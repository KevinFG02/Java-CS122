package Week4.products;

//Represents a sellable product
public class Product extends PlaceableItem
{
    private String productName;
    private double price;

    public Product(int aisle, String section, int row,
                   String productName, double price)
    {
        super(aisle, section, row);
        this.productName = productName;
        this.price = price;
    }

    public String getProductName(){
        return this.productName;
    }

    public double price(){
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Product: " + productName + ", Price: " + price;
    }
}
