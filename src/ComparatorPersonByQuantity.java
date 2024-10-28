import java.util.Comparator;

public class ComparatorPersonByQuantity implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return o1.getQuantity() - o2.getQuantity();
    }
}
