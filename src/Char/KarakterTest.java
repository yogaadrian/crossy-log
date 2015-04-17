package Char;

import Point.Point;
import junit.framework.TestCase;

/**
 * Created by omarcelh on 13-Apr-15.
 */

public class KarakterTest extends TestCase {

    public void testGetName() throws Exception {
        Karakter instance = new Karakter();
        String expResult = "Doge";
        String result = instance.getName();
        assertEquals("error di getName", expResult, result);
    }

    public void testGetCPosition() throws Exception {
        Point result = new Point();
        Karakter instance = new Karakter();
        assertEquals("error di getCPosition", result.getAbsis(), instance.getCPosition().getAbsis());
        assertEquals("error di getCPosition", result.getOrdinat(), instance.getCPosition().getOrdinat());
    }

    public void testGetStatus() throws Exception {
        Karakter instance = new Karakter();
        assertTrue("error di getStatus()", instance.getStatus());
    }

    public void testSetCPosition() throws Exception {
        Point P = new Point(2,3);
        Karakter instance = new Karakter();
        instance.setCPosition(P);
        assertEquals("error di setCPosition", P.getAbsis(), instance.getCPosition().getAbsis());
        assertEquals("error di setCPosition", P.getOrdinat(), instance.getCPosition().getOrdinat());
    }

    public void testSetStatus() throws Exception {
        Karakter instance = new Karakter();
        instance.setStatus(false);
        assertFalse("error di setStatus", instance.getStatus());
    }

    public void testPrintKarakter() throws Exception {
        //String result = "Doge\n" + "(0, 0)\n" + "true";
        Karakter instance = new Karakter();
        instance.PrintKarakter();
        //assertEquals("error di PrintKarakter", result, );
    }
}