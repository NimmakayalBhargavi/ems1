package com.cg.entities;

import java.util.List;

public class Department {
	private int deptNo;
	private String deptName;
	private int location;
	private List<Employee> employee;
	public Department(int deptNo, String deptName, int location, List<Employee> employee) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
		this.employee = employee;
	}
	public Department() {
		super();
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + location + ", employee="
				+ employee + "]";
	}
	
	
}
