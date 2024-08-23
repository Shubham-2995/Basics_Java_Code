package StringFunction;

public class Average_No 

{
	
	public static void main(String[] args) 
	
	{
		
		
		int nos []= new int[3];
		
		nos [0]=40;
		nos [1]=30;
		nos [2]=22;
		
		double sum=0;
		
		for(int i=0;i<nos.length;i++)
		{
			
			sum=sum+nos [i];
		}
		
		
		double average =sum/3;
		System.out.println(average);
		
		
	}
	
		
		
}


