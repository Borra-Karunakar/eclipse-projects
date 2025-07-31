package com.karunakar.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ItemDAO {
    private SessionFactory factory;

    public ItemDAO() {
        factory = new Configuration()
                    .configure("hibernate.cfg.xml")  // Load Hibernate config
                    .buildSessionFactory();
    }

    // CREATE
    public void addItem(Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(item);
        tx.commit();
        session.close();
    }

    // READ (View all)
    public List<Item> getAllItems() {
        Session session = factory.openSession();
        List<Item> itemList = session.createQuery("from Item", Item.class).list();
        session.close();
        return itemList;
    }

    // READ (by ID)
    public Item getItemById(int id) {
        Session session = factory.openSession();
        Item item = session.get(Item.class, id);
        session.close();
        return item;
    }

    // UPDATE
    public void updateItem(Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(item);
        tx.commit();
        session.close();
    }

    // DELETE
    public void deleteItem(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Item item = session.get(Item.class, id);
        if (item != null) {
            session.delete(item);
        }
        tx.commit();
        session.close();
    }

    // Close session factory
    public void close() {
        factory.close();
    }
}
