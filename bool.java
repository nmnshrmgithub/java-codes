import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Str5
{
public static void main(String args[])
{
String name;
String name1;
String name6="namansharma";
boolean b2;
String b1;
Scanner s=new Scanner(System.in);
System.out.println("Enter 2 strings and 2 no after it ");
name=s.next();
name1 =s.next();
b1=name.toLowerCase();

System.out.println("The two strings are "+b1);
System.out.println(name);
String n=b1.replace('n','m');

System.out.println(n);
}}
