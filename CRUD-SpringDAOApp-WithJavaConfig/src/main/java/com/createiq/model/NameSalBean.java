package com.createiq.model;

public class NameSalBean {
	private String name;
	private double salary;
	public NameSalBean() {
		super();
	}
	public NameSalBean(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "NameSalBean [name=" + name + ", salary=" + salary + "]";

}
}