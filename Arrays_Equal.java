package StringFunction;

import java.util.Arrays;

public class Arrays_Equal
{

	public static void main(String[] args)
	{
		
		int rollno []=new int[4];
		
		 rollno[0]=34;
		 rollno[1]=43;
		 rollno[2]=56;
		 rollno[3]=76;
		 
		 int classname[]=new int[4];
		     
		 classname[0]=34;
		 classname[1]=43;
		 classname[2]=56;
		 classname[3]=76;
		 
		boolean b1= Arrays.equals(rollno, classname);
		
		System.out.println(b1);
		 
				 
			 
	}

}
