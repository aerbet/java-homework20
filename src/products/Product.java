package products;

import java.time.LocalDate;

public abstract class Product {
    protected String name;
    protected double expirationDate;
    protected LocalDate producedOn;
    protected Place place;

    protected Product(String name, double expirationDate, LocalDate producedOn) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.producedOn = producedOn;
    }

    public abstract boolean isFresh();

    public double getExpirationDate() {
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

    @Override
    public String toString() {
        return this.name;
    }
}
