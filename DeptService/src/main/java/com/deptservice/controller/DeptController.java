package com.deptservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.deptservice.model.Department;
import com.deptservice.service.DeptService;

@RestController
@RequestMapping("/departments")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/")
	public Department saveDept(@RequestBody Department dept) {
		System.out.println("hi");
		return deptService.saveDept(dept);
	}

	@GetMapping("/{id}")
	public Department getDeptById(@PathVariable("id") Long deptId) {
		return deptService.getDeptById(deptId);

	}

}
