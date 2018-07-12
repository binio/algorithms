package business;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NestedArraysStreamTest {

    NestedArraysStream underTest = new NestedArraysStream();
    @Test
    public void joinStreams() {
        underTest.joinStreams();
    }

    @Test
    public void prepareErrorMessage() {
        underTest.prepareErrorMessage();
    }
}