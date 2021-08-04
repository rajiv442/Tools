package com.createiq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.config.EmployeeConfig;
import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeImp;
import com.createiq.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeImp empdao = (EmployeeImp) context.getBean("emp");
		Employee employee = new Employee(124, "sara", 434343.);
		empdao.add(employee);
		System.out.println("------Add sucessfully---------");
//		System.out.println(employee); 
		
	}

}
