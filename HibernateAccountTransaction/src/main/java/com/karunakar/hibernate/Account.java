package com.karunakar.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String holderName;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    // Getters and Setters
    public int getId() { return id; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public List<Transaction> getTransactions() { return transactions; }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
        for (Transaction t : transactions) {
            t.setAccount(this);
        }
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", holderName=" + holderName + "]";
    }
}