package com.youxuepai.componentconsumer.controller;

import com.youxuepai.componentapi.api.ProductApi;
import com.youxuepai.componentapi.vo.ProductVO;
import com.youxuepai.componentconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author super
 */
@RestController
@RequestMapping("/product")
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    @Override
    public boolean addProduct(@RequestBody ProductVO productVO) {
        return productService.addProduct(productVO);
    }

    @Override
    @GetMapping("/list")
    public List<ProductVO> getProductList() {
        return productService.getProductList();
    }
}
