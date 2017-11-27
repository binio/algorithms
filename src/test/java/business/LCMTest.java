package business;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by thomas on 25/11/17.
 */
@RunWith(JUnit4.class)
public class LCMTest {

    LCM lcm = new LCM();

    @Test
    public void calculateTest() {

        assertEquals(30,lcm.calculate(15,6));
    }

    @Test
    public void primeFactorTest() {
        List<Integer> testList = lcm.primeFactors(26);
        List<Integer> expectedList = Arrays.asList(2,13);

        Assert.assertThat(testList,
                IsIterableContainingInOrder.contains(expectedList.toArray()));
    }

}