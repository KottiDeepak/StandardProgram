package Encapsulation;

import java.util.Scanner;

class InventoryMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String itemName = sc.nextLine();
        double pricePerUnit = sc.nextDouble();
        int quantityInStock = sc.nextInt();

        InventoryItem Obj = new InventoryItem(itemName, pricePerUnit, quantityInStock);

        // CORRECTED: Use getter methods
        System.out.println("Item Name       : " + Obj.getItemName());
        System.out.println("Price Per Unit  : " + Obj.getPricePerUnit());
        System.out.println("Quantity        : " + Obj.getQuantityInStock());
        System.out.println("Total Value     : " + Obj.calculateTotalValue());

        int choice = sc.nextInt();

        if (choice == 1) {

            int ch = sc.nextInt();

            if (ch == 1) {
                // CORRECTED: Price is double
                double newPrice = sc.nextDouble();

                // CORRECTED: Update using setter
                Obj.setPricePerUnit(newPrice);
            }

            if (ch == 2) {
                // CORRECTED: Quantity is int
                int newQuantity = sc.nextInt();

                // CORRECTED: Update using setter
                Obj.setQuantityInStock(newQuantity);
            }

            // CORRECTED: Display After Update only when choice is 1
            System.out.println();
            System.out.println("After Update:");
            System.out.println();

            // CORRECTED: Display updated values using getters
            System.out.println("Item Name       : " + Obj.getItemName());
            System.out.println("Price Per Unit  : " + Obj.getPricePerUnit());
            System.out.println("Quantity        : " + Obj.getQuantityInStock());
            System.out.println("Total Value     : " + Obj.calculateTotalValue());

        } else if (choice == 2) {

            // CORRECTED: If user chooses No, terminate immediately
            System.exit(0);
        }
    }
}

class InventoryItem {
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantityInStock = quantityInStock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double calculateTotalValue() {
        return pricePerUnit * quantityInStock;
    }
}