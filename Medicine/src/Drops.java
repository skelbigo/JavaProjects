public class Drops extends Medicine {
    double volumeMl;
    int dropsPerMl;
    boolean isOral;

    public Drops(String name, double price, String manufacturer, boolean requiresPrescription, int shelfLifeMonths, double volumeMl, int dropsPerMl, boolean isOral) {
        super(name, price, manufacturer, requiresPrescription, shelfLifeMonths);
        this.volumeMl = volumeMl;
        this.dropsPerMl = dropsPerMl;
        this.isOral = isOral;
    }

    public double calculateTotalDrops(double volumeMl, int dropsPerMl) {
        return volumeMl * dropsPerMl;
    }

    @Override
    public String toString() {
        return "Drops{" + super.toString() +
                "volumeMl=" + volumeMl +
                ", dropsPerMl=" + dropsPerMl +
                ", isOral=" + isOral +
                '}';
    }
}
