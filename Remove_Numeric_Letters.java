package StringFunction;

public class Remove_Numeric_Letters
{

	public static void main(String[] args)
	{
		String S= " AP 81 Pune";
		
		System.out.println(S.replaceAll("[1-9]", ""));

	}

}
