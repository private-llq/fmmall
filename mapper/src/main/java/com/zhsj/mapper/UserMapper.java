package com.zhsj.mapper;

import com.zhsj.model.User;

/**
 * @program: fmmall
 * @description:
 * @author: liulq
 * @create: 2022-07-05 01:20
 */
public interface UserMapper {
    public User queryUserByName(String name);
}
