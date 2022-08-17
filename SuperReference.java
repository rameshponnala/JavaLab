//Super Class Var Referencing to its Sub class object
class Box{
	  double l,w,h;
	  Box(){
		  l=-1;
		  w=-1;
		  h=-1;
	 }

	Box(double l,double w,double h){
		  this.l=l;
		  this.w=w;
		  this.h=h;
	 }
	 public double volume(){ 
		 return 0;
	 }
	 public void getDimensions(){
		System.out.println("The length: "+l);
        System.out.println("The width: "+w);
        System.out.println("The Height: "+h);
	 }
}
class Cube extends Box{
    Cube(){
		super();
    }
    Cube(double len){
		this.l=this.w=this.h=len;
    }
    public double volume(){
		System.out.println("Volume of Cube");
		return this.l*this.w*this.h;
    }
}

public class SuperReference{
    public static void main(String args[]){
       
		System.out.println("Using Super Class Variable...");
		Box ref;
		ref=new Cube(9);
		ref.getDimensions();
		System.out.println("The volume using reference variable :"+ref.volume());
		
	
 }
}

