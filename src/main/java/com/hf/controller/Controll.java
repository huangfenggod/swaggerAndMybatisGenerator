package com.hf.controller;

import com.hf.mybatisgenerator.entity.Gen;
import com.hf.service.GetGen;
import com.hf.service.GetGenimpl;
import com.hf.thredtest.RequestThread;
import com.jayway.jsonpath.internal.function.ParamType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.TreeMap;

@RestController
@Api(tags = "后台接口",hidden = true)
@RequestMapping("/a")
public class Controll {
    @Autowired
    private GetGen getGen;

    @GetMapping("/b")
    @ApiOperation(value = "一个接口方法的测试",notes = "新增拓展")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "name1", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "name2", required = true, dataType = "String")}
    )
    public String say(@RequestParam("name1") String name1,@RequestParam String name2){
        return name1+name2;
    }
    @GetMapping("/c")
    @ApiOperation("一个接口方法的测试")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", required = true, dataType = "long")}
    )
    public Gen say1(@RequestParam("id") long id){
        for (int i=0;i<100;i++){
            RequestThread thread = new RequestThread(getGen);
            thread.start();
            System.out.println(thread.getName());

        }
        return getGen.getGen(id);

    }
    public String say2(@RequestParam("name1") String name1,@RequestParam String name2){
        return name1+name2;
    }
    @GetMapping("/d")
    @ApiOperation("一个接口方法的测试")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", required = true, dataType = "long")}
    )
    public Gen say2(@RequestParam("id") long id){
        return getGen.getGennone();

    }
}
