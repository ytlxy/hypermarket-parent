package com.hypermarket.sellergoods.service;


import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbGoods;

import java.util.List;

public interface GoodsService {
    public List<TbGoods> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void add(TbGoods goods);

    public TbGoods findOne(Long id);

    public void update(TbGoods goods);

    public void delete(List<Long> ids);

    public PageResult getAllPage(TbGoods goods, int pageNum, int pageSize);
}
