package learning_class;

public class Static_method {
	
	 // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

		public static void main(String[] args) {
			myStaticMethod();
			Static_method myPublic = new Static_method() ;
			myPublic.myPublicMethod();
			

		}

}
