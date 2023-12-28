package com.example.ganesh;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("bank")
public class BankRestController {
    @Autowired
    Bank bank;

    @GetMapping(value="/accounts/{id}")
    public Account getAccount(@PathVariable int id) {
        return bank.getAccount(id);
    }

    @PostMapping(value="/account", produces="application/json")
    public Account addAccount(@RequestBody Account account) {
        System.out.println("In BankRestController addAccount-->");
        System.out.println(account);
        System.out.println("In BankRestController addAccount--<");
        return bank.addAccount(account);
    }
}
