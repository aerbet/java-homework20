package products;

public class Milk extends Product {
    public Milk() {
        super("Milk", 60);
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
