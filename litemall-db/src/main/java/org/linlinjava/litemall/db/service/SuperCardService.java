package org.linlinjava.litemall.db.service;

import com.github.pagehelper.PageHelper;
import org.linlinjava.litemall.db.dao.LitemallVipCardMapper;
import org.linlinjava.litemall.db.dao.LitemallVipCardMapper;
import org.linlinjava.litemall.db.domain.LitemallVipCard;
import org.linlinjava.litemall.db.domain.LitemallVipCardExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SuperCardService {
    @Resource
    private LitemallVipCardMapper vipCardMapper;

    public LitemallVipCard findById(Integer cardId) {
        return vipCardMapper.selectByPrimaryKey(cardId);
    }

    public void add(LitemallVipCard userCard) {
        userCard.setAddTime(LocalDateTime.now());
        userCard.setUpdateTime(LocalDateTime.now());
        vipCardMapper.insertSelective(userCard);
    }

    public int updateById(LitemallVipCard userCard) {
        userCard.setUpdateTime(LocalDateTime.now());
        return vipCardMapper.updateByPrimaryKeySelective(userCard);
    }

    public List<LitemallVipCard> querySelective(Integer page, Integer size, String sort, String order) {
        LitemallVipCardExample example = new LitemallVipCardExample();
        LitemallVipCardExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        if(page != null){
            PageHelper.startPage(page, size);
        }
        return vipCardMapper.selectByExample(example);
    }

    public int count() {
        LitemallVipCardExample example = new LitemallVipCardExample();
        return (int) vipCardMapper.countByExample(example);
    }

}
