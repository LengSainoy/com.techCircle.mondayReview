package com.projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
   public static void main(String[] args) {
      // M = monthly payment
      // P = principal
      // r = monthly interest rate (percent / 100)
      //       (divide annual interest rate by 12)
      //        (input / 100) / 12
      // n = number of payment (# of month that take to pay the loan)

      // formular:
      /*                      n
                        r(1+r)
      *        M = P -------------
      *                   n
      *              (1+r)  -1

         use Math.pow() to raise power of n
      * */




      final byte MONTH_IN_YEAR = 12;
      final byte PERCENT = 100;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Principal : ");
      int principal = scanner.nextInt();

      System.out.print("Annual Interest Rate : ");
      float annualInterest = scanner.nextFloat();
      float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

      System.out.print("Period (Years) : ");
      byte years = scanner.nextByte();
      int numberOfPayments = years * MONTH_IN_YEAR;

      double mortgage = principal
                           * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                           / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
      String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
      System.out.println("Mortgage : "+mortgageFormatted);
   }
}
