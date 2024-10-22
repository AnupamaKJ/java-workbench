package com.learning;

public class loopsConcept {
    public static void main(String[] args) {
        //while loop
        int i = 1;
        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);


        System.out.println("_____________________");
        // do while loop

        int k = 5;
       do
        {
            System.out.println("Hi " + k);
            k++;
        } while (k<=4);

        System.out.println("_____________________");
        
        // for loop
        for (int l=1; l<=4; l++)
        {
            System.out.println("Hi " + l);
        }
    }
}
