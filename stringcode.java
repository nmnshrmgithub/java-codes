class Super
{
static String greeting 
{return "goodnight";}
String name{return "Ram";}
}
class Sub extends Super
{
Static String Greeting(){return "Hello";}
String name{ return "bheem";}
}

public class Tcs1{
public static void main(String args[])
{
Super s=new Sub();
System.out.println(s.greeting()+","+s.name());
}
}