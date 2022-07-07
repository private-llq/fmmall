package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.fmmall.entity.OrdersVO;
import com.qfedu.fmmall.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper extends GeneralDAO<Orders> {
    /**
     *  分页查询订单
     * @param userId
     * @param status
     * @param start
     * @param limit
     * @return
     */
    public List<OrdersVO> selectOrders(@Param("userId") String userId,
                                       @Param("status") String status,
                                       @Param("start") int start,
                                       @Param("limit") int limit);




}
