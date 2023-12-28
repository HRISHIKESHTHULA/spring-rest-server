package com.example.ganesh;

import javax.persistence.*;
import java.util.Currency;


@Entity
@Table(name = "Account")
public class Account{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long accountID;

    @Column(name="ACCOUNT_OWNER", length=50, nullable=false, unique=false)
    String accountOwner;

    @Column(name="CURRENCY", nullable=false, unique=false)
    String currency;

    @Column(name="AMOUNT", nullable=false, unique=false)
    double amount;

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public Currency getCurrency() {
        return Currency.getInstance(currency);
    }

    public void setCurrency(Currency currency) {
        this.currency = currency.getCurrencyCode();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", accountOwner='" + accountOwner + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
