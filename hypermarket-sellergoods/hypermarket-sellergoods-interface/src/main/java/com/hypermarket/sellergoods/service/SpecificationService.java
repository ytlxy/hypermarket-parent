package com.hypermarket.sellergoods.service;

import com.hypermarket.entity.PageResult;
import com.hypermarket.pojo.TbSpecification;
import com.hypermarket.pojogroup.Specification;

import java.util.List;
import java.util.Map;

public interface SpecificationService {
    public List<TbSpecification> findAll();

    public PageResult findPage(int pageNum, int pageSize);

    public void add(Specification specification);

    public void update(Specification specification);

    public Specification findOne(Long id);

    public void delete(List<Long> ids);

    public PageResult findPage(TbSpecification specification, int pageNum, int pageSize);

    public List<Map> selectOptionList();
}
