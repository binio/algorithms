package business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class NWPTest {

    @Parameter
    public int a;

    @Parameter(1)
    public int b;

    @Parameter(2)
    public int expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 112, 42, 14 },
                { 1000, 500 ,500},
                {125, 30, 5},
                {125, 0, 125},
                { 42, 112, 14 },
        });
    }

    @Test
    public void calculateTest(){

        NWP nwp = new NWP();
        assertEquals(expected, nwp.calculate(a, b));

    }

    @Test
    public void calculateStepsTest(){

        NWP nwp = new NWP();
        assertEquals(expected, nwp.calculateSteps(a, b));

    }
}