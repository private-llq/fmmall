package com.zhsj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: fmmall
 * @description: 用户表
 * @author: liulq
 * @create: 2022-07-05 01:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId;
    private String username;
    private String userRealname;
    private String userImg;
}
