package products;

import java.time.LocalDate;

public class Milk extends Product {

    public Milk(LocalDate producedOn) {
        super("Milk", 60, producedOn);
    }

    @Override
    public boolean isFresh() {
        double resultDate = place == Place.SHOWCASE ? expirationDate / 2 : expirationDate;
        return producedOn.plusDays((long) resultDate).isAfter(LocalDate.now());
    }
}
