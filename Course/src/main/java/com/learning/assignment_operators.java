package com.learning;

public class assignment_operators
{
    public static void main(String[] args)
    {
        int num=7;
        //int num2=5;
        //int result = num1 % num2;

        //num = num12;
        //num*=8;
        //num++; // post increment -> fetch the value first and then increment
        //++num // pre increment -> increment the value first and then fetch
       // num--;

        int result = num++;
        System.out.println(result);

        int x=6;
        int y=6;

        boolean result1 = x == y ;

        System.out.println( result1);

        int k = 7;
        int l = 5;
        int a = 5;
        int b = 9;

        boolean result2 = k<l || a<b || a>1;
        boolean result3 = a>b;
        System.out.println(result2);
        System.out.println(!result3);


    }

}
