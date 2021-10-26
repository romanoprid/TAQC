package com.company.Task6;

public class Task6 {

  public static void main(String[] args) {
    ComputerMouse computerMouse1 = new ComputerMouse(true, 0.5);
    ComputerMouse computerMouse2 = new ComputerMouse(true, 0.3);
    ComputerMouse computerMouse3 = new ComputerMouse(true, 1);

    computerMouse1.connectionTimeCheck();
    computerMouse1.mouseConnectionChecker();
    System.out.println(computerMouse1 + "\n");

    computerMouse2.connectionTimeCheck();
    computerMouse2.mouseConnectionChecker();
    System.out.println(computerMouse2 + "\n");

    computerMouse3.connectionTimeCheck();
    computerMouse3.mouseConnectionChecker();
    System.out.println(computerMouse3 + "\n");
  }
}
