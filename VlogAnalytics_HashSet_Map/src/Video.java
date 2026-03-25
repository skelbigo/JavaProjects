import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Video {
    private String title;
    private String url;
    private int likes;
    private int dislikes;
    private Set<Comment> comments;
    private int views;

    public Video(String title, String url, int likes, int dislikes, int views) {
        this.title = title;
        this.url = url;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = new HashSet<>();
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;

        return Objects.equals(video.url, url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        return "Назва='" + title + '\'' +
                ", лайки=" + likes +
                ", дізлайки=" + dislikes;
    }
}
