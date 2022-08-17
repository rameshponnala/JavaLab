//Java program to create file object and get its properties using file object
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
