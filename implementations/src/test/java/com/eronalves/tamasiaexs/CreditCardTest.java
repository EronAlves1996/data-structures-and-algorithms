package com.eronalves.tamasiaexs;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

/**
 * CreditCardTest
 */
public class CreditCardTest {

  @Test
  public void testMakePayment() {
    var wallet = new CreditCard[] {
        new CreditCard("John Bowman", "California Savings",
            "5391 0375 9387 5309", 5000),
        new CreditCard("John Bowman", "Californa Federal",
            "3485 0399 3395 1954", 3500),
        new CreditCard("John Bowman", "California Finance",
            "5391 0375 9387 5309", 300)
    };

    for (int val = 1; val <= 40; val++) {
      var success = wallet[0].charge(3 * val);
      var success1 = wallet[1].charge(2 * val);
      var success2 = wallet[2].charge(val);

      var list = List.of(success, success1, success2);

      IntStream.range(0, 3)
          .forEach(
              i -> System.out.print(!list.get(i) ? wallet[i].getBank() : ""));
    }
  }
}
