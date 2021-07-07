package com.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userservice.model.User;
import com.userservice.repository.UserRepository;
import com.userservice.vo.Department;
import com.userservice.vo.ResponceTemplateVo;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponceTemplateVo getUserandDeptDetail(Long userId) {
		ResponceTemplateVo vo = new ResponceTemplateVo();
		User user = userRepository.getById(userId);
		Department depatment = restTemplate.getForObject("http://DEPT-SERVICE/departments/" + user.getDeptId(),Department.class);
		vo.setUser(user);
		vo.setDepartment(depatment);
		return vo;
	}

}
