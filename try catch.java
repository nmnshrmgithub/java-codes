public class As1{
	
	public static void main(String args[])
	{
		
		try
		{
			System.out.println("try");
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
			
		}
		
		finally
		{
			
			System.out.println("finally");
		}
	}
}