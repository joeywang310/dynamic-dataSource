package com.wzc.dynamicdatasource.dao;

import com.baomidou.mybatisplus.annotations.SqlParser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.wzc.dynamicdatasource.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: joey
 * Date: 2019-01-29 16:48
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    List<User> selectList(Wrapper<User> wrapper);

    @Insert("INSERT INTO user   ( id ,`name`,age, email)  VALUES   (#{id},#{name},#{age},#{email})")
    Integer insertAllColumn(User user);


}
