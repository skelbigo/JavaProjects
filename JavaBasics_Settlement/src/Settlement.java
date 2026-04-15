public class Settlement {
    private String name;
    private String type;
    private int population;
    private double area;
    private static int settlementCount = 0;

    public Settlement() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.population = 0;
        this.area = 0;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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
