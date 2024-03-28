
public class Method_overLoading {

	public static void main(String[] args) {
		int num1=plusMethodInt(8,5);
		double num2=plusMethodDouble(4.31, 6.26);
		System.out.println("int : "+num1);
		System.out.println("Diuble : "+num2);
		
		int num3=plusMethod(4,4);
		double num4=plusMethod(4.44, 6.63);
		System.out.println("int : "+num3);
		System.out.println("Diuble : "+num4);
		
	}

	static int plusMethodInt(int x, int y)
	{
		return x+y;
	}
	
	static double plusMethodDouble(double x, double y)
	{
		return x+y;
	}
	
	
	//Instead of defining two methods that should do the same thing, it is better to overload one.

	//In the example below, we overload the plusMethod method to work for both int and double:
	
	static int plusMethod(int x, int y)
	{
		return x+y;
	}
	
	static double plusMethod(double x, double y)
	{
		return x+y;
	}
	
	// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
}
