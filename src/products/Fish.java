package products;

import java.time.LocalDate;

public class Fish extends Product {

    public Fish(LocalDate producedOn) {
        super("Fish", 20, producedOn);
    }

    @Override
    public boolean isFresh() {
        double resultDate = place == Place.SHOWCASE ? expirationDate / 20 : expirationDate;
        return producedOn.plusDays((long) resultDate).isAfter(LocalDate.now());
    }
}
