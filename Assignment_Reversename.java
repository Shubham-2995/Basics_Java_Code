package StringFunction;

public class Assignment_Reversename 
{

 
	public static void main(String[] args)
	{
		String name="Shubham";
		
	//	for(int i=0;i<=6;i++)  
		 
			
	    for(int i=name.length()-1;i>=0;i--)
		{
			char a1= name.charAt(i);
			System.out.println(a1);  // It will print vertically & take to the next line
			
		//	System.out.print(a1);    // It will print print something horizontally without moving control to the next line. 
			
		}
	}

}
