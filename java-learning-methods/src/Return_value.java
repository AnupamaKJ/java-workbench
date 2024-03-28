
public class Return_value {

public static void main (String[] args)
	{
		System.out.println(myMethod(3));
		System.out.println(myMethod1(2, 4));
		int z = myMethod2(5,5);
		System.out.println(z);
		
	}
	
public static int myMethod(int x)
{
	return 5 + x;
}

//This example returns the sum of a method's two parameters:
public static int myMethod1(int x, int y)
{
	return x + y;
}

//You can also store the result in a variable (recommended, as it is easier to read and maintain):

public static int myMethod2(int x, int y)
{
	return x+y;
}

}
