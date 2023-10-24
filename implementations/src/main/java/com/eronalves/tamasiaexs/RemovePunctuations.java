package com.eronalves.tamasiaexs;

/**
 * RemovePunctuations
 */
public class RemovePunctuations {

  public static String removePunctuations(String s) {
    var punctuations = "',!.;:";
    var tempSb = new StringBuilder(s);

    punctuations.chars().forEach(c -> {
      var index = 0;
      while (index != -1) {
        index = tempSb.indexOf(Character.toString(c));
        if (index != -1) tempSb.deleteCharAt(index);
      }
    });

    return tempSb.toString();
  }
}
