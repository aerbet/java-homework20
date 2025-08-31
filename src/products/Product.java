package products;

import java.time.LocalDate;

public abstract class Product {
    protected String name;
    protected int expirationDate;
    protected LocalDate producedOn;
    protected Place place;

    protected Product(String name, int expirationDate, LocalDate producedOn) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.producedOn = producedOn;
    }

    public abstract boolean isFresh();

    public String getName() {
        return name;
    }

    public int getExpirationDate() {
        return this.expirationDate;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
