package com.hypermarket.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hypermarket.entity.PageResult;
import com.hypermarket.mapper.TbSpecificationMapper;
import com.hypermarket.mapper.TbSpecificationOptionMapper;
import com.hypermarket.pojo.TbSpecification;
import com.hypermarket.pojo.TbSpecificationExample;
import com.hypermarket.pojo.TbSpecificationOption;
import com.hypermarket.pojo.TbSpecificationOptionExample;
import com.hypermarket.pojogroup.Specification;
import com.hypermarket.sellergoods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private TbSpecificationMapper specificationMapper;

    @Autowired
    private TbSpecificationOptionMapper specificationOptionMapper;

    @Override
    public List<TbSpecification> findAll() {
        return specificationMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbSpecification> page = (Page<TbSpecification>) specificationMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(Specification specification) {
        specificationMapper.insert(specification.getSpecification());
        for (TbSpecificationOption specificationOption:specification.getSpecificationOptionList()) {
            specificationOption.setSpecId(specification.getSpecification().getId());
            specificationOptionMapper.insert(specificationOption);
        }
    }

    @Override
    public void update(Specification specification) {
        TbSpecification tbSpecification = specification.getSpecification();
        specificationMapper.updateByPrimaryKey(tbSpecification);
        TbSpecificationOptionExample example = new TbSpecificationOptionExample();
        com.hypermarket.pojo.TbSpecificationOptionExample.Criteria criteria = example.createCriteria();
        criteria.andSpecIdEqualTo(tbSpecification.getId());
        specificationOptionMapper.deleteByExample(example);
        List<TbSpecificationOption> specificationOptionsList = specification.getSpecificationOptionList();
        for (TbSpecificationOption option : specificationOptionsList) {
            option.setSpecId(tbSpecification.getId());
            specificationOptionMapper.insert(option);
        }
    }

    @Override
    public Specification findOne(Long id) {
        Specification specification = new Specification();
        TbSpecification tbSpecification = specificationMapper.selectByPrimaryKey(id);
        specification.setSpecification(tbSpecification);
        TbSpecificationOptionExample example = new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria = example.createCriteria();
        criteria.andSpecIdEqualTo(id);
        List<TbSpecificationOption> specificationOptionList = specificationOptionMapper.selectByExample(example);
        specification.setSpecificationOptionList(specificationOptionList);
        return specification;
    }

    @Override
    public void delete(List<Long> ids) {
        for (Long id : ids) {
            specificationMapper.deleteByPrimaryKey(id);
            TbSpecificationOptionExample example = new TbSpecificationOptionExample();
            TbSpecificationOptionExample.Criteria criteria = example.createCriteria();
            criteria.andSpecIdEqualTo(id);
            specificationOptionMapper.deleteByExample(example);
        }
    }

    @Override
    public PageResult findPages(TbSpecification specification, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbSpecificationExample example = new TbSpecificationExample();
        TbSpecificationExample.Criteria criteria = example.createCriteria();
        if (specification != null) {
            if (specification.getSpecName() != null && specification.getSpecName().length() > 0) {
                criteria.andSpecNameLike("%" + specification.getSpecName() + "%");
            }
        }
        Page<TbSpecification> page = (Page<TbSpecification>) specificationMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public List<Map> selectOptionList() {
        return specificationMapper.selectOptionList();
    }
}
