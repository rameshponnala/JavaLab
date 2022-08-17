class ThrowsExample
{
	public void division() throws ArithmeticException{
		int a=7,b=8;
		System.out.println("The result is "+(a/b));
	}
	public void array() throws ArrayIndexOutOfBoundsException{
		int a[]={1,2,3,4,5};
		System.out.println("a[5] is" +a[5]);
	}
}
public class ThrowsDemo 
{
	public static void main(String[] args) 
	{
		ThrowsExample te=new ThrowsExample();
		try{
			te.division();
			te.array();
		}
		
		catch(ArithmeticException ae){
		  System.out.println(ae.getMessage());
		  ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println(aioobe.getMessage());
		}
	}
}
