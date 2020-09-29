package com.hypermarket.mapper;


import com.hypermarket.pojo.TbItemCat;
import com.hypermarket.pojo.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {
    public int countByExample(TbItemCatExample example);
    public int deleteByExample(TbItemCatExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbItemCat record);
    public int insertSelective(TbItemCat record);
    public List<TbItemCat> selectByExample(TbItemCatExample example);
    public TbItemCat selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbItemCat record,@Param("example") TbItemCatExample example);
    public int updateByExample(@Param("record") TbItemCat record,@Param("example") TbItemCatExample example);
    public int updateByPrimaryKeySelective(TbItemCat record);
    public int updateByPrimaryKey(TbItemCat record);

}
