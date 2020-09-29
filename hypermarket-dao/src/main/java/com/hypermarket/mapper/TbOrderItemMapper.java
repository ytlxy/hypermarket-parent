package com.hypermarket.mapper;


import com.hypermarket.pojo.TbOrderItem;
import com.hypermarket.pojo.TbOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderItemMapper {
    public int countByExample(TbOrderItemExample example);
    public int deleteByExample(TbOrderItemExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbOrderItem record);
    public int insertSelective(TbOrderItem record);
    public List<TbOrderItem> selectByExample(TbOrderItemExample example);
    public TbOrderItem selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbOrderItem record,@Param("example") TbOrderItemExample example);
    public int updateByExample(@Param("record") TbOrderItem record,@Param("example") TbOrderItemExample example);
    public int updateByPrimaryKeySelective(TbOrderItem record);
    public int updateByPrimaryKey(TbOrderItem record);

}
