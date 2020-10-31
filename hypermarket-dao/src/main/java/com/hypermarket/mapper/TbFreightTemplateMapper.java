package com.hypermarket.mapper;

import com.hypermarket.pojo.TbFreightTemplate;
import com.hypermarket.pojo.TbFreightTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbFreightTemplateMapper {
    public int countByExample(TbFreightTemplateExample example);
    public int deleteByExample(TbFreightTemplateExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbFreightTemplate record);
    public int insertSelective(TbFreightTemplate record);
    public List<TbFreightTemplate> selectByExample(TbFreightTemplateExample example);
    public TbFreightTemplate selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbFreightTemplate record,@Param("example") TbFreightTemplateExample example);
    public int updateByExample(@Param("record") TbFreightTemplate record,@Param("example") TbFreightTemplateExample example);
    public int updateByPrimaryKeySelective(TbFreightTemplate record);
    public int updateByPrimaryKey(TbFreightTemplate record);

}
