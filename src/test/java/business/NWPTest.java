package business;

import org.junit.Test;

import static org.junit.Assert.*;

public class NWPTest {

    @Test
    public void calculateTest(){

        NWP nwp = new NWP(112,42);
        assertEquals(14, nwp.calculate(112, 42));

    }

}