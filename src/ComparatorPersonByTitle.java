import java.util.Comparator;

public class ComparatorPersonByTitle implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
