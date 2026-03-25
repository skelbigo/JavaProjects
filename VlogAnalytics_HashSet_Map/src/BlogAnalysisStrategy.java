import java.util.Set;

public interface BlogAnalysisStrategy<T> {
    public T execute(Set<Video> videos);
}
