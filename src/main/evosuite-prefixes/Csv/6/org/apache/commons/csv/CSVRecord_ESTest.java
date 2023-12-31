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
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = Integer.valueOf(19);
        hashMap0.put("D>+", integer0);
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "D>+", 19);
        boolean boolean0 = cSVRecord0.isSet("D>+");
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-742));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "Rtrjh7xP1xby/w", 0L);
        boolean boolean0 = cSVRecord0.isConsistent();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, (-1L));
        cSVRecord0.values();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, (Map<String, Integer>) null, "org.apache.commons.csv.CSVRecord", (-1651L));
        cSVRecord0.size();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1718L);
        cSVRecord0.putIn((HashMap<String, String>) null);
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", 0L);
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        HashMap<String, String> hashMap2 = cSVRecord0.putIn(hashMap1);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        cSVRecord0.iterator();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, ";<gy^:tL", 1L);
        long long0 = cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        String[] stringArray0 = new String[2];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1163L));
        long long0 = cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        String[] stringArray0 = new String[0];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, (String) null, 1346L);
        cSVRecord0.getComment();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-132L));
        cSVRecord0.getComment();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        String[] stringArray0 = new String[19];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-17L));
        cSVRecord0.get("");
        cSVRecord0.getRecordNumber();
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
        cSVRecord0.getRecordNumber();
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
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "OS&]{jjXE", (-810L));
        cSVRecord0.get(0);
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "Ykb$~0MV";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1898L);
        cSVRecord0.get(0);
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[1] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        String string0 = cSVRecord0.get(1);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[1] = "";
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
        String string0 = cSVRecord0.get(1);
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", 3630L);
        cSVRecord0.toMap();
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = Integer.valueOf(0);
        hashMap0.put("m,-Hym", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "SQ>h' *d>-wRj[", 988L);
        cSVRecord0.toMap();
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        String[] stringArray0 = new String[19];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(3);
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-17L));
        cSVRecord0.putIn((HashMap<String, String>) null);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        String[] stringArray0 = new String[0];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, (-65L));
        Integer integer0 = new Integer(538);
        hashMap0.put("", integer0);
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        cSVRecord0.putIn(hashMap1);
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        hashMap0.put("B4\"~cc!4-", (Integer) null);
        cSVRecord0.isSet("B4\"~cc!4-");
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        cSVRecord0.isMapped("Index for header '%s' is %d but CSVRecord only has %d values!");
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-4463));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        boolean boolean0 = cSVRecord0.isMapped("");
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-4463));
        hashMap0.put("", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "lv~+_p=Bo9qZ`J", (-189L));
        boolean boolean0 = cSVRecord0.isMapped("");
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("8xJrMk[4fDX`WZ.", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 0);
        Map<String, String> map0 = cSVRecord0.toMap();
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 0L);
        Integer integer0 = new Integer(1);
        hashMap0.put("", integer0);
        boolean boolean0 = cSVRecord0.isSet("");
        cSVRecord0.isConsistent();
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 0L);
        Integer integer0 = new Integer(1);
        hashMap0.put("", integer0);
        boolean boolean0 = cSVRecord0.isSet("");
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer(0);
        hashMap0.put("8xJrMk[4fDX`WZ.", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 0);
        boolean boolean0 = cSVRecord0.isSet("8xJrMk[4fDX`WZ.");
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
        cSVRecord0.size();
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test2733() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isMapped("");
    }

    @Test(timeout = 4000)
    public void test2834() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        boolean boolean0 = cSVRecord0.isSet("");
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test2835() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        boolean boolean0 = cSVRecord0.isSet("");
    }

    @Test(timeout = 4000)
    public void test2836() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        boolean boolean0 = cSVRecord0.isSet("");
        cSVRecord0.size();
    }

    @Test(timeout = 4000)
    public void test2937() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-2));
        hashMap0.put(".bNZu\"/>D2bo}_", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-2));
        boolean boolean0 = cSVRecord0.isConsistent();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test2938() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-2));
        hashMap0.put(".bNZu\"/>D2bo}_", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-2));
        boolean boolean0 = cSVRecord0.isConsistent();
    }

    @Test(timeout = 4000)
    public void test3039() throws Throwable {
        String[] stringArray0 = new String[6];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[0], 8L);
        boolean boolean0 = cSVRecord0.isConsistent();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3040() throws Throwable {
        String[] stringArray0 = new String[6];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[0], 8L);
        boolean boolean0 = cSVRecord0.isConsistent();
        cSVRecord0.size();
    }

    @Test(timeout = 4000)
    public void test3041() throws Throwable {
        String[] stringArray0 = new String[6];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, stringArray0[0], 8L);
        boolean boolean0 = cSVRecord0.isConsistent();
    }

    @Test(timeout = 4000)
    public void test3142() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isConsistent();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3143() throws Throwable {
        String[] stringArray0 = new String[3];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "0%Jd}BE$.w", (-1L));
        boolean boolean0 = cSVRecord0.isConsistent();
    }

    @Test(timeout = 4000)
    public void test3244() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        Integer integer0 = new Integer((-2));
        hashMap0.put(".bNZu\"/>D2bo}_", integer0);
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-2));
        cSVRecord0.get(".bNZu\"/>D2bo}_");
    }

    @Test(timeout = 4000)
    public void test3345() throws Throwable {
        String[] stringArray0 = new String[2];
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "Index for header '%s' is %d but CSVRecord only has %d values!", 1336L);
        cSVRecord0.get("Q_=S<5~C7fE=i%");
    }

    @Test(timeout = 4000)
    public void test3446() throws Throwable {
        String[] stringArray0 = new String[5];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 0);
        cSVRecord0.get(stringArray0[3]);
    }

    @Test(timeout = 4000)
    public void test3547() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        int int0 = cSVRecord0.size();
    }

    @Test(timeout = 4000)
    public void test3648() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.getRecordNumber();
        cSVRecord0.toString();
    }

    @Test(timeout = 4000)
    public void test3749() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.get((-2569));
    }

    @Test(timeout = 4000)
    public void test3850() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String[] stringArray1 = cSVRecord0.values();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3851() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String[] stringArray1 = cSVRecord0.values();
    }

    @Test(timeout = 4000)
    public void test3952() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String string0 = cSVRecord0.toString();
    }

    @Test(timeout = 4000)
    public void test3953() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        String string0 = cSVRecord0.toString();
        cSVRecord0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test4054() throws Throwable {
        String[] stringArray0 = new String[4];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "=>E", 0L);
        cSVRecord0.toMap();
        cSVRecord0.toString();
    }

    @Test(timeout = 4000)
    public void test4155() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        cSVRecord0.getComment();
        cSVRecord0.size();
    }

    @Test(timeout = 4000)
    public void test4156() throws Throwable {
        String[] stringArray0 = new String[1];
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "8xJrMk[4fDX`WZ.", 1L);
        cSVRecord0.getComment();
        cSVRecord0.getRecordNumber();
    }
}
