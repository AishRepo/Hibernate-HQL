package com.sathya.test;

import java.util.List;

import com.sathya.dao.EmployeeDao;
import com.sathya.daoImpl.EmployeeDaoImpl;
import com.sathya.entity.Employee;

public class ClientApp {

	
	public static void main(String args[]) {
		EmployeeDao empdao =new EmployeeDaoImpl();
		
		// empdao.addEmployee();
	//	List<Employee> emplist =empdao.FindAllEmployee();
	//	for(Employee e :emplist) {
	//		System.out.println(e);
	//	}
		int uemp = empdao.UpdateEmployeeByDept(99);
		
		System.out.println(uemp);
	}
}
