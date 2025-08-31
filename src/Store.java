import products.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Store {
    private final Random rnd = new Random();
    private final Product[] products = new Product[20];

    public Store() {
        doInspection();
    }

    public void doInspection() {
        fillProducts();
        printTitle();
        printLabel();
        for (Product p : products) {
            System.out.printf(" %-7s | %15s |  %-13s | %12s | %s%n",
                    p.toString(),
                    p.getProducedOn().format(DateTimeFormatter.ofPattern("dd MMM yyyy")), // у меня вывод на русском, по этому формат сделал таким
                    p.getPlace(),
                    String.format("%.0f",p.getExpirationDate()),
                    p.isFresh()
            );
        }
        printLabel();
    }

    public void fillProducts() {
        for (int i = 0; i < products.length; i++) {
            int rndProduct = rnd.nextInt(5) + 1;
            LocalDate date = LocalDate.now().minusDays(rnd.nextInt(200) + 1);

            switch (rndProduct) {
                case 1:
                    products[i] = new Milk(date);
                    break;
                case 2:
                    products[i] = new Salt(date);
                    break;
                case 3:
                    products[i] = new Fish(date);
                    break;
                case 4:
                    products[i] = new Stew(date);
                    break;
                case 5:
                    products[i] = new Corn(date);
                    break;
                default:
            }

            products[i].setPlace(rnd.nextBoolean() ? Place.SHOWCASE : Place.ICEBOX);
        }
    }

    public void printTitle() {
        System.out.printf(" %40s%n%-8s | %15s | %13s | %10s | %5s%n",
                "Inspection result.",
                " Product",
                "Produced on",
                " Storage place",
                "S. life days",
                "Fresh"
        );
    }

    public void printLabel() {
        System.out.println("---------+-----------------+----------------+--------------+---------");
    }

}
