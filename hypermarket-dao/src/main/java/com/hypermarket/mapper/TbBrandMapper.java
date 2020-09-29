package com.hypermarket.mapper;

import com.hypermarket.pojo.TbBrand;
import com.hypermarket.pojo.TbBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbBrandMapper {
    public int countByExample(TbBrandExample example);
    public int deleteByExample(TbBrandExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbBrand record);
    public int insertSelective(TbBrand record);
    public List<TbBrand> selectByExample(TbBrandExample example);
    public TbBrand selectByPrimaryKey(Long id);
    public int updateByExample(@Param("record")TbBrand record, @Param("example") TbBrandExample example);
    public int updateByPrimaryKeySelective(TbBrand record);
    public int updateByPrimaryKey(TbBrand record);
}
