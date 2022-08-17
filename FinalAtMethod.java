//Program to demostrate Final Method
class Super
{
	public final void show(){
		System.out.println("Final Show Method");
	}
}
class Sub extends Super
{
	//Override final method
	public void show(){
		System.out.println("Overriden Method");
	}
}
public class  FinalAtMethod 
{
	public static void main(String[] args) 
	{
		Super sp=new Super();
		System.out.println("Super Class Method Invocation");
		sp.show();
		Sub s=new Sub();
		System.out.println("Sub Class Method Invocation which gives error");
		s.show();
	}
}
