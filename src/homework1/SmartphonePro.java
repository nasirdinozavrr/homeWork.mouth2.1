package homework1;

public class SmartphonePro extends Smartphone {
    private Color color;

    public SmartphonePro(String name, Company company, String madeOf, int year, int price, Color color) {
        super(name, company, madeOf, year, price);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    public String getInfo() {
        return ( "Device{" +
                "name='" + getName() + '\'' +
                ", company=" + getCompany() +
                ", madeOf='" + getMadeOf() + '\'' +
                ", year=" + getYear() + '\'' +
                ", color=" + color + '\'' +
                ", price=" + getPrice() +
                '}');
    }


}
