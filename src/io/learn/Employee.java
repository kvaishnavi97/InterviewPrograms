package io.learn;

import java.util.Objects;

public class Employee {

	long empID;

	String name;
	String department;

	public Employee(int empID, String name, String department) {
		  this.empID=empID;
		  this.name=name;
		  this.department=department;
	}

	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empID == other.empID;
	}
	
	

}
