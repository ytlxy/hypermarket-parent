package com.hypermarket.mapper;

import com.hypermarket.pojo.TbTypeTemolate;
import com.hypermarket.pojo.TbTypeTemolateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {
    public int countByExample(TbTypeTemolateExample example);
    public int deleteByExample(TbTypeTemolateExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbTypeTemolate record);
    public int insertSelective(TbTypeTemolate record);
    public List<TbTypeTemolate> selectByExample(TbTypeTemolateExample example);
    public TbTypeTemolate selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbTypeTemolate record, @Param("example") TbTypeTemolateExample example);
    public int updateByExample(@Param("record") TbTypeTemolate record,@Param("example") TbTypeTemolateExample example);
    public int updateByPrimaryKeySelective(TbTypeTemolate record);
    public int updateByPrimaryKey(TbTypeTemolate record);

}
