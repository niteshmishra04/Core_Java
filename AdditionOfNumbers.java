import java.util.Scanner;
public class AdditionOfNumbers {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number:");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Number:");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Result:"+c);
	}

}

