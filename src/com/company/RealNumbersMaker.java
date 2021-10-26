package com.company;

import java.util.Scanner;

public class RealNumbersMaker {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input height of brick");
    double a = input.nextDouble();
    System.out.println("");
    System.out.println("Input width of brick");
    double b = input.nextDouble();
    System.out.println("");
    System.out.println("Input depth of brick");
    double c = input.nextDouble();
    System.out.println("");
    System.out.println("Input height of hole");
    double x = input.nextDouble();
    System.out.println("");
    System.out.println("Input width of hole");
    double y = input.nextDouble();
    System.out.println("");
    if ((a <= 0) || (b <= 0) || (c <= 0) || (x <= 0) || (y <= 0)) {
      System.out.println("Can't be shoved in");
    }
    if ((a < x) && (b < y) ||
            (b < x) && (a < y) ||
            (a < y) && (c < x) ||
            (a < x) && (c < y) ||
            (b < y) && (c < x) ||
            (b < x) && (c < y)) {
      System.out.println("Shoved in successfully");
    } else {
      System.out.println("Can't shove in");
    }
  }

}
