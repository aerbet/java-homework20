package products;

public class Stew extends Product {

    public Stew() {
        super("Stew", 180);
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
