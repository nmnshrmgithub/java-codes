import java.awt.*;
import javax.swing.*;
import java.util.*;


public class frame1{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char[][] ar=new char[5][5];// Declare necessary variables
char[][] ar1=new char[5][5];
Stack<Character> STACK = new Stack<>();

for(int i=0;i<5;i++)// Input 5x5 2D Array using Scanner Class
{
  for(int j=0;j<5;j++)
  { ar[i][j]=sc.next().charAt(0); 
    if(j==4)
    {
       for(int n=0;n<5;n++)
      {  
  if(n==4)
  {
        ar1[i][n]= STACK.pop(); 
      
  }
  }
      
    }
  }
 
}
for(int m=0;m<5;m++)
{
  for(int k=0;k<5;k++)
  {
 System.out.print(ar1[m][k]+" ");  
if(k==4)
{
System.out.println();  

}	
  }
}
                                      
// Perform the reflection operation

// Output 5x5 2D Reflection Array
}
}