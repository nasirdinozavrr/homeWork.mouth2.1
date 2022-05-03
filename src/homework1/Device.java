package homework1;

public class Device {
    private String name;
    private Company company;
    private String madeOf;
    private int year;

    public Device(String name, Company company, String madeOf, int year) {
        this.name = name;
        this.company = company;
        this.madeOf = madeOf;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public int getYear() {
        return year;
    }


    public String getInfo() {
       return ( "Device{" +
                "name='" + name + '\'' +
                ", company=" + company.getCompany() +
                ", madeOf='" + madeOf + '\'' +
                ", year=" + year +
                '}');
    }
}
