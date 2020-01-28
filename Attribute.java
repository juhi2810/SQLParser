package SearchEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Attribute {
	
	String attribute;
	Scanner sc = new Scanner(System.in);
	
	public static HashMap<String,Employee> hmid = new HashMap<String,Employee>();
	public static HashMap<String,ArrayList<Employee>> hmfname = new HashMap<String,ArrayList<Employee>>();
	public static HashMap<String,ArrayList<Employee>> hmlname = new HashMap<String,ArrayList<Employee>>();
	public static HashMap<String,ArrayList<Employee>> hmdept = new HashMap<String,ArrayList<Employee>>();
	public static HashMap<String,ArrayList<Employee>> hmsalary = new HashMap<String,ArrayList<Employee>>();
	public static HashMap<String, ArrayList<String>> hmnotequal = new HashMap<String,ArrayList<String>>();
	
	public static TreeNode rootid,rootfname,rootlname,rootdept,rootsalary;
	
	static {
		createHashMaps();
		createBinaryTrees();
	}
	
	public static void createHashMaps() {
		EmployeeObjects emp_objs = new EmployeeObjects();
		emp_objs.getArr();
		for(int i=0;i<emp_objs.emp_array.size();i++) {
			hmid.putIfAbsent(emp_objs.emp_array.get(i).id, emp_objs.emp_array.get(i));
			
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
	
	public static void createBinaryTrees() {
		
		
		EmployeeObjects emp_objs = new EmployeeObjects();
		emp_objs.getArr();
		ArrayList<String> str = new ArrayList<String>();
		int flag=0;
		
		BinaryTrees bt = new BinaryTrees();
		
		rootid = bt.sortedArrayToBSTID(emp_objs.emp_array, 0, emp_objs.emp_array.size()-1);
		
		Collections.sort(emp_objs.emp_array, new SortByFName());
		str.add(emp_objs.emp_array.get(0).fname);
		for(int i=1;i<emp_objs.emp_array.size();i++) {
			for(int j=0;j<str.size();j++) {
				if(emp_objs.emp_array.get(i).fname.equalsIgnoreCase(str.get(j))){
					flag=1;
					break;
				}
			}
			if(flag==0) {
				str.add(emp_objs.emp_array.get(i).fname);
			}
			flag=0;
		}
		rootfname = bt.sortedArrayToBSTFName(str, 0, str.size()-1);
	
		str = new ArrayList<String>();
		Collections.sort(emp_objs.emp_array,new SortByLName());
		str.add(emp_objs.emp_array.get(0).lname);
		for(int i=1;i<emp_objs.emp_array.size();i++) {
			for(int j=0;j<str.size();j++) {
				if(emp_objs.emp_array.get(i).lname.equalsIgnoreCase(str.get(j))){
					flag=1;
					break;
				}
			}
			if(flag==0) {
				str.add(emp_objs.emp_array.get(i).lname);
			}
			flag=0;
		}
		rootlname = bt.sortedArrayToBSTLName(str, 0, str.size()-1);
		
		str = new ArrayList<String>();
		Collections.sort(emp_objs.emp_array, new SortByDept());
		str.add(emp_objs.emp_array.get(0).dept);
		for(int i=1;i<emp_objs.emp_array.size();i++) {
			for(int j=0;j<str.size();j++) {
				if(emp_objs.emp_array.get(i).dept.equalsIgnoreCase(str.get(j))){
					flag=1;
					break;
				}
			}
			if(flag==0) {
				str.add(emp_objs.emp_array.get(i).dept);
			}
			flag=0;
		}
		rootdept = bt.sortedArrayToBSTDept(str, 0, str.size()-1);
		
		str = new ArrayList<String>();
		Collections.sort(emp_objs.emp_array,new SortBySalary());
		str.add(emp_objs.emp_array.get(0).salary);
		for(int i=1;i<emp_objs.emp_array.size();i++) {
			for(int j=0;j<str.size();j++) {
				if(emp_objs.emp_array.get(i).salary.equalsIgnoreCase(str.get(j))){
					flag=1;
					break;
				}
			}
			if(flag==0) {
				str.add(emp_objs.emp_array.get(i).salary);
			}
			flag=0;
		}
		rootsalary = bt.sortedArrayToBSTSalary(str, 0, str.size()-1);
	}
	

}