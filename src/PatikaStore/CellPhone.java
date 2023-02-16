package PatikaStore;

public class CellPhone extends Product {
    private int batteryCapacity;
    private int ram;
    private int storage;
    private String color;

    public CellPhone(int id, String name, double price, Brand brand, int batteryCapacity, int ram, int storage, String color) {
        super(id, name,brand, price);
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getType() {
        return "Cell Phone";
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "batteryCapacity=" + batteryCapacity +
                ", ram=" + ram +
                ", storage=" + storage +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
