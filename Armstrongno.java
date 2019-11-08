import java.util.Scanner;
public class Armstrongno {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
		   
		   int num=0;
int no=n;
int p,sum=0;
while(n!=0)           //Use while loop check the number is Armstrong or not.
{                     //store the output(1 or 0) in result variable.
   num=n%10;
   p=num*num*num;
   sum=sum+p;
   n=n/10;
}
if(no==sum)
{
  result=1;
}
System.out.println(result);
}}