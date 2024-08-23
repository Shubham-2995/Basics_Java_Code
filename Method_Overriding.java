package OopsConcept;

class Parent
{
	void login()
	{
		System.out.println("Login with mobile number");
		
	}
	
}

public class Method_Overriding extends Parent
{

	void login()
	{
		super.login();
		System.out.println("Login with email id");
	//  super.login();
		
	}
	
	public static void main(String[] args) 
	{
		
		Method_Overriding M1=new Method_Overriding();
		M1.login();
		
	}

}
