//Welcome.java
public class Welcome{

   public static void main(String [ ] args){

         System.out.println("Welcome To OOP Lab using Java ");
   

    }
}









/*
Save the Program with the name of the class as follows

"Welcome.java"

To Compile:
 Go to the Directory in the command prompt wherever the program saved
For ex:
  F:\OOP Lab> javac Welcome.java

Note : if no errors it simply prompts cmd prompt otherwise it gives error messages

To Run:

  F:\OOP Lab> java Welcome

output: Welcome To OOP using Java Lab

 Note: out is an object of output stream class which is a static member of java.lang.System class
and it is an object of java.io.PrintStream class

Note: The structure of System class and its static members are as follows

public final class System{

    ------
    public static final InputStream in;
    public static final PrintStream out
    public static final PrintStream err     
    -----
    -----
}

Note: print() or println() is the one of the overloaded methods of the class java.io.PrintStream 

Note: as println() is the method of PrintStream class and out is a static member of System class and an object of PrintStream class, we are using the statement 

     System.out.println("...");

Note: To know the description of any class or interface the following command can be used 

  d:>javap java.io.PrintStream
  
  d:>javap java.lang.System

   d:>javap java.util.Scanner


 
Note:    To browse java documentation of the  API use the following web link
 https://docs.oracle.com/javase/8/docs/api/

  In this First choose your package name then choose your class or interface name then it displays the decription in the right frame.


Note: To make use of any package and its classes or interfaces we have to use the follwoing statement

     import packagename.class or interface name;

  Ex: import java.io.PrintStream;
         import java.util.Scanner;
         import java.sql.Statement;
         or
         import java.io.*;  // but not recommended one


*/


