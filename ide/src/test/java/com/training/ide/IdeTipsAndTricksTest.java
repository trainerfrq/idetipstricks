package com.training.ide;

import static org.junit.Assert.*;

public class IdeTipsAndTricksTest {

    @org.junit.Test
    public void getMyProp() {
        IdeTipsAndTricks newvar = new IdeTipsAndTricks("test");
        assertEquals("test", newvar.getMyProp());
    }
}