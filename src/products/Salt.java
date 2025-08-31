package products;

import java.time.LocalDate;

public class Salt extends Product {

    public Salt(LocalDate producedOn) {
        super("Salt", Integer.MAX_VALUE, producedOn);
    }

    @Override
    public boolean isFresh() {
        return true;
    }

}
