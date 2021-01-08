package org.linlinjava.litemall.db.service;

import com.github.pagehelper.PageHelper;
import org.linlinjava.litemall.db.dao.LitemallUserCardMapper;
import org.linlinjava.litemall.db.dao.LitemallUserCardMapper;
import org.linlinjava.litemall.db.domain.LitemallUserCard;
import org.linlinjava.litemall.db.domain.LitemallUserCard;
import org.linlinjava.litemall.db.domain.LitemallUserCardExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LitemallUserCardService {
    @Resource
    private LitemallUserCardMapper userCardMapper;

    public LitemallUserCard findById(Integer cardId) {
        return userCardMapper.selectByPrimaryKey(cardId);
    }

    public LitemallUserCard findByCardLevel(Integer level) {
        LitemallUserCardExample example = new LitemallUserCardExample();
        example.or().andCardLevelEqualTo(level).andDeletedEqualTo(false);
        return userCardMapper.selectOneByExample(example);
    }



    public void add(LitemallUserCard userCard) {
        userCard.setAddTime(LocalDateTime.now());
        userCard.setUpdateTime(LocalDateTime.now());
        userCardMapper.insertSelective(userCard);
    }

    public int updateById(LitemallUserCard userCard) {
        userCard.setUpdateTime(LocalDateTime.now());
        return userCardMapper.updateByPrimaryKeySelective(userCard);
    }

    public List<LitemallUserCard> querySelective(Integer page, Integer size, String sort, String order) {
        LitemallUserCardExample example = new LitemallUserCardExample();
        LitemallUserCardExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        if(page != null){
            PageHelper.startPage(page, size);
        }
        return userCardMapper.selectByExample(example);
    }

    public int count() {
        LitemallUserCardExample example = new LitemallUserCardExample();
        return (int) userCardMapper.countByExample(example);
    }

}
