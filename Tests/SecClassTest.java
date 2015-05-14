import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecClassTest {
    private SecClass secClass;

    @Before
    public void setUp() throws Exception {
        secClass = new SecClass();
    }

    @Test
    public void testSec() throws Exception {
        assertEquals(1.0, secClass.secMethod(0.0), 0.00001);
        assertEquals(1.15470, secClass.secMethod(Math.PI/6), 0.00001);
        assertEquals(1.41421, secClass.secMethod(Math.PI/4), 0.00001);
        assertEquals(2.0, secClass.secMethod(Math.PI/3), 0.00001);
        assertEquals(-1.0, secClass.secMethod(Math.PI), 0.00001);
        assertEquals(1.0, secClass.secMethod(2*Math.PI), 0.00001);
        assertNotEquals(0.5, secClass.secMethod(Math.PI/3),0.00001);
        assertNotEquals(0, secClass.secMethod(Math.PI),0.00001);
    }
}