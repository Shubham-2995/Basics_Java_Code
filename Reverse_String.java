package Basic_Programs;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		String input = "Atul";
		String output = "";
		
		for(int i=3;i<=0;i--)
		{
			char c1 = input.charAt(i);
			output=output+c1;
			
		}

		System.out.println("Ans is ->"+output);
	}

}
