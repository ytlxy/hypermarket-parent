package com.hypermarket.sellergoods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hypermarket.entity.PageResult;
import com.hypermarket.mapper.TbSpecificationMapper;
import com.hypermarket.mapper.TbSpecificationOptionMapper;
import com.hypermarket.pojo.TbSpecification;
import com.hypermarket.pojo.TbSpecificationOption;
import com.hypermarket.pojo.TbSpecificationOptionExample;
import com.hypermarket.pojogroup.Specification;
import com.hypermarket.sellergoods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class SpecificationServiceimpl implements SpecificationService {

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
        PageHelper.startPage(pageNum,pageSize);
        Page<TbSpecification> page= (Page<TbSpecification>) specificationMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(Specification specification) {
        TbSpecification tbSpecification = specification.getSpecification();
        specificationMapper.insert(tbSpecification);
        List<TbSpecificationOption> specificationOptionsList=specification.getSpecificationOptionList();
        for (TbSpecificationOption option:specificationOptionsList){
            option.setSpecId(tbSpecification.getId());
            specificationOptionMapper.insert(option);
        }
    }

    @Override
    public void update(Specification specification) {
        TbSpecification tbSpecification = specification.getSpecification();
        specificationMapper.updateByPrimaryKey(tbSpecification);
        TbSpecificationOptionExample example=new TbSpecificationOptionExample();
        com.hypermarket.pojo.TbSpecificationOptionExample.Criteria criteria= example.createCriteria();
        criteria.andSpecIdEqualTo(tbSpecification.getId());
        specificationOptionMapper.deleteByExample(example);
        List<TbSpecificationOption> specificationOptionsList=specification.getSpecificationOptionList();
        for (TbSpecificationOption option:specificationOptionsList){
            option.setSpecId(tbSpecification.getId());
            specificationOptionMapper.insert(option);
        }
    }

    @Override
    public Specification findOne(Long id) {
        Specification specification=new Specification();
        TbSpecification tbSpecification=specificationMapper.selectByPrimaryKey(id);
        specification.setSpecification(tbSpecification);
        TbSpecificationOptionExample example=new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria=example.createCriteria();
        criteria.andSpecIdEqualTo(id);
        List<TbSpecificationOption> specificationOptionList=specificationOptionMapper.selectByExample(example);
        specification.setSpecificationOptionList(specificationOptionList);
        return specification;
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public PageResult findPage(TbSpecification specification) {
        return null;
    }

    @Override
    public List<Map> selectOptionList() {
        return null;
    }
}
