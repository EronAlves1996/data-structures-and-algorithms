package com.eronalves.tamasiaexs;

/**
 * PredatoryCreditCard
 */
public class PredatoryCreditCard extends CreditCard {

  public PredatoryCreditCard(String customer, String bank, String account,
      int limit, double balance) {
    super(customer, bank, account, limit, balance);
  }

  @Override
  public boolean charge(double price) {
    boolean isSuccess = super.charge(price);
    if (!isSuccess) charge(5);
    return isSuccess;
  }

}
