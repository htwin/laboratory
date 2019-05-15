package com.laboManager.mapper;

import com.laboManager.pojo.TbApply;
import com.laboManager.pojo.TbApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbApplyMapper {
    int countByExample(TbApplyExample example);

    int deleteByExample(TbApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbApply record);

    int insertSelective(TbApply record);

    List<TbApply> selectByExample(TbApplyExample example);

    TbApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByExample(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByPrimaryKeySelective(TbApply record);

    int updateByPrimaryKey(TbApply record);
}