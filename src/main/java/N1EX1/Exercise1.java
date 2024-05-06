package N1EX1;

import N1EX1.Models.Exceptions.VentaBuidaException;
import N1EX1.Models.Product;
import N1EX1.Models.Sale;

public class Exercise1 {
    public static void main(String[] args) {
        // Sales
        Sale firstSale = new Sale();
        Sale secondSale = new Sale();

        try {
            firstSale.calculateTotal();
        } catch (VentaBuidaException e){
            System.out.println(e.getMessage());
        }
        // Products
        Product apple = new Product("Apple", 3);
        Product banana = new Product("Banana", 10);
        Product grapes = new Product("Grapes", 5);

        // Adding products
        secondSale.add_product(apple);
        secondSale.add_product(banana);
        secondSale.add_product(grapes);

        try {
            secondSale.calculateTotal();
        } catch (VentaBuidaException e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < secondSale.getProductList().size() + 1; i++) {
            try{
                System.out.println(secondSale.getProductList().get(i).getName());
            } catch (IndexOutOfBoundsException ex){
                System.out.println("Invalid index");
            }
        }

    }
}
