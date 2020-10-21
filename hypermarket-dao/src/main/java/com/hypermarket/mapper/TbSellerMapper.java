package com.hypermarket.mapper;


import com.hypermarket.pojo.TbSeller;
import com.hypermarket.pojo.TbSellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSellerMapper {
    public int countByExample(TbSellerExample example);
    public int deleteByExample(TbSellerExample example);
    public int deleteByPrimaryKey(String id);
    public int insert(TbSeller record);
    public int insertSelective(TbSeller record);
    public List<TbSeller> selectByExample(TbSellerExample example);
    public TbSeller selectByPrimaryKey(String id);
    public int updateByExampleSelective(@Param("record") TbSeller record,@Param("example") TbSellerExample example);
    public int updateByExample(@Param("record") TbSeller record,@Param("example") TbSellerExample example);
    public int updateByPrimaryKeySelective(TbSeller record);
    public int updateByPrimaryKey(TbSeller record);

}
