package com.example.ganesh;

public class TransferTransactionData {
    long from_account;
    long to_account;
    double amount;

    public void setFrom_account(long from_account) {
        this.from_account = from_account;
    }

    public void setTo_account(long to_account) {
        this.to_account = to_account;
    }

    public long getFrom_account() {
        return from_account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getTo_account() {
        return to_account;
    }

    @Override
    public String toString() {
        return "TransferTransactionData{" +
                "from_account=" + from_account +
                ", to_account=" + to_account +
                ", amount=" + amount +
                '}';
    }
}
