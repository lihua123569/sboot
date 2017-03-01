package com.sboot.user.service;

import com.sboot.user.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Yanghu
 * @since 2017-02-28
 */
public interface IUserService extends IService<User> {
	boolean deleteAll();
}
