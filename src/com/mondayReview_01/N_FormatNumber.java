package com.mondayReview_01;

import java.text.NumberFormat;

public class N_FormatNumber {
   public static void main(String[] args) {
      NumberFormat currency = NumberFormat.getCurrencyInstance();
      String price = currency.format(1234567.891);
      System.out.println(price);
   }
}
