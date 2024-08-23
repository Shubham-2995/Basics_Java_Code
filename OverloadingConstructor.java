package Basictesting;

public class OverloadingConstructor
{
	
	OverloadingConstructor()
	
	{
		System.out.println("This is a constructor 1");
	}
	
	OverloadingConstructor(int a)
	{
		System.out.println("This is a constructor 2");
		
	}
	OverloadingConstructor(int a, String b)
	
	{
		System.out.println("This is a construcutor 3");
	}
	
	
	

	public static void main(String[] args) 
	
	{
		new OverloadingConstructor();
		
		new OverloadingConstructor(1);
		
		OverloadingConstructor O1=new OverloadingConstructor(1,"Ok");
		
		
		
	}
	
}	
			
	
		

	
