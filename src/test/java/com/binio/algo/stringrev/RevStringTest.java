package com.binio.algo.stringrev;

import static org.junit.Assert.*;

import org.junit.Test;

public class RevStringTest {

    @Test
    public void reverse() {
        assertEquals( "zsamot", RevString.reverse("tomasz"));
        assertEquals( "Barb", RevString.reverse("braB"));
        assertEquals( "AZXC", RevString.reverse("CXZA"));
        assertEquals( "Anakonda", RevString.reverse("adnokanA"));
        assertEquals( "ANNA", RevString.reverse("ANNA"));
    }

    @Test
    public void reverseV2() {
        assertEquals( "zsamot", RevString.reverseV2("tomasz"));
        assertEquals( "Barb", RevString.reverseV2("braB"));
        assertEquals( "AZXC", RevString.reverseV2("CXZA"));
        assertEquals( "Anakonda", RevString.reverseV2("adnokanA"));
        assertEquals( "ANNA", RevString.reverseV2("ANNA"));
    }

    @Test
    public void reverseV3() {
        assertEquals( "zsamot", RevString.reverseV3("tomasz"));
        assertEquals( "Barb", RevString.reverseV3("braB"));
        assertEquals( "AZXC", RevString.reverseV3("CXZA"));
        assertEquals( "Anakonda", RevString.reverseV3("adnokanA"));
        assertEquals( "ANNA", RevString.reverseV3("ANNA"));
    }
}