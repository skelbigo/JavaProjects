import java.util.Comparator;

public class MovieByTitleLengthComparator implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        int length = m1.title.length() - m2.title.length();
        if (length != 0) {
            return length;
        }

        return m1.title.compareTo(m2.title);
    }
}
