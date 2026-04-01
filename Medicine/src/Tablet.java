public class Tablet extends Medicine {
    int tabletsPerPackage;
    double mgPerTablet;
    String shape;

    public Tablet(String name, double price, String manufacturer, boolean requiresPrescription, int shelfLifeMonths, int tabletsPerPackage, double mgPerTablet, String shape) {
        super(name, price, manufacturer, requiresPrescription, shelfLifeMonths);
        this.tabletsPerPackage = tabletsPerPackage;
        this.mgPerTablet = mgPerTablet;
        this.shape = shape;
    }

    public double calculatePricePerTablet(double price, int tabletsPerPackage) {
        return price / tabletsPerPackage;
    }

    @Override
    public String toString() {
        return "Tablet{" + super.toStringPrice() +
                "tabletsPerPackage=" + tabletsPerPackage +
                ", mgPerTablet=" + mgPerTablet +
                ", shape='" + shape + '\'' +
                '}';
    }
}
