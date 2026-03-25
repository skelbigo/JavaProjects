import java.util.HashSet;
import java.util.Set;

public class Videoblog {
    private String vloggerName;
    private Set<Video> videos;

    public Videoblog(String vloggerName) {
        this.vloggerName = vloggerName;
        this.videos = new HashSet<>();
    }

    public void addVideo(Video... video) {
        for(Video v : video) {
            this.videos.add(v);
        }
    }

    public Set<Video> getVideos() {
        return videos;
    }
}
