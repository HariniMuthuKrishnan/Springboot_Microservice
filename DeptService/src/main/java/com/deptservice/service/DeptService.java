package com.deptservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deptservice.model.Department;
import com.deptservice.repository.DeptRepository;


@Service
public class DeptService {
	
	@Autowired
	private DeptRepository deptRepository;

	public Department saveDept(Department dept) {
		return deptRepository.save(dept);
	}

	public Department getDeptById(Long deptId) {
		return deptRepository.getByDeptId(deptId);
	}
}
