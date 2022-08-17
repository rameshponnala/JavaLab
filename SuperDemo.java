//Usage of super keyword 
class Box{
	   double l;
	  Box(){
		  l=-1;
	}

	Box(double l){
		  this.l=l;
	}
	 public double volume(){ 
		 return Math.pow(l,3);
	 }
	
}
class Cuboid extends Box{
	 private double l,w,h;
    Cuboid(){
		//Calling Super Class Constructor
		super();
    }
    Cuboid(double l,double w,double h){
		this.l=l;
		this.w=w;
		this.h=h;
    }

	 public void getDimensions(){
		System.out.println("The sides of Box are : "+super.l );
		 System.out.println("The dimensions of Cuboid are");
		 System.out.println(l + " "+ w+ "  " +"   "+h);
		 
	 }
    public double volume(){

		System.out.println("Super Class Volume"+super.volume());
		System.out.println("Volume of Cuboid");
		return this.l*this.w*this.h;
    }
}

public class SuperDemo{
    public static void main(String args[]){
       
				

		Cuboid cb2=new Cuboid(2,3,5);
		cb2.getDimensions();
		System.out.println("The volume of cuboid is :"+cb2.volume());
		
 }
}

