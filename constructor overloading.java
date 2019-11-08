 class Base
{    
Base(){
	System.out.println("this is base constructor");
	
}
}
class Derived extends Base{
	Derived()
	{
		System.out.println("this is dervied constructor");
	}
	void fun()
	{
	
	System.out.println("this is derived  fun() ");
	super();	
	}	
}
class Circle
{ public static void main(String args[])
	{
	Derived d=new Derived();
	d.fun();
	}
}