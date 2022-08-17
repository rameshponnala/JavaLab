//program to demonstrate serialiazation and deserialization
import java.io.Serializable;

import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

class Employee implements Serializable 
{
	private int id;
	private String name;
    transient String address;// this variable can't be serializable
	private double sal;
	
	Employee(){
	System.out.println("No-arg constructor");
	}
	Employee(int id,String name, String address, double sal){
	this.id=id;
	this.name=name;
	this.address=address;
	this.sal=sal;
	}
	
	public void disp(){
	System.out.println("The id is"+id+"\n The name is"+name+"\n The salary is "+sal);
	System.out.println("The transient variable address is : "+address);
	}

}

public class SerialzeObject 
{
	public static void main(String[] args)  throws IOException,ClassNotFoundException
	{

	Employee e=new Employee(1290,"rams","Hyderabad",25000);
	
	//To Serialize:
	FileOutputStream fos=new FileOutputStream("serialfile.txt");
	ObjectOutputStream oos=new  ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("The object is serialized");

	//To Deserialize:
	System.out.println("Deserializing......\n");
	FileInputStream fis=new FileInputStream("serialfile.dat");
	ObjectInputStream ois=new  ObjectInputStream(fis);
	
	//Object obj=ois.readObject();
	//Employee obj=(Employee)obj;

		Employee obj=(Employee)ois.readObject();

		obj.disp();

		}
}
