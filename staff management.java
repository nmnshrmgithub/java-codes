import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Staff
{

int id;
String name;
float salary;

void get()
{
System.out.println("\n Enter id name and salary ");
Scanner s=new Scanner(System.in);
id=s.nextInt();
name=s.next();
salary=s.nextFloat();
}
}

class Typist extends Staff
{
int ts;
Scanner s1=new Scanner(System.in);
void get1()
{
System.out.println("Enter typing speed");
ts=s1.nextInt();
}
void show()
{
System.out.println("\n\tId - "+id+"\n\tName - "+name+"\n\tSalary - "+salary+"\n\tTyping speed - "+ts);
}

}


class Manager extends Staff
{

String dept;
void get2()
{
Scanner s2=new Scanner(System.in);
System.out.println("Enter dept ");
dept=s2.next();
}

void show1()
{
System.out.println("\n\tId - "+id+"\n\tName - "+name+"\n\tSalary - "+salary+"\n\tDepartment - "+dept);
}

public static void main(String args[])
{


Typist t1=new Typist();
Manager t2=new Manager();
t1.get();
t1.get1();
t1.show();
t2.get2();
t2.show1();
}
}
