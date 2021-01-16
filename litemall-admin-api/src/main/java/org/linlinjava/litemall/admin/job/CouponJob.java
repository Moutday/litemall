package org.linlinjava.litemall.admin.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.admin.util.DateUtil;
import org.linlinjava.litemall.db.domain.*;
import org.linlinjava.litemall.db.service.*;
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
    @Autowired
    private SuperCardService superCardService;
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

    // 每月1号 按用户等级 发放优惠券 todo：定时任务时间更改    特权卡优惠券每月发放
    @Scheduled(fixedDelay = 60 * 60 * 1000)
    public void giveCouponForVip(){
        List<LitemallUserCard> cardList = userCardService.querySelective(null,0,"","");
        List<LitemallVipCard>  vipCardList = superCardService.querySelective(null,0,"","");
        LocalDateTime firstDayTime = DateUtil.getFirstDayTimeOfMonth();
        LocalDateTime endDayTime = DateUtil.getEndDayTimeOfMonth();
        cardList.forEach(card->{
            List<LitemallUser> userList =  userService.queryByCardLevel(card.getCardLevel());
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
        vipCardList.forEach(card->{
                    List<LitemallUser> userList =  userService.queryByVipCardLevel(card.getId());
                    if(userList != null && card.getCouponIds() != null){
                        userList.forEach(user->{
                            String[] couponIds = card.getCouponIds().split(",");
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
