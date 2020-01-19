package SearchEngine;

import java.util.Scanner;

public class AttriAdapter {
	private String attr_name;
	private String oper;
	private String constant;
	Scanner sc = new Scanner(System.in);
	
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
	
	
	
}