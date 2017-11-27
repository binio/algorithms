package business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StreamsProcessingOrderTest {



    StreamsProcessingOrder sp = new StreamsProcessingOrder();

    @Test
    public void intermAndTerminal() throws Exception {
        sp.intermAndTerminal();
    }

    @Test
    public void operationNumbers() throws Exception {
        sp.operationNumbers();
    }

    @Test
    public void operationNumbersPipeline() throws Exception {
        sp.operationNumbersPipeline();
    }



}