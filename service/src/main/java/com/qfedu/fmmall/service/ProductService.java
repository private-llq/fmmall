package com.qfedu.fmmall.service;

import com.qfedu.fmmall.vo.ResultVO;

public interface ProductService {


    public ResultVO listRecommendProducts();

    /**
    *@Description: 商品基本信息查询接口
    *@Param: 
    *@return: 
    *@Author: liulq
    *@date: 2022/7/5
    */
    public ResultVO getProductBasicInfo(String productId);
    /**
    *@Description:   商品参数信息查询接口
    *@Param: 
    *@return: 
    *@Author: liulq
    *@date: 2022/7/5
    */
    public ResultVO getProductParamsById(String productId);

}

