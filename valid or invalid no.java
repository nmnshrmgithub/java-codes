import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Error2
{
public static void main(String args[])
{
int invalid=0;
int number,count=0,a,d;


Scanner n=new Scanner(System.in);

System.out.println(" \nEnter your password");
a=n.nextInt();

if(a==123)
{
System.out.println("\t\t ***** WELCOME NAMAN ***** \n");


System.out.println("\n\t Enter your no of inputs ");
d=n.nextInt();
String b[] =new String[d+1];

System.out.println("\n\t Enter your "+d+" inputs :- ");
for(int m=0;m<d;m++)
{
b[m]=n.next();

}
for(int i=0;i<d;i++)
{
               try
               {
                number=Integer.parseInt(b[i]);
                System.out.println("\n\t"+b[i]+" converted in integer\n");
               }
catch(NumberFormatException e)
{
invalid=invalid+1;
System.out.println("\n\t"+b[i]+" cant be converted in integer \n");
continue;
}
                 count+=1;
}
System.out.println("\n     \t    **STATS**  \n\t valid no = "+count);
System.out.println("\t invalid no = "+invalid);

}
else
{

System.out.println("\t\t ***** GET LOST *****");
}
}
}