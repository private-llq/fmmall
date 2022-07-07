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

    /**
    *@Description: 根据三级分类ID分页查询商品信息
    *@Param:
    *@return:
    *@Author: liulq
    *@date: 2022/7/7
    */
    public ResultVO getProductsByCategoryId(int categoryId,int pageNum,int limit);


    /**
    *@Description: 根据类别查询商品品牌接口
    *@Param: 
    *@return: 
    *@Author: liulq
    *@date: 2022/7/7
    */
    public ResultVO listBrands(int categoryId);

    /**
    *@Description: 根据关键字搜索分页
    *@Param: 
    *@return: 
    *@Author: liulq
    *@date: 2022/7/7
    */
    public ResultVO searchProduct(String kw,int pageNum,int limit);


    /**
     *  根据关键字搜索品牌名列表
     * @param kw
     * @return
     */
    public ResultVO listBrands(String kw);

}

