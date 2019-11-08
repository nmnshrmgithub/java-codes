import java.io.*;
import java.lang.*;

class A extends Thread
{	
public void run( )
{
System.out.println("Thread A  started");
for(int i=1; i<=100;i++)
{
System.out.println("Thread A="+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run( )
{
System.out.println("Thread B  started");
	for(int j=1;j<=100;j++)
	{
System.out.println("Thread B"+j);
	}
System.out.println("Exit from B");

	}
	}
class C extends Thread
{
public void run( )
{
System.out.println("Thread C  started");
for(int j=1;j<=100;j++)
{
System.out.println("Thread C"+j);
}
System.out.println("Exit from C");

}
}
class ThreadPriority
{
public static void main(String args[])
{
A a1 = new A();
B b1 = new B();
C c1 = new C();
c1.setPriority(Thread.MAX_PRIORITY);
a1.setPriority(Thread.MIN_PRIORITY);
a1.start();
b1.start();
c1.start();
System.out.println("End of main thread");
}
}
