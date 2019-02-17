package com.sathya.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.sql.Update;

import com.sathya.dao.EmployeeDao;
import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	SessionFactory factory = HibernateUtil.getSessionFactory();

	/*	public void addEmployee() {
		Session s1 = factory.openSession();
		 Transaction tx = s1.beginTransaction();
		Employee emp11 = new Employee();
		emp11.setEmpId(01);
		emp11.setEmpName("Aish");
        emp11.setEmpdept(99);
        Employee emp12 =new Employee();
        emp12.setEmpId(02);
        emp12.setEmpName("John");
        emp12.setEmpdept(100);
        Employee emp13 =new Employee();
        emp13.setEmpId(03);
        emp13.setEmpName("michael");
        emp13.setEmpdept(50);
        Employee emp14 =new Employee();
        emp14.setEmpId(04);
        emp14.setEmpName("barak");
        emp14.setEmpdept(70);
		
		//s1.save(emp11);
		//s1.save(emp12);
        s1.save(emp13);
        //s1.save(emp14);
		tx.commit();
		

	}*/
	
	/*
public List FindAllEmployee() {
		String HQL_QUERY = "Select e from Employee e where empId=:id";

		Session session = factory.openSession();
		Query qry = session.createQuery(HQL_QUERY);
		qry.setParameter("id", 2);
		List list = qry.list();
		session.close();

		return list;
	}
*/
	public int UpdateEmployeeByDept(Integer dept) {
		Session session = factory.openSession();
		String hql1= "update Employee set empdept = :empdept where empId =:empId";
		Query qry =session.createQuery(hql1);
	qry.setParameter("empdept",5);
	qry.setParameter("empId", 3);
		Transaction tx =session.beginTransaction();
		int result =qry.executeUpdate();
		tx.commit();
		session.close();
		
		return result;
		
		
		
		
		
		
		
}

		
	}



