package com.depedency;

public
class DebitCard  implements BankCard{
    public void transaction(long amount){
        System.out.println("transaction successful");
    }
}
