package com.laboManager.mapper;

import com.laboManager.pojo.TbScrap;
import com.laboManager.pojo.TbScrapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbScrapMapper {
    int countByExample(TbScrapExample example);

    int deleteByExample(TbScrapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbScrap record);

    int insertSelective(TbScrap record);

    List<TbScrap> selectByExample(TbScrapExample example);

    TbScrap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbScrap record, @Param("example") TbScrapExample example);

    int updateByExample(@Param("record") TbScrap record, @Param("example") TbScrapExample example);

    int updateByPrimaryKeySelective(TbScrap record);

    int updateByPrimaryKey(TbScrap record);
}