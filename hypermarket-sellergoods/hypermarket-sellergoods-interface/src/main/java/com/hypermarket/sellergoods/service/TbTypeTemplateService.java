package com.hypermarket.sellergoods.service;

import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbTypeTemplate;

import java.util.List;

//服务层接口
public interface TbTypeTemplateService {

    //查询全部
    public List<TbTypeTemplate> findAll();

    //返回分页列表
    public PageResult findPage(int pageNum, int pageSize);

    //增加
    public void add(TbTypeTemplate typeTemplate);

    //修改
    public void update(TbTypeTemplate typeTemplate);

    //根据ID查询
    public TbTypeTemplate findOne(Long id);

    //批量删除
    public void delete(List<Long> ids);

    //分页
    public PageResult findPage(TbTypeTemplate typeTemplate,int pageNum,int pageSize);
}
