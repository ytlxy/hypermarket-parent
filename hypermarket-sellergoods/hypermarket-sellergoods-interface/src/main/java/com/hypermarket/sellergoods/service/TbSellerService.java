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

    public TbSeller findOne(Long id);

    public void delete(List<Long> ids);

    public PageResult findPage(TbSeller tbSeller, int pageNum, int pageSize);

    public List<Map> selectOptionList();

}
