package com.qfedu.fmmall.service;

import com.qfedu.fmmall.entity.ShoppingCart;
import com.qfedu.fmmall.vo.ResultVO;

import java.util.List;

public interface ShoppingCartService {
    /**
     * 新增购物车
     * @param cart
     */
    public ResultVO addShoppingCart(ShoppingCart cart);

    /**
     * 查询购物车
     * @param userId
     */
    public ResultVO listShoppingCartsByUserId(int userId);

    /**
     * 修改购物车
     * @param cartId
     * @param cartNum
     */
    public ResultVO updateCartNum(int cartId,int cartNum);

    /**
     * 查询购物车
     * @param cids
     */
    public ResultVO listShoppingCartsByCids(String cids);

}
