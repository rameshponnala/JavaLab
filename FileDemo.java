//Java program to create file object and get its properties using file object
import java.io.File;
class  FileProperties
{
	public static void main(String[] args) 
	{
		File f=new File("/JavaLab/Annotations");

		System.out.println("File Object is :"+ f.toString());
		System.out.println("File Name is :"+ f.getName());
		System.out.println("File path  is :"+ f.getPath());
		System.out.println("File abslute path  is :"+ f.getAbsolutePath());
		System.out.println("File parent  is :"+ f.getParent());
		System.out.print("File Exists :");
		System.out.println(f.exists() ? "Exists " : " Doesn't Exist");
		System.out.println("Is Directory ?: "+(f.isDirectory() ? " Yes " : " No"));
		System.out.println("Is writable " + (f.canWrite() ? " Writable " : " Not Writable"));
	    System.out.println("Is readable " + (f.canRead() ? " Readable " : " Not Readable"));
	
	}
}
