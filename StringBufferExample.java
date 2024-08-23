package StringBuilderAndBuffer;

public class StringBufferExample
{

	public static void main(String[] args) 
	{
		
		StringBuffer S1=new StringBuffer("Pune");
		             S1.append(" City");
		             System.out.println(S1);
		             
		             S1.insert(4, " is a");
		             System.out.println(S1);
		             
		        /*   S1.delete(0, 4);
		             System.out.println(S1);  */
		             
		             S1.substring(1, 4);
		             System.out.println(S1);
		             
		             S1.reverse();
		             System.out.println(S1);
		             
		             
	}

}
