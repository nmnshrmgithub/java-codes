import java.io.*;
import java.lang.*;

class Error1
{
public static void main(String args[])
{
int invalid=0;
int number,count=0;

for(int i=0;i<args.length;i++)
{
try
{
number=Integer.parseInt(args[i]);

}
catch(NumberFormatException e)
{
invalid=invalid+1;
continue;
}
count+=1;
}
System.out.println("valid no ="+count);
System.out.println("invalid no ="+invalid);
}
}