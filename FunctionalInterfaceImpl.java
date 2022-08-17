@FunctionalInterface
interface MyInterface
{
	public void showCase();
	//void disp(); //if you dont comment it, it gives error as FunctionalInterface can not have two abstract methods
}

class FunctionalInterfaceImpl implements MyInterface
{
	public void showCase(){
		System.out.println("ShowCase Implented");
	}
	void disp(){
			System.out.println("Disp Implented");
	}
	public static void main(String[] args) 
	{
		FunctionalInterfaceImpl m=new FunctionalInterfaceImpl();
		m.showCase();
		m.disp();
	}
}
