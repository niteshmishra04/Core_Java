
import java.util.Scanner;  
public class SumOfDigit   
{  
public static void main(String args[])  
{  
int a, b, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
	a = sc.nextInt();  
while(a > 0)  
{  
   b = a % 10;  
   sum = sum + b;  
  
a = a / 10;  
}  
 
System.out.println("Sum of Digits: "+sum);  
}  
}  