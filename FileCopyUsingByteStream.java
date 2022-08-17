// Java Program illustrating the Byte Stream to copy contents of one file to another file.
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
