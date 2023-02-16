package PatikaStore;

public class Main {

    public static void main(String[] args) {
        Brand asus = new Brand(1,"asus");
        Product p1 = new Product(1,"deneme pc", asus, 5000.0) {
            @Override
            public String getType() {
                return null;
            }
        };
        System.out.println(p1);

    }
}