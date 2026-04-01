import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Client {
    public static void main(String[] args) {
        Car chevrolet = new Car("American", "Equinox EV", 183, 195.4, 5, "Electric", true);
        Car toyota = new Car("Japanese", "RAV4", 204, 185.5, 5, "gasoline", true);
        Boat kolibri = new Boat("Ukraine", "Kolibri", 55, 170, 530, true, "PVH (wood)");

        Comparator<Vehicle> brandComparator = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return v1.getBrand().compareTo(v2.getBrand());
            }
        };

        Vehicle[] vehicles = {chevrolet, toyota, kolibri};
        Arrays.sort(vehicles, brandComparator);
        System.out.println(Arrays.toString(vehicles));
        System.out.println();

        TreeSet<Vehicle> sortedBySpeed = new TreeSet<Vehicle>(new Vehicle.SpeedComparator());
        sortedBySpeed.add(chevrolet);
        sortedBySpeed.add(toyota);
        sortedBySpeed.add(kolibri);

        System.out.println("Sorted by speed" + sortedBySpeed);
    }
}
