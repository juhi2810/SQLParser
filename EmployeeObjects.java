package SearchEngine;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeObjects{
	ArrayList<Employee> emp_array;
	
	public EmployeeObjects() {}

	public void getArr() {
		
		emp_array = new ArrayList<Employee>();
		emp_array.add(new Employee("101","Raj","Sharma","Prod","20000"));
		emp_array.add(new Employee("102","Soham","Gupta","Dev","35000"));
		emp_array.add(new Employee("103","Ritu","Desai","Testing","18000"));
		emp_array.add(new Employee("104","Jayesh","Shukla","Prod","22000"));
		emp_array.add(new Employee("105","Abhinav","Deshpande","BA","23000"));
		emp_array.add(new Employee("106","Trisha","Goyal","QA","30000"));
		emp_array.add(new Employee("107","Jack","Brown","Dev","25000"));
		emp_array.add(new Employee("108","Peter","Dawson","Testing","23000"));
		emp_array.add(new Employee("109","Joe","Fernandez","QA","31000"));
		emp_array.add(new Employee("110","Richa","Tiwari","BA","34000"));
		
	
	}
	
}
	
class SortByID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.id.compareTo(o2.id);
	}
	
}

class SortByFName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.fname.compareTo(o2.fname);
	}
	
}

class SortByLName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.lname.compareTo(o2.lname);
	}
	
}

class SortByDept implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.dept.compareTo(o2.dept);
	}
	
}

class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.salary.compareTo(o2.salary);
	}
	
}
