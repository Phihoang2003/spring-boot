package com.springboot.demo.controller;

import com.springboot.demo.entity.Department;
import com.springboot.demo.error.DepartmentNotFoundException;
import com.springboot.demo.service.DepartmentService;
import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER=
            LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment( @Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDeparmentList() {
        return departmentService.fetchDeparmentList();
    }

   @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
            throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }
    @GetMapping("/departments/name/{name}")
    public Department fetDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
