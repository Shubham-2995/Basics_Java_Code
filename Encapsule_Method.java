package Encapsule;

public class Encapsule_Method
{
    
	private String name="xyx@gmail.com";
	
	public String getUsername()
	{
		return name;
		
	}
	
	public void setUsername(String username)
	{
		this.name=username;
		
	}
	
	public class OopsConcept
	{
	
	      public static void main(String[] args) 
	      {
	         
	    	  Encapsule_Method E1= new Encapsule_Method();
	    	  E1.setUsername("shubham@gmail.com");
	    	  System.out.println(E1.getUsername());
	    	  
	      }
	      
	}     

}
