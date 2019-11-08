import java.io.*;
import java.lang.*;

class String1
{
public static void main(String args[])
{
StringBuffer m=new StringBuffer("java");
System.out.println(m);

m.append(" object oriented language");
System.out.println(m);

m.insert(4," is");
System.out.println(m);

m.insert(4," _ ");
System.out.println(m);

m.append(" improves security ");
System.out.println(m);
}
}