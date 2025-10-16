package com.project.learningJava;

public class Variables {
    public static void main(String[] args) {

        String name = "John";
        System.out.println("Hello" + name);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int age = 25;

        int x = 10;
        int y = 20;
        System.out.println(age);
        System.out.println(x +y); // print the value of x +y

      int w = 5;
      int u = 6;
      System.out.println("The sum is" + u + w);  //Prints : The sum is 56

        int a;
        int b;
        int c;

        a = b = c = 50;
        System.out.println(a + b + c); // 150

        // This is an identifers

        int minutuesPerHour = 60;
        int hoursPerMinute = 60;

        int m = 60;

        int my = 60;

        // If do not want the value of my variables to change i will have to use the final keywords exmple : final int mynum =15;

        my = 20; // Error: cannot assign a value to final variable 'myNum'

        final int Minutes_per_hour = minutuesPerHour;

        final int Birthday = hoursPerMinute;

            // Student data

        String studentName = "John";

        

    }
}
