package business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StreamsExampleTest {

    //under test
    StreamsExample s = new StreamsExample();

    @Test
    public void testFilterStream(){
        s.filterStream();
    }

    @Test
    public void testCreateStream() {
        s.createStream();
    }

    @Test
    public void testPrimitiveStreams() {
        s.primitiveStreams();
    }

    @Test
    public void testPrimitiveAvaerage() {
        s.primitiveAverage();
    }

    @Test
    public void testMaxPrimitive() {
        s.maxPrimitive();
    }

    @Test
    public void testMapToObject() {
        s.mapToObject();
    }

    @Test
    public void testMapPrimitiveToObject() {
        s.mapPrimitiveToObject();
    }



}