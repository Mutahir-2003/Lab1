package javaapplication1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> items = new HashMap<>();
        
        System.out.println("Welcome to the Billing System!");
        
        while (true) {
            System.out.print("Enter item name (or 'done' to finish): ");
            String itemName = scanner.nextLine();
            
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            
            System.out.print("Enter price for " + itemName + ": ");
            try {
                double itemPrice = Double.parseDouble(scanner.nextLine());
                items.put(itemName, itemPrice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a number.");
            }
        }
        
        double total = 0;
        System.out.println("\n--- Bill ---");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.printf("%s: $%.2f%n", entry.getKey(), entry.getValue());
            total += entry.getValue();
        }
        System.out.printf("Total: $%.2f%n", total);
        
        scanner.close();
    }
}


