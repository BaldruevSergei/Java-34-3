package practice.bank_account;

import practice.bank_account.model.Bank_Account;

public class BankAppl {
    public static void main(String[] args) {
        Bank_Account acc0 = new Bank_Account(100L, "Bill Smith", "Bank#1", 1, 100);
        acc0.display();
        System.out.println(acc0.getOwner());
        System.out.println(acc0.getBalance());
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.withdraw(350);
        System.out.println(acc0.getBalance());
        acc0.withdraw(300);
        System.out.println(acc0.getBalance());
        acc0.withdraw(250);
        System.out.println(acc0.getBalance());

        Bank_Account acc1 = new Bank_Account(200l, "Bank#1", 1);
        System.out.println(acc1.getOwner());

        Bank_Account acc2 = new Bank_Account(300L, "Bank#1", 1, 0.0);
        System.out.println(acc2.getOwner());

    }}
