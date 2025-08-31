package products;

import java.time.LocalDate;

public class Milk extends Product {

    public Milk(LocalDate producedOn) {
        super("Milk", 60, producedOn);
    }

    @Override
    public boolean isFresh() {
        return producedOn.plusDays(60).isAfter(LocalDate.now());
    }
}
