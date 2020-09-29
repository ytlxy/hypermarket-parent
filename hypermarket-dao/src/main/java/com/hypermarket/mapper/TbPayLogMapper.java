package com.hypermarket.mapper;


import com.hypermarket.pojo.TbPayLog;
import com.hypermarket.pojo.TbPayLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPayLogMapper {
    public int countByExample(TbPayLogExample example);
    public int deleteByExample(TbPayLogExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbPayLog record);
    public int insertSelective(TbPayLog record);
    public List<TbPayLog> selectByExample(TbPayLogExample example);
    public TbPayLog selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbPayLog record,@Param("example") TbPayLogExample example);
    public int updateByExample(@Param("record") TbPayLog record,@Param("example") TbPayLogExample example);
    public int updateByPrimaryKeySelective(TbPayLog record);
    public int updateByPrimaryKey(TbPayLog record);

}
