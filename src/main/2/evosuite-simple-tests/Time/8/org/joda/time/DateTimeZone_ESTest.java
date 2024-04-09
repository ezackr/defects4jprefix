/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 04:02:30 GMT 2024
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
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DefaultNameProvider;
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
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        String string0 = dateTimeZone0.getShortName((long) 1);
        assertEquals("+01:00", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        Object object0 = fixedDateTimeZone0.UTC.writeReplace();
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Set<String> set0 = DateTimeZone.getAvailableIDs();
        assertEquals(578, set0.size());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        NameProvider nameProvider0 = DateTimeZone.getNameProvider();
        assertNotNull(nameProvider0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        assertEquals("America/Los_Angeles", timeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, 1);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Provider provider0 = DateTimeZone.getProvider();
        assertNotNull(provider0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        assertEquals("UTC", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.getName(1L);
        assertEquals("-08:00", string0);
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.getName(1L);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
        String string0 = dateTimeZone0.toString();
        assertEquals("UTC", string0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        assertEquals("UTC", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTimeZone.setDefault(dateTimeZone0);
        assertEquals("America/Los_Angeles", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
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
    public void test1315() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
        assertEquals("America/Los_Angeles", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
        assertEquals("UTC", dateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        // Undeclared exception!
        try {
            DateTimeZone.forID("-OW)q<GN ");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid format: \"-OW)q<GN \" is malformed at \"OW)q<GN \"
            //
            verifyException("org.joda.time.format.DateTimeFormatter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:00.070");
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00:00.070");
        assertEquals("+00:00:00.070", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        try {
            DateTimeZone.forOffsetHoursMinutes(0, (-874));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: -874
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        try {
            DateTimeZone.forOffsetHoursMinutes((-573), (-573));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: -573
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        try {
            DateTimeZone.forOffsetHoursMinutes(3600000, 3600000);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: 3600000
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        try {
            DateTimeZone.forOffsetHoursMinutes(23, 3668);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: 3668
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
        assertEquals("-01:00", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        // Undeclared exception!
        try {
            DateTimeZone.forOffsetMillis((-143528941));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Millis out of range: -143528941
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        // Undeclared exception!
        try {
            DateTimeZone.forOffsetMillis(Integer.MAX_VALUE);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Millis out of range: 2147483647
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
        assertEquals("America/Los_Angeles", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertTrue(dateTimeZone0.isFixed());
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("UTC", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(19, "HST");
        // Undeclared exception!
        try {
            DateTimeZone.forTimeZone(simpleTimeZone0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone id 'HST' is not recognised
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("-18:00", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertNotNull(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1024, "");
        // Undeclared exception!
        try {
            DateTimeZone.forTimeZone(simpleTimeZone0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone id '' is not recognised
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
        assertEquals("UTC", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test3136() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("GMT+01:00");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("+01:00", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("GMT+01:00");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
        assertNotNull(dateTimeZone1);
    }

    @Test(timeout = 4000)
    public void test3138() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("GMT+01:00");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
        assertEquals("+01:00", dateTimeZone1.getID());
    }

    @Test(timeout = 4000)
    public void test3239() throws Throwable {
        DateTimeZone.setProvider((Provider) null);
    }

    @Test(timeout = 4000)
    public void test3340() throws Throwable {
        DateTimeZone.setNameProvider((NameProvider) null);
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
        DateTimeZone.setNameProvider(defaultNameProvider0);
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1256000));
        assertEquals("-00:20:56", dateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        Locale locale0 = Locale.UK;
        String string0 = fixedDateTimeZone0.getShortName((-1705L), locale0);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test3644() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        Locale locale0 = Locale.UK;
        String string0 = fixedDateTimeZone0.getShortName((-1705L), locale0);
        assertEquals("+00:00", string0);
    }

    @Test(timeout = 4000)
    public void test3745() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(578);
        Locale locale0 = Locale.CANADA_FRENCH;
        String string0 = dateTimeZone0.getName((long) 578, locale0);
        assertEquals("+00:00:00.578", string0);
    }

    @Test(timeout = 4000)
    public void test3846() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Instant instant0 = new Instant();
        int int0 = dateTimeZone0.UTC.getOffset((ReadableInstant) instant0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test3947() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
        assertEquals((-28800000), int0);
    }

    @Test(timeout = 4000)
    public void test4048() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4149() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        boolean boolean0 = dateTimeZone0.isStandardOffset(1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4250() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(1813L);
        assertEquals((-28800000), int0);
    }

    @Test(timeout = 4000)
    public void test4351() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
        assertEquals((-28378000), int0);
    }

    @Test(timeout = 4000)
    public void test4452() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Asia/Yerevan");
        int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036854775743L));
        assertEquals(10680000, int0);
    }

    @Test(timeout = 4000)
    public void test4553() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Auckland");
        int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036854775801L));
        assertEquals(43200000, int0);
    }

    @Test(timeout = 4000)
    public void test4654() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Africa/Harare");
        CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(9223372036811575808L);
        assertEquals(7452000, int0);
    }

    @Test(timeout = 4000)
    public void test4755() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(fixedDateTimeZone0);
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(100L);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4856() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Auckland");
        int int0 = dateTimeZone0.getOffsetFromLocal(476L);
        assertEquals(43200000, int0);
    }

    @Test(timeout = 4000)
    public void test4957() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        // Undeclared exception!
        try {
            fixedDateTimeZone0.UTC.getMillisKeepLocal((DateTimeZone) null, 9223372036854775806L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Subtracting time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5058() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        // Undeclared exception!
        try {
            dateTimeZone0.convertUTCToLocal((-9223372036826397809L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Adding time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5159() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.convertLocalToUTC((-247L), true);
        assertEquals(28799753L, long0);
    }

    @Test(timeout = 4000)
    public void test5260() throws Throwable {
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
    public void test5361() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Auckland");
        // Undeclared exception!
        try {
            dateTimeZone0.convertLocalToUTC((-9223372036854775770L), false);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Subtracting time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5462() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Anchorage");
        // Undeclared exception!
        try {
            dateTimeZone0.convertLocalToUTC((-9223372036826397749L), true);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Illegal instant due to time zone offset transition (daylight savings time 'gap'): -292275055-05-17T00:40:02.251 (America/Anchorage)
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5563() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Anchorage");
        // Undeclared exception!
        try {
            dateTimeZone0.convertLocalToUTC(9223372036832729889L, false);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Subtracting time zone offset caused overflow
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5664() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        long long0 = fixedDateTimeZone0.convertLocalToUTC(28799701L, true);
        assertEquals(28799701L, long0);
    }

    @Test(timeout = 4000)
    public void test5765() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        assertEquals(4, localDateTime0.size());
    }

    @Test(timeout = 4000)
    public void test5866() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        long long0 = fixedDateTimeZone0.getMillisKeepLocal(fixedDateTimeZone0, 31622400000L);
        assertEquals(31622400000L, long0);
    }

    @Test(timeout = 4000)
    public void test5967() throws Throwable {
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
    public void test6068() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6169() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-2717640000029L), false);
        assertEquals((-2717640000029L), long0);
    }

    @Test(timeout = 4000)
    public void test6270() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        long long0 = fixedDateTimeZone0.adjustOffset((-247L), true);
        assertEquals((-247L), long0);
    }

    @Test(timeout = 4000)
    public void test6371() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-9223372036854775797L), false);
        assertEquals((-9223372036854775797L), long0);
    }

    @Test(timeout = 4000)
    public void test6472() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset(9223372036854775794L, true);
        assertEquals(9223372036854775794L, long0);
    }

    @Test(timeout = 4000)
    public void test6573() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-2717640000000L), false);
        assertEquals((-2717640422000L), long0);
    }

    @Test(timeout = 4000)
    public void test6674() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-2717640000000L), true);
        assertEquals((-2717640000000L), long0);
    }

    @Test(timeout = 4000)
    public void test6775() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-2717640000029L), true);
        assertEquals((-2717639578029L), long0);
    }
}
