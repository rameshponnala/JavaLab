//MyPackDemo.java with main method to use mypack classes  
import mypack.MyClass;
import mypack.MyDemoPack;
class MyPackDemo 
{
	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		m.show();
		System.out.println(m.message());
		MyDemoPack md=new  MyDemoPack();
		md.disp();
	}
}
//Comple using javac MyPackDemo.java