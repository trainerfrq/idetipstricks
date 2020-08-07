package FirstPackage;

import static org.junit.Assert.*;

public class IdeTipsTest {

    @org.junit.Test
    public void getMyProp() {
    }

    @org.junit.Test
    public void setMyProp() {
        
        IdeTips newVar = new IdeTips("test");
        assertEquals("test", newVar.getMyProp());
    }
}