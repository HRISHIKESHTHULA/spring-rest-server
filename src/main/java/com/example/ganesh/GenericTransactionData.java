package com.example.ganesh;

import java.util.ArrayList;
import java.util.List;

public class GenericTransactionData {
    String transactionType;
    List<Long> accountList;
    List<Double> ops;

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public List<Long> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Long> accountList) {
        this.accountList = accountList;
    }

    public List<Double> getOps() {
        return ops;
    }

    public void setOps(List<Double> ops) {
        this.ops = ops;
    }
}
