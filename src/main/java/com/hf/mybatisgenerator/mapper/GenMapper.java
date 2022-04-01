package com.hf.mybatisgenerator.mapper;

import com.hf.mybatisgenerator.entity.Gen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface GenMapper {
    int deleteByPrimaryKey(Long tableId);

    int insert(Gen record);

    Gen selectByPrimaryKey(Long tableId);

    List<Gen> selectAll();

    int updateByPrimaryKey(Gen record);
}
