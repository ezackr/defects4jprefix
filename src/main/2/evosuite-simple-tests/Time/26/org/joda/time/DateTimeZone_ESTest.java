/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:44:59 GMT 2024
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Object object0 = dateTimeZone0.UTC.writeReplace();
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        try {
            DateTimeZone.forOffsetHours((-1013));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Offset is too large
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:00.001");
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:00.001");
        assertEquals("+00:00:00.001", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.getName((-1209L));
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.getName((-1209L));
        assertEquals("-08:00", string0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
        String string0 = dateTimeZone0.toString();
        assertEquals("+00:00:00.001", string0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Set<String> set0 = DateTimeZone.getAvailableIDs();
        assertFalse(set0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        NameProvider nameProvider0 = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        DateMidnight dateMidnight0 = new DateMidnight();
        assertEquals(1392364800000L, dateMidnight0.getMillis());
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        Provider provider0 = DateTimeZone.getProvider();
        assertNotNull(provider0);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.UTC.getMillisKeepLocal((DateTimeZone) null, 105430016L);
        assertEquals(134230016L, long0);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        assertEquals("UTC", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTimeZone.setDefault(dateTimeZone0);
        assertEquals("America/Los_Angeles", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        // Undeclared exception!
        try {
            DateTimeZone.setDefault((DateTimeZone) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone must not be null
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
        assertEquals("America/Los_Angeles", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
        assertEquals("UTC", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        // Undeclared exception!
        try {
            DateTimeZone.forID("-org.joda.time.chrono.GJChronology");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid format: \"-org.joda.time.chrono.GJChronology\" is malformed at \"org.joda.time.chrono.GJChronology\"
            //
            verifyException("org.joda.time.format.DateTimeFormatter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        assertEquals("UTC", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 19);
        assertEquals("+00:19", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertEquals("UTC", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        try {
            DateTimeZone.forOffsetHoursMinutes((-2327), (-2327));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: -2327
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        try {
            DateTimeZone.forOffsetHoursMinutes(335, 335);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: 335
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
        assertEquals("America/Los_Angeles", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.UTC;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("UTC", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        // Undeclared exception!
        try {
            DateTimeZone.forTimeZone(timeZone0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone id 'America/Los_Angeles' is not recognised
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        TimeZone timeZone0 = TimeZone.getTimeZone("PLT");
        // Undeclared exception!
        try {
            DateTimeZone.forTimeZone(timeZone0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone id 'PLT' is not recognised
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MAX;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
        assertSame(dateTimeZone1, dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MAX;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
        assertNotNull(dateTimeZone1);
    }

    @Test(timeout = 4000)
    public void test2531() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MAX;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("+18:00", dateTimeZone1.getID());
    }

    @Test(timeout = 4000)
    public void test2632() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2633() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("-18:00", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2734() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1121, "No printer supplied");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2735() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1121, "No printer supplied");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
        assertEquals("UTC", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2836() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
        assertEquals("UTC", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test2937() throws Throwable {
        DateTimeZone.setProvider((Provider) null);
    }

    @Test(timeout = 4000)
    public void test3038() throws Throwable {
        DateTimeZone.setNameProvider((NameProvider) null);
    }

    @Test(timeout = 4000)
    public void test3139() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10125000);
        assertEquals("+02:48:45", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test3240() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Locale locale0 = Locale.US;
        String string0 = dateTimeZone0.getShortName((-28802544L), locale0);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test3241() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Locale locale0 = Locale.US;
        String string0 = dateTimeZone0.getShortName((-28802544L), locale0);
        assertEquals("-08:00", string0);
    }

    @Test(timeout = 4000)
    public void test3342() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(823);
        String string0 = dateTimeZone0.getShortName((long) 823);
        assertEquals("+00:00:00.823", string0);
    }

    @Test(timeout = 4000)
    public void test3443() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(909);
        Locale locale0 = Locale.PRC;
        String string0 = dateTimeZone0.getName((long) 909, locale0);
        assertEquals("+00:00:00.909", string0);
    }

    @Test(timeout = 4000)
    public void test3544() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        MutableDateTime mutableDateTime0 = new MutableDateTime();
        int int0 = dateTimeZone0.getOffset((ReadableInstant) mutableDateTime0);
        assertEquals((-28800000), int0);
    }

    @Test(timeout = 4000)
    public void test3645() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        int int0 = fixedDateTimeZone0.UTC.getOffset((ReadableInstant) null);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test3746() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775788L);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3847() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.UTC.isStandardOffset((-136L));
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3948() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(9971999980L);
        assertEquals((-25200000), int0);
    }

    @Test(timeout = 4000)
    public void test4049() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775748L);
        assertEquals((-28378000), int0);
    }

    @Test(timeout = 4000)
    public void test4150() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        // Undeclared exception!
        try {
            dateTimeZone0.convertUTCToLocal((-9223372036854775790L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Adding time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test4251() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.convertUTCToLocal(839L);
        assertEquals((-28799161L), long0);
    }

    @Test(timeout = 4000)
    public void test4352() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        // Undeclared exception!
        try {
            dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Subtracting time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test4453() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        // Undeclared exception!
        try {
            dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Subtracting time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test4554() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.convertLocalToUTC((-1L), false);
        assertEquals(28799999L, long0);
    }

    @Test(timeout = 4000)
    public void test4655() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 839L);
        assertEquals(839L, long0);
    }

    @Test(timeout = 4000)
    public void test4756() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        // Undeclared exception!
        try {
            dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test4857() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
        assertFalse(boolean0);
    }
}
