package com.lin.tx.common.controller;

import com.lin.tx.common.entity.CommonResult;
import com.lin.tx.common.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/consumer")
public class Demo {

    final static String LocalURI="http://LINTXPRODER8001";

    //           http://localhost/consumer/getAll
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAll")
    public CommonResult<UserInfo> getUserList() {
        return restTemplate.getForObject(LocalURI+"/provider/system/userInfo/getAll", CommonResult.class);
    }
}
