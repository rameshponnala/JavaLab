class ThrowExample
{
	public void division(int a, int b){
		if(b<=0)
			throw new ArithmeticException();
		else
			System.out.println("Result is "+(a/b));
	 }
}
public class ThrowDemo{
	public static void main(String[] args) 
	{
		ThrowExample te=new ThrowExample();
		try{
			te.division(15,0);	
		}
		catch(ArithmeticException ae){
			System.out.println("Please change the value of b as non zero");
		}
	}
}
