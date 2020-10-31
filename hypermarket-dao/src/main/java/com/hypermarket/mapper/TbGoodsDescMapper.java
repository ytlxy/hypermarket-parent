package com.hypermarket.mapper;


import com.hypermarket.pojo.TbGoodsDesc;
import com.hypermarket.pojo.TbGoodsDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsDescMapper {
    public int countByExample(TbGoodsDescExample example);
    public int deleteByExample(TbGoodsDescExample example);
    public int deleteByPrimaryKey(Long goodsId);
    public int insert(TbGoodsDesc record);
    public int insertSelective(TbGoodsDesc record);
    public List<TbGoodsDesc> selectByExample(TbGoodsDescExample example);
    public TbGoodsDesc selectByPrimaryKey(Long goodsId);
    public int updateByExampleSelective(@Param("record") TbGoodsDesc record,@Param("example") TbGoodsDescExample example);
    public int updateByExample(@Param("record") TbGoodsDesc record,@Param("example") TbGoodsDescExample example);
    public int updateByPrimaryKeySelective(TbGoodsDesc record);
    public int updateByPrimaryKey(TbGoodsDesc record);

}
