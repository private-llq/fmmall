package com.qfedu.fmmall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author liulq
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryVO implements Serializable {

    private Integer categoryId;
    private String categoryName;
    private Integer categoryLevel;
    private Integer parentId;
    private String categoryIcon;
    private String categorySlogan;
    private String categoryPic;
    private String categoryBgColor;
    //实现首页的类别显示
    private List<CategoryVO> categories;
    //实现首页分类商品推荐
    private List<ProductVO> products;
}