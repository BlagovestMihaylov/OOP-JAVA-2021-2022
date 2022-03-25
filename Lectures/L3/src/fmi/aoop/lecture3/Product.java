package fmi.aoop.lecture3;

public class Product
{
    private String description;
    private double price;
    public final String PRODUCT_ID;
    private static long cnt;

    public Product(String description, double price)
    {
        setDescription(description);
        setPrice(price);
        PRODUCT_ID = String.format("P%06d", cnt++);
    }

    public final void setPrice(double price)
    {
        this.price = price > 0 ? price : 0;
    }
    public double getPrice()
    {
        return price;
    }

    public final void setDescription(String description)
    {
        this.description = description != null ? description: "Unnamed product";
    }
    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString()
    {
        return String.format("Product: %s :price: %.2f, description: %s ",
                                        PRODUCT_ID, price, description);
    }



}
