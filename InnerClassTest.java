//Program to demostrate nested or inner class
class MyOuter{
 private int x=7;
    class MyInner{
		public void innerMethod(){
			 System.out.println("Outer x is"+x);
		   }
    }//close for inner
}//close for outer
public class InnerClassTest{
	public static void main(String[] arg){
		//MyOuter mo=new MyOuter();
			//MyOuter.MyInner inner=mo.new MyInner();
			// above two lines can be written as follows in single line
			MyOuter.MyInner inner=new MyOuter().new MyInner();
			inner.innerMethod();
	}
}
			
