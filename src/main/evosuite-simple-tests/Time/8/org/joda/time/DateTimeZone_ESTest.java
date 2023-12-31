/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 01:27:04 GMT 2023
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        int int0 = 2649;
        try {
            DateTimeZone.forOffsetHoursMinutes(2649, 2649);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: 2649
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
        Locale locale0 = Locale.US;
        defaultNameProvider0.getName(locale0, "org.joda.time.field.ScaledDurationField", "org.joda.time.field.ScaledDurationField");
        DateTimeZone.setNameProvider(defaultNameProvider0);
        int int0 = 19;
        int int1 = 60000;
        DateTimeZone.forOffsetHoursMinutes(19, 60000);
        // Undeclared exception!
        try {
            DateTimeZone.getDefault();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: 60000
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        String string0 = "~S{E4n";
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        ZoneInfoProvider zoneInfoProvider0 = null;
        try {
            zoneInfoProvider0 = new ZoneInfoProvider("~S{E4n", classLoader0);
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // Resource not found: \"~S{E4n/ZoneInfoMap\" ClassLoader: sun.misc.Launcher$AppClassLoader@0000000001
            //
            verifyException("org.joda.time.tz.ZoneInfoProvider", e);
        }
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = 0L;
        String string0 = dateTimeZone0.UTC.getNameKey(0L);
        dateTimeZone0.convertLocalToUTC(0L, false);
        dateTimeZone0.UTC.convertUTCToLocal(0L);
        DateTimeZone.setDefault(dateTimeZone0);
        long long1 = 1459L;
        Locale locale0 = Locale.PRC;
        String string1 = dateTimeZone0.getName(1459L, locale0);
        locale0.getDisplayLanguage();
        dateTimeZone0.nextTransition((-1L));
        long long2 = 2552L;
        URI uRI0 = MockURI.create("T]~]LIvezO*");
        MockFile mockFile0 = new MockFile(uRI0);
        MockFile mockFile1 = new MockFile(mockFile0, string1);
        // Undeclared exception!
        try {
            MockFile.createTempFile(string0, string1, (File) mockFile1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Illegal character in path at index 1: T]~]LIvezO*
            //
            verifyException("java.net.URI", e);
        }
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        DateTimeZone.forOffsetMillis(0);
        DateTimeZone.forID("k`");
        DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
        // Undeclared exception!
        try {
            DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone id 'k`' is not recognised
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = (-3740);
        try {
            DateTimeZone.forOffsetHours((-3740));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: -3740
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        String string0 = "MIT";
        // Undeclared exception!
        try {
            ZoneOffset.of("MIT");
            fail("Expecting exception: DateTimeException");
        } catch (DateTimeException e) {
            //
            // Invalid ID for ZoneOffset, non numeric characters found: MIT
            //
            verifyException("java.time.ZoneOffset", e);
        }
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        int int0 = 578;
        try {
            DateTimeZone.forOffsetHoursMinutes(578, 578);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: 578
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test128() throws Throwable {
        int int0 = 578;
        try {
            DateTimeZone.forOffsetHours(578);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: 578
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test189() throws Throwable {
        int int0 = 24;
        int int1 = 1000;
        try {
            DateTimeZone.forOffsetHoursMinutes(24, 1000);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: 24
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test2910() throws Throwable {
        DateTimeZone.getAvailableIDs();
        UTCProvider uTCProvider0 = new UTCProvider();
        uTCProvider0.getAvailableIDs();
        uTCProvider0.getAvailableIDs();
        DateTimeZone.setProvider(uTCProvider0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2253));
        long long0 = dateTimeZone0.adjustOffset(0L, false);
        DateTimeZone.getProvider();
        DateTimeZone.forOffsetHoursMinutes((-2253), (-2253));
        int int0 = 2000;
        DateTimeZone.forOffsetMillis(int0);
        // Undeclared exception!
        try {
            dateTimeZone0.isStandardOffset(long0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: -2253
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test3311() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 50);
        dateTimeZone0.UTC.previousTransition((-1425L));
        int int0 = dateTimeZone0.UTC.getOffset(0L);
        dateTimeZone0.getStandardOffset(1420L);
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2082, "a=fT}2ru86SS1=`2Po", 578, 2082, 0, 1212, 6600000, 1212, 1, 2082, 0);
        OffsetTime offsetTime0 = MockOffsetTime.now();
        ZoneOffset zoneOffset0 = ZoneOffset.from(offsetTime0);
        simpleTimeZone0.toZoneId();
        TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(simpleTimeZone0);
        long long0 = (-1L);
        dateTimeZone1.convertUTCToLocal(long0);
        boolean boolean0 = true;
        // Undeclared exception!
        try {
            dateTimeZone1.convertLocalToUTC((long) int0, boolean0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Illegal start month 578
            //
            verifyException("java.util.SimpleTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test3712() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(10, 10);
        dateTimeZone0.hashCode();
        DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
        doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
        DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
        dateTimeZone0.getOffsetFromLocal(10);
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateMidnight dateMidnight0 = DateMidnight.now((Chronology) buddhistChronology0);
        DateMidnight dateMidnight1 = dateMidnight0.plusWeeks(265);
        dateMidnight1.getMillisOfSecond();
        dateTimeZone0.getOffset((ReadableInstant) dateMidnight1);
        dateTimeZone0.adjustOffset(21600000L, true);
        dateTimeZone0.getOffset(21600000L);
        dateTimeZone0.convertLocalToUTC((long) 10, true);
        DateTimeZone dateTimeZone1 = DateTimeZone.forID("America/Denver");
        dateTimeZone0.toString();
        long long0 = 10800000L;
        dateTimeZone1.convertLocalToUTC(10800000L, true, 10800000L);
        dateTimeZone1.getStandardOffset(10);
        dateTimeZone0.UTC.previousTransition(36000000L);
        int int0 = (-167);
        DateTimeZone.forOffsetHoursMinutes(1, (-167));
        dateTimeZone1.UTC.getShortName(long0);
        DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider1 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
        DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider1);
        long long1 = (-824L);
        // Undeclared exception!
        try {
            dateTimeZone1.getMillisKeepLocal(dateTimeZone0, long1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: -167
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test3913() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        NameProvider nameProvider0 = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(nameProvider0);
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        dateTimeZone0.getMillisKeepLocal(fixedDateTimeZone0, 1029L);
        DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
        fixedDateTimeZone0.equals(defaultNameProvider0);
        long long0 = (-1422L);
        String string0 = "Ve!CDbg19FKCi";
        DateTimeZone.forID("Ve!CDbg19FKCi");
        // Undeclared exception!
        try {
            dateTimeZone0.getMillisKeepLocal(fixedDateTimeZone0, long0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The datetime zone id 'Ve!CDbg19FKCi' is not recognised
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test4114() throws Throwable {
        int int0 = 1;
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
        Interval interval0 = new Interval((-272L), 10800000L);
        Duration duration0 = interval0.toDuration();
        dateTimeZone0.getNameKey((-352L));
        interval0.withEndMillis(1);
        DateTime dateTime0 = interval0.getEnd();
        dateTime0.withDayOfYear(1);
        int int1 = dateTime0.getDayOfMonth();
        interval0.withDurationBeforeEnd(duration0);
        dateTime0.withZoneRetainFields(dateTimeZone0);
        dateTimeZone0.getOffset((ReadableInstant) dateTime0);
        DateTimeZone.getAvailableIDs();
        dateTimeZone0.convertUTCToLocal((-352L));
        dateTimeZone0.isStandardOffset((-1611L));
        dateTimeZone0.previousTransition(0L);
        dateTimeZone0.isFixed();
        DateTimeZone.getDefault();
        LocalDateTime localDateTime0 = LocalDateTime.fromDateFields((Date) null);
        LocalDateTime localDateTime1 = localDateTime0.withYear(int1);
        LocalDateTime localDateTime2 = localDateTime1.minusSeconds(int0);
        int int2 = 4;
        LocalDateTime localDateTime3 = localDateTime2.minusMillis(int2);
        LocalDateTime localDateTime4 = localDateTime3.plusSeconds(int0);
        // Undeclared exception!
        try {
            dateTimeZone0.isLocalDateTimeGap(localDateTime4);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The date must not be null
            //
            verifyException("org.joda.time.LocalDateTime", e);
        }
    }

    @Test(timeout = 4000)
    public void test5215() throws Throwable {
        NameProvider nameProvider0 = null;
        DateTimeZone.setNameProvider((NameProvider) null);
        int int0 = 1139;
        try {
            DateTimeZone.forOffsetHours(1139);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Hours out of range: 1139
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5416() throws Throwable {
        int int0 = 86400000;
        // Undeclared exception!
        try {
            DateTimeZone.forOffsetMillis(86400000);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Millis out of range: 86400000
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5517() throws Throwable {
        int int0 = 204;
        DateTimeZone.forOffsetHoursMinutes(0, 204);
        DefaultNameProvider defaultNameProvider0 = null;
        try {
            defaultNameProvider0 = new DefaultNameProvider();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Minutes out of range: 204
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }
}
