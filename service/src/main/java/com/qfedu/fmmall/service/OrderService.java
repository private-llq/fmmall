package com.qfedu.fmmall.service;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.fmmall.vo.ResultVO;

import java.sql.SQLException;
import java.util.Map;

public interface OrderService {
    /**
     * 新增订单
     * @param cids
     * @param order
     * @return
     * @throws SQLException
     */
    public Map<String,String> addOrder(String cids, Orders order) throws SQLException;

    /**
     * 修改订单状态
     * @param orderId
     * @param status
     * @return
     */
    public int updateOrderStatus(String orderId, String status);

    /**
     *  根据订单id编号查询订单状态
     * @param orderId
     * @return
     */
    public ResultVO getOrderById(String orderId);

    /**
     * 关闭订单
     * @param orderId
     */
    public void closeOrder(String orderId);

    /**
     * 分页查询订单
     * @param userId
     * @param status
     * @param pageNum
     * @param limit
     * @return
     */
    public ResultVO listOrders(String userId,String status,int pageNum, int limit);

}
