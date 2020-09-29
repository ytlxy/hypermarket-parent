package com.hypermarket.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hypermarket.pojo.TbBrand;
import com.hypermarket.sellergoods.service.BrandService;
import com.hypermarket.mapper.TbBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }
}
