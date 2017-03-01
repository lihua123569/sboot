package com.sboot.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;
import com.sboot.user.entity.User;
import com.sboot.user.service.IUserService;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2017-02-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	

	/**
	 * AR 部分测试
	 */
	@RequestMapping("/test")
	public Page<User> test() {
		User user = new User("testAr", 0, 1);
		System.err.println("删除所有：" + user.delete(null));
		user.insert();
		System.err.println("查询插入结果：" + user.selectById().toString());
		user.setName("mybatis-plus-ar");
		System.err.println("更新：" + user.updateById());
		return user.selectPage(new Page<User>(0, 12), null);
	}

	/**
	 * 增删改查 CRUD
	 */
	@RequestMapping("/test1")
	public User test1() {
		System.err.println("删除一条数据：" + userService.deleteById(1L));
		System.err.println("deleteAll：" + userService.deleteAll());
		System.err.println("插入一条数据：" + userService.insert(new User(1L, "张三", 17, 1)));
		User user = new User("张三", 17, 1);
		boolean result = userService.insert(user);
		// 自动回写的ID
		Long id = user.getId();
		System.err.println("插入一条数据：" + result + ", 插入信息：" + user.toString());
		System.err.println("查询：" + userService.selectById(id).toString());
		System.err.println("更新一条数据：" + userService.updateById(new User(1L, "三毛", 18, 2)));
		return userService.selectById(1L);
	}

	/**
	 * 插入 OR 修改
	 */
	@RequestMapping("/test2")
	public User test2() {
		userService.insertOrUpdate(new User(1L, "王五", 19, 3));
		return userService.selectById(1L);
	}

	/**
	 * 分页 PAGE
	 */
	@RequestMapping("/test3")
	public Page<User> test3() {
		return userService.selectPage(new Page<User>(0, 12));
	}
	
}
