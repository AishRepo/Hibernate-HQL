package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp15")
public class Employee {

	@Id
	private Integer empId;

	
	@Column
	private String empName;

	
	@Column
	private Integer empdept;
	
	

	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public Integer getEmpdept() {
		return empdept;
	}



	public void setEmpdept(Integer empdept) {
		this.empdept = empdept;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empdept=" + empdept + "]";
	}



	
}
