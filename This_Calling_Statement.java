package ThisStatement;

public class This_Calling_Statement 
{
	
	This_Calling_Statement(int a)
	{
		
		System.out.println("RedMi");
	}
	
	
	This_Calling_Statement(double a)
	{
		
		System.out.println("Samsung");
		
	}
	
	
	This_Calling_Statement()
	{
		this(9.32);
		System.out.println("Sony");
		
	}
	

	public static void main(String[] args) 
	{
		
		new This_Calling_Statement();
	}

}
