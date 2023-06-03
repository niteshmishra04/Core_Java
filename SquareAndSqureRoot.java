import java.util.Scanner;

public class SquareAndSqureRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		
		System.out.println("Square of the given number is:"+a*a);
		System.out.println("Square_root of the given number is:"+Math.sqrt(a));

	}

}
