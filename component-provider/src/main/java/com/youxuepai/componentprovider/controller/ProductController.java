package com.youxuepai.componentprovider.controller;

import com.youxuepai.componentapi.api.ProductApi;
import com.youxuepai.componentapi.entity.Product;
import com.youxuepai.componentapi.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author super
 * @since 2019-07-25
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController implements ProductApi {

    @PostMapping("/addProduct")
    @Override
    public boolean addProduct(@RequestBody ProductVO productVO){
        Product product = new Product();
        BeanUtils.copyProperties(productVO, product);
        return product.insert();
    }

    @GetMapping("/list")
    @Override
    public List<ProductVO> getProductList() {
        List<Product> products = new Product().selectAll();
        List<ProductVO> voList = new ArrayList<>();
        for (Product product : products) {
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(product, productVO);
            voList.add(productVO);
        }
        return voList;
    }
}

