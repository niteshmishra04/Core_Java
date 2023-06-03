import java.util.Scanner;
public class LeapYearCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year you want to check whether leap or not:");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("This is Leap Year");
		else
			System.out.println("This is NOT a Leap Year");
	}

}
