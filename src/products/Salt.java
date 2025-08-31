package products;

import java.time.LocalDate;

public class Salt extends Product {

    public Salt(LocalDate producedOn) {
        super("Salt", Double.POSITIVE_INFINITY, producedOn);
    }

    @Override
    public boolean isFresh() {
        return true;
    }

}
