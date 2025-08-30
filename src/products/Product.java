package products;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Product {
    protected String name;
    protected double expirationDate;

    protected Product(String name, double expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public abstract boolean isFresh();

    public double getExpirationDate() {
        return this.expirationDate;
    }
}
