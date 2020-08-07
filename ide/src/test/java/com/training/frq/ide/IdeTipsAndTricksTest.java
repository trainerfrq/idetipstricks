package com.training.frq.ide;

import static org.junit.Assert.*;

public class IdeTipsAndTricksTest {

    @org.junit.Test
    public void getMyProp(){
        IdeTipsAndTricks tipsAndTricks=new IdeTipsAndTricks("Eu");
        assertEquals("Eu",tipsAndTricks.getMyProp());
    }

}