
class Box{
  double l,w,h;
  Box(){
  l=-1;
  w=-1;
  h=-1;
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
       return this.l*this.w*this.h;
    }
}
public class VolumeOfCube{
    public static void main(String args[]){
        Box b=new Box();
        System.out.println("The dimensions of the Box are.." );
        System.out.println("The length: "+b.l);
        System.out.println("The width: "+b.w);
        System.out.println("The Height: "+b.h);
        Cube c=new Cube();
        System.out.println("The volume using default values :"+c.volume());
        Cube c1=new Cube(5);
        System.out.println("The volume using value :"+c1.volume());
       }
}
