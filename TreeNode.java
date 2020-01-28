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
	ArrayList<Employee> temp = new ArrayList<Employee>();
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
		TreeNode node = new TreeNode(arr.get(mid));
		node.left = sortedArrayToBSTSalary(arr, start, mid-1);
		node.right = sortedArrayToBSTSalary(arr, mid+1, end);
		return node;
	}
	
	public void printId(TreeNode node, String constant, String oper, AttriAdapter obj) {
		if(node==null) {
			return;
		}
		printId(node.left,constant,oper,obj);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				obj.result_set.add(node.attribute_value);
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>0) {
				obj.result_set.add(node.attribute_value);
			}
		}
		else if("<=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<=0) {
				obj.result_set.add(node.attribute_value);
			}
		}
		else if("<".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<0) {
				obj.result_set.add(node.attribute_value);
			}
		}
		else if("!=".equalsIgnoreCase(oper)) {
			if(!(node.attribute_value.compareTo(constant)==0)) {
				obj.result_set.add(node.attribute_value);
			}
		}
		printId(node.right,constant,oper,obj);
	}
	
	public void printFName(TreeNode node,String constant,String oper, AttriAdapter obj) {
		if(node==null) {
			return;
		}
		printFName(node.left,constant,oper,obj);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				temp.addAll(Attribute.hmfname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>0) {
				temp.addAll(Attribute.hmfname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<=0) {
				temp.addAll(Attribute.hmfname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<0) {
				temp.addAll(Attribute.hmfname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("!=".equalsIgnoreCase(oper)) {
			if(!(node.attribute_value.compareTo(constant)==0)) {
				temp.addAll(Attribute.hmfname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		printFName(node.right,constant,oper,obj);
	}
	
	public void printLName(TreeNode node,String constant,String oper, AttriAdapter obj) {
		if(node==null) {
			return;
		}
		printLName(node.left,constant,oper,obj);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				temp.addAll(Attribute.hmlname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>0) {
				temp.addAll(Attribute.hmlname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<=0) {
				temp.addAll(Attribute.hmlname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<0) {
				temp.addAll(Attribute.hmlname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("!=".equalsIgnoreCase(oper)) {
			if(!(node.attribute_value.compareTo(constant)==0)) {
				temp.addAll(Attribute.hmlname.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		printLName(node.right,constant,oper,obj);
		
	}
	
	public void printDept(TreeNode node, String constant, String oper, AttriAdapter obj) {
		if(node==null) {
			return;
		}
		printDept(node.left,constant,oper,obj);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				temp.addAll(Attribute.hmdept.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>0) {
				temp.addAll(Attribute.hmdept.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<=0) {
				temp.addAll(Attribute.hmdept.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<0) {
				temp.addAll(Attribute.hmdept.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("!=".equalsIgnoreCase(oper)) {
			if(!(node.attribute_value.compareTo(constant)==0)) {
				temp.addAll(Attribute.hmdept.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		printDept(node.right,constant,oper,obj);
	}
	
	public void printSalary(TreeNode node, String constant,String oper, AttriAdapter obj) {
		if(node==null) {
			return;
		}
		printSalary(node.left,constant,oper,obj);
		if(">=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>=0) {
				temp.addAll(Attribute.hmsalary.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if(">".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)>0) {
				temp.addAll(Attribute.hmsalary.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<=".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<=0) {
				temp.addAll(Attribute.hmsalary.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("<".equalsIgnoreCase(oper)) {
			if(node.attribute_value.compareTo(constant)<0) {
				temp.addAll(Attribute.hmsalary.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		else if("!=".equalsIgnoreCase(oper)) {
			if(!(node.attribute_value.compareTo(constant)==0)) {
				temp.addAll(Attribute.hmsalary.get(node.attribute_value));
				for(int i=0;i<temp.size();i++) {
					obj.result_set.add(temp.get(i).id);
				}
				temp.clear();
			}
		}
		printSalary(node.right,constant,oper,obj);
	}
}
