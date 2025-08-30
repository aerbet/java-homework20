package products;

public class Salt extends Product {

    public Salt() {
        super("Salt", Double.POSITIVE_INFINITY);
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
