package com.company.Task6.test;

import com.company.Task6.ComputerMouse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerMouseTest {

  @Test
  void mouseConnectionCheckerTest() {
    ComputerMouse computerMouse1 = new ComputerMouse(true, 0.5);
    ComputerMouse computerMouse2 = new ComputerMouse(true, 0.3);
    ComputerMouse computerMouse3 = new ComputerMouse(false, 1);

    assertEquals("Mouse is connected", computerMouse1.mouseConnectionChecker());
    assertEquals("Mouse is connected", computerMouse2.mouseConnectionChecker());
    //to see how bug appears uncomment row below
    //assertEquals("Mouse is connected", computerMouse3.mouseConnectionChecker());
    System.out.println(computerMouse1);
    System.out.println(computerMouse2);
    System.out.println(computerMouse3);
  }

  @Test
  void connectionTimeCheckTest() {
    ComputerMouse computerMouse1 = new ComputerMouse(true, 0.5);
    ComputerMouse computerMouse2 = new ComputerMouse(true, 0.3);
    ComputerMouse computerMouse3 = new ComputerMouse(false, 1);

    assertEquals("There are no bugs", computerMouse1.connectionTimeCheck());
    assertEquals("There are no bugs", computerMouse2.connectionTimeCheck());
    //to see how bug appears uncomment row below
    //assertEquals("There are no bugs", computerMouse3.connectionTimeCheck());
    System.out.println(computerMouse1);
    System.out.println(computerMouse2);
    System.out.println(computerMouse3);
  }
}