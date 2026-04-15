public class UncontrolledIntersection extends Intersection{
    private boolean hasMainRoadSign;
    private int dangerBonus;

    public UncontrolledIntersection(String mainStreet, String sideStreet, double hourlyTraffic, boolean hasMainRoadSign, int dangerBonus) {
        super(mainStreet, sideStreet, hourlyTraffic);
        this.hasMainRoadSign = hasMainRoadSign;
        this.dangerBonus = dangerBonus;
    }

    @Override
    public double getRiskLevel() {
        return super.getRiskLevel() * 1.5;
    }

    @Override
    public String toString() {
        return "UncontrolledIntersection{" + super.toString() +
                "hasMainRoadSign=" + hasMainRoadSign +
                ", dangerBonus=" + dangerBonus +
                '}';
    }
}
