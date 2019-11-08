import java.io.*;

class A extends Thread
{
public void run( )
{

for( int i=1; i<=10;i++)
{
	if(i==3) 
	{
	yield();
	}
System.out.println("Thread A"+i);
}
}
}
class B extends Thread
{
	public void run( )
{
	for(int j=1;j<=10;j++)
	{
System.out.println("Thread B"+j);
	if(j==3)
	{
	stop();
	}
	}

}
}
class C extends Thread
{
public void run()
{

for( int k=1; k<=10; k++)
{
System.out.println("Thread C ="+k);
      try
	{
	   if(k==4)
	   {
	   sleep(5000);
	   }
                  }
	catch(Exception e)
	{
	}

}
	
}
}
class ThreadMethods 
{
public static void main(String args[])
{
A threadA = new A();
B threadB = new B();
C threadC = new C();
threadA.start();
threadB.start();
threadC.start();
}
}
