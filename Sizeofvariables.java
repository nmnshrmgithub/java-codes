import java.lang.*;
import java.util.Scanner;
import java.io.*;

 class Student
{
	public static int f(int x,int y)
	{
		return (x>y) ? y:x;
	}
	public static void main(String args[])
	{

	System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
	System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
    System.out.println("Size of Short: " + (Short.SIZE/8) + " bytes.");
    System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
    System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
    System.out.println("Size of char: " + sizeof(char.class) + " bytes.");
    System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
    System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
	}
}