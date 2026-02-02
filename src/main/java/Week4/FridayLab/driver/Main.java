package Week4.FridayLab.driver;

import Week4.FridayLab.products.PlaceableItem;
import Week4.FridayLab.products.Product;
import Week4.FridayLab.products.SaleProduct;

public class Main
{
    public static void main(String[] args)
    {
        //advertisement placard
        PlaceableItem placard = new PlaceableItem(15, "A", 3);
        System.out.println(placard);

        //regular product
        Product airpods = new Product(3, "D", 4, "Apple Airpods", 159.99);
        System.out.println(airpods);

        //product on sale for 20% off
        SaleProduct suitcase = new SaleProduct(3, "D", 4, "Samsonite",
                99.99, true, 0.2);
        System.out.println(suitcase);
    }
}