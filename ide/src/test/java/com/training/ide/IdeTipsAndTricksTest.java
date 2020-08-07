package com.training.ide;

import static org.junit.Assert.*;

public class IdeTipsAndTricksTest {

    @org.junit.Test
    public void getMyProp() {
        IdeTipsAndTricks newVar = new IdeTipsAndTricks("test");
        assertEquals("test",newVar.getMyProp());
    }
}