package com.wzc.dynamicdatasource.service;

import com.wzc.dynamicdatasource.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: joey
 * Date: 2019-01-29 16:46
 */
public interface IUserService {

    void insertUser(User user);

    List<User> selectUserList();
}
