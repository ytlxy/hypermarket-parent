package com.hypermarket.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hypermarket.entity.PageResult;
import com.hypermarket.mapper.TbTypeTemplateMapper;
import com.hypermarket.pojo.TbTypeTemplate;
import com.hypermarket.pojo.TbTypeTemplateExample;
import com.hypermarket.sellergoods.service.TbTypeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TbTypeTemplateServiceImpl implements TbTypeTemplateService {

    @Autowired
    private TbTypeTemplateMapper typeTemplateMapper;

    //查询全部
    @Override
    public List<TbTypeTemplate> findAll() {
        return typeTemplateMapper.selectByExample(null);
    }

    //分页查询
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
       Page<TbTypeTemplate> page =(Page<TbTypeTemplate>) typeTemplateMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    //增加
    @Override
    public void add(TbTypeTemplate typeTemplate) {
        typeTemplateMapper.insert(typeTemplate);
    }

    //修改
    @Override
    public void update(TbTypeTemplate typeTemplate) {
        typeTemplateMapper.updateByPrimaryKey(typeTemplate);
    }

    //根据ID获取实体
    @Override
    public TbTypeTemplate findOne(Long id) {
        return typeTemplateMapper.selectByPrimaryKey(id);
    }

    //批量删除
    @Override
    public void delete(List<Long> ids) {
        for (Long id:ids){
            typeTemplateMapper.deleteByPrimaryKey(id);
        }
    }

    //分页+查询
    @Override
    public PageResult findPage(TbTypeTemplate typeTemplate, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbTypeTemplateExample example=new TbTypeTemplateExample();
        TbTypeTemplateExample.Criteria criteria=example.createCriteria();

        if (typeTemplate!=null){
            if (typeTemplate.getName()!=null && typeTemplate.getName().length()>0){
                criteria.andNameLike("%"+typeTemplate.getName()+"%");
            }
            if (typeTemplate.getSpecIds()!=null && typeTemplate.getSpecIds().length()>0){
                criteria.andSpecIdsLike("%"+typeTemplate.getSpecIds()+"%");
            }
            if (typeTemplate.getCustomAttributeItems()!= null && typeTemplate.getCustomAttributeItems().length()>0){
                criteria.andCustomAttributeItemsLike("%"+typeTemplate.getCustomAttributeItems().length()+"%");
            }
        }
        Page<TbTypeTemplate> page=(Page<TbTypeTemplate>) typeTemplateMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }
}
