/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:35:27 GMT 2023
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.Entities;
import org.junit.runner.RunWith;

public class EntitiesTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Entities entities0 = Entities.HTML32;
        String string0 = entities0.unescape("KS!!0%&{&8{b(W'LqVf");
        assertEquals("KS!!0%&{&8{b(W'LqVf", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Entities entities0 = new Entities();
        String string0 = entities0.unescape("&");
        assertEquals("&", string0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Entities entities0 = new Entities();
        StringWriter stringWriter0 = new StringWriter(0);
        entities0.escape((Writer) stringWriter0, "c:QQ{,9W5");
        assertEquals("c:QQ{,9W5", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(128);
        entities_BinaryEntityMap0.size = 7;
        String string0 = entities_BinaryEntityMap0.name(0);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(139);
        entities_BinaryEntityMap0.size = (-418);
        int int0 = entities_BinaryEntityMap0.value("M_VtDs4uMx6");
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
        entities_ArrayEntityMap0.value("");
        entities_ArrayEntityMap0.add("", (-1));
        Entities entities0 = Entities.HTML32;
        String string0 = entities0.entityName(2059);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
        entities_ArrayEntityMap0.size = (-2179);
        String string0 = entities_ArrayEntityMap0.name((-233));
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
        String string0 = entities_LookupEntityMap0.name(256);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Entities.PrimitiveEntityMap entities_PrimitiveEntityMap0 = new Entities.PrimitiveEntityMap();
        int int0 = entities_PrimitiveEntityMap0.value("");
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        Entities.PrimitiveEntityMap entities_PrimitiveEntityMap0 = new Entities.PrimitiveEntityMap();
        String string0 = entities_PrimitiveEntityMap0.name((-3070));
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
        String string0 = entities_ArrayEntityMap0.name((-822));
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        Entities entities0 = new Entities();
        String string0 = entities0.escape("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        Entities entities0 = Entities.HTML40;
        int int0 = entities0.entityValue("igrave");
        assertEquals(236, int0);
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        Entities entities0 = new Entities();
        Entities.fillWithHtml40Entities(entities0);
        String string0 = entities0.entityName(34);
        assertEquals("quot", string0);
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        Entities entities0 = new Entities();
        Entities.fillWithHtml40Entities(entities0);
        String string0 = entities0.entityName(34);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        Entities entities0 = Entities.HTML40;
        // Undeclared exception!
        try {
            entities0.unescape((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        Entities entities0 = Entities.HTML40;
        // Undeclared exception!
        try {
            entities0.HTML32.unescape((Writer) null, (String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        // Undeclared exception!
        try {
            Entities.fillWithHtml40Entities((Entities) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        Entities entities0 = Entities.HTML40;
        // Undeclared exception!
        try {
            entities0.escape((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        Entities entities0 = Entities.HTML32;
        // Undeclared exception!
        try {
            entities0.HTML32.escape((Writer) null, "loz");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        Entities entities0 = Entities.XML;
        Entities entities1 = Entities.HTML32;
        Entities.fillWithHtml40Entities(entities1);
        Entities entities2 = Entities.XML;
        Entities.fillWithHtml40Entities(entities2);
        entities0.HTML40.addEntity("org.apache.commons.lang.Entities$LookupEntityMap", 0);
        Entities.fillWithHtml40Entities(entities0);
        entities0.XML.map = null;
        entities0.HTML32.unescape("1A-%<\"'");
        // Undeclared exception!
        try {
            entities0.entityValue("]s:E5`o@)+^4vaKA$r");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(703);
        String[] stringArray0 = new String[2];
        stringArray0[0] = "loz";
        stringArray0[1] = "8225";
        entities_BinaryEntityMap0.names = stringArray0;
        int[] intArray0 = new int[9];
        intArray0[0] = 703;
        intArray0[1] = 703;
        intArray0[2] = 703;
        intArray0[3] = 703;
        intArray0[4] = 703;
        intArray0[6] = 703;
        intArray0[7] = 703;
        intArray0[8] = 703;
        entities_BinaryEntityMap0.ensureCapacity(0);
        entities_BinaryEntityMap0.values = intArray0;
        entities_BinaryEntityMap0.ensureCapacity(703);
        entities_BinaryEntityMap0.name((-870));
        Entities entities0 = Entities.XML;
        // Undeclared exception!
        try {
            entities0.entityName(703);
            //  fail("Expecting exception: NullPointerException");
            // Unstable assertion
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        Entities entities0 = Entities.XML;
        // Undeclared exception!
        try {
            entities0.HTML40.addEntities((String[][]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        Entities entities0 = Entities.HTML40;
        String[][] stringArray0 = new String[5][0];
        // Undeclared exception!
        try {
            entities0.XML.addEntities(stringArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2624() throws Throwable {
        Entities entities0 = new Entities();
        String[][] stringArray0 = new String[0][3];
        entities0.XML.addEntities(stringArray0);
        assertEquals(0, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test2725() throws Throwable {
        Entities entities0 = new Entities();
        String[][] stringArray0 = new String[5][2];
        // Undeclared exception!
        try {
            entities0.addEntities(stringArray0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // null
        }
    }

    @Test(timeout = 4000)
    public void test2826() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(260);
        Entities entities0 = Entities.HTML32;
        entities0.unescape((Writer) stringWriter0, "`&BfzC4U'2Qeq4{~ZIx");
        assertEquals("`&BfzC4U'2Qeq4{~ZIx", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2927() throws Throwable {
        Entities entities0 = Entities.HTML32;
        String string0 = entities0.unescape("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3028() throws Throwable {
        Entities entities0 = new Entities();
        String string0 = entities0.unescape("$+kkY&NC1%.#");
        assertEquals("$+kkY&NC1%.#", string0);
    }

    @Test(timeout = 4000)
    public void test3229() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "M)er1y";
        stringArray0[1] = "org.apache.commons.lang.IntHashMap";
        stringArray0[2] = "org.apache.commons.lang.IntHashMap";
        stringArray0[3] = "t},&&A~7>3MM8.kKeF";
        entities_BinaryEntityMap0.names = stringArray0;
        entities_BinaryEntityMap0.ensureCapacity((-958));
        Entities entities0 = Entities.XML;
        Entities.fillWithHtml40Entities(entities0);
        Entities entities1 = Entities.XML;
        StringWriter stringWriter0 = new StringWriter();
        entities1.escape((Writer) stringWriter0, "");
        entities1.unescape((Writer) stringWriter0, "");
        Entities.fillWithHtml40Entities(entities1);
        entities0.addEntity("org.apache.commons.lang.exception.NestableRuntimeException", (-958));
        entities0.HTML32.escape((Writer) stringWriter0, "org.apache.commons.lang.exception.NestableRuntimeException");
        entities_BinaryEntityMap0.add("", 1437);
        int int0 = entities0.entityValue("");
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test3330() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
        Entities entities0 = new Entities();
        entities_BinaryEntityMap0.size = 116;
        entities0.map = (Entities.EntityMap) entities_BinaryEntityMap0;
        // Undeclared exception!
        try {
            entities0.escape("H3A");
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3431() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
        entities_BinaryEntityMap0.add("$+kkY&NC1%#", 116);
        Entities entities0 = new Entities();
        entities0.map = (Entities.EntityMap) entities_BinaryEntityMap0;
        String string0 = entities0.escape("H3A");
        assertEquals("H3A", string0);
    }

    @Test(timeout = 4000)
    public void test3532() throws Throwable {
        Entities entities0 = Entities.HTML32;
        int int0 = entities0.entityValue((String) null);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test3633() throws Throwable {
        Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
        entities_ArrayEntityMap0.value("");
        entities_ArrayEntityMap0.add("", (-1));
        Entities entities0 = Entities.HTML32;
        // Undeclared exception!
        try {
            entities0.entityName((-1));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1
        }
    }

    @Test(timeout = 4000)
    public void test3734() throws Throwable {
        Entities entities0 = Entities.HTML32;
        // Undeclared exception!
        try {
            entities0.HTML32.entityName((-854));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -854
        }
    }

    @Test(timeout = 4000)
    public void test3835() throws Throwable {
        Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
        int int0 = entities_HashEntityMap0.value("");
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test3936() throws Throwable {
        Entities.PrimitiveEntityMap entities_PrimitiveEntityMap0 = new Entities.PrimitiveEntityMap();
        entities_PrimitiveEntityMap0.add("!\t\"0g@:b(6", 104);
        int int0 = entities_PrimitiveEntityMap0.value("!\t\"0g@:b(6");
        assertEquals(104, int0);
    }

    @Test(timeout = 4000)
    public void test4037() throws Throwable {
        Entities entities0 = Entities.HTML40;
        Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
        String string0 = entities0.escape("951");
        assertEquals("951", string0);
    }

    @Test(timeout = 4000)
    public void test4138() throws Throwable {
        Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
        String string0 = entities_TreeEntityMap0.name(1959);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test4239() throws Throwable {
        Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
        entities_BinaryEntityMap0.add("$+kkY&NC1%.#", 116);
        int int0 = entities_BinaryEntityMap0.value("$+kkY&NC1%.#");
        assertEquals(116, int0);
    }

    @Test(timeout = 4000)
    public void test4340() throws Throwable {
        Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
        entities_HashEntityMap0.add("", 758);
        int int0 = entities_HashEntityMap0.value("");
        assertEquals(758, int0);
    }
}
