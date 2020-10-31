package com.hypermarket.mapper;


import com.hypermarket.pojo.TbGoods;
import com.hypermarket.pojo.TbGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsMapper {
    public int countByExample(TbGoodsExample example);
    public int deleteByExample(TbGoodsExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbGoods record);
    public int insertSelective(TbGoods record);
    public List<TbGoods> selectByExample(TbGoodsExample example);
    public TbGoods selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbGoods record,@Param("example") TbGoodsExample example);
    public int updateByExample(@Param("record") TbGoods record,@Param("example") TbGoodsExample example);
    public int updateByPrimaryKeySelective(TbGoods record);
    public int updateByPrimaryKey(TbGoods record);

}
