package com.lintx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lintx.entity.UserInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ltx
 * @since 2022-05-30
 */
public interface IUserInfoService extends IService<UserInfo> {

    List<UserInfo> getUserList();

}
