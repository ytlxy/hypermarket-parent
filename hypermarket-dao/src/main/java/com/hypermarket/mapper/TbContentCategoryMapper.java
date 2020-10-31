package com.hypermarket.mapper;

import com.hypermarket.pojo.TbContentCategory;
import com.hypermarket.pojo.TbContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentCategoryMapper {
    public int countByExample(TbContentCategoryExample example);
    public int deleteByExample(TbContentCategoryExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbContentCategory record);
    public int insertSelective(TbContentCategory record);
    public List<TbContentCategory> selectByExample(TbContentCategoryExample example);
    public TbContentCategory selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbContentCategory record,@Param("example") TbContentCategoryExample example);
    public int updateByExample(@Param("record") TbContentCategory record,@Param("example") TbContentCategoryExample example);
    public int updateByPrimaryKeySelective(TbContentCategory record);
    public int updateByPrimaryKey(TbContentCategory record);

}
