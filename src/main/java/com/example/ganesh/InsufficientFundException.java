package com.example.ganesh;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(String msg){
        super(msg);
    }
}
