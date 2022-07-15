package com.depedency;

public
class ShoppingMall {
    //    private DebitCard debitCard;
//    private CreditCard creditCard;
    private BankCard bankCard;

    public
    ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

//    public
//    ShoppingMall(DebitCard debitCard, CreditCard creditCard) {
//        this.debitCard = debitCard;
//        this.creditCard = creditCard;
//    }

    public static
    void main(String[] args) {
//        CreditCard creditCard = new CreditCard();
//        DebitCard debitCard = new DebitCard();
//        ShoppingMall shoppingMall = new ShoppingMall(debitCard, creditCard);
          BankCard bankCard = new DebitCard();
          ShoppingMall shoppingMall = new ShoppingMall(bankCard);
          shoppingMall.purchase(500);
    }

    public
    void purchase(long amount) {
//        debitCard.transaction(amount);
//        creditCard.transaction(amount);¬
        bankCard.transaction(amount);
    }
}
