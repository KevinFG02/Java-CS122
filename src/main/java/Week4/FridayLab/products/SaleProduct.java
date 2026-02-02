package Week4.FridayLab.products;

//represents a product that can be on sale
public class SaleProduct extends Product
{
    private boolean currentlyOnSale;
    private double discountPercentage;

    public SaleProduct(int aisle, String section, int row,
                       String productName, double price,
                       boolean currentlyOnSale, double discountPercentage)
    {
        super(aisle, section, row, productName, price);
        this.currentlyOnSale = currentlyOnSale;
        this.discountPercentage = discountPercentage;
    }

    public boolean isCurrentlyOnSale(){
        return this.currentlyOnSale;
    }

    public double getDiscountPercentage(){
        return this.discountPercentage;
    }

    @Override
    public String toString() {
        String onSale;
        String discount;

        if(currentlyOnSale == true){
            onSale = ", Currently on sale";
            discount = ", Discount Percentage: " + discountPercentage;
        } else {
            onSale = "";
            discount = "";
        }

        return super.toString() + onSale + discount;
    }
}

