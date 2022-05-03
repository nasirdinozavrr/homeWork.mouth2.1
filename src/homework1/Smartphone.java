package homework1;

public class Smartphone extends Device {
    private int price;

    public Smartphone(String name, Company company, String madeOf, int year, int price) {
        super(name, company, madeOf, year);
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public String priceInfo() {
        return ("Smartphone{" +
                " price=" + price +
                '}');
    }

    public final String priceInfo(int price) {
        return ("Smartphone{" +
                "discount price=" + (price - 15) +
                '}');

    }

}
