package OopsConcept;

class Amazon

{
	
	static void testing()    // Single Level Inheritance with static methods
	{
	
		System.out.println("Mobile No");
	}
	
	
	void Registration()     // // Single Level Inheritance with non-static methods
	{
		
		System.out.println("Register NO");
    
    }
    
}
	
public class SingleInheritance extends Amazon
{
    static void logindetails()
	{
		
		System.out.println("Email Id");
	}
    
    
    void Details()
	{
		
		System.out.println("Password");
	}
	
    
	public static void main(String[] args) 
	{
		
		logindetails();
		testing();
		SingleInheritance A1=new SingleInheritance();  // Subclass inherit properties from super class so we can create an object with ref variable and called both non static methods.
		A1.Registration();
		A1.Details();
		

	}
	
}


