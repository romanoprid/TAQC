package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Math.pow;

public class NaturalNumbersManager {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();


    //a
    n = n * n;
    boolean threeCheck = false;
    String s = Integer.toString(n);


    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '3') {
        threeCheck = true;
        break;
      }
    }
    System.out.println(s);
    System.out.println(threeCheck);


    //b
    int r = 0;
    while (n != 0) {
      r = r * 10 + n % 10;
      n /= 10;
    }
    n = r;
    System.out.println(n);


    //c
    int count = 0, d, first, last;
    double pwr;
    d = n;
    while (d > 0) {
      d /= 10;
      count++;
    }
    pwr = pow(10, count - 1);
    first = n / (int) pwr;
    last = n % 10;
    n /= 10;
    n = n * 10 + first;
    n %= pwr;
    n += last * pwr;
    System.out.println(n);


    //d
    s = s.replaceAll("^(?!\")|$(?<!\")", "1");
    System.out.println(s);
  }
}


