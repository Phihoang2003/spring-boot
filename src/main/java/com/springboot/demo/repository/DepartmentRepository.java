package com.springboot.demo.repository;

import com.springboot.demo.entity.Department;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
    public Department findByDepartmentName(String departmentName);
}
