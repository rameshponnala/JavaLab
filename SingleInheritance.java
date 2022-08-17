class Box{
	  protected double l,w,h;
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
public class SingleInheritance{
    public static void main(String args[]){
        Box b=new Box();
        System.out.println("The dimensions of box are.." );
		b.getDimensions();

        Cube c=new Cube();
		System.out.println("The dimensions of Cube are.." );
		c.getDimensions();
        System.out.println("The volume using default values :"+c.volume());

        Cube c1=new Cube(5);
		System.out.println("The dimensions of Cube are.." );
		c1.getDimensions();
        System.out.println("The volume using value :"+c1.volume());

       }
}

