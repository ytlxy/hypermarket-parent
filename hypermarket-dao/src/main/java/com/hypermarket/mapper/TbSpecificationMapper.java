package com.hypermarket.mapper;


import com.hypermarket.pojo.TbSpecification;
import com.hypermarket.pojo.TbSpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpecificationMapper {
    public int countByExample(TbSpecificationExample example);
    public int deleteByExample(TbSpecificationExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbSpecification record);
    public int insertSelective(TbSpecification record);
    public List<TbSpecification> selectByExample(TbSpecificationExample example);
    public TbSpecification selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbSpecification record,@Param("example") TbSpecificationExample example);
    public int updateByExample(@Param("record") TbSpecification record,@Param("example") TbSpecificationExample example);
    public int updateByPrimaryKeySelective(TbSpecification record);
    public int updateByPrimaryKey(TbSpecification record);

}
