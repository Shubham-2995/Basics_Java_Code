package Basictesting;

public class MethodOverloading 
{
	// Static Method
	
	
	static void add(int a)
	{
		System.out.println("1");
	}
	
	static void add()
	{
		System.out.println("2");
		
	}
	
	static void add(String a)
	{
		System.out.println("Shubham");
	}
	
	// Nonstatic Mehtod
	
    void sub(int a)
	{
		System.out.println("100");
	}
	
	void sub()
	{
		System.out.println("200");
		
	}
	
    void sub(String a)
	{
		System.out.println("Shubham");
	}
	
	
	public static void main(String[] args) 
	{
		
		add(100);
		add();
		add("Shubham");
		
		MethodOverloading M1=new MethodOverloading();
		M1.sub(1);
		M1.sub();
		M1.sub("Deshpande");
		
		

	}

}
