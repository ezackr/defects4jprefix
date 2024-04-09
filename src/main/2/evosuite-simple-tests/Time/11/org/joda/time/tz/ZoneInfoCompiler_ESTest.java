/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:10:48 GMT 2024
 */
package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 120);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "-[&", 37, 37, 1);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
        String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
        assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String[] stringArray0 = new String[5];
        stringArray0[0] = "-verbose";
        stringArray0[1] = "-verbose";
        stringArray0[2] = "-verbose";
        stringArray0[3] = "-verbose";
        stringArray0[4] = "-verbose";
        ZoneInfoCompiler.main(stringArray0);
        assertEquals(5, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        // Undeclared exception!
        try {
            ZoneInfoCompiler.verbose();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        // Undeclared exception!
        try {
            ZoneInfoCompiler.parseDayOfWeek("where possible options include:");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value \"where possible options include:\" for dayOfWeek is not supported
            //
            verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        String[] stringArray0 = new String[0];
        ZoneInfoCompiler.main(stringArray0);
        assertEquals(0, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-?";
        ZoneInfoCompiler.main(stringArray0);
        assertEquals(6, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
        assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ZoneInfoCompiler.parseTime("2a9e&7* )#BFUgfDG");
        StringTokenizer stringTokenizer0 = new StringTokenizer("2a9e&7* )#BFUgfDG", "yearvetkday", false);
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
        try {
            zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // &7* )#BFUgfDG
            //
            verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        int int0 = ZoneInfoCompiler.parseYear("minimum", 2640);
        assertEquals(Integer.MIN_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        // Undeclared exception!
        try {
            ZoneInfoCompiler.parseYear("mdt", 377);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"mdt\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        int int0 = ZoneInfoCompiler.parseYear("min", 0);
        assertEquals(Integer.MIN_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        int int0 = ZoneInfoCompiler.parseYear("maximum", (-3604));
        assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        String string0 = ZoneInfoCompiler.parseOptional("24:00");
        assertEquals("24:00", string0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        int int0 = ZoneInfoCompiler.parseTime("-2");
        assertEquals((-7200000), int0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('-');
        assertEquals('w', char0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('S');
        assertEquals('s', char0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('U');
        assertEquals('u', char0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('W');
        assertEquals('w', char0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('g');
        assertEquals('u', char0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('s');
        assertEquals('s', char0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('u');
        assertEquals('u', char0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('w');
        assertEquals('w', char0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        char char0 = ZoneInfoCompiler.parseZoneChar('z');
        assertEquals('u', char0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("-[&", true);
        boolean boolean0 = ZoneInfoCompiler.test("-[&", dateTimeZone0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = ZoneInfoCompiler.test(">=", dateTimeZone0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Time");
        FileSystemHandling.appendStringToFile(evoSuiteFile0, "\nFromYear: ");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "Time";
        stringArray0[1] = "Time";
        ZoneInfoCompiler.main(stringArray0);
        assertEquals(2, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        MockFile mockFile0 = new MockFile("ru/e", "ru/e");
        Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, (File[]) null);
        assertTrue(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        FileSystemHandling.shouldAllThrowIOExceptions();
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        MockFile mockFile0 = new MockFile("b5u_1VNS5lmv");
        try {
            zoneInfoCompiler0.compile(mockFile0, (File[]) null);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Destination directory doesn't exist and cannot be created: b5u_1VNS5lmv
            //
            verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
        }
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        File file0 = MockFile.createTempFile("9/9}Fn>oz7Df/_NGZ", "&'");
        try {
            zoneInfoCompiler0.compile(file0, (File[]) null);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Destination is not a directory: /var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/9/9}Fn>oz7Df/_NGZ0&'
            //
            verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
        }
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        StringReader stringReader0 = new StringReader("#PQ$OYFMgg-gS=");
        BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        StringReader stringReader0 = new StringReader("2a9e&7* )#BFUgfDG");
        BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        StringReader stringReader0 = new StringReader(" is not recise i th period ");
        BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        StringReader stringReader0 = new StringReader("zone");
        BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
        ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
        // Undeclared exception!
        try {
            zoneInfoCompiler0.parseDataFile(bufferedReader0);
            fail("Expecting exception: NoSuchElementException");
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.StringTokenizer", e);
        }
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        StringTokenizer stringTokenizer0 = new StringTokenizer("");
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        StringTokenizer stringTokenizer0 = new StringTokenizer("9");
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        StringTokenizer stringTokenizer0 = new StringTokenizer("2a9e&7* )#BFUgfDG");
        stringTokenizer0.nextToken("org.joda.time.base.AbstractDateTime");
        ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
        try {
            zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // &7* )#BFU
            //
            verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
        }
    }
}
