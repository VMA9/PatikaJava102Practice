package PatikaStore;

public abstract class Notebook extends Product {
    private String operatingSystem;
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    public Notebook(int id, String name, Brand brand, double price, String operatingSystem, String processor, int ram, int storage, String graphicsCard) {
        super(id, name, brand, price);
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}