//Program to demstrate Abstract Class
abstract class MyAbstract
{
	public void show(){
		System.out.println("Concrete Show Method from MyAbstract");
    }
	public abstract void disp();
	public abstract void message();
	
}
class MyAbstractImpl extends MyAbstract
{
	public  void disp(){
		System.out.println("Implemented Disp method");
	}
	public  void message(){
		System.out.println("Welcome to Abstract Class Implementor");
	}
}
class AbstractDemo
{

	public static void main(String[] args) 
	{
		MyAbstractImpl m=new MyAbstractImpl();
		m.show();
		m.disp();
		m.message();
		//Abstract Class variable referencing to its sub class obj
		MyAbstract ma=new MyAbstractImpl();
		System.out.println("Using Reference Variable");
		ma.show();
		ma.disp();
		ma.message();
	}
}
