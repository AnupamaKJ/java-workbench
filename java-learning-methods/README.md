# Definition
A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.

####Create a Method

A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:

####Create a method inside Main:
public class Main {  
  static void myMethod() {  
    // code to be executed  
  }  
}  

#### Call a Method
To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
In the following example, myMethod() is used to print a text (the action), when it is called:

Inside main, call the myMethod() method:

public class Main {  
  static void myMethod() {  
    System.out.println("I just got executed!");  
  }  

  public static void main(String[] args) {  
    myMethod();  
  }  
}  

// Outputs "I just got executed!

####Example Explained
* myMethod() is the name of the method
* static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
* void means that this method does not have a return value. You will learn more about return values later in this chapter


#Parameters and Arguments

* Information can be passed to methods as parameter. Parameters act as variables inside the method.

* Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

* The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name: 

-- When a parameter is passed to the method, it is called an argument.
-- So, from the example above: fname is a parameter,
-- while Liam, Jenny and Anja are arguments.

##### Multiple Parameters

Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.


##Return Values

The void keyword, used in the examples above, indicates that the method should not return a value. 
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:

#Method Overloading
With method overloading, multiple methods can have the same name with different parameters:

Example

int myMethod(int x)  
float myMethod(float x)  
double myMethod(double x, double y)

###Java Scope

In Java, variables are only accessible inside the region they are created. This is called scope.

####Method Scope

Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
