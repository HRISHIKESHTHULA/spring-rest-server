package com.example.ganesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("bank")
public class Transactions {
    @Autowired
    Bank bank;

    @PostMapping(value = "/transactions/accounts/{id}", produces = "application/json")
    public Account transaction(@PathVariable int id, @RequestBody TransactionData transactionData) throws InsufficientFundException{
        System.out.println("In BankRestController transaction-->");
        System.out.println(transactionData);
        System.out.println("In BankRestController transaction--<");
        return bank.transaction(id, transactionData);
    }

    @PostMapping(value = "/transactions/", produces = "application/json")
    public boolean transferTransaction(@RequestBody TransferTransactionData transferTransactionData) throws InsufficientFundException{
        System.out.println("In BankRestController transferTransaction-->");
        System.out.println(transferTransactionData);
        System.out.println("In BankRestController transferTransaction--<");
        return bank.transferTransaction(transferTransactionData);
    }

    @PostMapping(value = "/genericTransaction/", produces = "application/json")
    public boolean genericTransaction(@RequestBody GenericTransactionData transactionData) throws InsufficientFundException{
        System.out.println("In BankRestController genericTransaction-->");
        System.out.println(transactionData);
        System.out.println("In BankRestController genericTransaction--<");
        return true;
    }
}
