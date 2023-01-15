package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
    obj.setName("Diksha");
    System.out.println("Error: you might seen some error, please not it down in commnets");
    obj.getName();
  }
}