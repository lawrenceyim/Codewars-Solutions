package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    int remainder = number % 5;
    if (number > 0) {
      return remainder == 0 ? number : number + (5 - remainder);    
    } 
    return remainder == 0 ? number: number - remainder;
  }
}