package products;

public enum Place {
    SHOWCASE("Showcase"),
    ICEBOX("Icebox");

    private String title;

    Place(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
