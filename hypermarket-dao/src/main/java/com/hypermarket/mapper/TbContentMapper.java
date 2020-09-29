package com.hypermarket.mapper;

import com.hypermarket.pojo.TbContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    public int countByExample(TbContentMapper example);
    public int deleteByExample(TbContentMapper example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbContent record);
    public int insertSelective(TbContent record);
    public List<TbContent> selectByExample(TbContentMapper example);
    public TbContent selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbContent record,@Param("example") TbContentMapper example);
    public int updateByExample(@Param("record") TbContent record,@Param("example") TbContentMapper example);
    public int updateByPrimaryKeySelective(TbContent record);
    public int updateByPrimaryKey(TbContent record);

}
