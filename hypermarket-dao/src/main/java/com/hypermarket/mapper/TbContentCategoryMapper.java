package com.hypermarket.mapper;

import com.hypermarket.pojo.TbContentCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentCategoryMapper {
    public int countByExample(TbContentCategoryMapper example);
    public int deleteByExample(TbContentCategoryMapper example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbContentCategory record);
    public int insertSelective(TbContentCategory record);
    public List<TbContentCategory> selectByExample(TbContentCategoryMapper example);
    public TbContentCategory selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbContentCategory record,@Param("example") TbContentCategoryMapper example);
    public int updateByExample(@Param("record") TbContentCategory record,@Param("example") TbContentCategoryMapper example);
    public int updateByPrimaryKeySelective(TbContentCategory record);
    public int updateByPrimaryKey(TbContentCategory record);

}
