package com.ia.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.Dao.EmployeeDao;
import com.ia.entity.Employee;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee addEmployee(Employee employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int empid) {
		
		return dao.deleteEmployee(empid);
	}

	@Override
	public Employee getEmployee(int empid) {
		
		return dao.getEmployee(empid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployees();
	}

}
