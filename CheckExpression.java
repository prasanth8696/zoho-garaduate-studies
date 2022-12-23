
import java.util.Scanner;
import java.util.ArrayList;
/*
 * question 
 *    check the expression is valid or not
 *    input => (a+b)(ab+)
 *    output => invalid
 *    
 *    input => (a+b)(a+b)
 *     output => valid
 */   

public class CheckExpression {
	
	public static boolean  checkExp(String str) {

		ArrayList stack = new ArrayList();
		//boundry conditions
		if (str.charAt(0) == ')')
				return false;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == '(')
				stack.add(str.charAt(i));
			
			else if(str.charAt(i) == ')'){
				if (stack.size() > 0)
					stack.remove(stack.size()-1);
				else
					return false;
			}
			else if((str.charAt(i) == '+') || (str.charAt(i) == '-') || (str.charAt(i) == '*') || (str.charAt(i) == '/') ) {
				try {
					if (str.charAt(i-1) >= 97 && str.charAt(i+1) >= 97 && str.charAt(i-1) <= 122 && str.charAt(i+1) <= 122) {
						
					}
					else
						return false;
					
				}
				catch(StringIndexOutOfBoundsException e) {
					return false;
				}
			}
			
		}
		if (stack.size() == 0)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression...");
		String str = sc.next();
		
		boolean res = checkExp(str);
		if (res) 
			System.out.println(str + " Valid...");
		else
			System.out.println(str + " NotValid...");
		
		
		

	}

}
