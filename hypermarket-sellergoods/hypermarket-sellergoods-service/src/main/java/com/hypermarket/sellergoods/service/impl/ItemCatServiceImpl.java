package com.hypermarket.sellergoods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hypermarket.entity.PageResult;
import com.hypermarket.mapper.TbItemCatMapper;
import com.hypermarket.pojo.TbItemCat;
import com.hypermarket.pojo.TbItemCatExample;
import com.hypermarket.sellergoods.service.ItemCatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<TbItemCat> findAll() {
        return tbItemCatMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbItemCat> page = (Page<TbItemCat>) tbItemCatMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(TbItemCat tbItemCat) {
        tbItemCatMapper.insert(tbItemCat);
    }

    @Override
    public void update(TbItemCat tbItemCat) {
        tbItemCatMapper.updateByPrimaryKey(tbItemCat);
    }

    @Override
    public TbItemCat findOne(Long id) {
        return tbItemCatMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(List<Long> ids) {
        for (Long id : ids) {
            tbItemCatMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbItemCat tbItemCat, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        if (tbItemCat != null) {
            if (tbItemCat.getName() != null && tbItemCat.getName().length() > 0) {
                criteria.andNameNotLike("%" + tbItemCat.getName() + "%");
            }
        }
        Page<TbItemCat> page = (Page<TbItemCat>) tbItemCatMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }
}
