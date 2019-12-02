import Instrument.Guitar;
import Instrument.Piano;
import Instrument.Saxophone;
import Interfaces.IPlay;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

public class ShopTest {

    private Shop shop;
    private IPlay Instrument;
    private IPlay Instrument1;
    private IPlay Instrument2;

    @Before
    public void before() {
        shop = new Shop();
        Instrument = new Guitar("Red", "Electric");
        Instrument1 = new Piano("Black", "Grand");
        Instrument2 = new Saxophone("metal", 6);
    }

    @Test
}
