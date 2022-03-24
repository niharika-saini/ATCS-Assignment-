package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.Service.EmployeeService;
import com.ia.entity.Employee;

@SpringBootTest
class SprintBootDemo1ApplicationTests {
	
	
    @Autowired
	EmployeeService service;
    
    @Test
    void testAddEmployee() {
    	Employee employee=new Employee(121, "Ritika", 1565, "Sikar");		
		Employee emp=service.addEmployee(employee);
    	assertEquals(emp.getEmpName(),"Ritika");
    	
    }

}
