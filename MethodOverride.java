class Super
{
	Super(){
		System.out.println("Super Class Constructor");
	}
	public void display(){
		System.out.println("Super class display method");
	}
}
class Sub extends Super
{
	Sub(){
		System.out.println("sub class cnstructor");
	}
	//Overriden Method
	public void display(){
		System.out.println("Sub class overriden display method");
	}
}
public class MethodOverride
{
	public static void main(String []args){
		Sub s=new Sub();
		s.display();
	}
}
