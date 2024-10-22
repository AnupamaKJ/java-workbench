package com.learning;

public class TypeConversion {
    public static void main(String[] args) {

        byte b = 127;
        int a = 12;

        a=b; // implicitly converted -- conversion

       // b=a;

        b=(byte)a; // explicitly converted  -- casting

        int c=12;
        byte k = (byte)c;
        System.out.println(k);

        float f= 5.6f;
        int t= (int) f;
        System.out.println(t);

        byte x=10;
        byte y=20;
        int result = x*y;
        System.out.println(result); // Type promotions

    }
}
