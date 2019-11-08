import java.util.Scanner;
public class Array12 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;

int a[]=new int[n];



for(int i=0,j=0;j< n;j++) 
  {
  if((i%2)==0)
  {
    a[j]=i; 
  if(a[j]%3==0)
  {
    sum=sum+a[j];
  }
  }
  i=i+2;
}


System.out.print(sum);

}
}