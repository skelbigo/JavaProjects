import java.util.Comparator;
import java.util.Objects;

public class Car extends Vehicle{
    int doorCount;
    String fuelType;
    boolean isElectric;

    public Car(String brand, String model, int maxSpeed, double weight, int doorCount, String fuelType, boolean isElectric) {
        super(brand, model, maxSpeed, weight);
        this.doorCount = doorCount;
        this.fuelType = fuelType;
        this.isElectric = isElectric;
    }

    @Override
    public void move() {
        System.out.println("The car is driving down the road");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", fuelType='" + fuelType + '\'' +
                ", isElectric=" + isElectric +
                super.toString() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o) || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doorCount == car.doorCount && isElectric == car.isElectric && Objects.equals(fuelType, car.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doorCount, fuelType, isElectric);
    }
}
