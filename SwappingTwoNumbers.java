import java.util.Scanner;
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before Swapping:"+x+" "+y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("After Swapping:"+x+" "+y);
	}

}
