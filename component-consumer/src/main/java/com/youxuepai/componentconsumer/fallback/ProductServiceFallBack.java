package com.youxuepai.componentconsumer.fallback;

import com.youxuepai.componentapi.vo.ProductVO;
import com.youxuepai.componentconsumer.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author super
 */
@Component
public class ProductServiceFallBack implements ProductService {
    @Override
    public boolean addProduct(ProductVO productVO) {
        return false;
    }

    @Override
    public List<ProductVO> getProductList() {
        return new ArrayList<>();
    }
}
