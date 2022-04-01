package com.hf.mybatisgenerator.mapper;

import com.hf.mybatisgenerator.entity.Gen;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GenMapperExt extends GenMapper {
    Gen getGen();
}
