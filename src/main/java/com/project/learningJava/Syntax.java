package com.project.learningJava;

public class Syntax {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int myNum = 100;
        System.out.println(myNum);

        int mNum = 15;
        mNum = 20; // mNum is now 20  with different variable
        System.out.println(mNum); // mNum is now 20  with different variable

        final int myNum2 = mNum;
        System.out.println(myNum2);

        int myNum3 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello World";
        System.out.println(myText);
    }
}
