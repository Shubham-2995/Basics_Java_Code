package Collection;
import java.util.ArrayList;
import java.util.Collection;

public class Add_Method 
{

	public static void main(String[] args)
	{
		               Collection C1 = new ArrayList();
		               
		               C1.add("Age");                        // Add Method
		               C1.add("Color");
		               C1.add(76);
		               C1.add(false);
		               C1.add(6.98);
		               System.out.println(C1);
		               
		               
		               Collection C2 = new ArrayList();
		               
		               C2.addAll(C1);                       // AddAll Method
		               C2.add("Rice");
		               C2.add("Sugar");
		               System.out.println(C2);
		               
		               
		               boolean b1= C2.equals(C1);          // Equals Method
		               System.out.println(b1);
		               
		               
		               boolean b2 = C1.isEmpty();          // isEmpty Method
		               System.out.println(b2);
		               
		               
	/*	               C1.clear();                         // clear Method
		               System.out.println(C1);   */
		               
		               
		               C1.remove(76);                      // remove Method
		               System.out.println(C1);
		               
		               
		               C2.removeAll(C1);                  // removeAll Method
		               System.out.println(C2);
		               
    }

}
