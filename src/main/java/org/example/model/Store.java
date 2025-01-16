package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Dark Chocolate", 15.0, "Rich dark chocolate", 75.0),
                new Coke("Coca-Cola", 5.0, "Refreshing soft drink", true),
                new Bread("Sourdough", 8.0, "Freshly baked sourdough bread", "Whole Wheat")
        };

        listProducts(products);
    }
}
