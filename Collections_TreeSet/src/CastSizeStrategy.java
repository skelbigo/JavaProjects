public class CastSizeStrategy implements MovieComparisonStrategy {
    @Override
    public int getValue(Movie m) {
        return m.getListOfActors().size();
    }
}
