package com.training.ide;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ideTipsAndTricksTest {

    @org.junit.Test
    public void getMyProp() {
        IdeTipsAndTricks ideTipsAndTricks = new IdeTipsAndTricks( "test");
        assertEquals("test",ideTipsAndTricks.getMyProp());
}
}