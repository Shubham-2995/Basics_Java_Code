package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Methods 
{

	public static void main(String[] args) 
	{
		Collection C1 = new ArrayList();
        
        C1.add("Age");                        
        C1.add("Color");
        C1.add(76);
        C1.add(false);
        C1.add(6.98);
        System.out.println(C1);
        
        
        Iterator I1 =C1.iterator();         // Iterator Method
        
        while(I1.hasNext())
        {
        	
        	System.out.println(I1.next());
        	
        }
        
        System.out.println(C1.size());      // Size Method
        
       
        boolean b1=C1.contains("Manish");   // Contains Method
        System.out.println(b1);
        

	}

}
