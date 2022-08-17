//program to display fibonacci series using recursion 
import java.util.Scanner;
class fiboni
{
	public int fibon(int a)
	{
			if(a==0 || a==1)
				return a;
			else
				return fibon(a-1)+fibon(a-2);
	}
}

public class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		fiboni f1=new fiboni();
		for(int i=0;i<n;i++)
			System.out.print("\t "+f1.fibon(i));
	}
}