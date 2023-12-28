package com.example.ganesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
public class Bank{
    @Autowired
    AccountRepository accountRepository;

    public Account addAccount(Account account){
        System.out.println("In Bank addAccount-->");
        System.out.println(account);
        System.out.println("In Bank addAccount--<");

        System.out.println("In Bank addAccount, accountRepository-->");
        System.out.println(accountRepository);
        System.out.println("In Bank addAccount, accountRepository-->");
        Account added_account = accountRepository.save(account);

        System.out.println("In Bank addAccount added account-->");
        System.out.println(added_account);
        System.out.println("In Bank addAccount added account--<");
        return added_account;
    }

    public Account getAccount(long account_id){
        Iterator<Account> accounts = accountRepository.findAllById(Collections.singletonList(account_id)).iterator();
        return accounts.next();
    }

    @Transactional
    public Account withdraw(long account_id, double amount) throws InsufficientFundException{
        Account account = accountRepository.findAllById(Collections.singletonList(account_id)).iterator().next();
        double cur_amount = account.getAmount();
        double deducted_amount = cur_amount - amount;
        if (deducted_amount < 0) {
            throw (new InsufficientFundException("Hi"));
        }
        else {
            account.setAmount(deducted_amount);
            return accountRepository.save(account);
        }
    }

    @Transactional
    public Account addAmount(long account_id, double amount){
        Account account = accountRepository.findAllById(Collections.singletonList(account_id)).iterator().next();
        double cur_amount = account.getAmount();
        double added_amount = cur_amount + amount;
        account.setAmount(added_amount);
        return accountRepository.save(account);
    }

    public Account transaction(long account_id, TransactionData transactionData) throws InsufficientFundException {
        System.out.println("In Bank transaction-->");
        System.out.println(transactionData);
        System.out.println("In Bank transaction--<");
        if(transactionData.transactionType.equals("add")){
            return addAmount(account_id, transactionData.amount);
        }
        else if(transactionData.transactionType.equals("remove")){
            return withdraw(account_id, transactionData.amount);
        }
        else if(transactionData.transactionType.equals("transfer")){
            return withdraw(account_id, transactionData.amount);
        }
        return null;
    }

    public Currency getAmount(Account account){
        return null;
    }

    @Transactional
    public boolean transferTransaction(TransferTransactionData transferTransactionData) throws InsufficientFundException {
        withdraw(transferTransactionData.from_account, transferTransactionData.amount);
        addAmount(transferTransactionData.to_account, transferTransactionData.amount);
        return true;
    }
}
