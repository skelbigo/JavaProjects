import java.util.TreeSet;

public class MovieDatabase {
    TreeSet<Actor> listOfAllActors;
    TreeSet<Movie> listOfAllMovies;

    public MovieDatabase() {
        this.listOfAllActors = new TreeSet<>();
        this.listOfAllMovies = new TreeSet<>(new MovieByTitleLengthComparator());
    }

    public void addMovie(Movie... movies) {
        for(Movie m : movies) {
            this.listOfAllMovies.add(m);
        }
    }

    public void addActor(Actor... actors) {
        for(Actor a : actors) {
            this.listOfAllActors.add(a);
        }
    }

    public Actor findActorByName(String name) {
        for(Actor a : listOfAllActors) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }
}
