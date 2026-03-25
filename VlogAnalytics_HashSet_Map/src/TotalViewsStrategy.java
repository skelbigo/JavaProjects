import java.util.Iterator;
import java.util.Set;

public class TotalViewsStrategy implements BlogAnalysisStrategy<Integer> {
    @Override
    public Integer execute(Set<Video> videos) {
        Iterator i = videos.iterator();
        int sum = 0;

        while (i.hasNext()) {
            Video video = (Video) i.next();
            sum += video.getViews();
        }
        return sum;
    }
}
