package com.hypermarket.mapper;


import com.hypermarket.pojo.TbOrder;
import com.hypermarket.pojo.TbOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {
    public int countByExample(TbOrderExample example);
    public int deleteByExample(TbOrderExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbOrder record);
    public int insertSelective(TbOrder record);
    public List<TbOrder> selectByExample(TbOrderExample example);
    public TbOrder selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbOrder record,@Param("example") TbOrderExample example);
    public int updateByExample(@Param("record") TbOrder record,@Param("example") TbOrderExample example);
    public int updateByPrimaryKeySelective(TbOrder record);
    public int updateByPrimaryKey(TbOrder record);

}
