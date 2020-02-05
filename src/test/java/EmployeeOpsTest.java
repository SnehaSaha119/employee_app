

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sneha.apps.emp.beans.Employee;
import com.sneha.apps.emp.crud.EmployeeOps;

public class EmployeeOpsTest {

	static EmployeeOps eOps;
	Employee emp;
	@BeforeClass
	public static void initialization()
	{
		eOps=new EmployeeOps();
	}
	
	@Test
	public void testEmployeeMap() {
		//EmployeeOps eOps=new EmployeeOps();
		
		assertEquals(1,eOps.getEmployee());
	}
	
	@Before
	public void testEmpCreation()
	{
		emp=new Employee(123,"Sneha","Readhat");
		eOps.createEmployee(emp);
	}

}
