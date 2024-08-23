package ThisKeyword;

public class This_Keyword 
{

	int age;
	String name;
	double salary;
	
	void details(int age, String name, double salary)
	
	{
		
		//System.out.println("Students");
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) 
	{
        This_Keyword T1=new This_Keyword();
        T1.details(0,"Sham", 8947.56);
        System.out.println(T1.age);
        System.out.println(T1.name);
        System.out.println(T1.salary);
        

	}

}
