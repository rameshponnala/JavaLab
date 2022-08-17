//Program to demonstrate Interface
interface MyInter
{
	int MAX=10;
	void show();
	 public abstract String message();
}
class MyInterImpl implements MyInter
{
	public void show(){
		System.out.println("MAX :"+MAX);//MAX can't be modified as it is final variable
		System.out.println("Implemented Show method");
	}
	public String message(){
		System.out.println("Implemented message method");
		return "Welcome to Interfaces";
	}
}
public class InterfaceDemo
{
	public static void main(String[] args) 
	{
		MyInterImpl mi=new MyInterImpl();
		mi.show();
		System.out.println("Message : "+mi.message());
	}
}
