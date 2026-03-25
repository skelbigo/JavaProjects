import java.util.Iterator;
import java.util.Set;

public class PopularCommentStrategy implements BlogAnalysisStrategy<Comment> {
    public Comment execute(Set<Video> videos) {
        Iterator<Video> i = videos.iterator();

        while (i.hasNext()) {
            Video video = i.next();
            Set<Comment> comments = video.getComments();
            for (Comment comment : comments) {
                if (comment.getLikes() > video.getLikes()) {
                    return comment;
                }
            }
        }
        return null;
    }
}
