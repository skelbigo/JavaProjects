import java.util.Objects;

public class Boat extends Vehicle {
    double draft;
    boolean hasMotor;
    String hullMaterial;

    public Boat(String brand, String model, int maxSpeed, double weight, double draft, boolean hasMotor, String hullMaterial) {
        super(brand, model, maxSpeed, weight);
        this.draft = draft;
        this.hasMotor = hasMotor;
        this.hullMaterial = hullMaterial;
    }

    @Override
    public void move() {
        System.out.println("The boat is floating on the water");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "draft=" + draft +
                ", hasMotor=" + hasMotor +
                ", hullMaterial='" + hullMaterial + '\'' +
                super.toString() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o) || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return Double.compare(draft, boat.draft) == 0 && hasMotor == boat.hasMotor && Objects.equals(hullMaterial, boat.hullMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), draft, hasMotor, hullMaterial);
    }
}
