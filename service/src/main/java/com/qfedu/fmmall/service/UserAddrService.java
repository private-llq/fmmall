package com.qfedu.fmmall.service;

import com.qfedu.fmmall.vo.ResultVO;

public interface UserAddrService {
    /**
     * 查询收货地址
     * @param userId
     * @return
     */
    public ResultVO listAddrsByUid(int userId);

}
