package com.hf.service;

import com.hf.mybatisgenerator.entity.Gen;
import com.hf.mybatisgenerator.mapper.GenMapper;
import com.hf.mybatisgenerator.mapper.GenMapperExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetGenimpl implements GetGen {
private static final Logger LOGGER = LoggerFactory.getLogger(GetGenimpl.class);

    @Autowired
   private GenMapperExt genMapper;
    @Override
    public Gen getGen(long number) {
        LOGGER.info("访问一次");


        return genMapper.selectByPrimaryKey(number);
    }
    @Override
    public Gen getGennone() {
        return genMapper.getGen();
    }
}
