package com.eronalves.tamasiaexs;

/**
 * CreditCard
 */
public class CreditCard {

  private String customer;
  private String bank;
  private String account;
  private int limit;
  private double balance;

  public CreditCard(String customer, String bank, String account, int limit,
      double balance) {
    this.customer = customer;
    this.bank = bank;
    this.account = account;
    this.limit = limit;
    this.balance = balance;
  }

  public CreditCard(String customer, String bank, String account, int limit) {
    this(customer, bank, account, limit, 0.0);
  }

  public void updateLimit(int amount) {
    this.limit += amount;
  }

  public String getCustomer() {
    return customer;
  }

  public String getBank() {
    return bank;
  }

  public String getAccount() {
    return account;
  }

  public int getLimit() {
    return limit;
  }

  public double getBalance() {
    return balance;
  }

  public boolean charge(double price) {
    if (price + balance > limit) return false;
    balance += price;
    return true;
  }

  public void makePayment(double amount) {
    if (amount < 0) return;
    balance -= amount;
  }
}
