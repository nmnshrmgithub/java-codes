import java.io.*;
import java.lang.*;
import java.util.Scanner;  
class MyException extends Exception
{
MyException(String message)
{
super(message);
}
}
class Error4
	{
	public static void main(String args[])
	{
Scanner s= new Scanner(System.in);

	float x=0.0f, y=0.0f;
float z=0.0f;
System.out.println("Enter 2 numbers");
x=s.nextFloat();
y=s.nextFloat();
	try
	{
	 z= x/ y;
	if(z<0.01)
 	{
 	throw new MyException("Number is too small");
	}
                  else
              {
System.out.println(z);
}
	}
	catch(MyException e)
	{
	System.out.println("Caught my Exception");
	System.out.println(e.getMessage());
	}
        }

	}










