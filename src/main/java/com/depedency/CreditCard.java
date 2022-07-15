package com.depedency;

public
class CreditCard implements BankCard{
    public void transaction(long amount){
        System.out.println("transaction successful");
    }
}
