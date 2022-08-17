class MyDepricate
{
	@Deprecated //comment it and try
	public void display(){
		System.out.println("The  display method");
	}
	public void newDisp(){
		System.out.println("The new disp method");
	}
}
public class AtDeprecated 
{
	public static void main(String[] args) 
	{
		MyDepricate m=new MyDepricate();
		m.display();
		m.newDisp();
		
	}
}
