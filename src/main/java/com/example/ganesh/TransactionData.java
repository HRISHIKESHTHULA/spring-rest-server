package com.example.ganesh;


public class TransactionData {
    String transactionType;
    double amount;

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionData{" +
                "transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
