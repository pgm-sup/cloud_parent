package com.youxuepai.componentconsumer.service;

import com.youxuepai.componentapi.vo.ProductVO;
import com.youxuepai.componentconsumer.fallback.ProductServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author super
 */
@FeignClient(name = "component-provider", fallback = ProductServiceFallBack.class)
public interface ProductService {

    /**
     * 添加产品
     * @param productVO 产品基本信息
     * @return 添加成功或失败
     */
    @RequestMapping(value = "/api/v1//product/addProduct", method = RequestMethod.POST)
    boolean addProduct(ProductVO productVO);

    /**
     * 获取产品列表
     * @return 产品列表
     */
    @RequestMapping(value = "/api/v1//product/list", method = RequestMethod.GET)
    List<ProductVO> getProductList();
}
