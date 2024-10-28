import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("TV", 2150.99, 10, 14),
                new Product("leptop", 320.99, 9, 56),
                new Product("telephone", 654.99, 7, 44),
                new Product("PlayStation", 850.99, 8, 25)

        ));
        print(products);
        products.sort(new ComparatorPersonByTitle());
        System.out.println("//--------------//title//--------------//");
        print(products);
        System.out.println("//------------------// price");
        products.sort(new ComparatorPersonByPrice());
        print(products);

    }
    public static void print(List<Product> list){
        for (Product product:list) {
            System.out.println(product);

        }
    }
}