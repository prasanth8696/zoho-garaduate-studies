import java.util.Scanner;
/* question is
 *    check the given substring is available in the string1 if avalable return last occurence index
 *    input  string1 => hello123hello123
 *            string2 => 123
 *    output => 13
 */

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter str1 ");
		String str1 = sc.next();
		System.out.println("enter substring ");
		String str2 = sc.next();
		
		int count = 0;
		int j = (str1.length() - 1);
		int i = (str2.length() - 1);
		while(count != str2.length() && j >= 0) {
			if (str1.charAt(j) == str2.charAt(i)) {
				i--;
				j--;
				count++;
			}
			else {
				count = 0;
				i = (str2.length() - 1);
			}
		}
		if (count == 0)
			System.out.println(-1);
		else
			System.out.println(j+1);
		

	}

}
