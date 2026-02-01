package Week4.products;

//represents an item with a location at a store
public class PlaceableItem
{
    private int aisle;
    private String section;
    private int row;

    public PlaceableItem(int aisle, String section, int row)
    {
        this.aisle = aisle;
        this.section = section;
        this.row = row;
    }

    public int getAisle(){
        return this.aisle;
    }

    public String getSection(){
        return this.section;
    }

    public int getRow(){
        return this.row;
    }

    @Override
    public String toString() {
        return "Aisle: " + aisle + ", Section: " + section + ", Row: " + row;
    }
}
