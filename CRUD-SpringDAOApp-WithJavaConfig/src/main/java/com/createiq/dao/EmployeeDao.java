package com.createiq.dao;



import java.util.List;
import java.util.Map;

import com.createiq.model.Employee;

public interface EmployeeDao {
	void add(Employee employee);
	void update(Employee employee);
	void delete(Integer eid);
	void findbyId(Integer eid);
	Employee findByID(Integer eid);
	List<Employee> findall();
	Integer count();
	double avgsal();
	List<Map> namsalmap();
	

}
