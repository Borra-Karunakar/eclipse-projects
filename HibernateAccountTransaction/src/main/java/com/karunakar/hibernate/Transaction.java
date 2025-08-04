package com.karunakar.hibernate;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // Getters and Setters
    public int getId() { return id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", type=" + type + ", amount=" + amount + "]";
    }
}
