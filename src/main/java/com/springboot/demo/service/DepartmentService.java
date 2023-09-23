package com.springboot.demo.service;

import com.springboot.demo.entity.Department;
import com.springboot.demo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDeparmentList();

    public Department fetchDepartmentById(Long departmentId)
            throws DepartmentNotFoundException;

    Department fetchDepartmentByName(String departmentName);
}
