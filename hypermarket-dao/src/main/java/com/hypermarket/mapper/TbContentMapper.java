package com.hypermarket.mapper;

import com.hypermarket.pojo.TbContent;
import com.hypermarket.pojo.TbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    public int countByExample(TbContentExample example);
    public int deleteByExample(TbContentExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbContent record);
    public int insertSelective(TbContent record);
    public List<TbContent> selectByExample(TbContentExample example);
    public TbContent selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbContent record,@Param("example") TbContentExample example);
    public int updateByExample(@Param("record") TbContent record,@Param("example") TbContentExample example);
    public int updateByPrimaryKeySelective(TbContent record);
    public int updateByPrimaryKey(TbContent record);

}
