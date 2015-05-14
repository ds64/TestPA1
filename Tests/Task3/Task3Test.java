package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void task3Test()
    {
        Health health = new Health("Mental");
        assertEquals("Mental", health.getType());

        ArturDent arturDent = new ArturDent(true,true);
        assertTrue(arturDent.getIsDanger());
        assertTrue(arturDent.getHasAccomplice());

        MrProsser mrProsser = new MrProsser(true,true,true,true,health);
        assertTrue(mrProsser.getIsArguing());
        assertTrue(mrProsser.getIsSurprised());
        assertTrue(mrProsser.getIsWorried());
        assertTrue(mrProsser.getLookedAround());
        assertEquals("Mental",mrProsser.getHisHealth().getType());
    }
}