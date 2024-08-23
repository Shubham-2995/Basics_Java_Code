package StringFunction;

import java.util.Arrays;

public class ArrayIntoArray
{

	public static void main(String[] args) 
	{
		
		double[] Esalary= new double[3];
		
		Esalary[0]=34567.78;
		Esalary[1]=34867.78;
		Esalary[2]=345678.89;
		
		
		double[] Msalary= new double[3];
	
	   
		for(int i = 0;i<Esalary.length;i++)
		{
			
			Msalary[i]=Esalary[i];
			
		
		}
		
		System.out.println(Arrays.toString(Msalary));
		
		
	}

}
