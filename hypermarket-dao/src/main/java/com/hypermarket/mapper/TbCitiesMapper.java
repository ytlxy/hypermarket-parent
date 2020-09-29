package com.hypermarket.mapper;

import com.hypermarket.pojo.TbCities;
import com.hypermarket.pojo.TbCitiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCitiesMapper {
    public int countByExample(TbCitiesExample example);
    public int deleteByExample(TbCitiesExample example);
    public int deleteByPrimaryKey(Integer id);
    public int insert(TbCities record);
    public int insertSelective(TbCities record);
    public List<TbCities> selectByExample(TbCitiesExample example);
    public TbCities selectByPrimaryKey(Integer id);
    public int updateByExampleSelective(@Param("record") TbCities record,@Param("example") TbCitiesExample example);
    public int updateByExample(@Param("record") TbCities record,@Param("example") TbCitiesExample example);
    public int updateByPrimaryKeySelective(TbCities record);
    public int updateByPrimaryKey(TbCities record);

}
