class SuperClass{
    public void getDetails(){
       System.out.println("Super class Disp Method");
   }
  }
class SubClass extends SuperClass{
  @Override //try to remove comment for this and compile once and observe   
  public void getdetails(){    //speeling mistaken it should be getDetails()
       System.out.println("sub class Disp Method");
   }
  }
 public class AtOverride{
	public static void main(String[] args) 
	{
		SuperClass sp=new SubClass();
		sp.getDetails();		
	}
}
