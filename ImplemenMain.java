package SearchEngine;

import java.util.ArrayList;
import java.util.Scanner;

public class ImplemenMain {
	public static void main(String[] args) {
		ArrayList<AttriAdapter> aalist = new ArrayList<AttriAdapter>();
		ArrayList<String> logical_oper = new ArrayList<String>();
		ArrayList<Employee> final_resultset = new ArrayList<Employee>();
		int no_of_conditions,flag=0;
		String loper;
		System.out.println("Enter the number of conditions: ");
		Scanner sc = new Scanner(System.in);
		no_of_conditions=sc.nextInt();
		AttriAdapter aaobj = null;
		for(int i=0;i<no_of_conditions;i++) {
			aaobj = new AttriAdapter();
			aaobj.input();
			aalist.add(aaobj);
			if(i!=(no_of_conditions-1)){
				System.out.println("Enter the logical operator between the current and the next condition: ");
				loper = sc.next();
				logical_oper.add(loper);
			}
		}
		for(int i=0;i<no_of_conditions;i++) {
			if("=".equals(aalist.get(i).getOper())) {
				aalist.get(i).equals();
			}
			else if(">=".equals(aalist.get(i).getOper())) {
				aalist.get(i).greaterThanEqualsTo();
			}
			else if(">".equals(aalist.get(i).getOper())) {
				aalist.get(i).greaterThanEqualsTo();
			}
			else if("<=".equals(aalist.get(i).getOper())) {
				aalist.get(i).lessThanEqualsTo();
			}
			else if("<".equals(aalist.get(i).getOper())) {
				aalist.get(i).lessThanEqualsTo();
			}
			else if("!=".equals(aalist.get(i).getOper())) {
				aalist.get(i).notEqualsTo();
			}
		}
		for(int i=0,l=0;i<no_of_conditions;i++,l++) {
			if(i==0) {
				if("&&".equalsIgnoreCase(logical_oper.get(l))){
					for(int j=0;j<aalist.get(i).result_set.size();j++) {
						for(int k=0;k<aalist.get(i+1).result_set.size();k++) {
							if(aalist.get(i).result_set.get(j).equalsIgnoreCase(aalist.get(i+1).result_set.get(k))) {
								final_resultset.add(Attribute.hmid.get(aalist.get(i).result_set.get(j)));
								break;
							}
						}
					}
				}
				else if("||".equalsIgnoreCase(logical_oper.get(l))) {
					for(int j=0;j<aalist.get(i).result_set.size();j++) {
						final_resultset.add(Attribute.hmid.get(aalist.get(i).result_set.get(j)));	
					}
					for(int j=0;j<aalist.get(i+1).result_set.size();j++) {
						for(int k=0;k<final_resultset.size();k++) {
							if(aalist.get(i+1).result_set.get(j).equalsIgnoreCase(final_resultset.get(k).id)){
								flag=1;
								break;
							}
						}
						if(flag==0) {
							final_resultset.add(Attribute.hmid.get(aalist.get(i+1).result_set.get(j)));
						}
						else {
							flag=0;
						}
					}
				}
			}
			else {
				if(no_of_conditions>2)
					i=2;
				else
					break;
				if("&&".equalsIgnoreCase(logical_oper.get(l))){
					int j=0;
					while(j<final_resultset.size()) {
						for(int k=0;k<aalist.get(i).result_set.size();k++) {
							if(final_resultset.get(j).id.equalsIgnoreCase(aalist.get(i).result_set.get(k))) {
								flag=1;
							}
						}
						if(flag==0) {
							final_resultset.remove(j);
						}
						else {
							flag=0;
							j+=1;
						}
					}
				}
				else if("||".equalsIgnoreCase(logical_oper.get(i))) {
					for(int j=0;j<aalist.get(i).result_set.size();j++){
						for(int k=0;k<final_resultset.size();k++) {
							if(aalist.get(i).result_set.get(j).equalsIgnoreCase(final_resultset.get(k).id)) {
								flag=1;
							}
						}
						if(flag==0) {
							final_resultset.add(Attribute.hmid.get(aalist.get(i).result_set.get(j)));
						}
						else{
							flag=0;
						}
					}
				}
				
			}
		}
		
		if(final_resultset.isEmpty()) {
			System.out.println("Empty!");
		}
		for(int i=0;i<final_resultset.size();i++) {
			System.out.println(final_resultset.get(i).toString());
		}
		
		
		
		
		
		
	}
}
