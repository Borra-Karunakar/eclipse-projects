package com.karunakar.hibernate;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItemDAO dao = new ItemDAO();  // Create DAO object

        while (true) {
            System.out.println("\n-------------------------------");
            System.out.println("Hibernate Item CRUD");
            System.out.println("-------------------------------");
            System.out.println("1. Add");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Get by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // ADD
                    scanner.nextLine();  // Clear buffer
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    dao.addItem(new Item(name, price));
                    System.out.println("Item added.");
                    break;

                case 2: // VIEW ALL
                    List<Item> items = dao.getAllItems();
                    if (items.isEmpty()) {
                        System.out.println("No items found.");
                    } else {
                        for (Item item : items) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3: // UPDATE
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    Item itemToUpdate = dao.getItemById(updateId);
                    if (itemToUpdate != null) {
                        scanner.nextLine();
                        System.out.print("Enter new name: ");
                        itemToUpdate.setName(scanner.nextLine());
                        System.out.print("Enter new price: ");
                        itemToUpdate.setPrice(scanner.nextDouble());
                        dao.updateItem(itemToUpdate);
                        System.out.println("Item updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4: // DELETE
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    dao.deleteItem(deleteId);
                    System.out.println("Item deleted (if exists).");
                    break;

                case 5: // GET BY ID
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    Item item = dao.getItemById(id);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 0: // EXIT
                    dao.close();
                    scanner.close();
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
