package com.eronalves.tamasiaexs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputAllBaseTypes {

  public static void inputAllBaseTypes() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input a boolean!");

    while (true) {
      try {
        boolean input = scanner.nextBoolean();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not boolean! Please try again");
      }
    }

    System.out.println("Input a char!");

    while (true) {
      try {
        char[] input = scanner.next().toCharArray();
        if (input.length != 1) throw new Exception("Not a char");
        System.out.println(input[0]);
        break;
      } catch (Exception e) {
        System.out.println("Input is not a char! Please try again");
        scanner.reset();

      }
    }

    System.out.println("Input a byte!");

    while (true) {
      try {
        byte input = scanner.nextByte();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not a byte! Please try again");
        scanner.reset();

      }
    }

    System.out.println("Input a short!");

    while (true) {
      try {
        short input = scanner.nextShort();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not a short! Please try again");
        scanner.reset();

      }
    }

    System.out.println("Input a int!");

    while (true) {
      try {
        int input = scanner.nextInt();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not a int! Please try again");
        scanner.reset();
      }
    }

    System.out.println("Input a long!");

    while (true) {
      try {
        var input = scanner.nextLong();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not a long! Please try again");
        scanner.reset();

      }
    }

    System.out.println("Input a float!");

    while (true) {
      try {
        var input = scanner.nextFloat();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not a float! Please try again");
        scanner.reset();

      }
    }

    System.out.println("Input a double!");

    while (true) {
      try {
        var input = scanner.nextDouble();
        System.out.println(input);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Input is not a double! Please try again");
        scanner.reset();

      }
    }

    scanner.close();
  }
}
