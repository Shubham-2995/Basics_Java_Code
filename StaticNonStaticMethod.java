package Basictesting;

public class StaticNonStaticMethod 
{

	static void add()
	{
		
		int a= 25;
		int b= 30;
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	void sub()
	{
		
		int a= 25;
		int b= 30;
		int sub=a-b;
		System.out.println(sub);
	}
	
	
	public static void main(String[] args) 
	
	{
		StaticNonStaticMethod C=new StaticNonStaticMethod();
		C.sub();
		add();
		
	}
		

}


