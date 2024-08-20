package Collection;
import java.util.HashMap;
import java.util.Map;

public class Map_Interface 
{

	public static void main(String[] args) 
	{
		     Map<String,Integer> m1= new HashMap<String,Integer>();
		     
		     m1.put("Sugar", 50);
		     m1.put("Oil", 232);
		     m1.put("Tea", 350);
		     System.out.println(m1);
		     m1.clear();
		     System.out.println(m1);
		     boolean b1=m1.isEmpty();
		     System.out.println(b1);
		     boolean b2=m1.containsKey("Sugar");   // same method for value
		     System.out.println(b2);
		     

	}

}
