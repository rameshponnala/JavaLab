//Program to find the sum of first n naturals using recursion
import java.util.Scanner;
public class RecSumOfNatural{
	public int sumofnaturals(int n){
		if (n==0 || n==1)
		{
			return n;
		}
		else
		{
			return n+sumofnaturals(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any integer \n");
		n=sc.nextInt();
		RecSumOfNatural rs=new RecSumOfNatural();
		int f=rs.sumofnaturals(n);
		System.out.println("The sum of first "+n+ " naturals is " +f);
	}
}
