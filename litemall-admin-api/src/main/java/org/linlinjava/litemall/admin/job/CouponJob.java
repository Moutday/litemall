package org.linlinjava.litemall.admin.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.admin.util.DateUtil;
import org.linlinjava.litemall.db.domain.LitemallCoupon;
import org.linlinjava.litemall.db.domain.LitemallCouponUser;
import org.linlinjava.litemall.db.domain.LitemallUser;
import org.linlinjava.litemall.db.domain.LitemallUserCard;
import org.linlinjava.litemall.db.service.LitemallCouponService;
import org.linlinjava.litemall.db.service.LitemallCouponUserService;
import org.linlinjava.litemall.db.service.LitemallUserCardService;
import org.linlinjava.litemall.db.service.LitemallUserService;
import org.linlinjava.litemall.db.util.CouponConstant;
import org.linlinjava.litemall.db.util.CouponUserConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 检测优惠券过期情况
 */
@Component
public class CouponJob {
    private final Log logger = LogFactory.getLog(CouponJob.class);

    @Autowired
    private LitemallCouponService couponService;
    @Autowired
    private LitemallCouponUserService couponUserService;
    @Autowired
    private LitemallUserCardService userCardService;
    @Autowired
    private LitemallUserService userService;

    /**
     * 每隔一个小时检查
     * TODO
     * 注意，因为是相隔一个小时检查，因此导致优惠券真正超时时间可能比设定时间延迟1个小时
     */
    @Scheduled(fixedDelay = 60 * 60 * 1000)
    public void checkCouponExpired() {
        logger.info("系统开启任务检查优惠券是否已经过期");

        List<LitemallCoupon> couponList = couponService.queryExpired();
        for (LitemallCoupon coupon : couponList) {
            coupon.setStatus(CouponConstant.STATUS_EXPIRED);
            couponService.updateById(coupon);
        }

        List<LitemallCouponUser> couponUserList = couponUserService.queryExpired();
        for (LitemallCouponUser couponUser : couponUserList) {
            couponUser.setStatus(CouponUserConstant.STATUS_EXPIRED);
            couponUserService.update(couponUser);
        }

        logger.info("系统结束任务检查优惠券是否已经过期");
    }

    // 每月1号 按用户等级 发放优惠券 todo：定时任务时间更改
    @Scheduled(fixedDelay = 60 * 60 * 1000)
    public void giveCouponForVip(){
        List<LitemallUserCard> cardList = userCardService.querySelective(null,0,"","");
        LocalDateTime firstDayTime = DateUtil.getFirstDayTimeOfMonth();
        LocalDateTime endDayTime = DateUtil.getEndDayTimeOfMonth();
        cardList.forEach(card->{
            List<LitemallUser> userList =  userService.queryByCardId(card.getId());
            if(userList != null && card.getVipMonthCoupon() != null){
                    userList.forEach(user->{
                        String[] couponIds = card.getVipMonthCoupon().split(",");
                        for(String couponId : couponIds){
                            LitemallCouponUser couponUser = new LitemallCouponUser();
                            couponUser.setUserId(user.getId());
                            couponUser.setCouponId(Integer.parseInt(couponId));
                            couponUser.setStartTime(firstDayTime);
                            couponUser.setEndTime(endDayTime);
                            couponUserService.add(couponUser);
                        }
                    });
                }
            }
        );
    }
}
