package com.eronalves.tamasiaexs;

/**
 * CountVowels
 */
public class CountVowels {

  private static String vowels = "aeiouAEIOU";

  public static int countVowels(String phrase) {
    return phrase.chars().reduce(0,
        (total, vowel) -> vowels.contains(Character.toString(vowel)) ? total + 1
            : total);
  }
}
