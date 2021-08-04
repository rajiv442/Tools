package com.createiq.model;

public class Employee {
 private Integer eid;
 private String ename;
 private double esalary;
public Employee() {
	super();
}
public Employee(Integer eid, String ename, double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = salary;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double geteSalary() {
	return esalary;
}
public void setSalary(double esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}

}
