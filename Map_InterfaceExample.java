package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_InterfaceExample
{

	public static void main(String[] args)
	{
		
		Map<String,Integer> m1= new HashMap<String,Integer>();
	     
	     m1.put("Sugar", 50);
	     m1.put("Oil", 232);
	     m1.put("Tea", 350);
	     
	     Set<String> s1=m1.keySet();
	     System.out.println(s1);
	     
	     m1.remove("Sugar");
	     System.out.println(m1);
	     
	     Set<String> S1=m1.keySet();
	     System.out.println(s1);
	     
	     for(String S2: m1.keySet())
	     {
	    	 System.out.println(S2);
	    	 
	     }
	}

}
