package com.exercises;

public class
String_ComboString {
    public static void main(String[] args) {
        /*
        Given 2 strings, a and b, return a string of the form short+long+short,
        with the shorter string on the outside and the longer string on the inside.
        The strings will not be the same length, but they may be empty (length 0).
        comboString("Hello", "hi") → "hiHellohi"
        comboString("hi", "Hello") → "hiHellohi"
        comboString("aaa", "b") → "baaab"
        */
        String str_A = "a";
        String str_B = "ddddd";
        String expectedStr = comboString(str_A, str_B);
        System.out.println(expectedStr);
    }

    private static String comboString(String a, String b) {
        String[] arrStr = new String[2];
        if (a.length() > b.length()) {
            arrStr[0] = b;
            arrStr[1] = a;
        } else {
            arrStr[0] = a;
            arrStr[1] = b;
        }
        return arrStr[0]+arrStr[1]+arrStr[0];
    }
}
