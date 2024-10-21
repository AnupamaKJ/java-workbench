Java is an object oriented language (OOP). 
Java objects are part of so-called "Java classes".

public class Main {
public static void main(String[] args) {
System.out.println("This will be printed");
}
}

The first line defines a class called Main.

public class Main {

In Java, every line of code that can actually run needs to be inside a class. 
This line declares a class named Main, which is public, that means that any other class can access it. 

public static void main(String[] args) {

This is the entry point of our Java program. the main method has to have this exact signature in order to be able to run our program.

    public --  means that anyone can access it.
    static -- means that you can run this method without creating an instance of Main.
    void -- means that this method doesn't return any value.
    main -- is the name of the method.

The arguments we get inside the method are the arguments that we will get when running the program with parameters. 
It's an array of strings.

System.out.println("This will be printed");

    System -- is a pre-defined class that Java provides us and it holds some useful methods and variables.
    out -- is a static variable within System that represents the output of your program (stdout).
    println -- is a method of out that can be used to print a line.
