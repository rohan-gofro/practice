package ques3;

public class Employee implements Comparable<Employee>{

	long empId;
	String empName;
	double empSalary;
	
	public Employee(long empId , String empName , double empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (empId ^ (empId >>> 32));
		return result;
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
		if (empId != other.empId)
			return false;
		return true;
	}
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		
		if(empId == arg0.empId)
		return 0;
		
		else if(empId > arg0.empId)
		return 1;
		
		else
			return -1;
		
	}
	
}
