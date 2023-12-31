/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:05:12 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CSVRecord_ESTest extends CSVRecord_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = Integer.valueOf(19);
        hashMap0.put("D>+", integer0);
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "D>+", 19);
        boolean boolean0 = cSVRecord0.isSet("D>+");
        assertEquals(19L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = Integer.valueOf(19);
        hashMap0.put("D>+", integer0);
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "D>+", 19);
        boolean boolean0 = cSVRecord0.isSet("D>+");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-742));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "Rtrjh7xP1xby/w", 0L);
        boolean boolean0 = cSVRecord0.isConsistent();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, (-1L));
        cSVRecord0.values();
        assertEquals((-1L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, (Map<String, Integer>) null, "org.apache.commons.csv.CSVRecord", (-1651L));
        cSVRecord0.size();
        assertEquals((-1651L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1718L);
        cSVRecord0.putIn((HashMap<String, String>) null);
        assertEquals(1718L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", 0L);
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        HashMap<String, String> hashMap2 = cSVRecord0.putIn(hashMap1);
        assertSame(hashMap2, hashMap1);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        cSVRecord0.iterator();
        assertEquals((-189L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, ";<gy^:tL", 1L);
        long long0 = cSVRecord0.getRecordNumber();
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1163L));
        long long0 = cSVRecord0.getRecordNumber();
        assertEquals((-1163L), long0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        String[] stringArray0 = new String[0];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, (String) null, 1346L);
        cSVRecord0.getComment();
        assertEquals(1346L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-132L));
        cSVRecord0.getComment();
        assertEquals((-132L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        String[] stringArray0 = new String[19];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-17L));
        cSVRecord0.get("");
        assertEquals((-17L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
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
    public void test1314() throws Throwable {
        String[] stringArray0 = new String[4];
        stringArray0[3] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 0L);
        String string0 = cSVRecord0.get("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "OS&]{jjXE", (-810L));
        cSVRecord0.get(0);
        assertEquals((-810L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "Ykb$~0MV";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1898L);
        cSVRecord0.get(0);
        assertEquals(1898L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[1] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        String string0 = cSVRecord0.get(1);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[1] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        String string0 = cSVRecord0.get(1);
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", 3630L);
        // Undeclared exception!
        try {
            cSVRecord0.toMap();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = Integer.valueOf(0);
        hashMap0.put("m,-Hym", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "SQ>h' *d>-wRj[", 988L);
        // Undeclared exception!
        try {
            cSVRecord0.toMap();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        String[] stringArray0 = new String[19];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-17L));
        // Undeclared exception!
        try {
            cSVRecord0.putIn((HashMap<String, String>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, (-65L));
        Integer integer0 = new Integer(538);
        hashMap0.put("", integer0);
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        // Undeclared exception!
        try {
            cSVRecord0.putIn(hashMap1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 538
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        hashMap0.put("B4\"~cc!4-", (Integer) null);
        // Undeclared exception!
        try {
            cSVRecord0.isSet("B4\"~cc!4-");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        cSVRecord0.isMapped("Index for header '%s' is %d but CSVRecord only has %d values!");
        assertEquals(1336L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-4463));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        boolean boolean0 = cSVRecord0.isMapped("");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-4463));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        boolean boolean0 = cSVRecord0.isMapped("");
        assertEquals((-189L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("8xJrMk[4fDX`WZ.", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 0);
        Map<String, String> map0 = cSVRecord0.toMap();
        assertFalse(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 0L);
        Integer integer0 = new Integer(1);
        hashMap0.put("", integer0);
        boolean boolean0 = cSVRecord0.isSet("");
        assertTrue(cSVRecord0.isConsistent());
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 0L);
        Integer integer0 = new Integer(1);
        hashMap0.put("", integer0);
        boolean boolean0 = cSVRecord0.isSet("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("8xJrMk[4fDX`WZ.", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 0);
        boolean boolean0 = cSVRecord0.isSet("8xJrMk[4fDX`WZ.");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
        assertEquals(3, cSVRecord0.size());
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
        assertEquals((-1L), cSVRecord0.getRecordNumber());
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
    public void test2834() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        boolean boolean0 = cSVRecord0.isSet("");
        assertEquals(1336L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2835() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        boolean boolean0 = cSVRecord0.isSet("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2836() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        boolean boolean0 = cSVRecord0.isSet("");
        assertEquals(2, cSVRecord0.size());
    }

    @Test(timeout = 4000)
    public void test2937() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-2));
        hashMap0.put(".bNZu\"/>D2bo}_", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-2));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals((-2L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test2938() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-2));
        hashMap0.put(".bNZu\"/>D2bo}_", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-2));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3039() throws Throwable {
        String[] stringArray0 = new String[6];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[0], 8L);
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals(8L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3040() throws Throwable {
        String[] stringArray0 = new String[6];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[0], 8L);
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals(6, cSVRecord0.size());
    }

    @Test(timeout = 4000)
    public void test3041() throws Throwable {
        String[] stringArray0 = new String[6];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[0], 8L);
        boolean boolean0 = cSVRecord0.isConsistent();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3142() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertEquals((-1L), cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3143() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isConsistent();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3244() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-2));
        hashMap0.put(".bNZu\"/>D2bo}_", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-2));
        // Undeclared exception!
        try {
            cSVRecord0.get(".bNZu\"/>D2bo}_");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index for header '.bNZu\"/>D2bo}_' is -2 but CSVRecord only has 1 values!
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test3345() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        // Undeclared exception!
        try {
            cSVRecord0.get("Q_=S<5~C7fE=i%");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // No header mapping was specified, the record values can't be accessed by name
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test3446() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 0);
        // Undeclared exception!
        try {
            cSVRecord0.get(stringArray0[3]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Mapping for null not found, expected one of []
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test3547() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        int int0 = cSVRecord0.size();
        assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test3648() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.getRecordNumber();
        assertEquals("[null, null, null, null]", cSVRecord0.toString());
    }

    @Test(timeout = 4000)
    public void test3749() throws Throwable {
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
            //
            verifyException("org.apache.commons.csv.CSVRecord", e);
        }
    }

    @Test(timeout = 4000)
    public void test3850() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String[] stringArray1 = cSVRecord0.values();
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test3851() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String[] stringArray1 = cSVRecord0.values();
        assertEquals(1, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test3952() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String string0 = cSVRecord0.toString();
        assertEquals("[null]", string0);
    }

    @Test(timeout = 4000)
    public void test3953() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String string0 = cSVRecord0.toString();
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }

    @Test(timeout = 4000)
    public void test4054() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.toMap();
        assertEquals("[null, null, null, null]", cSVRecord0.toString());
    }

    @Test(timeout = 4000)
    public void test4155() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        cSVRecord0.getComment();
        assertEquals(1, cSVRecord0.size());
    }

    @Test(timeout = 4000)
    public void test4156() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        cSVRecord0.getComment();
        assertEquals(1L, cSVRecord0.getRecordNumber());
    }
}
