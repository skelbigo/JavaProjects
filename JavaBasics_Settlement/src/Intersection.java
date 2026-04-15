public class Intersection {
    private String mainStreet;
    private String sideStreet;
    private double hourlyTraffic;

    public Intersection(String mainStreet, String sideStreet, double hourlyTraffic) {
        this.mainStreet = mainStreet;
        this.sideStreet = sideStreet;
        this.hourlyTraffic = hourlyTraffic;
    }

    public double getRiskLevel() {
        return  hourlyTraffic / 100;
    }

    public String getMainStreet() {
        return mainStreet;
    }

    public String getSideStreet() {
        return sideStreet;
    }

    public double getHourlyTraffic() {
        return hourlyTraffic;
    }

    static class IntersectionStats {
        private String lastTrafficUpdate;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "mainStreet='" + mainStreet + '\'' +
                ", sideStreet='" + sideStreet + '\'' +
                ", hourlyTraffic=" + hourlyTraffic +
                '}';
    }
}
