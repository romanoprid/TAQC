package com.company.Task4;

import java.io.IOException;
import java.util.Scanner;

public class PersonMaker {
  private String name;
  private int birthYear;

  public PersonMaker() {
  }

  public PersonMaker(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  public String getName() {
    return name;
  }


  public int getBirthYear() {
    return birthYear;
  }


  public int age() {
    return (2021 - birthYear);
  }

  public PersonMaker input() {
    Scanner object = new Scanner(System.in);
    System.out.println("Input name: ");
    String name = object.nextLine();
    System.out.println("Input person's birth year:");
    int year = object.nextInt();
    PersonMaker person = new PersonMaker(name, year);
    return person;
  }


  public void output() throws IOException {


    System.out.println("You data is: " + input());


  }

  public String changeName(String newName) {
    return this.name = newName;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", birthYear=" + birthYear +
            '}';
  }
}
