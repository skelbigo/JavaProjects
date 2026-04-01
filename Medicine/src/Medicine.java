public class Medicine {
    String name;
    double price;
    String manufacturer;
    boolean requiresPrescription;
    int shelfLifeMonths;

    public Medicine(String name, double price, String manufacturer, boolean requiresPrescription, int shelfLifeMonths) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.requiresPrescription = requiresPrescription;
        this.shelfLifeMonths = shelfLifeMonths;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", requiresPrescription=" + requiresPrescription +
                ", shelfLifeMonths=" + shelfLifeMonths +
                '}';
    }

    public String toStringPrice() {
        return "name='" + name + '\'' +
                ", price=" + price + '\'';
    }
}
