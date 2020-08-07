package com.training.ide;

import static org.junit.Assert.*;

public class IdeTipsAndTricksTest {

    @org.junit.Test
    public void getMyProp() {
        IdeTipsAndTricks ideTipsAndTricks = new IdeTipsAndTricks("test");
        assertEquals("test",ideTipsAndTricks.getMyProp());
    }
}