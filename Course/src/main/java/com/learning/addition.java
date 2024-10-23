package com.learning;

class Calculator
    //Method Overloading -- same method name and different parameters

{
    public int add(int n1, int n2)
    {
       return n1+n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }

    public double add(double  n1, int n2)
    {
        return n1+n2;
    }
}

public class addition {
    public static void main(String[] args)
    {   int num1 = 4;
        int num2 = 5;
         //  int result = num1 + num2;  // addition operation
        // System.out.println(result);

        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println(result);
    }

}
