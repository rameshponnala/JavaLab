// Java program to read and write from file using BufferedReader and BufferedWriter
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

	   FileReader fr = new FileReader( sourceFile );
	   BufferedReader br = new BufferedReader( fr );

	   FileWriter fw = new FileWriter( targetFile );
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
		   bw.write("\n");
		}
	   }

	   System.out.println("File Written into "+targetFile.getName());
	   br.close();
	   fr.close();
	   bw.close();
	   fw.close();
  	}
}