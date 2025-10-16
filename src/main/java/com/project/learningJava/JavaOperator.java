package com.project.learningJava;

public class JavaOperator {
    public static void main(String[] args) {

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        int x = 10;
        int y = 3;

        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1

        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5
        int a = 10;
        int b = 3;
        System.out.println(a / b);   // Integer division, result is 3

        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);   // Decimal division, result is 3.333...

        int W = 5;

        ++W; // Increment W by 1
        System.out.println(W); // 6

        --W; // Decrement W by 1
        System.out.println(W); // 5

        int peopleInRoom = 0;

// 3 people enter
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;

        System.out.println(peopleInRoom); // 3

// 1 person leaves
        peopleInRoom--;

        System.out.println(peopleInRoom); // 2

        int E = 10;
        E += 5;

        int savings = 100;
        savings += 50; // add 50 to savings
        System.out.println("Total savings: " + savings);

        int s = 5;
        int f = 3;
        System.out.println(s > f);// returns true, because 5 is higher than 3

        int age = 18;

        System.out.println(age >= 18); // true, old enough to vote
        System.out.println(age < 18);  // false, not old enough

        int passwordLength = 5;

        System.out.println(passwordLength >= 8); // false, too short
        System.out.println(passwordLength < 8);  // true, needs more characters


        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));

        int result1 = 2 + 3 * 4;     // 2 + 12 = 14
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.println(result1);
        System.out.println(result2);

        int result3 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
        int result4 = 10 - (2 + 5);  // 10 - 7 = 3

        System.out.println(result3);
        System.out.println(result4);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String tst = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        String name = "John";
        int old = 25;
        System.out.println("My name is " + name + " and I am " + age + " years old.");


        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String u = "10";
        int p = 20;
        String o = u+ p;  // z will be 1020 (a String)

        String tzt = "We are the so-called \"Vikings\" from the north.";

        String tzt2 = "It\'s alright.";

        String tut = "The character \\ is called backslash.";


        String tx = "We are the so-called Vikings \n from the north.";

        System.out.println(tx);


Math.max(5,19);

        Math.sqrt(64);

        Math.abs(-4.7);

        Math.round(4.6);  // 5
        Math.ceil(4.1);   // 5.0
        Math.floor(4.9);  // 4.0

        int randomNum = (int)(Math.random() * 101);  // 0 to 100


    }
}
