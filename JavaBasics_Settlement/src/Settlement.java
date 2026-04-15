import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Settlement {
    private String name, type;
    private int population;
    private double area;
    private static int settlementCount = 0;
    private Intersection[] intersections = new Intersection[0];

    public Settlement() {
        this("Unknown", "Unknown", 0, 0);
        settlementCount++;
    }

    public Settlement(String name, String type, int population, double area) {
        this.name = name;
        this.type = type;
        this.population = population;
        this.area = area;
        settlementCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setIntersections(Intersection[] intersections) {
        this.intersections = intersections;
    }

    public double calculateDensity() {
        return this.population / this.area;
    }

    public void changePopulation() {
        this.population += 1;
    }

    public void changePopulation(int count) {
        this.population += count;
    }

    public static void printTotalCount() {
        System.out.println("Total number of objects created:" + settlementCount);
    }

    public List<Intersection> findIntersectionsByStreet(String streetName) {
        class StreetNameFormatter {
            String trimStreetName() {
                String cleanName = streetName.trim();
                return cleanName;
            }
        }
        StreetNameFormatter snm = new StreetNameFormatter();
        String finalName = snm.trimStreetName();
        return Arrays.stream(intersections).filter(s -> finalName.equalsIgnoreCase(s.getMainStreet()) || finalName.equalsIgnoreCase(s.getSideStreet())).collect(Collectors.toList());
    }

    public Intersection getMostBusyIntersection() {
        return Arrays.stream(intersections).max(Comparator.comparing(Intersection::getHourlyTraffic)).orElse(null);
    }

    public Intersection[] sortIntersectionsByDanger() {
        return Arrays.stream(intersections).sorted(Comparator.comparing(Intersection::getRiskLevel)).toArray(Intersection[]::new);
    }

    public Intersection[] cloneIntersections() {
        return Arrays.copyOf(intersections, intersections.length);
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
