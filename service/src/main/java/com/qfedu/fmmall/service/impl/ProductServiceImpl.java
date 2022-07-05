package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.ProductMapper;
import com.qfedu.fmmall.entity.ProductVO;
import com.qfedu.fmmall.service.ProductService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
//    @Autowired
//    private ProductImgMapper productImgMapper;
//    @Autowired
//    private ProductSkuMapper productSkuMapper;
//    @Autowired
//    private ProductParamsMapper productParamsMapper;

    @Override
    public ResultVO listRecommendProducts() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", productVOS);
        return resultVO;
    }

}
