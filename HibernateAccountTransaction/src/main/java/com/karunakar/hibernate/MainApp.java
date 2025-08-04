package com.karunakar.hibernate;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountTransactionDAO dao = new AccountTransactionDAO();

        while (true) {
            System.out.println("\nHibernate One-to-Many - Account ↔ Transactions");
            System.out.println("1. Add Account with Transactions");
            System.out.println("2. View All Accounts & Transactions");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String holderName = scanner.nextLine();

                    System.out.print("Enter number of transactions: ");
                    int n = scanner.nextInt();
                    Transaction[] txns = new Transaction[n];

                    for (int i = 0; i < n; i++) {
                        scanner.nextLine();
                        System.out.print("Enter type (credit/debit): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();

                        Transaction txn = new Transaction();
                        txn.setType(type);
                        txn.setAmount(amount);
                        txns[i] = txn;
                    }

                    dao.addAccountWithTransactions(holderName, txns);
                    System.out.println("Account and transactions added.");
                    break;

                case 2:
                    dao.viewAccountsWithTransactions();
                    break;

                case 0:
                    dao.close();
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
