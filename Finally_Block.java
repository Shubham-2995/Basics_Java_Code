package StringFunction;

import java.util.InputMismatchException;

public class Finally_Block 
{

	public static void main(String[] args) 
	{
		
		int rollno[]=new int[3];
		
		rollno[0]=80;
		rollno[1]=34;
		rollno[2]=34;
		try
		{
			rollno[3]=76;
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Hello");
		}
		
		catch(InputMismatchException b) 
		{
			
		}
		
		finally
		{
			
			System.out.println("Thank You");
		}
		
		
		System.out.println("All Program Good");
		

	}

}
