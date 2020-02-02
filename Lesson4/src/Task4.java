import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Product firstProduct = new Product();
//        firstProduct.setName(br.readLine());
//        firstProduct.setPrice(Double.parseDouble(br.readLine()));
//        firstProduct.setQuantity(Integer.parseInt(br.readLine()));
//
//        Product secondProduct = new Product();
//        secondProduct.setName(br.readLine());
//        secondProduct.setPrice(Double.parseDouble(br.readLine()));
//        secondProduct.setQuantity(Integer.parseInt(br.readLine()));
//
//        Product thirdProduct = new Product();
//        thirdProduct.setName(br.readLine());
//        thirdProduct.setPrice(Double.parseDouble(br.readLine()));
//        thirdProduct.setQuantity(Integer.parseInt(br.readLine()));
//
//        Product fourthProduct = new Product();
//        fourthProduct.setName(br.readLine());
//        fourthProduct.setPrice(Double.parseDouble(br.readLine()));
//        fourthProduct.setQuantity(Integer.parseInt(br.readLine()));

        Product firstProduct = new Product("apple", 2.3, 3);
        Product secondProduct = new Product("potato", 3.3, 5);
        Product thirdProduct = new Product("tea", 5.5, 2);
        Product fourthProduct = new Product("coffee", 6.9, 3);

        ArrayList<Product> products = new ArrayList<>();
        products.add(firstProduct);
        products.add(secondProduct);
        products.add(thirdProduct);
        products.add(fourthProduct);
        Product maxQuantity = products.get(0);
        Product maxPrice = products.get(0);

        for (Product pr : products) {
            if (pr.getQuantity() > maxQuantity.getQuantity()) {
                maxQuantity = pr;
            }

        }
        for (Product pr : products) {
            if (pr.getPrice() > maxPrice.getPrice()) {
                maxPrice = pr;
            }

        }
        System.out.println("maxQuantity " + maxQuantity.getName());
        System.out.println("maxPrice " + maxPrice.getName());

    }
}

