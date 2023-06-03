import java.util.Scanner;
public class ArmstrongCheck {

	public static void main(String[] args) {

		int num=0, number, temp, total=0;
		
		System.out.println("Enter any number to check whether it is Armstrong or Not:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		number = num;
		
		while(number>0) {
			temp =number % 10;
			total = total+temp*temp*temp;
			number =number/10;
		}
		
		if(total==num)
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is NOT an Armstrong Number");

	}

}
