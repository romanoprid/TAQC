package com.company.Task5;

import com.company.Task5.enums.breedType;

public class Dog {
  private String name;
  private int age;
  private breedType breed;


  public Dog(String name, int age, breedType breed) {
    this.name = name;
    this.age = age;
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public breedType getBreed() {
    return breed;
  }

  public void setBreed(breedType breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", breed=" + breed +
            '}';
  }
}
