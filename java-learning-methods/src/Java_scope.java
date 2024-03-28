
public class Java_scope {
	
	static int y=10;

	public static void main(String[] args)
	{
		 // Code here CANNOT use x
	    int x = 100;
	    // Code here can use x
		System.out.println(x);
		System.out.println(y);
	}

	public void myMethod()
	{
		   int x = 200;
		System.out.println(x);
		System.out.println(y);
	}
}
