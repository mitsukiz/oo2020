package app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Tegemisega läks peaaegu 1.5 tundi

public class Tests {
    
    Jook jook = new Jook("water", 1.05, 1);
    Joogipudel pudel = new Joogipudel(1.0, BottleType.GLASS, 0.1);

    @Test
    public void test1(){
        System.out.println("Test algas!");
    }

    @Test
    public void test2(){
        assertEquals(65, pudel.wholeWeight(), 0.01);

    }

    @Test
    public void test3(){
        pudel.fillBottle(jook);
        assertEquals(66, pudel.wholeWeight(), 0.01);
    }

    @Test
    public void test4(){
        System.out.println("Test lõppes!");
    }


}