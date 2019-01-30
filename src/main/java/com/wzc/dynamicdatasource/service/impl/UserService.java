package com.wzc.dynamicdatasource.service.impl;

import com.wzc.dynamicdatasource.annotation.DataSource;
import com.wzc.dynamicdatasource.config.DataSourceNames;
import com.wzc.dynamicdatasource.dao.UserDao;
import com.wzc.dynamicdatasource.entity.User;
import com.wzc.dynamicdatasource.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: joey
 * Date: 2019-01-29 16:47
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    /**
     * 动态数据源：mysql主从应用，读从库，写主库
     */
    @Override
    @DataSource(name = DataSourceNames.MASTER)
    public void insertUser(User user) {
        userDao.insertAllColumn(user);
    }

    /**
     * 动态数据源：mysql主从应用，读从库，写主库
     */
    @Override
    @DataSource(name = DataSourceNames.SLAVE)
    public List<User> selectUserList() {
        return userDao.selectList(null);
    }
}
