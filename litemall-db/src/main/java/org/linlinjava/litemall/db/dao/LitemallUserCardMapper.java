package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallUserCard;
import org.linlinjava.litemall.db.domain.LitemallUserCardExample;

public interface LitemallUserCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    long countByExample(LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int insert(LitemallUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int insertSelective(LitemallUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    LitemallUserCard selectOneByExample(LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    LitemallUserCard selectOneByExampleSelective(@Param("example") LitemallUserCardExample example, @Param("selective") LitemallUserCard.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    List<LitemallUserCard> selectByExampleSelective(@Param("example") LitemallUserCardExample example, @Param("selective") LitemallUserCard.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    List<LitemallUserCard> selectByExample(LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    LitemallUserCard selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallUserCard.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    LitemallUserCard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    LitemallUserCard selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallUserCard record, @Param("example") LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallUserCard record, @Param("example") LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}