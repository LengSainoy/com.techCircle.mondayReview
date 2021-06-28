package com.exercises;

public class String_BackAround {
    public static void main(String[] args) {
       /* Given a string, take the last char and return a new string
       with the last char added at the front and back, so "cat" yields "tcatt".
       The original string will be length 1 or more.
        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"
        */
        backAround();
    }

    private static void backAround() {
        String str = "banana";
        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar+str+lastChar);
    }
}
