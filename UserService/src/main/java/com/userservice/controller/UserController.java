package com.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.userservice.model.User;
import com.userservice.service.UserService;
import com.userservice.vo.ResponceTemplateVo;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveDept(@RequestBody User user) {
		return userService.saveUser(user);

	}

	@GetMapping("/{id}")
	public ResponceTemplateVo getUserandDeptDetail(@PathVariable("id") Long userId) {
		System.out.println("hi in getUserandDeptDetail");
		return userService.getUserandDeptDetail(userId);

	}
}
