package com.hypermarket.mapper;


import com.hypermarket.pojo.TbGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsMapper {
    public int countByExample(TbGoodsMapper example);
    public int deleteByExample(TbGoodsMapper example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbGoods record);
    public int insertSelective(TbGoods record);
    public List<TbGoods> selectByExample(TbGoodsMapper example);
    public TbGoods selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbGoods record,@Param("example") TbGoodsMapper example);
    public int updateByExample(@Param("record") TbGoods record,@Param("example") TbGoodsMapper example);
    public int updateByPrimaryKeySelective(TbGoods record);
    public int updateByPrimaryKey(TbGoods record);

}
