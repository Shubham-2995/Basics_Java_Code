package StringFunction;

public class Remove_Capital

{

	public static void main(String[] args)
	{
		
		String P= "Shubham Deshpande";
		
		System.out.println(P.replaceAll("[A-Z]", ""));
		
		System.out.println(P.replaceAll("[a-z]", ""));
		
	}

}
