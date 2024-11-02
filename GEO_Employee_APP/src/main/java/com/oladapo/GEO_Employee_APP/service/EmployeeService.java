package com.oladapo.GEO_Employee_APP.service;

import com.oladapo.GEO_Employee_APP.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void delete(int theId);
}
