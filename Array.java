package StringFunction;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) 
	{
		int rollno[]=new int[3];
		
		rollno[0]=74;
		rollno[1]=85;
		rollno[2]=35;
		
		System.out.println(Arrays.toString(rollno));
		
		
		for(int i=0;i<=2;i++)
		{
			
			System.out.println(rollno[i]);
		}

	}

}
