package business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StreamAdvancedTest {
    StreamAdvanced sa = new StreamAdvanced();

    @Test
    public void getAllPeople() throws Exception {
        sa.getAllPeople();
    }

    @Test
    public void groupByAge() throws Exception {
        sa.groupByAge();
    }


    @Test
    public void averageAge() throws Exception {
        sa.averageAge();//
    }

    @Test
    public void sumAge() {
        sa.sumAge();
    }

    @Test
    public void joiningAge() throws Exception {
        sa.joiningAge();
    }

    @Test
    public void toMap() throws Exception {
        sa.toMap();
    }
}