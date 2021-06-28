package com.projects;

public class PaymentSchedule {
   public static final byte MONTHS_IN_YEAR = 12;
   public static final byte PERCENT = 100;
   public static void main(String[] args) {
      /**
       *    L = loan amount or Principal
       *    c = monthly interest
       *    n = number of payment (ex. 10 yrs = 120 payments)
       *    p = number of payment we have made
       *
       *                n        p           n
       *    B = L [ (1+c) - (1+c) ] / [ (1+c) -1
       *
       *
       *
       */

   }

   public static double calculateBalance(
      int principal,
      float annualInterest,
      byte years,
      short numberOfPaymentMade) {

      float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
      short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

      double balance = principal
                          * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentMade))
                          / (Math.pow(1 + monthlyInterest, numberOfPayments)) - 1;
      return balance;
   }
}
