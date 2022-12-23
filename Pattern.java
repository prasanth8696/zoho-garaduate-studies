import java.util.Scanner;
/*
 * input ==> E
 * output ;
ABCDEDCBA
 ABCDCBA
  ABCBA
   ABC
    A
   ABC
  ABCBA
 ABCDCBA
ABCDEDCBA
    
    */

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the char ");
		
		char ch = sc.next().toUpperCase().charAt(0);
		
		int n = ch - 64;
		
		
		// decreasing triangle
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			int temp = 64;
			
			for(int j=i;j<n;j++) {
				temp++;
				System.out.printf("%c",temp);
				
			}
			
			
			for(int j=i+1;j<n;j++) {
				temp--;
				System.out.printf("%c",temp);
			}
			System.out.println();
		}
		
		//increasing triangle
		
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.print(" ");
			}
			
			int temp = 64;
			
			for(int j=0;j<=i;j++) {
				temp++;
				System.out.printf("%c",temp);
			}
			
			for(int j=1;j<=i;j++) {
				temp--;
				System.out.printf("%c",temp);
			}
			System.out.println();
		}
	}
	

}
