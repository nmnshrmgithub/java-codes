import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Bank
{
int accno;
String name;
float balance;
float w1;
Scanner s=new Scanner(System.in);
void input()
{
System.out.println("\n Welcome customer \n please enter your account no name and balance :- ");
accno=s.nextInt();
name=s.next();
balance=s.nextFloat();
}

void input1()
{
System.out.println("\n Welcome customer \n please enter your account no name and balance :- ");
accno1=s.nextInt();
name1=s.next();
balance1=s.nextFloat();
}


void display()
{
System.out.println("\n ****Welcome**** \n   "+accno+"\n dear  "+name+"\n your balance is  "+balance);
}

int withdraw()
{
System.out.println("How much money do you want to withdraw ");
w1=s.nextFloat();
display();
if(balance<w1)
{
System.out.println(" SORRY you dont have enough balance ");
}
else
{
float amt;
amt=balance-w1;
System.out.println(" Kindly pickout your money ");
System.out.println(" Your remaining balance is "+amt);

}
return 0;
}

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
Bank s1=new Bank();
Bank s2=new Bank();

s1.input();
s2.input1();

System.out.println("\n For further operations please one of the account \n To select an account please enter the account no \n account no = ");
String z=sc.next();
if(z.equals(
System.out.println("\n  Do you want to display customers information ");
String d=sc.next();
if(d.equals("y"))
{
s1.display();
s2.display();
}
System.out.println("\n  Do you want to withdraw money ");
String w=sc.next();

if(w.equals("y"))
{
s1.withdraw();
}else
{
System.out.println("****THANKYOU FOR BANKING WITH US****");
}
}
}