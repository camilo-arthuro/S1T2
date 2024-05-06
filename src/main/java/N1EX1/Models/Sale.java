package N1EX1.Models;

import N1EX1.Models.Exceptions.VentaBuidaException;

import java.util.ArrayList;

public class Sale {
    // Attributes
    private ArrayList<Product> productList;
    private double totalPrice;

    // Constructor
    public Sale() {
        this.productList = new ArrayList<Product>();
        this.totalPrice = 0d;
    }

    // Getter
    public ArrayList<Product> getProductList() {
        return productList;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    // General method
    public void calculateTotal() throws VentaBuidaException {
        if (this.productList.isEmpty()){
            throw new VentaBuidaException("To make a sale you must first add products");
        } else {
            for (int i = 0; i < this.productList.size(); i++) {
                this.totalPrice += this.productList.get(i).getPrice();
            }
            System.out.println("Total price " + this.totalPrice);
        }
    }

    public void add_product(Product product){
        this.productList.add(product);
    }
}
