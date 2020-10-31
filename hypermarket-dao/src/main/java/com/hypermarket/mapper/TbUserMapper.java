package com.hypermarket.mapper;

import com.hypermarket.pojo.TbUser;
import com.hypermarket.pojo.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    public int countByExample(TbUserExample example);
    public int deleteByExample(TbUserExample example);
    public int deleteByPrimaryKey(Long id);
    public int insert(TbUser record);
    public int insertSelective(TbUser record);
    public List<TbUser> selectByExample(TbUserExample example);
    public TbUser selectByPrimaryKey(Long id);
    public int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);
    public int updateByExample(@Param("record") TbUser record,@Param("example") TbUserExample example);
    public int updateByPrimaryKeySelective(TbUser record);
    public int updateByPrimaryKey(TbUser record);

}
