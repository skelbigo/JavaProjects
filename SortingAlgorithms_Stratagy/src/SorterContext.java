public class SorterContext {
    private SortStrategy strategy;

    public SorterContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSort(int[] arr) {
        strategy.sort(arr);
    }
}