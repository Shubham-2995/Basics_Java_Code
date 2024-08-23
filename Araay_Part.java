package StringFunction;

public class Araay_Part 
{

	public static void main(String[] args) 
	{
		
		int rollno[]=new int [5];
		
		rollno[0]=11;
		rollno[1]=22;
		rollno[2]=33;
		rollno[3]=66;
		rollno[4]=55;
		
		int givennumber=66;
		
		for(int i=0; i<rollno.length;i++)
		{
			
			if(givennumber==rollno[i])
			{
				
				System.out.println("Yes Found");
			}
			
			else
			{
				System.out.println("Sorry Not Found");
				
			}
		}
		
	}

}
