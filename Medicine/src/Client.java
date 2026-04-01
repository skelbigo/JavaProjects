import java.lang.reflect.Array;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Tablet tablet1 = new Tablet("Aspirine", 58, "Bayer", false,  60, 20, 500, "round");
        Tablet tablet2 = new Tablet("Citramon", 28, "Darnitsa (PrAT FF)", false,  36, 10, 2, "round");
        Tablet tablet3 = new Tablet("Citramon", 56, "Darnitsa (PrAT FF)", false,  36, 20, 2, "round");
        Drops drops1 = new Drops("Systane Aqua", 486, "Alcon", false, 3, 10, 400, false);
        Drops drops2 = new Drops("Otipax", 197, "Biocodex", false, 36, 16, 1, true);

        List<Medicine> medicines = Arrays.asList(tablet1, tablet2, tablet3, drops1, drops2);
        List<Medicine> testMedicines = Arrays.asList(tablet1, tablet3, null, drops2);
        Comparator<Medicine> medicinesComparator = Comparator.comparingDouble(Medicine::getPrice);
        Collections.sort(medicines, medicinesComparator);
        System.out.println("A list of medications, from the least expensive to the most expensive: " + medicines.toString());

        medicines.sort(medicinesComparator.reversed());
        System.out.println("A list of medications, from the most expensive to the least expensive: " + medicines);

        medicines.sort(Comparator.comparing(Medicine::getName).thenComparing(Medicine::getPrice));
        System.out.println("The list of medications is sorted by name and price" + medicines);

        Comparator<Medicine> nullsFirstComparator = Comparator.nullsFirst(medicinesComparator);
        Collections.sort(testMedicines, nullsFirstComparator);
        System.out.println("Sorted list (nulls first): " + testMedicines);


        Comparator<Medicine> nullsLastComparator = Comparator.nullsLast(medicinesComparator);
        Collections.sort(testMedicines, nullsLastComparator);
        System.out.println("Sorted list (nulls last): " + testMedicines);
    }
}
