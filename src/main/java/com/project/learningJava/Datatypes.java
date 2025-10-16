package com.project.learningJava;

import lombok.Getter;
import lombok.Setter;

public class Datatypes {

    public static void main(String[] args) {

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

// Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        byte myNumber = 10;
        short myShort = 10;
        int myInt = 10;

        System.out.println(myNum);
// Set the maximum possible score in the game to 500
        int maxScore = 500;

// The actual score of the user
        int userScore = 423;

/* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);
        long myNum1 = 1500000000000L;
        System.out.println(myFloatNum);

// DAta Casting ( the below exaple is widen castin , an automatic casting of changing a sammler type to a larger typedata tpes from
        int mInt = 9;
        double myDouble = mInt; // Automatic casting: int to double

        System.out.println(myInt);    // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        double miDouble = 9.78d;
        int miInt = (int) myDouble; // Manual casting: double to int

        System.out.println(miDouble); // Outputs 9.78
        System.out.println(miInt);    // Outputs 9

        float f1 = 35e3f;
        double d1 = 12E4d;
        var x = 5;


        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        boolean IsFishTasty = false;

        class Student {
            private boolean active;

            public boolean isActive() {
                return active;
            }

            public void setActive(boolean active) {
                this.active = active;
            }
        }

        System.out.println("p is active!");
    }

    @Getter
    @Setter
    public class Student {
        public boolean active;

    }
    }
