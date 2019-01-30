package com.wzc.dynamicdatasource.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: joey
 * Date: 2019-01-29 15:30
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}