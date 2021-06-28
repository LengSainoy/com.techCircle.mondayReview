package com.exercises;

public class Arithmetic_Or35 {
    public static void main(String[] args) {
    /*  Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
        Use the % "mod" operator -- see Introduction to Mod

        or35(3) → true
        or35(10) → true
        or35(8) → false
        */
        int n = 20;
        boolean or35 = false;
        if (n % 3 == 0 || n % 5 == 0) {
            or35 = true;
        }
    }
}
