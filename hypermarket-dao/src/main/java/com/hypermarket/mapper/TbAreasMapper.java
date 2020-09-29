package com.hypermarket.mapper;

import com.hypermarket.pojo.TbAreas;
import com.hypermarket.pojo.TbAreasExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAreasMapper {
    public int countByExample(TbAreasExample example);
    public int deleteByExample(TbAreasExample example);
    public int deleteByPrimaryKey(Integer id);
    public int insert(TbAreas record);
    public int insertSelective(TbAreas record);
    public List<TbAreas> selectByExample(TbAreasExample example);
    public TbAreas selectByPrimaryKey(Integer id);
    public int updateByExample(@Param("record") TbAreas record, @Param("example") TbAreasExample example);
    public int updateByPrimaryKeySeletive(TbAreas record);
    public int updateByPrimaryKey(TbAreas record);
}
