package products;

import java.time.LocalDate;

public class Stew extends Product {

    public Stew(LocalDate producedOn) {
        super("Stew", 180, producedOn);
    }

    @Override
    public boolean isFresh() {
        return producedOn.plusDays(180).isAfter(LocalDate.now());
    }
}
