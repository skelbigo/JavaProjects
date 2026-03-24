import java.util.TreeSet;

public class Actor implements Comparable<Actor> {
    String name;
    TreeSet<Movie> listOfAllMovies;

    public Actor(String name, TreeSet<Movie> listOfAllMovies) {
        this.name = name;
        this.listOfAllMovies = listOfAllMovies;
    }

    public Actor(String name) {
        this.name = name;
        this.listOfAllMovies = new TreeSet<>();
    }

    public TreeSet<Movie> getListOfAllMovies() {
        return listOfAllMovies;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Actor actor) {
        return this.name.compareTo(actor.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
