package com.controller;


import com.lin.tx.common.entity.CommonResult;
import com.lin.tx.common.entity.UserInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ltx
 * @since 2022-05-30
 */
@RestController
@RequestMapping("/provider/system/userInfo")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "getbeixuan")
    public CommonResult<UserInfo> getUserList(@PathVariable("id") Long id) {
        UserInfo userList = userInfoService.getUser(id);
        if (userList == null) {
            throw new RuntimeException("不存在id"+id);
        }
        return new CommonResult(200, "插入数据成功", userList);
    }


    public CommonResult<UserInfo> getbeixuan(@PathVariable("id") Long id) {
        UserInfo userList = userInfoService.getUser(id);
        if (userList == null) {

            UserInfo userInfo = new UserInfo();
            userInfo.setUsername("备选策略");
            return new CommonResult(200, "插入数据成功", userInfo);
        }

        return new CommonResult(200, "插入数据成功", userList);
    }
}

