import java.util.Scanner;
public class DoubleToInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any double value:");
		double a = sc.nextDouble();
		int b = (int)a;
		
		System.out.println("Result:"+b);

	}

}
