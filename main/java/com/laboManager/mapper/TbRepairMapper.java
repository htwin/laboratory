package com.laboManager.mapper;

import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRepairMapper {
    int countByExample(TbRepairExample example);

    int deleteByExample(TbRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRepair record);

    int insertSelective(TbRepair record);

    List<TbRepair> selectByExample(TbRepairExample example);

    TbRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRepair record, @Param("example") TbRepairExample example);

    int updateByExample(@Param("record") TbRepair record, @Param("example") TbRepairExample example);

    int updateByPrimaryKeySelective(TbRepair record);

    int updateByPrimaryKey(TbRepair record);
}