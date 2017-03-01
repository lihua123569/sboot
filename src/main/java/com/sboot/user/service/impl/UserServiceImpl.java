package com.sboot.user.service.impl;

import com.sboot.user.entity.User;
import com.sboot.user.mapper.UserMapper;
import com.sboot.user.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2017-02-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}
}
