package com.eronalves.tamasiaexs;

/**
 * CorrectArithmetic
 */
public class CorrectArithmetic {

  public static void main(String[] args) {
    if (args.length < 3)
      throw new RuntimeException("There should be three integers as input");

    var a = Integer.parseInt(args[0]);
    var b = Integer.parseInt(args[1]);
    var c = Integer.parseInt(args[2]);

    if (a + b == c) {
      spellFormula("a + b = c", a, "+", b, c);
      return;
    }

    if (b - c == a) {
      spellFormula("b - c = a", b, "-", c, a);
      return;
    }

    if (a * b == c) {
      spellFormula("a * b = c", a, "*", b, c);
      return;
    }

    System.out.println("The input cannot be used in any of the formulas");
  }

  private static void spellFormula(String formula, int first, String operation,
      int second, int result) {
    System.out.println(
        "The input can be used in the formula " + formula + ", since " + first
            + operation + second + result);
  }
}
