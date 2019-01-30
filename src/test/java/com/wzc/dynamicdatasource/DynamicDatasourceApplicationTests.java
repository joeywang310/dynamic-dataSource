package com.wzc.dynamicdatasource;

import com.wzc.dynamicdatasource.entity.User;
import com.wzc.dynamicdatasource.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamicDatasourceApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setAge(1);
        user.setEmail("123123@qq.com");
        user.setName("aaaa");
        user.setId(9L);
        userService.insertUser(user);
        List<User> users = userService.selectUserList();
        users.forEach(System.out::println);
    }

}

