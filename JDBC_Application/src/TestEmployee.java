import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOImpl();
		 if(dao.addEmployee(new Employee(3000, 3000, "adding", "technoogy"))>0)
		 {
		 System.out.println("added");
		 }
		 else {
		 System.out.println("Not added");
		 }

		if (dao.updateEmployee(new Employee(3000, 6000, "adding new", "technoogy new"))) {
			System.out.println("updated");
		} else
			System.out.println("not updated");
		Employee employee = dao.findEmployeeById(3000);
		if (employee != null) {
			System.out.println(employee);
		} else {
			System.out.println("no record found");
		}

		System.out.println("num of records in list:" + dao.findAllEMployees().size());

	}

}
