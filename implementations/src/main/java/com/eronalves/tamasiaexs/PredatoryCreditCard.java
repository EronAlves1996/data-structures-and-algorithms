package com.eronalves.tamasiaexs;

/**
 * PredatoryCreditCard
 */
public class PredatoryCreditCard extends CreditCard {

  private double apr;
  private double chargeCalls;

  public PredatoryCreditCard (
      String cust,
      String bk,
      String acnt,
      int lim,
      double initialBal,
      double rate
  ) {
    super(
        cust,
        bk,
        acnt,
        lim,
        initialBal
    );
    apr = rate;
    chargeCalls = 0;
  }

  public void processMonth () {
    if (balance > 0) {
      double monthlyFactor = Math
          .pow(
              1 + apr,
              1.0 / 12
          );
      balance *= monthlyFactor;
      balance += chargeCalls > 10
          ? chargeCalls - 10
          : 0;
    }
  }

  @Override
  public boolean charge (double price) {
    chargeCalls++;
    boolean isSuccess = super.charge(price);
    if (!isSuccess) charge(5);
    return isSuccess;
  }

}
