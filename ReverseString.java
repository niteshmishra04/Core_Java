import java.util.Scanner;
public class ReverseString {
	
	public static void main(String[] args) {
		String s, rev="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String:");
		s = sc.next();

		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		
		System.out.println("Reverse of the given string is:"+rev);
		
		if(s.equals(rev)) {
			System.out.println("Given string is palindrome:");
		}
		
		else {
			System.out.println("Given string is not a palindrome");
		}
		
	}
}
