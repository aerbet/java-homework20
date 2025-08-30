package products;

import java.time.LocalDate;

public class Fish extends Product {
    public Fish() {
        super("Fish", 20);
    }

    @Override
    public boolean isFresh() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
