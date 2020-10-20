package com.hypermarket.sellergoods.service;

import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbTypeTemplate;

import java.util.List;

public interface TbTypeTemplateService {

    public List<TbTypeTemplate> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void add(TbTypeTemplate typeTemplate);

    public void update(TbTypeTemplate typeTemplate);

    public TbTypeTemplate findOne(Long id);

    public void delete(List<Long> ids);

    public PageResult findPage(TbTypeTemplate typeTemplate, int pageNum, int pageSize);
}
