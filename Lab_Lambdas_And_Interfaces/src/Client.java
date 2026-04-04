import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        MathFunction formula = (a, b, c, d) -> (Math.pow(Math.tan(a), 1.0 / c)) / (1 + (Math.sinh(b) / Math.log(Math.abs(d + c))));
        MathFunction formula1 = (a, b, c, d) -> (2 * Math.log(Math.pow(b, a))) + (Math.abs(Math.asin(-Math.sqrt(d / c))));
        MathFunction formula2 = (a, b, c, d) -> 3 * (Math.log(a / b) + Math.sqrt(Math.cos(c) + Math.exp(d)));
        printResults(formula, 1.234, -3.12, 5.45, 2.0, "Formula 1 = ");
        printResults(formula1, 3.56, 1.02, 3, 2.43, "Formula 2 = ");
        printResults(formula2, -2.54, 1.23, -2.14, -0.23, "Formula 2 = ");

        List<SportsCompetition> matches = new ArrayList<>();
        matches.add(new FootballMatch(
                "Champions League", "Real Madrid", "Borussia Dortmund", 2, 2,
                "London", "Wembley Stadium", 4, 0, true));
        matches.add(new FootballMatch("Euro 2024", "Ukraine", "Slovakia",
                2, 1, "Dusseldorf", "Merkur Spiel-Arena", 1, 0, false));
        matches.add(new TennisMatch("Wimbledon", "Alcaraz", "Djokovic",
                3, 2, "London", "Grass", true, 12, 15,
                new String[]{"1-6", "7-6", "6-1", "3-6", "6-4"}));
        matches.add(new TennisMatch("French Open", "Nadal", "Zverev",
                3, 0, "Paris", "Clay", true, 5, 18,
                new String[]{"7-6", "6-3", "6-3"}));

        System.out.println("--- Tournament Results ---");
        matches.forEach(System.out::println);
    }

    public static void printResults(MathFunction formula, double a, double b, double c, double d, String name) {
        System.out.println(name + formula.calculate(1.234, -3.12, 5.45, 2.0));
    }
}
