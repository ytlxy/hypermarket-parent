package com.hypermarket.sellergoods.service;

import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbItemCat;

import java.util.List;

public interface ItemCatService {
    public List<TbItemCat> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void add(TbItemCat tbItemCat);

    public void update(TbItemCat tbItemCat);

    public TbItemCat findOne(Long id);

    public void delete(List<Long> ids);

    public PageResult findPage(TbItemCat specification, int pageNum, int pageSize);
}
