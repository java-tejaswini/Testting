package com.pojo;

public class Employee {
	private int empId, salary;
	private String name, technoogy;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, int salary, String name, String technoogy) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
		this.technoogy = technoogy;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnoogy() {
		return technoogy;
	}

	public void setTechnoogy(String technoogy) {
		this.technoogy = technoogy;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", technoogy=" + technoogy + "]";
	}

}
