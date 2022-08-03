package com.lintx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lintx.entity.UserInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ltx
 * @since 2022-05-30
 */
@Mapper
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
