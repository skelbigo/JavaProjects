public class UnemployedActorStrategy implements ActorFilterStrategy {
    @Override
    public boolean test(Actor a) {
        return a.getListOfAllMovies().isEmpty();
    }
}
