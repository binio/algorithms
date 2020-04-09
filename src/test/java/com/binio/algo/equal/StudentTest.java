package com.binio.algo.equal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testEqual() {
        Student s1 = new Student("Tomasz", "Biniecki");
        Student s2 = new Student("Tomasz", "Biniecki");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        assertEquals(s1,s2);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

}