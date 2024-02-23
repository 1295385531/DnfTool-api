package com.shijiu.dnftool.back.controller;

import com.shijiu.dnftool.common.base.BaseApiService;
import com.shijiu.dnftool.common.base.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2023-10-23-18:03
 * @Description:
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private BaseApiService baseApiService;

    @RequestMapping("/login")
    public BaseResponse login(){

        return baseApiService.setResultSuccess(true);
    }

}
