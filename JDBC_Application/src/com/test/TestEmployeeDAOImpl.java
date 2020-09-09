package com.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.pojo.Employee;

public class TestEmployeeDAOImpl {

	@Test
	public void testAddEmployee_positive() {

		EmployeeDAO dao = new EmployeeDAOImpl();
		Employee employee = new Employee(1, 1000, "CDK", "JAVA");
		int added = dao.addEmployee(employee);
		assertTrue(added == 1);
	}

	@Test
	public void testAddEmployee1() {
	}

	@Test
	public void testUpdateEmployee() {
	}

	@Test
	public void testDeleteEmployee() {
		EmployeeDAO dao = new EmployeeDAOImpl();
		int deleted = dao.deleteEmployee(1);
		assertEquals(1, deleted);

		assertTrue(dao.findEmployeeById(1) == null);

	}

	@Test
	public void testFindEmployeeById() {
		// Employee employee = new Employee(1, 1000, "CDK", "JAVA");
		EmployeeDAO dao = new EmployeeDAOImpl();
		Employee employee = dao.findEmployeeById(1);
		assertTrue(employee != null);
		assertEquals("CDK", employee.getName());
		assertEquals("JAVA", employee.getTechnoogy());
		assertEquals(1000, employee.getSalary());
	}

	@Test
	public void testFindEmployeeById_negative() {
		// Employee employee = new Employee(1, 1000, "CDK", "JAVA");
		EmployeeDAO dao = new EmployeeDAOImpl();
		Employee employee = dao.findEmployeeById(10);
		assertTrue(employee == null);

	}

	@Test
	public void testFindAllEMployees() {
		EmployeeDAO dao = new EmployeeDAOImpl();
		List<Employee> employees = dao.findAllEMployees();
		assertEquals(1, employees.size());

		Employee employee = employees.get(0);
		assertTrue(employee != null);
		assertEquals("CDK", employee.getName());
		assertEquals("JAVA", employee.getTechnoogy());
		assertEquals(1000, employee.getSalary());

	}

}
