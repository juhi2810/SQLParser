package SearchEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Attribute {
	
	String attribute;
	Scanner sc = new Scanner(System.in);
	
	HashMap<String,ArrayList<Employee>> hmid = new HashMap<String,ArrayList<Employee>>();
	HashMap<String,ArrayList<Employee>> hmfname = new HashMap<String,ArrayList<Employee>>();
	HashMap<String,ArrayList<Employee>> hmlname = new HashMap<String,ArrayList<Employee>>();
	HashMap<String,ArrayList<Employee>> hmdept = new HashMap<String,ArrayList<Employee>>();
	HashMap<String,ArrayList<Employee>> hmsalary = new HashMap<String,ArrayList<Employee>>();
	
	public void createHashMaps() {
		EmployeeObjects emp_objs = new EmployeeObjects();
		emp_objs.getArr();
		for(int i=0;i<emp_objs.emp_array.size();i++) {
			hmid.putIfAbsent(emp_objs.emp_array.get(i).id, new ArrayList<Employee>());
			hmid.get(emp_objs.emp_array.get(i).id).add(emp_objs.emp_array.get(i));
			
			hmfname.putIfAbsent(emp_objs.emp_array.get(i).fname, new ArrayList<Employee>());
			hmfname.get(emp_objs.emp_array.get(i).fname).add(emp_objs.emp_array.get(i));
			
			hmlname.putIfAbsent(emp_objs.emp_array.get(i).lname, new ArrayList<Employee>());
			hmlname.get(emp_objs.emp_array.get(i).lname).add(emp_objs.emp_array.get(i));
			
			hmdept.putIfAbsent(emp_objs.emp_array.get(i).dept, new ArrayList<Employee>());
			hmdept.get(emp_objs.emp_array.get(i).dept).add(emp_objs.emp_array.get(i));
			
			hmsalary.putIfAbsent(emp_objs.emp_array.get(i).salary, new ArrayList<Employee>());
			hmsalary.get(emp_objs.emp_array.get(i).salary).add(emp_objs.emp_array.get(i));
		}
		
	}
	

}