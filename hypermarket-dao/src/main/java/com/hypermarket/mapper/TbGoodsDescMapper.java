package com.hypermarket.mapper;


import com.hypermarket.pojo.TbGoodsDesc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsDescMapper {
    public int countByExample(TbGoodsDescMapper example);
    public int deleteByExample(TbGoodsDescMapper example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbGoodsDesc record);
    public int insertSelective(TbGoodsDesc record);
    public List<TbGoodsDesc> selectByExample(TbGoodsDescMapper example);
    public TbGoodsDesc selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbGoodsDesc record,@Param("example") TbGoodsDescMapper example);
    public int updateByExample(@Param("record") TbGoodsDesc record,@Param("example") TbGoodsDescMapper example);
    public int updateByPrimaryKeySelective(TbGoodsDesc record);
    public int updateByPrimaryKey(TbGoodsDesc record);

}
