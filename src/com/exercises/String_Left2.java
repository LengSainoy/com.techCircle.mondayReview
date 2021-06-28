package com.exercises;

public class String_Left2 {
    public static void main(String[] args) {
        /*
        Given a string, return a "rotated left 2" version where
        the first 2 chars are moved to the end. The string length will be at least 2.
            left2("Hello") → "lloHe"
            left2("java") → "vaja"
            left2("Hi") → "Hi"
        */
        System.out.println(left2("Miranda"));
    }

    public static String left2(String str) {
        if (str.length() > 2) return str.substring(2) + str.substring(0, 2);
        else throw new StringIndexOutOfBoundsException("String must have index more than 2");
    }
}
