package com.ia.Service;

import java.util.List;

import com.ia.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	String  deleteEmployee(int empid);
	Employee getEmployee(int empid);
	List<Employee> getAllEmployee();

}
