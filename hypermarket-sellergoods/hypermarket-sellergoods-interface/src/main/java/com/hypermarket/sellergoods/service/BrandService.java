package com.hypermarket.sellergoods.service;

import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbBrand;

import java.util.List;

public interface BrandService {
    public List<TbBrand> findAll();
    public PageResult findPage(int pageNum,int pageSize);

}
