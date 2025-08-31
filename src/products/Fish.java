package products;

import java.time.LocalDate;

public class Fish extends Product {
    public Fish(LocalDate producedOn) {
        super("Fish", 20, producedOn);
    }

    @Override
    public boolean isFresh() {
        return producedOn.plusDays(20).isAfter(LocalDate.now());
    }
}
