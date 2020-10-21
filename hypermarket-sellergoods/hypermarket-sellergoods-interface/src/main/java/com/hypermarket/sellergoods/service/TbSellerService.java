package com.hypermarket.sellergoods.service;

import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbSeller;

import java.util.List;
import java.util.Map;

public interface TbSellerService {
    public List<TbSeller> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void add(TbSeller tbSeller);

    public void update(TbSeller tbSeller);

    public TbSeller findOne(String id);

    public void delete(List<String> ids);

    public PageResult findPage(TbSeller tbSeller, int pageNum, int pageSize);

}
