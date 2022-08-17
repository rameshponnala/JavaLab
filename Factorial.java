//Program to find the factorial of a given number using recursion
import java.util.Scanner;
public class Factorial
{	
	static int a;
	public static int factorial(int n)
	{
		if(n==1||n==0)
		{
			return 1;
		}
			else
		{
				return n*factorial(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int f;
		System.out.println("enter number");
		a=sc.nextInt();
		f=factorial(a);
		System.out.println("factorial value is"+f);
	}
}

