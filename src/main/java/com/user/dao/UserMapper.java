package com.user.dao;

import com.user.entity.User;

import java.util.Map;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Mar 05 16:14:05 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Mar 05 16:14:05 CST 2019
     */
    int insertSelective(User record);

    User getUser(Map map);
}