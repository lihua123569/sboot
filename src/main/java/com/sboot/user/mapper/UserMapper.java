package com.sboot.user.mapper;

import com.sboot.user.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  * 用户表 Mapper 接口
 * </p>
 *
 * @author Yanghu
 * @since 2017-02-28
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * @Title: deleteAll
	 * @Description: TODO
	 * @return
	 * @return: Integer
	 */
	Integer deleteAll();

}