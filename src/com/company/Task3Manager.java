package com.company;


import java.util.Scanner;

import static java.lang.Math.*;

public class Task3Manager {

  public static void main(String[] args) {


    //1)
    Scanner input = new Scanner(System.in);
    System.out.println("Input radius: ");
    double r = input.nextDouble();
    double perimeter;
    double area;
    perimeter = PI * r;
    area = PI * pow(r, 2);
    System.out.println("\nArea: " + area + "\nPerimeter: " + perimeter);


    //2)
    System.out.println("What is your name?");
    String name = input.next();
    System.out.println("Hi " + name);
    //the string here maybe should be "Where do you live" or "Where are you living",
    // but if customer wants to be like this, ok :)
    System.out.println("Where are you live " + name + " ?");
    String address = input.next();
    System.out.println("Your info: " + name + " " + address);


    //3)
    double sumOfAllCallsPrice = 0;
    double[] priceArray = new double[3];
    double[] priceMinutes = new double[3];

    System.out.println("Input price per minute for c1, c2, c3: ");
    for (int i = 0; i < 3; i++) {
      priceArray[i] = input.nextDouble();
    }

    System.out.println("Input duration in minutes for c1, c2, c3: ");
    for (int i = 0; i < 3; i++) {
      priceMinutes[i] = input.nextDouble();
    }
    System.out.println("Sum of all: ");
    for (int i = 0; i < 3; i++) {
      sumOfAllCallsPrice = sumOfAllCallsPrice + (priceArray[i] * priceMinutes[i]);
      System.out.println(sumOfAllCallsPrice);
    }
  }
}
