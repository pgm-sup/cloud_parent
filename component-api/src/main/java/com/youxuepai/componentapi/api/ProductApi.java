package com.youxuepai.componentapi.api;

import com.youxuepai.componentapi.vo.ProductVO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author super
 */
public interface ProductApi {

    /**
     * 添加产品
     * @param productVO 产品基本信息
     * @return 添加成功或失败
     */
    boolean addProduct(@RequestBody ProductVO productVO);

    /**
     * 获取产品列表
     * @return 产品列表
     */
    List<ProductVO> getProductList();
}
