package products;

import java.time.LocalDate;

public class Corn extends Product {
    public Corn(LocalDate producedOn) {
        super("Corn", 150, producedOn);
    }

    @Override
    public boolean isFresh() {
        return producedOn.plusDays(150).isAfter(LocalDate.now());
    }
}
