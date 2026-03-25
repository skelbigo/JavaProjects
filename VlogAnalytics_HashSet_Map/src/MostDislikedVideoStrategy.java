import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MostDislikedVideoStrategy implements BlogAnalysisStrategy<List<Video>> {
    public List<Video> execute(Set<Video> videos) {
        int max = 0;
        List<Video> result = new ArrayList<>();
        for(Video video : videos) {
            if (max < video.getDislikes()) {
                result.clear();
                max = video.getDislikes();
                result.add(video);
            } else if (max == video.getDislikes()) {
                result.add(video);
            }
        }
        return result;
    }
}
