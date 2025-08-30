package products;

import java.time.LocalDate;

public class Corn extends Product {
    public Corn() {
        super("Corn", 150);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isFresh() {
        return false;
    }
}
