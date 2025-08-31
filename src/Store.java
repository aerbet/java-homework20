import products.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Store {
    private final Random rnd = new Random();
    private final Product[] products = new Product[20];
//    private final Product[] product = {new Milk(), new Salt(), new Fish(), new Corn(), new Stew()};
//    private Place icebox = Place.ICEBOX;
//    private Place showcase = Place.SHOWCASE;

    public Store() {
        doInspection();
    }

    public void doInspection() {
        fillProducts();
        printTitle();
        printLabel();
        for (Product p : products) {
            System.out.printf(" %-7s | %17s |  %-12s | %12s | %s%n",
                    p.toString(),
                    p.getProducedOn().format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")),
                    p.getPlace(),
                    p.getExpirationDate(),
                    p.isFresh()
            );
        }
        printLabel();
    }

//    public String placeProduct() {
//        int index = rnd.nextInt(2) + 1;
//        String placement;
//        if (index == 1) {
//            placement = icebox.toString();
//        } else {
//            placement = showcase.toString();
//        }
//
//        return placement;
//    }

//    public String produceDates() {
//        LocalDate date = LocalDate.now().minusDays(rnd.nextInt(200) + 1);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
//
//        return date.format(formatter);
//    }

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
        System.out.printf(" %44s%n%-8s | %17s | %10s | %10s | %5s%n",
                "Inspection result.",
                "Product",
                "Produced on",
                "Storage place",
                "S. life days",
                "Fresh"
        );
    }

    public void printLabel() {
        System.out.println("---------+-------------------+---------------+--------------+---------");
    }

}
