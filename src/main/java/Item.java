import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Item implements ISell {
    private int buyPrice;
    private int sellPrice;
    private IPlay instrument;

    public Item(IPlay instrument, int buyPrice, int sellPrice) {
        this.instrument = instrument;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkUp() {
        return sellPrice/buyPrice;
    }
}
