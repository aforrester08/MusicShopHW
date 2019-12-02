import Interfaces.ISell;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public void buyStock(ISell item) {
        stock.add(item);
    }

    public void sellItem(ISell item) {
        stock.remove(item);
    }
}
