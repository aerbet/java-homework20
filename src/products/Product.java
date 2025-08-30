package products;

public abstract class Product {
    protected String name;
    protected int expirationDate;

    protected Product(String name, int expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public abstract boolean isFresh();
}
