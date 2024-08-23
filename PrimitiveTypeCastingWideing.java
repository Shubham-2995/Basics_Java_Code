package TypeCasting;

public class PrimitiveTypeCastingWideing

{

	public static void main(String[] args) 
	{
		int a=100;
		           double b= a;   // implicit way Widening
		System.out.println(b);        
		
		int c=99;
		double b2=(double)c;      // explicit way Widening
		System.out.println(b2); 
		
		byte x= 127;
		short y=x;
		System.out.println(y); 
		

	}

}
