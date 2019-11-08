import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Bank
{int accno;
String name;
float balance,w1;
static char d;
void input()
{ System.out.println("\n\t ****Welcome to BHAI BHAI COOPERATIVE BANK**** \n please enter your account no , name and balance :- ");
Scanner s=new Scanner(System.in);
accno=s.nextInt();
name=s.next();
balance=s.nextFloat();  }
void display()
{ System.out.println("\n\t       ****WELCOME**** \n\t Account no -> "+accno+"\n\t Mr."+name+"\n\t Your balance is "+balance);   }
void withdraw()
{ System.out.println("\tHow much money do you want to withdraw sir ");
Scanner ss=new Scanner(System.in);
w1=ss.nextFloat();
if(balance<w1)
{  System.out.println(" SORRY you dont have enough balance ");   }
else
{ balance=balance-w1;
System.out.println(" Kindly pickout your money ");
System.out.println(" Your remaining balance is "+balance);
System.out.println(" Do you want to continue further ");
String w2;
w2=ss.next();
if(w2.equals("y"))
{ Bank s2=new Bank();
s2.withdraw();           }}}
public static void main(String args[])
{ Bank s1=new Bank();
s1.input();
System.out.println("\n  Do you want to display customers information ");
String d;
Scanner sss=new Scanner(System.in);
d=sss.next();
if(d.equals("y"))
{ s1.display();  }
System.out.println("\n  Do you want to withdraw money ");
String w;
w=sss.next();
if(w.equals("y"))
{    s1.withdraw();   }
else
{  System.out.println("****THANKYOU FOR BANKING WITH US****");  }
}}
