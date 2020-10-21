package com.hypermarket.sellergoods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hypermarket.entity.PageResult;
import com.hypermarket.mapper.TbSellerMapper;
import com.hypermarket.pojo.TbSeller;
import com.hypermarket.sellergoods.service.TbSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TbSellerServiceImpl implements TbSellerService {

    @Autowired
    private TbSellerMapper tbSellerMapper;

    @Override
    public List<TbSeller> findAll() {
        return tbSellerMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbSeller> page=(Page<TbSeller>) tbSellerMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(TbSeller tbSeller) {
        tbSellerMapper.insert(tbSeller);
    }

    @Override
    public void update(TbSeller tbSeller) {
        tbSellerMapper.updateByPrimaryKey(tbSeller);
    }

    @Override
    public TbSeller findOne(Long id) {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {
        for (Long id:ids){
        }
    }

    @Override
    public PageResult findPage(TbSeller tbSeller, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<Map> selectOptionList() {
        return null;
    }
}
