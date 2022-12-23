
import java.util.Scanner;
/* question print 1 and 5 number system
 *  input 5 
 *  output => 1 5 11 15 51
 * 
 */

//its not a best approash please refer in online
public class NumberSystem {
	public static boolean checkNumber(int num) {
		while(num != 0) {
			int lastDigit = num % 10;
			if ( (lastDigit == 1) || (lastDigit == 5) )
				;
			else 
				return false;
			num = num/10;			
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n ");
		int n = sc.nextInt();
		
		int count = 1 ;
		System.out.print(" " + 1 );
		int value = 2;
				
		while(count != n) {
			if ((value & 1) == 0) {
				value++;
				continue;
				
			}
		
		boolean res = checkNumber(value);
			if (res == true) {
				System.out.print(" " + value);
				value++;
				count++;
				continue;
			}
			value++;
			
		}

	}

}
