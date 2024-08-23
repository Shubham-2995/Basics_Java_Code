package StringFunction;

import java.util.Arrays;

public class Array_1 
{

	public static void main(String[] args) 
	{
		
		{
			int rollno[]=new int[4];
			
			rollno[0]=74;
			rollno[1]=85;
			rollno[2]=35;
			
			Arrays.sort(rollno);    // Sorting of Array
			
			System.out.println(Arrays.toString(rollno));
			
            String names[]=new String[5];   // We accept null values for string data type only
			
			names[0]="A";
			names[1]="B";
			names[2]="C";
			names[3]="null";
			
			System.out.println(Arrays.toString(names));
			
            String name[]=new String[3];   // Duplicate Values
			
			name[0]="A";
			name[1]="A";
			name[2]="C";
			
			System.out.println(Arrays.toString(name));
			
			
			String update[]=new String[3];   // Update values
				
			update[0]="A";
			update[0]="X";
			update[1]="C";
				
			System.out.println(Arrays.toString(update));
				
			
		
		}
	}
}


