package com.mondayReview_01;

import java.util.Scanner;

public class O_ReadInput {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Age: ");
      int age = sc.nextInt();
      System.out.println("You are "+age);


   }
}
