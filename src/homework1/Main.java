package homework1;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("Apple");
        Smartphone smartphone = new Smartphone("Iphone-10", company, "USA", 2017, 120);
        System.out.println(smartphone.priceInfo());
        smartphone.priceInfo();
        smartphone.priceInfo();

        Company company1 = new Company("Samsung");
        SmartphonePro smartphonePro1 = new SmartphonePro("Galaxy-12",  company1, "South Korea", 2018, 100, Color.WHITE);
        System.out.println(smartphonePro1.getInfo());
        smartphonePro1.getInfo();

        Company company2 = new Company("Xiaomi");
        SmartphonePro smartphonePro2 = new SmartphonePro("Redmi", company2, "China", 2022, 99, Color.GREY);
        System.out.println(smartphonePro2.getInfo());
        smartphonePro2.getInfo();

    }
}
