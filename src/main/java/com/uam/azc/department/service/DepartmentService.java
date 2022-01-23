package com.uam.azc.department.service;

import com.uam.azc.department.entity.Department;
import com.uam.azc.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of departmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentbyId(Long departmentId) {
        log.info("Inside findDepartment of departmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
