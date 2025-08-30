package products;

public class Corn extends Product {
    public Corn() {
        super("Corn", 150);
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
