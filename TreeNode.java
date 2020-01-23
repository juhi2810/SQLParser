package SearchEngine;

import java.util.ArrayList;
import java.util.Collections;

public class TreeNode {
	public TreeNode left,right;
	public String attribute_value;
	
	
	public TreeNode(String data) {
		this.attribute_value = data;
		left=right=null;
	}
}

class BinaryTrees{
	static TreeNode root;
	
	TreeNode sortedArrayToBSTID(ArrayList<Employee> arr, int start, int end) {
		if(start>end)
			return null;
		Collections.sort(arr, new SortByID());
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(arr.get(mid).id);
		node.left = sortedArrayToBSTID(arr, start, mid-1);
		node.right = sortedArrayToBSTID(arr, mid+1, end);
		return node;
	}
	
	TreeNode sortedArrayToBSTFName(ArrayList<String> arr, int start, int end) {
		if(start>end)
			return null;
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(arr.get(mid));
		node.left = sortedArrayToBSTFName(arr, start, mid-1);
		node.right = sortedArrayToBSTFName(arr, mid+1, end);
		return node;
	}
	
	TreeNode sortedArrayToBSTLName(ArrayList<String> arr, int start, int end) {
		if(start>end)
			return null;
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(arr.get(mid));
		node.left = sortedArrayToBSTLName(arr, start, mid-1);
		node.right = sortedArrayToBSTLName(arr, mid+1, end);
		return node;
	}
	
	TreeNode sortedArrayToBSTDept(ArrayList<String> arr, int start, int end) {
		if(start>end)
			return null;
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(arr.get(mid));
		node.left = sortedArrayToBSTDept(arr, start, mid-1);
		node.right = sortedArrayToBSTDept(arr, mid+1, end);
		return node;
	}
	
	TreeNode sortedArrayToBSTSalary(ArrayList<String> arr, int start, int end) {
		if(start>end)
			return null;
		int mid = (start+end)/2;
		System.out.println("mid is: "+ arr.get(mid));
		TreeNode node = new TreeNode(arr.get(mid));
		node.left = sortedArrayToBSTSalary(arr, start, mid-1);
		node.right = sortedArrayToBSTSalary(arr, mid+1, end);
		return node;
	}
	
	public void printId(TreeNode node, String constant, String oper) {
		if(node==null) {
			return;
		}
		printId(node.left,constant,oper);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				System.out.println(Attribute.hmid.get(node.attribute_value).toString());
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			
		}
		else if("<=".equalsIgnoreCase(oper)) {
			
		}
		else if("<".equalsIgnoreCase(oper)) {
			
		}
		printId(node.right,constant,oper);
	}
	
	public void printFName(TreeNode node,String constant,String oper) {
		if(node==null) {
			return;
		}
		printFName(node.left,constant,oper);
		if(">=".equalsIgnoreCase(oper)) {
			
			
		}
		else if(">".equalsIgnoreCase(oper)) {
			
		}
		else if("<=".equalsIgnoreCase(oper)) {
			
		}
		else if("<".equalsIgnoreCase(oper)) {
			
		}
		printFName(node.right,constant,oper);
	}
	
	public void printLName(TreeNode node,String constant,String oper) {
		if(node==null) {
			return;
		}
		printLName(node.left,constant,oper);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				System.out.println(Attribute.hmlname.get(node.attribute_value).toString());
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			
		}
		else if("<=".equalsIgnoreCase(oper)) {
			
		}
		else if("<".equalsIgnoreCase(oper)) {
			
		}
		printLName(node.right,constant,oper);
		
	}
	
	public void printDept(TreeNode node, String constant, String oper) {
		if(node==null) {
			return;
		}
		printDept(node.left,constant,oper);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				System.out.println(Attribute.hmdept.get(node.attribute_value).toString());
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			
		}
		else if("<=".equalsIgnoreCase(oper)) {
			
		}
		else if("<".equalsIgnoreCase(oper)) {
			
		}
		printDept(node.right,constant,oper);
	}
	
	public void printSalary(TreeNode node, String constant,String oper) {
		if(node==null) {
			return;
		}
		printSalary(node.left,constant,oper);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				System.out.println(Attribute.hmsalary.get(node.attribute_value).toString());
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			
		}
		else if("<=".equalsIgnoreCase(oper)) {
			
		}
		else if("<".equalsIgnoreCase(oper)) {
			
		}
		printSalary(node.right,constant,oper);
	}
}
