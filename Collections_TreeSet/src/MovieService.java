import java.util.Iterator;
import java.util.TreeSet;

public class MovieService {
    public static Actor hasActorWithoutMovies(MovieDatabase movieDatabase, ActorFilterStrategy strategy) {
        Iterator<Actor> i = movieDatabase.listOfAllActors.iterator();

        while (i.hasNext()) {
            Actor actor = i.next();
            if (strategy.test(actor)) {
                return actor;
            }
        }
        return null;
    }

    public static TreeSet<Actor> getColleaguesOfActor(Actor actor) {
        TreeSet<Actor> colleagues = new TreeSet<>();
        Iterator i = actor.getListOfAllMovies().iterator();
        while(i.hasNext()) {
            Movie movie = (Movie) i.next();
            colleagues.addAll(movie.getListOfActors());
            colleagues.remove(actor);
        }
        return colleagues;
    }

    public static TreeSet<Movie> findMovieWithMostActors(MovieDatabase movieDatabase, CastSizeStrategy strategy) {
        int max = 0;
        TreeSet<Movie> result = new TreeSet<>();
        for (Movie m : movieDatabase.listOfAllMovies) {
            int cast = strategy.getValue(m);
            if (cast > max) {
                max = m.getListOfActors().size();
                result.clear();
                result.add(m);
            } else if (cast == max) {
                result.add(m);
            }
        }
        return result;
    }
}
