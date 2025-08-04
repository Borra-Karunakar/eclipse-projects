package com.karunakar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class AccountTransactionDAO {
    private SessionFactory factory;

    public AccountTransactionDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void addAccountWithTransactions(String holderName, Transaction... transactions) {
        Account acc = new Account();
        acc.setHolderName(holderName);
        acc.setTransactions(Arrays.asList(transactions));

        Session session = factory.openSession();
        org.hibernate.Transaction tx = session.beginTransaction(); // Fixed: fully qualified name
        session.save(acc);
        tx.commit();
        session.close();
    }

    public void viewAccountsWithTransactions() {
        Session session = factory.openSession();
        session.createQuery("from Account", Account.class).list().forEach(account -> {
            System.out.println(account);
            account.getTransactions().forEach(System.out::println);
        });
        session.close();
    }

    public void close() {
        factory.close();
    }
}


/*
 Aug 04, 2025 2:07:34 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.15.Final
Aug 04, 2025 2:07:35 AM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Aug 04, 2025 2:07:35 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Aug 04, 2025 2:07:35 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/account_transaction_db]
Aug 04, 2025 2:07:35 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {password=****, user=root}
Aug 04, 2025 2:07:35 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Aug 04, 2025 2:07:35 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Aug 04, 2025 2:07:36 AM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Aug 04, 2025 2:07:36 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@3382cf68] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Aug 04, 2025 2:07:36 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]

Hibernate One-to-Many - Account ↔ Transactions
1. Add Account with Transactions
2. View All Accounts & Transactions
0. Exit
Choose option: 1
Enter Account Holder Name: Karunakar
Enter number of transactions: 2
Enter type (credit/debit): credit
Enter amount: 1000
Enter type (credit/debit): debit
Enter amount: 500
Hibernate: insert into Account (holderName) values (?)
Hibernate: insert into Transaction (account_id, amount, type) values (?, ?, ?)
Hibernate: insert into Transaction (account_id, amount, type) values (?, ?, ?)
Account and transactions added.

Hibernate One-to-Many - Account ↔ Transactions
1. Add Account with Transactions
2. View All Accounts & Transactions
0. Exit
Choose option: 

*/
