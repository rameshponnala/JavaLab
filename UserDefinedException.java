//UserDefinedException.java
class Employee
{
	private int bal=0;
	Employee(int bal){
	  this.bal=bal;
	}
	public  void withdraw(int amt) throws MinimumBalanceException {
		if (bal>=0 && amt<=bal)
		{
			System.out.println("You can withdraw amount "+amt);
		}
		else
			 throw new MinimumBalanceException("Please maintain min balance in your account");
	}
}
public class UserDefinedException 
{
	public static void main(String[] args) 
	{
		Employee s=new Employee(10000);
		try{
			  s.withdraw(100000);
		}
		catch(MinimumBalanceException mbe){
			System.out.println(mbe.getMessage());
		}
	}
}
