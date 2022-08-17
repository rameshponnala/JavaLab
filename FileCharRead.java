//reading characters from file and copying into another file
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io. IOException;
import java.util.Scanner;
public class FileCharRead
{
	//constructor
   public static void main(String [] args) throws IOException {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter any file name");
	  String file=s.next();
	   File inFile  = new File(file);
	   File outFile = new File("file1.txt");	

	   FileReader fr = new FileReader( inFile );
	   FileWriter fw = new FileWriter( outFile );
	
	   int c = 0;
       boolean keepReading = true;
	
	   while( keepReading ){
			c = fr.read();
			if( c == -1 )
			{
			   keepReading = false;
			}
			else
			{ 
			   fw.write( c );
			}
	   } 
      
	  System.out.println("Read and written into file1.txt file...");
	   
	  fr.close();
	   fw.close();
  	}
}
