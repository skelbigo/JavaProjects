import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arr1 = {5, 1, 9, 3};
        int[] arr2 = {-1, 12, 0, 8, 3, 10};
        sortAndPrint(arr, new BubbleSort());
        sortAndPrint(arr1, new InsertionSort());
        sortAndPrint(arr2, new SelectionSort());
    }

    public static void sortAndPrint(int[] arr, SortStrategy sortStrategy) {
        SorterContext sorterContext = new SorterContext(sortStrategy);

        System.out.println("Original: " + Arrays.toString(arr));
        sorterContext.executeSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr) + "\n");
    }
}
