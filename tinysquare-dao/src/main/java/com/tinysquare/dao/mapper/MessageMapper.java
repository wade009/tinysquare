package com.tinysquare.dao.mapper;

import com.tinysquare.dao.entity.Message;
import com.tinysquare.dao.entity.MessageExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int countByExample(MessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int deleteByExample(MessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int insert(Message record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int insertSelective(Message record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	List<Message> selectByExample(MessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	Message selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int updateByPrimaryKeySelective(Message record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tiny_message
	 * @mbggenerated  Thu May 05 19:33:13 CST 2016
	 */
	int updateByPrimaryKey(Message record);

	/**
   	 * 根据用户id查询系统信息
   	 * 
   	 * @param params
   	 *            #{userId},#{pageBegin},#{pageSize}
   	 * @return
   	 */
   	List<Message> selectByUserId(Map<String, Object> params);
}