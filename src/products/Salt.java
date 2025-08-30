package products;

public class Salt extends Product {

    public Salt() {
        super("Salt", Integer.MAX_VALUE);
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
