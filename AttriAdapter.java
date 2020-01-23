package SearchEngine;

import java.util.ArrayList;
import java.util.Scanner;

public class AttriAdapter {
	private String attr_name;
	private String oper;
	private String constant;
	Scanner sc = new Scanner(System.in);
	BinaryTrees bt = new BinaryTrees();
	
	
	public void input() {
		
		System.out.println("Enter the field on which query is to be performed: ");
		this.attr_name=sc.nextLine();
		System.out.println("Enter the operator for the constraint: ");
		this.oper=sc.nextLine();
		System.out.println("Enter the constant for the constraint: ");
		this.constant=sc.nextLine();
		
	}

	public String getAttr_name() {
		return attr_name;
	}

	public void setAttr_name(String attr_name) {
		this.attr_name = attr_name;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getConstant() {
		return constant;
	}

	public void setConstant(String constant) {
		this.constant = constant;
	}
	
	public void equals() {
		Employee e = null;
		ArrayList<Employee> emp_resultset;
		if("id".equalsIgnoreCase(this.attr_name)) {
			e = Attribute.hmid.get(this.constant);
			System.out.println(e.toString());
		}
		else if("fname".equalsIgnoreCase(this.attr_name)) {
			emp_resultset = Attribute.hmfname.get(this.constant);
			for(int i=0;i<emp_resultset.size();i++) {
				System.out.println(emp_resultset.get(i).toString());
			}
		}
		else if("lname".equalsIgnoreCase(this.attr_name)) {
			emp_resultset = Attribute.hmlname.get(this.constant);
			for(int i=0;i<emp_resultset.size();i++) {
				System.out.println(emp_resultset.get(i).toString());
			}
		}
		else if("dept".equalsIgnoreCase(this.attr_name)) {
			emp_resultset = Attribute.hmdept.get(this.constant);
			for(int i=0;i<emp_resultset.size();i++) {
				System.out.println(emp_resultset.get(i).toString());
			}
		}
		else if("salary".equalsIgnoreCase(this.attr_name)) {
			emp_resultset = Attribute.hmsalary.get(this.constant);
			for(int i=0;i<emp_resultset.size();i++) {
				System.out.println(emp_resultset.get(i).toString());
			}
		}		
	}
	
	public void greaterThanEqualTo() {
		TreeNode temp = null;
		if("id".equalsIgnoreCase(this.attr_name)) {
			temp = Attribute.rootid;
			while(!(temp.attribute_value.compareTo(this.constant)>=0)) {
				if(this.constant.compareToIgnoreCase(temp.attribute_value)<0) {
					temp = temp.left;
				}
				else if(this.constant.compareToIgnoreCase(temp.attribute_value)>0) {
					temp = temp.right;
				}
			}
			bt.printId(temp, this.constant, this.oper);
		}
		else if("fname".equalsIgnoreCase(this.attr_name)) {
			temp = Attribute.rootfname;
			while(!(temp.attribute_value.compareTo(this.constant)>=0)) {
				if(this.constant.compareToIgnoreCase(temp.attribute_value)<0) {
					temp = temp.left;
				}
				else if(this.constant.compareToIgnoreCase(temp.attribute_value)>0) {
					temp = temp.right;
				}
			}
			bt.printFName(temp, this.constant, this.oper);
		}
		else if("lname".equalsIgnoreCase(this.attr_name)) {
			temp = Attribute.rootlname;
			while(!(temp.attribute_value.compareTo(this.constant)>=0)) {
				if(this.constant.compareToIgnoreCase(temp.attribute_value)<0) {
					temp = temp.left;
				}
				else if(this.constant.compareToIgnoreCase(temp.attribute_value)>0) {
					temp = temp.right;
				}
			}
			bt.printLName(temp, this.constant, this.oper);
		}
		else if("dept".equalsIgnoreCase(this.attr_name)) {
			temp = Attribute.rootdept;
			while(!(temp.attribute_value.compareTo(this.constant)>=0)) {
				if(this.constant.compareToIgnoreCase(temp.attribute_value)<0) {
					temp = temp.left;
				}
				else if(this.constant.compareToIgnoreCase(temp.attribute_value)>0) {
					temp = temp.right;
				}
			}
			bt.printDept(temp, this.constant, this.oper);
		}
		else if("salary".equalsIgnoreCase(this.attr_name)) {
			temp = Attribute.rootsalary;
			while(!(temp.attribute_value.compareTo(this.constant)>=0)) {
				if(this.constant.compareToIgnoreCase(temp.attribute_value)<0) {
					temp = temp.left;
				}
				else if(this.constant.compareToIgnoreCase(temp.attribute_value)>0) {
					temp = temp.right;
				}
			}
			bt.printSalary(temp, this.constant, this.oper);
			
		}
		
	}
	
	
	
	
}