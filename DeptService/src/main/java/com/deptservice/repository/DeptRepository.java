package com.deptservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deptservice.model.Department;


@Repository
public interface DeptRepository extends JpaRepository<Department, Long>
{

	Department getByDeptId(Long deptId);

}
