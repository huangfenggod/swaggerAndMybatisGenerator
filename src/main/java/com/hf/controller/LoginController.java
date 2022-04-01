package com.hf.controller;

import com.hf.entity.LoginParam;
import com.hf.entity.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "登录")
public class LoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value = "登录",notes = "传入用户名，密码")
    @ApiImplicitParam(paramType = "LoginParam",name = "登录用户名密码",required = true,dataType = "LoginParam")
    @RequestMapping(value = "/login1")
    @ResponseBody
    public Response login(@RequestBody LoginParam loginParam){
        LOGGER.info("登录进来了");
        return new Response(200,"登录成功",null);
    }
}
