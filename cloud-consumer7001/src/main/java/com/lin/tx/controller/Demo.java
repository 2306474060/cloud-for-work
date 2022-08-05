package com.lin.tx.controller;

import com.lin.tx.common.entity.CommonResult;
import com.lin.tx.common.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/consumer")
public class Demo {

    final static String LocalURI="http://localhost:8001";


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAll")
    public CommonResult<UserInfo> getUserList() {
        return restTemplate.getForObject(LocalURI+"/provider/system/userInfo/getAll", CommonResult.class);
    }
}
