//Program to define user defined exception
//save as MinimumBalanceException.java and compile
public class MinimumBalanceException extends Exception
{
	MinimumBalanceException(){
		System.out.println("Low Balance");
	}
	MinimumBalanceException(String s){
		super(s);
	}
}