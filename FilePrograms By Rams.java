//59. Java program to create file object and get its properties using file object
import java.io.File;
import java.io.IOException;
class  FileProperties
{
	public static void main(String[] args) 
	{
		File f=new File("D:/JavaLab/Annotations");//prefix D:/ for absolute path

		System.out.println("File Object is :"+ f.toString());
		System.out.println("File Name is :"+ f.getName());
		System.out.println("File path  is :"+ f.getPath());
		System.out.println("File abslute path  is :"+ f.getAbsolutePath());
		System.out.println("File parent  is :"+ f.getParent());
		System.out.print("File Exists :");
		System.out.println(f.exists() ? "Exists " : " Doesn't Exist");
		System.out.println("Is Directory ?: "+(f.isDirectory() ? " Yes " : " No"));
		System.out.println("Is writable  ?: " + (f.canWrite() ? " Writable " : " Not Writable"));
	    System.out.println("Is readable ?: " + (f.canRead() ? " Readable " : " Not Readable"));
		System.out.println("Is File ?: "+(f.isFile() ? " Yes " : " No"));
		System.out.println("Is Absolute ?: "+(f.isAbsolute() ? " Yes " : " No"));
		System.out.println("Last Modified : "+ f.lastModified());
		System.out.println("Size of the File : "+ f.length() + " in bytes");
		String listOfFiles[]=f.list();
		System.out.println(" \n List of Files in " +f.getName() + " Directory are...\n " );
		for (String fileName: listOfFiles)
		{
			System.out.println( fileName);
		}
		//It generates array of file objects
		File files[]=f.listFiles();
		System.out.println(" \n List of Files in " +f.getName() + " Directory are...\n " );
		for (File fileObj: files)
		{
			System.out.println( (fileObj.isFile()) ? ( "It is file named "+fileObj.getName() ) : (" It is directory named "+ fileObj.getName() ));
		}

		//Create a new File
		File newFile= new File("mcaclass.txt");
		try{
		System.out.println("\n "+ newFile.getName() + " File created : " +(newFile.createNewFile()));
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		//Create directory
		File dir= new File("MCAIIsem");
		System.out.println(dir.getName() + " Directory created : " +(dir.mkdir()));
	}
}

//60 Java Program to display list of file names with specified extension using FilenameFilter
import java.io.FilenameFilter;
import java.io.File;

class ExtensionFilter 
{
	public static void main(String[] args) 
	{
		File dir=new File("D:/JavaLab/Annotations");
		
		String javaFiles[]= dir.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".java");
				}
				});

		for(String file: javaFiles)
			System.out.println( file);
	}
}

//61 Java Program illustrating the Byte Stream to copy contents of one file to another file.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyUsingByteStream {
	public static void main(	String[] args)	{

		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try {
			sourceStream
				= new FileInputStream("D:/JavaLab/Annotations/AnnotationsNotes.txt");
			targetStream
				= new FileOutputStream("notes.txt");

			// Reading source file and writing content to target file byte by byte
			int temp;
			while ( (temp = sourceStream.read())	!=  -1)
				targetStream.write((byte)temp);
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally {
			try{
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
			}
			catch(IOException e){e.printStackTrace();}
		}
	}
}

//62 Java Program illustrating the Character Stream to copy contents of one file to another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUsingCharStream {
	public static void main(	String[] args)	{
		FileReader sourceStream = null;
		FileWriter targetStream=null;
		try {
			sourceStream	= new FileReader("Student.java");
			targetStream	= new FileWriter("charTargetFile.txt");
			// Reading sourcefile and writing content to target file character by character.
			int temp=-1;
			while ( (temp = sourceStream.read()) !=  -1)
				targetStream.write(temp);//writes onto file
			}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally {
			try{
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

//63 Java program to read the file content and display using BufferedInputStream
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamApp{
	public static void main(String args[])
	{	
			InputStream fin=null;
			BufferedInputStream bufin=null;
			try
			{
				fin= new FileInputStream("FinalVarEx.java");
				//give existing file name
				bufin = new BufferedInputStream(fin);
				int i;
				while( (i = bufin.read()) != -1)
				{
					System.out.print((char)i);
				}
				
			}
			catch(IOException exp){
				System.out.println(" Exception Raised ::"+exp);
			}
			finally{
				try{
					bufin.close();
					fin.close();
				}
				catch(Exception e){e.printStackTrace();}
			}
	}
}

//64 Java program to write the content onto file using BufferedOutputStream
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamApp
{
	public static void main(String args[])
	{	
		OutputStream os=null;
		BufferedOutputStream bos=null;

		try
		{
			String msg = " Hi Lets do work with BufferedOutputStream 8/11/2022";
			os = new FileOutputStream("demo.txt");
			bos = new BufferedOutputStream(os);
			byte[] msgArr = msg.getBytes();
			bos.write(msgArr);
			System.out.println(" Data Transfer done to a file");
		}
		catch(IOException exp)
		{
				System.out.println(" Exception Raised ::"+exp);
			}
			finally{
				try{
				bos.flush();
				bos.close();
				os.close();
			}catch(Exception e){e.printStackTrace();}
		}
	}
}

//65 Java program to read and write from file using BufferedReader and BufferedWriter
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

import java.util.Scanner;

public class FileBufferRead
{
   public static void main(String [] args) throws IOException
   {

	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter source file name");
	   String sourceFile=s.next();

	   System.out.println("Enter target file name");
	   String targetFile=s.next();

	   File inFile  = new File(sourceFile);
	   File outFile = new File(targetFile);	

	   FileReader fr = new FileReader( inFile );
	   BufferedReader br = new BufferedReader( fr );

	   FileWriter fw = new FileWriter( outFile );
	   BufferedWriter bw = new BufferedWriter( fw );	

	   String temp = null;
       boolean keepReading = true;
	
	   while( keepReading )
	   {
		temp = br.readLine();
		if( temp == null) 
		{
		   keepReading = false;
		}
		else
		{ 
		   bw.write( temp );
		}
	   }

	   System.out.println("File Written succesfully into "+ targetFile.getName());
	   br.close();
	   fr.close();
	   bw.close();
	   fw.close();
  	}
}

//66 Java program to demonstrate serialiazation and deserialization
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