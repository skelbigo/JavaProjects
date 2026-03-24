import java.util.TreeSet;

public class Movie implements Comparable<Movie> {
    String title;
    TreeSet<Actor> listOfAllActors;

    public Movie(String title, TreeSet<Actor> listOfAllActors) {
        this.title = title;
        this.listOfAllActors = listOfAllActors;
    }

    public Movie(String title) {
        this.title = title;
        this.listOfAllActors = new TreeSet<>();
    }

    public void addActor(Actor actor) {
        this.listOfAllActors.add(actor);
        actor.getListOfAllMovies().add(this);
    }

    public TreeSet<Actor> getListOfActors() {
        return listOfAllActors;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Movie movie) {
        return this.title.compareTo(movie.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
