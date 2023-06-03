import java.util.Scanner;
public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		int r, sum=0, temp;
		System.out.println("Enter any nuimber to check whether it is palindrome or not");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		temp = n;
		
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is NOT a palindrome");
	}

}
