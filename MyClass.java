package mypack;
public class MyClass
{
	public void show(){
		System.out.println("MyClass Show Method");
	}
	public String message(){
		System.out.println("MyCLass Message Method");
		return "Welcome Friend";
	}
}
//To Compile:
//c:>javac -d . MyClass.java