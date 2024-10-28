import java.util.Comparator;

public class ComparatorPersonByRating implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return o1.getRating() - o2.getRating();
    }
}
