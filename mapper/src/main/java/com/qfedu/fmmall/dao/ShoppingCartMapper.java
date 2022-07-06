package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.ShoppingCart;
import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.fmmall.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liulq
 */
@Repository
public interface ShoppingCartMapper extends GeneralDAO<ShoppingCart> {
    /**
     * 查询购物车
     * @param userId
     */
    public List<ShoppingCartVO> selectShopcartByUserId(int userId);

    /**
     * 修改购物车数量
     * @param cartId
     * @param cartNum
     */
    public int updateCartnumByCartid(@Param("cartId") int cartId,
                                     @Param("cartNum") int cartNum);

    /**
     * 根据id查询购车
     * @param cids
     * @return
     */
    //1,8
    public List<ShoppingCartVO> selectShopcartByCids(List<Integer> cids);

}
