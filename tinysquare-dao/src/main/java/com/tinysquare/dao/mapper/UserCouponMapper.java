package com.tinysquare.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.tinysquare.dao.entity.UserCoupon;
import com.tinysquare.dao.entity.UserCouponExample;
import com.tinysquare.dao.entityex.UserCouponItem;

public interface UserCouponMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int countByExample(UserCouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int deleteByExample(UserCouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int insert(UserCoupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int insertSelective(UserCoupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	List<UserCoupon> selectByExample(UserCouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	UserCoupon selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int updateByExampleSelective(@Param("record") UserCoupon record, @Param("example") UserCouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int updateByExample(@Param("record") UserCoupon record, @Param("example") UserCouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int updateByPrimaryKeySelective(UserCoupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table tiny_user_coupon
	 *
	 * @mbggenerated Tue Apr 12 22:03:22 CST 2016
	 */
	int updateByPrimaryKey(UserCoupon record);

	/**
	 * 根据用户和状态查询
	 * 
	 * @param params
	 *            #{userId},#{status},#{pageBegin},#{pageSize}
	 * @return
	 */
	List<UserCouponItem> selectByUserIdAndStatus(Map<String, Object> params);

	/**
	 * 根据用户和状态查询记录数
	 * 
	 * @param params
	 *            #{userId},#{status}
	 * @return
	 */
	Integer countByUserIdAndStatus(Map<String, Object> params);
}