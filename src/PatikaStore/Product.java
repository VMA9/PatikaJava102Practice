package PatikaStore;
public abstract class Product {
    private int id;
    private String name;
    private double price;
    private Brand brand;

    public Product(int id, String name,  Brand brand, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                '}';
    }
}