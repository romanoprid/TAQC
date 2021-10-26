package com.company.Task6;

import java.util.Objects;

public class ComputerMouse {
  private boolean isConnected;
  private double connectionTime;

  public ComputerMouse(boolean isConnected, double connectionTime) {
    this.isConnected = isConnected;
    this.connectionTime = connectionTime;
  }


  public boolean isConnected() {
    return isConnected;
  }

  public void setConnected(boolean connected) {
    isConnected = connected;
  }

  public double getConnectionTime() {
    return connectionTime;
  }

  public void setConnectionTime(double connectionTime) {
    this.connectionTime = connectionTime;
  }

  public String mouseConnectionChecker() {

    if (this.isConnected) {
      return "Mouse is connected";
    } else {
      return "Mouse is not connected";
    }
  }

  public String connectionTimeCheck() {
    if (this.connectionTime < 1 && this.connectionTime > 0 && isConnected) {
      return "There are no bugs";
    } else {
      return "Bug is here";
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputerMouse computerMouse = (ComputerMouse) o;
    return isConnected == computerMouse.isConnected && connectionTime == computerMouse.connectionTime;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isConnected, connectionTime);
  }

  @Override
  public String toString() {
    return "ComputerMouse{" +
            "isConnected=" + isConnected +
            ", connectionTime=" + connectionTime +
            '}';
  }
}
