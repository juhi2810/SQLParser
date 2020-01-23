package SearchEngine;

public class ImplemenMain {
	public static void main(String[] args) {
		
		AttriAdapter aaobj = new AttriAdapter();
		aaobj.input();
		
		if("=".equals(aaobj.getOper())) {
			aaobj.equals();
		}
		else if(">=".equals(aaobj.getOper())) {
			aaobj.greaterThanEqualTo();
		}
		/*else if(">".equals(aaobj.getOper())) {
			aaobj.greaterThan();
		}*/
		
		
	}
}
