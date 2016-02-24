package com.tinysquare.dao.mapper;

import com.tinysquare.dao.entity.Shop;
import com.tinysquare.dao.entity.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int countByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int deleteByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    Shop selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiny_shop
     *
     * @mbggenerated Tue Apr 12 22:52:32 CST 2016
     */
    int updateByPrimaryKey(Shop record);
}