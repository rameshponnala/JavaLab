// Java Program illustrating the Character Stream to copy contents of one file to another file.

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
