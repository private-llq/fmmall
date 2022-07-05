package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: fmmall
 * @description:
 * @author: liulq
 * @create: 2022-07-05 17:01
 */
@RestController
@RequestMapping("/shopcart")
public class ShopcartController {


//    @GetMapping("/list")
//    @ApiImplicitParam(dataType = "int",name = "userId", value = "用户ID",required = true)
//    public ResultVO list(Integer userId, @RequestHeader("token")String token){
//        ResultVO resultVO = shoppingCartService.listShoppingCartsByUserId(userId);
//        return resultVO;
//    }




}
