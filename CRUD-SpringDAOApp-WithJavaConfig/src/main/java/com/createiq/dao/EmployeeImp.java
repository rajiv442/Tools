package com.createiq.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository("emp")
public class EmployeeImp implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES(?,?,?)", employee.getEid(), employee.getEname(),
				employee.geteSalary());

	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMPLOYEE SET ENAME = ?, ESAL = ? WHERE EID = ?", employee.getEname(),
				employee.geteSalary(), employee.getEid());

	}

	public void delete(Integer eid) {
		jdbcTemplate.update("delete Employee where eid= ?", eid);
	}

	public void findbyId(Integer eid) {
		// TODO Auto-generated method stub

	}

	public Employee findByID(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

	public double avgsal() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Map> namsalmap() {
		// TODO Auto-generated method stub
		return null;
	}

}
