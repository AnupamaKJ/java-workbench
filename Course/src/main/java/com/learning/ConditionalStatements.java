package com.learning;

public class ConditionalStatements {
    public static void main(String[] args) {
        int x=38;
        int y=17;
        int z=26;
        if(x>10 && x<=20) {
            System.out.println("Hello");
        }
        else {
            System.out.println("Bye");
        }
        if(x>y) {
            System.out.println(x);
            System.out.println("Thank you");
        }
        else
            System.out.println(y);
        System.out.println("--------------------");

        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);

        int n=4;
        int result=0;

//        if(n%2==0)
//            result=10;
//        else
//            result =20;
//        System.out.println(result);
        result = n%2==0 ? 10 : 20;

        System.out.println(result);

        System.out.println("--------------------");

        int day=8;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the valid number");
        }

    }
}
