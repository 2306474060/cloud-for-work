package com.lintx.controller;


import com.lin.tx.common.entity.CommonResult;
import com.lin.tx.common.entity.UserInfo;
import com.lintx.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/getAll")
    public CommonResult<UserInfo> getUserList() {
        List<UserInfo> userList = userInfoService.getUserList();
        return new CommonResult(200, "插入数据成功", userList);
    }

    @GetMapping("/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        UserInfo byId = userInfoService.getById(id);
        if (!byId.equals(null)) {
            return new CommonResult(200, "插入数据成功", byId);
        } else {
            return new CommonResult(404, "插入数据成功", null);

        }
    }
    @PostMapping("/create")
    public CommonResult create(@RequestBody UserInfo userInfo) {
        int i = userInfoService.create(userInfo);
        if (i>0) {
            return new CommonResult(200, "插入数据成功", i);
        }else {
            return new CommonResult(404, "插入数据成功", null);

        }
    }
}

