package OopsConcept;

class Google

{
	
	static void add()
	{
		
		System.out.println("Buy");
	}


}

class Microsoft extends Google
{
	
	static void sub()
	{
		
		System.out.println("Sell");
	}


}

public class MultiInheritance extends Microsoft
{
    void Multiply()
    {
    	
    	System.out.println("Reject");
    }
	
    
    public static void main(String[] args) 
	{
		
    	add();
    	sub();
    	MultiInheritance M1= new MultiInheritance();
    	M1.Multiply();
    	
    	
	}

}
