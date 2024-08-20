package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Method 
{

	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		
		l1.add(96);
		l1.add(54);
		l1.add(89);
		l1.add(234);
		l1.add(234);
	/*  l1.add(null);
		l1.add(null);
	    l1.add("Ghty12#^&"); */
		
		Collections.sort(l1);       // Sorting
		
		System.out.println(l1);
		
		//Iteration Forward
		
		Iterator i2=l1.iterator();
		
		while(i2.hasNext())
		{
			
			System.out.println(i2.next());
			
		}
		
		
		ListIterator l4=l1.listIterator();
		
		while(l4.hasNext())
		{
			System.out.println(l4.next());
			
		}
		
		while(l4.hasPrevious())
		{
			
			System.out.println(l4.previous());
		}
		
		
	}

}
