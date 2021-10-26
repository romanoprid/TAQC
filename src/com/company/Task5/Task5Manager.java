package com.company.Task5;

import com.company.Task5.enums.HTTPError;
import com.company.Task5.enums.breedType;


import java.util.Arrays;
import java.util.Scanner;

public class Task5Manager {

  public static void main(String[] args) {
    floatNumbersCheck();
    intNumbersCheck();
    httpErrorCheck();
    dogCheck();

  }

  //1.
  public static void floatNumbersCheck() {
    Scanner input = new Scanner(System.in);
    int counter = 0;
    float[] arrayFloatNumbers = new float[3];
    for (int i = 0; i < 3; i++) {
      arrayFloatNumbers[i] = input.nextFloat();
    }
    for (int i = 0; i < 3; i++) {
      if (-5 <= arrayFloatNumbers[i] && arrayFloatNumbers[i] <= 5) {
        counter++;
      }
    }
    if (counter == 3) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }


  public static void intNumbersCheck() {
    Scanner input = new Scanner(System.in);
    Integer[] arrayIntNumbers = new Integer[3];
    int counter = 0;
    for (int i = 0; i < 3; i++) {
      arrayIntNumbers[i] = input.nextInt();
    }
    int max = arrayIntNumbers[0];
    int min = arrayIntNumbers[2];
    Arrays.sort(arrayIntNumbers);
    System.out.println(min);
    System.out.println(max);
  }

  public static void httpErrorCheck() {
    Scanner input = new Scanner(System.in);
    int codeError;
    codeError = input.nextInt();
    HTTPError httpError = HTTPError.idCheck(codeError);
    System.out.println(httpError);
  }

  //2.
  public static void dogCheck() {
    Dog dog1 = new Dog("Pes", 3, breedType.GERMAN_SHEPHERD);
    Dog dog2 = new Dog("Carevych", 2, breedType.PITBULL);
    Dog dog3 = new Dog("Pes", 3, breedType.YORKSHIRE_TERRIER);
    System.out.println(dog1.toString() + "\n" + dog2.toString() + "\n" + dog3.toString());
    if (dog1.getName().equals(dog2.getName())
            || dog2.getName().equals(dog3.getName())
            || dog3.getName().equals(dog1.getName())) {

      System.out.println("There are dogs with the same name");
    } else {
      System.out.println("There aren't dogs with the same name");
    }
    if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge())
      System.out.println("\n" + dog1);

    else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
      System.out.println("\n" + dog2);
    } else if (dog1.getAge() == dog2.getAge()) {
      System.out.println("\n" + dog1.toString() + "\n" + dog2.toString());
    } else if (dog1.getAge() == dog3.getAge()) {
      System.out.println("\n" + dog1.toString() + "\n" + dog3.toString());
    } else if (dog2.getAge() == dog3.getAge()) {
      System.out.println("\n" + dog2.toString() + "\n" + dog3.toString());
    } else
      System.out.println(dog3);

  }

}
