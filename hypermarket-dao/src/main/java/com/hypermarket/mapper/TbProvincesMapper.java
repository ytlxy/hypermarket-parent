package com.hypermarket.mapper;


import com.hypermarket.pojo.TbProvinces;
import com.hypermarket.pojo.TbProvincesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProvincesMapper {
    public int countByExample(TbProvincesExample example);
    public int deleteByExample(TbProvincesExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbProvinces record);
    public int insertSelective(TbProvinces record);
    public List<TbProvinces> selectByExample(TbProvincesExample example);
    public TbProvinces selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbProvinces record,@Param("example") TbProvincesExample example);
    public int updateByExample(@Param("record") TbProvinces record,@Param("example") TbProvincesExample example);
    public int updateByPrimaryKeySelective(TbProvinces record);
    public int updateByPrimaryKey(TbProvinces record);

}
