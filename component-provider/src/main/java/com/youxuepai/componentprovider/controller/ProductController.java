package com.youxuepai.componentprovider.controller;


import com.youxuepai.componentprovider.entity.Product;
import com.youxuepai.componentprovider.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author super
 * @since 2019-07-25
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/addProduct")
    @ResponseBody
    public boolean addProduct(@RequestBody ProductVO productVO){
        Product product = new Product();
        BeanUtils.copyProperties(productVO, product);
        return product.insert();
    }
}

