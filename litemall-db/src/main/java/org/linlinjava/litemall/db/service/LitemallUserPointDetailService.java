package org.linlinjava.litemall.db.service;

import com.github.pagehelper.PageHelper;
import org.linlinjava.litemall.db.dao.LitemallUserPointDetailMapper;
import org.linlinjava.litemall.db.domain.LitemallUserPointDetail;
import org.linlinjava.litemall.db.domain.LitemallUserPointDetailExample;
import org.linlinjava.litemall.db.domain.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LitemallUserPointDetailService {
    @Resource
    private LitemallUserPointDetailMapper userPointDetailMapper;

    public LitemallUserPointDetail findById(Integer userId) {
        return userPointDetailMapper.selectByPrimaryKey(userId);
    }

    public LitemallUserPointDetail findUserPointDetailVoById(Integer userId) {
        LitemallUserPointDetail userPointDetail = findById(userId);
        return userPointDetail;
    }


    public void add(LitemallUserPointDetail userPointDetail) {
        userPointDetail.setAddTime(LocalDateTime.now());
        userPointDetail.setUpdateTime(LocalDateTime.now());
        userPointDetailMapper.insertSelective(userPointDetail);
    }

    public int updateById(LitemallUserPointDetail user) {
        user.setUpdateTime(LocalDateTime.now());
        return userPointDetailMapper.updateByPrimaryKeySelective(user);
    }

    public List<LitemallUserPointDetail> querySelective(Integer page, Integer size, String sort, String order) {
        LitemallUserPointDetailExample example = new LitemallUserPointDetailExample();
        LitemallUserPointDetailExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return userPointDetailMapper.selectByExample(example);
    }

    public int count() {
        LitemallUserPointDetailExample example = new LitemallUserPointDetailExample();
        return (int) userPointDetailMapper.countByExample(example);
    }

}
