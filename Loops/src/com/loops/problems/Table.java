package com.loops.problems;

import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    // WAP to print table of an input number.
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = in.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " * " + i + " = " + (i * n));
    }
  }
}
