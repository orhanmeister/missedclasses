package com.company;

// This is one way to comment in Java //
/* This is how to put extremely cool large comments in Java in multiple lines */

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hi, I already print sentences." + "\n");

        int integer = 25;
        double d2 = 3.94;
        String s3 = "Pope Pius XIII";
        boolean b4 = true;

        System.out.printf("My name is %s, I am %d years old, and my GPA is %.2f\n", s3, integer, d2);

        System.out.println("My name is " + s3 + ", I am " + integer + " years old, and my GPA is " + d2 + "\n");

        int x = 20;
        double y = 7;

        double R = x/y;
        R = Math.round(R*100.00)/100.00;

        int t = 20;
        int v = 7;

         System.out.println("The answer for x/y is : " + (x/y));
         System.out.println("The answer for x/y to 2 decimal places is : " + R);

         System.out.println("The answer for x.y is : " + t*v);
         System.out.println("The answer for x+y is : " + (t+v));
         System.out.println("The answer for x-y is : " + (t-v));
         System.out.println("The answer for the remainder of x/y is : " + t%v);

    }

}
