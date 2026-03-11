
package gtiit.bank_application;

public class Account {
    private Customer owner;
    private Currency currency;
    private int balance;

    public Account(Customer owner, Currency currency) {
        this.owner = owner;
        this.currency = currency;
    }

    public Customer owner() {
        return this.owner;
    }

    public Currency currency() {
        return this.currency;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
        }
    }

    public int balance() {
        return this.balance;
    }

    public String toString() {
        return "Account of " + owner.name() + " - balance: " + currency.symbol() + " " + this.balance;
    }
}

