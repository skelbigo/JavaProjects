import java.util.Comparator;
import java.util.Objects;

public abstract class Vehicle {
    String brand;
    String model;
    int maxSpeed;
    double weight;

    public Vehicle(String brand, String model, int maxSpeed, double weight) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public double calculateTravelTime(double distance) {
        return distance/this.maxSpeed;
    }

    public void move() {
        System.out.println("Traffic is moving");
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxSpeed == vehicle.maxSpeed && Double.compare(weight, vehicle.weight) == 0 && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, maxSpeed, weight);
    }

    public static class SpeedComparator implements Comparator<Vehicle> {
        public int compare(Vehicle v1, Vehicle v2) {
            return v1.maxSpeed - v2.maxSpeed;
        }
    }
}
