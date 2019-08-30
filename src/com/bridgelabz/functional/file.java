package com.bridgelabz.functional;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("/home/admin1/Desktop/JavaProgram/JavaProgram/src/com/bridgelabz/functional/myFile"));
    sc.useDelimiter("");
    while (sc.hasNext()) {
      String s = sc.next();
      if (s.trim().isEmpty()) {
        continue;
      }
      System.out.println(s);
    }
    sc.close();
  }

}