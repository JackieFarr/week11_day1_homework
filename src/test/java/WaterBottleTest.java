import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

//    private WaterBottle waterbottle;

    @Test
    public void canDrink(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void canEmpty(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void canRefill(){
        WaterBottle waterbottle = new WaterBottle( 100);
        assertEquals(100, waterbottle.reFill());
    }
}
