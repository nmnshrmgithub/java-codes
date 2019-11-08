import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Student
{
int rollno;
String name;

void get()
{
System.out.println("enter roll no and name");
Scanner s=new Scanner(System.in);
rollno=s.nextInt();
name=s.next();

}
void show()
{
System.out.println(" \n you have entered :- \n\trollno= "+rollno +"\n\tName - "+name);
}


class Test extends Student
{
int marks1;
int marks2;

void get1()
{
System.out.println("\nEnter marks in 2 fields ");
Scanner s2=new Scanner(System.in);

marks1=s2.nextInt();
marks2=s2.nextInt();
show();
show1();
}
void show1()
{
System.out.println("\n\tMarks1= "+marks1+"\n\tMarks2="+marks2);


System.out.println(" \n Do you want to enter more inputs ");
Scanner s1=new Scanner(System.in);
String a;
a=s1.next();
if(a.equals("y"))
{
get();
}
else
{System.out.println(" ok thanks bye bye ");}

}

}
public static void main(String args[])
{
Test t=new Test();
t.get();
t.get1();

}
}