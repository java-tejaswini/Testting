package com.test;

import java.sql.SQLException;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.pojo.Employee;

public class TestEmployee {

	EmployeeDAO dao = new EmployeeDAOImpl();

	@Test
	public void test() {
			Employee employee = new Employee(3000, 3000, "adding", "technoogy");
			assertThrows(SQLException.class,()->{
				dao.addEmployee1(employee);
			});
		

	}

}
