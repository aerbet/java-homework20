import products.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Store {
    private final Random rnd = new Random();
    private final String[] products = new String[20];
    private final Product[] product = {new Milk(), new Salt(), new Fish(), new Corn(), new Stew()};

    public Store() {
        printProducts();
    }

    public void printProducts() {
        fillProducts();
        for (int i = 0; i < products.length; i++) {
            System.out.printf(" %s | %s |%n", products[i], setDates());
        }
    }

    public String setDates() {
        LocalDate date = LocalDate.now().minusDays(rnd.nextInt(200) + 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = date.format(formatter);

        return formattedDate;
    }

    public void fillProducts() {
        for (int i = 0; i < products.length; i++) {
            products[i] = product[rnd.nextInt(product.length)].toString();
        }
    }


    public String[] getProduct() {
        return products;
    }
}
