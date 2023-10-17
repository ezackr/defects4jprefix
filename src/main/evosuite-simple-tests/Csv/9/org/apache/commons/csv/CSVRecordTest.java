/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:09:20 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.apache.commons.csv.CSVRecord;
import org.junit.runner.RunWith;

public class CSVRecordTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = Integer.valueOf(0);
        hashMap0.put("m,-Hym", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "SQ>h' *d>-wRj[", 988L);
        cSVRecord0.toMap();
        assertEquals(988L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "4mz1bv", 22L);
        Integer integer0 = Integer.getInteger("4mz1bv", 37);
        hashMap0.put("4mz1bv", integer0);
        boolean boolean0 = cSVRecord0.isSet("4mz1bv");
        assertEquals(22L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "4mz1bv", 22L);
        Integer integer0 = Integer.getInteger("4mz1bv", 37);
        hashMap0.put("4mz1bv", integer0);
        boolean boolean0 = cSVRecord0.isSet("4mz1bv");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-742));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "Rtrjh7xP1xby/w", 0L);
        boolean boolean0 = cSVRecord0.isConsistent();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("o-tpk$6C$?0$<,OI", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "o-tpk$6C$?0$<,OI", 0L);
        // Undeclared exception!
        try {
            cSVRecord0.get("o-tpk$6C$?0$<,OI");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index for header 'o-tpk$6C$?0$<,OI' is 0 but CSVRecord only has 0 values!
        }
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, (-1L));
        cSVRecord0.values();
        assertEquals((-1L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        Map<String, String> map0 = cSVRecord0.toMap();
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        Map<String, String> map0 = cSVRecord0.toMap();
        assertEquals(1, map0.size());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1718L);
        cSVRecord0.putIn((HashMap<String, String>) null);
        assertEquals(1718L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "4mz1bv", 22L);
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        cSVRecord0.putIn(hashMap1);
        assertEquals(22L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        long long0 = cSVRecord0.getRecordNumber();
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1163L));
        long long0 = cSVRecord0.getRecordNumber();
        assertEquals((-1163L), long0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        String[] stringArray0 = new String[0];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, (String) null, 1346L);
        cSVRecord0.getComment();
        assertEquals(1346L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-132L));
        cSVRecord0.getComment();
        assertEquals((-132L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "}4sRg C%:iCI!X}1+";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        cSVRecord0.get("");
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-3325L));
        hashMap0.put("]Qf(\"", integer0);
        cSVRecord0.get("]Qf(\"");
        assertEquals((-3325L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "d,(of9oA+['0", (-1L));
        cSVRecord0.get(0);
        assertEquals((-1L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "Ykb$~0MV";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1898L);
        cSVRecord0.get(0);
        assertEquals(1898L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[1] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        String string0 = cSVRecord0.get(1);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[1] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        String string0 = cSVRecord0.get(1);
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", 3630L);
        // Undeclared exception!
        try {
            cSVRecord0.toMap();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-191));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "z64,]$;)k[X", (-2039L));
        // Undeclared exception!
        try {
            cSVRecord0.toMap();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -191
        }
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        String[] stringArray0 = new String[13];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 0L);
        // Undeclared exception!
        try {
            cSVRecord0.putIn((HashMap<String, String>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-511));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "2z$Sed*)ckLcX.1J|", 0L);
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        // Undeclared exception!
        try {
            cSVRecord0.putIn(hashMap1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -511
        }
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-3325L));
        hashMap0.put("]Qf(\"", integer0);
        BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(biFunction0).apply(any(), any());
        hashMap0.replaceAll(biFunction0);
        // Undeclared exception!
        try {
            cSVRecord0.isSet("]Qf(\"");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        String[] stringArray0 = new String[9];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "{JavKs!", (-1506L));
        cSVRecord0.isMapped("yP+1vZbk@@{k");
        assertEquals((-1506L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(1173);
        hashMap0.put((String) null, integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1280L));
        boolean boolean0 = cSVRecord0.isMapped((String) null);
        assertEquals((-1280L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(1173);
        hashMap0.put((String) null, integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1280L));
        boolean boolean0 = cSVRecord0.isMapped((String) null);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3842);
        hashMap0.put("Oz_uLlbHM]67j", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        cSVRecord0.toMap();
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(2);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], 2);
        hashMap0.put("p", integer0);
        boolean boolean0 = cSVRecord0.isSet("p");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(2);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], 2);
        hashMap0.put("p", integer0);
        boolean boolean0 = cSVRecord0.isSet("p");
        assertEquals(2L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        String[] stringArray0 = new String[9];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.putIfAbsent("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1917L));
        boolean boolean0 = cSVRecord0.isSet("");
        assertEquals((-1917L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2632() throws Throwable {
        String[] stringArray0 = new String[9];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.putIfAbsent("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1917L));
        boolean boolean0 = cSVRecord0.isSet("");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2733() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2734() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
        assertEquals((-1L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2835() throws Throwable {
        String[] stringArray0 = new String[4];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[3], (-13L));
        boolean boolean0 = cSVRecord0.isSet(stringArray0[3]);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2836() throws Throwable {
        String[] stringArray0 = new String[4];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[3], (-13L));
        boolean boolean0 = cSVRecord0.isSet(stringArray0[3]);
        assertEquals((-13L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2937() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-1879048235));
        hashMap0.put(stringArray0[0], integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1879048235));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2938() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-1879048235));
        hashMap0.put(stringArray0[0], integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1879048235));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals((-1879048235L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3039() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3040() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals((-1L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3141() throws Throwable {
        String[] stringArray0 = new String[4];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[3], (-13L));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals((-13L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3142() throws Throwable {
        String[] stringArray0 = new String[4];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[3], (-13L));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3243() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-3325L));
        hashMap0.put("]Qf(\"", integer0);
        cSVRecord0.get("]Qf(\"");
        assertEquals((-3325L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3344() throws Throwable {
        String[] stringArray0 = new String[4];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[3], (-13L));
        // Undeclared exception!
        try {
            cSVRecord0.get("%wDsI9Nzy=4m");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // No header mapping was specified, the record values can't be accessed by name
        }
    }

    @Test(timeout = 4000)
    public void test3445() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], 2);
        // Undeclared exception!
        try {
            cSVRecord0.get(stringArray0[1]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Mapping for null not found, expected one of []
        }
    }

    @Test(timeout = 4000)
    public void test3546() throws Throwable {
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, (Map<String, Integer>) null, "Mrf@WT?J6iLUs", (-1691L));
        assertEquals("[]", cSVRecord0.toString());
    }

    @Test(timeout = 4000)
    public void test3547() throws Throwable {
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, (Map<String, Integer>) null, "Mrf@WT?J6iLUs", (-1691L));
        cSVRecord0.size();
        assertEquals((-1691L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3648() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        int int0 = cSVRecord0.size();
        assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test3749() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.getRecordNumber();
        assertEquals(4, cSVRecord0.size());
    }

    @Test(timeout = 4000)
    public void test3850() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        // Undeclared exception!
        try {
            cSVRecord0.get((-2569));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -2569
        }
    }

    @Test(timeout = 4000)
    public void test3951() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, 143L);
        String[] stringArray1 = cSVRecord0.values();
        assertEquals(5, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test3952() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, 143L);
        String[] stringArray1 = cSVRecord0.values();
        assertEquals(143L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test4053() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", 3630L);
        String string0 = cSVRecord0.toString();
        assertEquals("[null, null]", string0);
    }

    @Test(timeout = 4000)
    public void test4054() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", 3630L);
        String string0 = cSVRecord0.toString();
        assertEquals(3630L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test4155() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.getComment();
        assertFalse(cSVRecord0.isConsistent());
    }

    @Test(timeout = 4000)
    public void test4256() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], 2);
        cSVRecord0.iterator();
        assertEquals(2L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test4257() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], 2);
        cSVRecord0.iterator();
        assertEquals(2, cSVRecord0.size());
    }
}
