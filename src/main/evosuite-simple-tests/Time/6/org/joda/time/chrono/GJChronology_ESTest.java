/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 00:44:29 GMT 2023
 */
package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        // Undeclared exception!
        try {
            GJChronology.getInstance(dateTimeZone0, (-62064835199996L), (-809));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid min days in first week: -809
            //
            verifyException("org.joda.time.chrono.JulianChronology", e);
        }
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
        // Undeclared exception!
        try {
            GJChronology.getInstance(dateTimeZone0, 3327L, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid min days in first week: 0
            //
            verifyException("org.joda.time.chrono.JulianChronology", e);
        }
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        // Undeclared exception!
        try {
            gJChronology0.gregorianToJulianByYear(9223372036854775807L);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 292278994 for year must be in the range [-292269054,292272992]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Sao_Paulo");
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
        // Undeclared exception!
        try {
            gJChronology0.gregorianToJulianByWeekyear((-62135754750999L));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 0 for year is not supported
            //
            verifyException("org.joda.time.field.SkipDateTimeField", e);
        }
    }

    @Test(timeout = 4000)
    public void test114() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTime dateTime0 = new DateTime(292278993, 1, 5, 1, 1, 1);
        // Undeclared exception!
        try {
            GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 5);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 292278994 for weekyear must be in the range [-292275054,292278993]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test125() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        // Undeclared exception!
        try {
            gJChronology0.assemble((AssembledChronology.Fields) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.joda.time.chrono.GJChronology", e);
        }
    }

    @Test(timeout = 4000)
    public void test146() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        try {
            gJChronology0.getDateTimeMillis((-1), 2, 2, 2, 5006, 5006, (-1));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 5006 for minuteOfHour must be in the range [0,59]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test157() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        try {
            gJChronology0.getDateTimeMillis(0, 0, 0, 4, (-222), (-222), (-2839));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value -222 for minuteOfHour must be in the range [0,59]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test178() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        try {
            gJChronology0.getDateTimeMillis(91, 2311, 91, 91);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 2311 for monthOfYear must be in the range [1,12]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test219() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        // Undeclared exception!
        try {
            GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid min days in first week: 0
            //
            verifyException("org.joda.time.chrono.JulianChronology", e);
        }
    }

    @Test(timeout = 4000)
    public void test2210() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1253);
        MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
        LocalDate localDate0 = monthDay0.toLocalDate(0);
        DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
        // Undeclared exception!
        try {
            GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid min days in first week: 0
            //
            verifyException("org.joda.time.chrono.JulianChronology", e);
        }
    }

    @Test(timeout = 4000)
    public void test2311() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
        DateTime dateTime0 = DateTime.now();
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
        try {
            gJChronology0.getDateTimeMillis(315, 315, 1, 1, 0, 1, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 315 for monthOfYear must be in the range [1,12]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3212() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        LocalDateTime localDateTime0 = new LocalDateTime((-12219321178000L));
        // Undeclared exception!
        try {
            gJChronology0.set(localDateTime0, (-12219321178000L));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 14 for dayOfMonth is not supported
            //
            verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
        }
    }

    @Test(timeout = 4000)
    public void test4113() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Sao_Paulo");
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (-1076L), 1);
        String string0 = gJChronology0.toString();
        assertEquals("GJChronology[America/Sao_Paulo,cutover=1969-12-31T23:59:58.924Z,mdfw=1]", string0);
    }

    @Test(timeout = 4000)
    public void test4214() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        Months months0 = Months.TEN;
        long long0 = gJChronology0.add((ReadablePeriod) months0, (-667L), (-797));
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4215() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        Months months0 = Months.TEN;
        long long0 = gJChronology0.add((ReadablePeriod) months0, (-667L), (-797));
        assertEquals((-20958394022667L), long0);
    }

    @Test(timeout = 4000)
    public void test4316() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        StrictChronology.getInstance(gJChronology0);
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4417() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.gregorianToJulianByWeekyear(4);
        assertEquals(1209600004L, long0);
    }

    @Test(timeout = 4000)
    public void test4418() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.gregorianToJulianByWeekyear(4);
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4519() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        gJChronology0.hashCode();
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4620() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Sao_Paulo");
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
        GJChronology gJChronology1 = (GJChronology) gJChronology0.withUTC();
        assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4621() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("America/Sao_Paulo");
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
        GJChronology gJChronology1 = (GJChronology) gJChronology0.withUTC();
        assertNotSame(gJChronology1, gJChronology0);
    }

    @Test(timeout = 4000)
    public void test4722() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.gregorianToJulianByYear(1280L);
        assertEquals(1123201280L, long0);
    }

    @Test(timeout = 4000)
    public void test4723() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.gregorianToJulianByYear(1280L);
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4824() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.julianToGregorianByYear(4);
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test4825() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.julianToGregorianByYear(4);
        assertEquals((-1123199996L), long0);
    }

    @Test(timeout = 4000)
    public void test4926() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        Months months0 = Months.TEN;
        int[] intArray0 = gJChronology0.get((ReadablePeriod) months0, (long) 44481320, (-20958393600667L));
        assertArrayEquals(new int[] { (-7970) }, intArray0);
    }

    @Test(timeout = 4000)
    public void test4927() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        Months months0 = Months.TEN;
        int[] intArray0 = gJChronology0.get((ReadablePeriod) months0, (long) 44481320, (-20958393600667L));
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test5028() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.julianToGregorianByWeekyear(0);
        assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
    }

    @Test(timeout = 4000)
    public void test5029() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        long long0 = gJChronology0.julianToGregorianByWeekyear(0);
        assertEquals((-1209600000L), long0);
    }
}
