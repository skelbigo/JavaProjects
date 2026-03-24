import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Client {
    public static void main(String[] args) {
        MovieDatabase movieDatabase = new MovieDatabase();
        MovieDataSeeder.fillDatabase(movieDatabase);
        printResults(movieDatabase);
    }

    public static void printResults(MovieDatabase movieDatabase) {
        Actor unemployedActor = MovieService.hasActorWithoutMovies(movieDatabase, new UnemployedActorStrategy());
        System.out.println(unemployedActor != null ? "Актор, який не знімався в жодному фільмі: " + unemployedActor : "Всі актори працюють");

        String targetName = "Eмма Вотсон";
        Actor target = movieDatabase.findActorByName(targetName);
        if (target != null) {
            System.out.println("Колеги актора " + targetName + ": " + MovieService.getColleaguesOfActor(target));
        }

        System.out.println("Фільм з найбільшою кількістю акторів: " + MovieService.findMovieWithMostActors(movieDatabase, new CastSizeStrategy()));
    }
}
