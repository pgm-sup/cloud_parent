package com.youxuepai.componentprovider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youxuepai.componentprovider.entity.Product;
import com.youxuepai.componentprovider.mapper.ProductMapper;
import com.youxuepai.componentprovider.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author super
 * @since 2019-07-25
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
