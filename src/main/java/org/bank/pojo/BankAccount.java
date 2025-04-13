package org.bank.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BankAccount {
    @Id
    private int accountNumber;
    private double balance;
    private String type;
    @ManyToOne
    private Customer customer;



    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("-Deposit successful! New Balance = " + balance);
        }else {
            System.out.println("- Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
            System.out.println("- Withdrawal successful! New Balance = " + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", customer=" + customer +
                '}';
    }
}
