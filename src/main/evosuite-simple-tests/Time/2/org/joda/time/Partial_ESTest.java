/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 11:58:09 GMT 2023
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Partial_ESTest extends Partial_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        long long0 = 0L;
        LocalTime localTime0 = new LocalTime(0L);
        Partial partial0 = new Partial(localTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        String string0 = "";
        localTime0.getFields();
        int int0 = 5;
        partial_Property0.setCopy(5);
        // Undeclared exception!
        try {
            partial_Property0.setCopy("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value \"\" for hourOfDay is not supported
            //
            verifyException("org.joda.time.field.BaseDateTimeField", e);
        }
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        // Undeclared exception!
        try {
            partial0.property(dateTimeFieldType0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Field 'minuteOfHour' is not supported
            //
            verifyException("org.joda.time.base.AbstractPartial", e);
        }
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        long long0 = 0L;
        LocalTime localTime0 = new LocalTime(0L);
        Partial partial0 = new Partial(localTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        int int0 = 5;
        partial_Property0.setCopy(5);
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        partial_Property0.setCopy("", locale0);
        // Undeclared exception!
        try {
            DateTimeUtils.setCurrentMillisFixed(long0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value \"\" for hourOfDay is not supported
            //
            verifyException("org.joda.time.field.BaseDateTimeField", e);
        }
    }

    @Test(timeout = 4000)
    public void test133() throws Throwable {
        int int0 = 0;
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        int[] intArray0 = new int[0];
        Partial partial0 = null;
        try {
            partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Values array must be the same length as the types array
            //
            verifyException("org.joda.time.Partial", e);
        }
    }

    @Test(timeout = 4000)
    public void test264() throws Throwable {
        Days days0 = Days.MAX_VALUE;
        Partial partial0 = new Partial();
        partial0.toString("");
        Seconds seconds0 = null;
        try {
            seconds0 = Seconds.ZERO;
        } catch (MockIllegalArgumentException e) {
        }
    }

    @Test(timeout = 4000)
    public void test525() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        int[] intArray0 = new int[2];
        intArray0[1] = 0;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        // Undeclared exception!
        try {
            DurationFieldType.hours();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Types array must not contain duplicate: millisOfSecond and millisOfSecond
            //
            verifyException("org.joda.time.Partial", e);
        }
    }

    @Test(timeout = 4000)
    public void test556() throws Throwable {
        Days days0 = Days.MAX_VALUE;
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        DateTimeFieldType dateTimeFieldType3 = DateTimeFieldType.yearOfCentury();
        dateTimeFieldTypeArray0[3] = dateTimeFieldType3;
        int[] intArray0 = new int[4];
        Partial partial0 = null;
        try {
            partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Types array must be in order largest-smallest: secondOfMinute < centuryOfEra
            //
            verifyException("org.joda.time.Partial", e);
        }
    }

    @Test(timeout = 4000)
    public void test567() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        int[] intArray0 = new int[2];
        intArray0[1] = 0;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        // Undeclared exception!
        try {
            DurationFieldType.hours();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Types array must not contain null: index 0
            //
            verifyException("org.joda.time.Partial", e);
        }
    }

    @Test(timeout = 4000)
    public void test588() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        int int0 = 0;
        intArray0[1] = 0;
        Partial partial1 = null;
        try {
            partial1 = new Partial(dateTimeFieldTypeArray0, intArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Types array must be in order largest-smallest: secondOfMinute < secondOfDay
            //
            verifyException("org.joda.time.Partial", e);
        }
    }

    @Test(timeout = 4000)
    public void test649() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        MutablePeriod mutablePeriod0 = new MutablePeriod(2629800000L, 2629800000L);
        Partial partial1 = partial0.plus(mutablePeriod0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfDay();
        int int0 = (-4543);
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
        int[] intArray0 = new int[3];
        intArray0[0] = (-4543);
        intArray0[1] = (-1);
        intArray0[2] = (-4543);
        Partial partial2 = new Partial(dateTimeFieldTypeArray0, intArray0);
        partial1.withPeriodAdded(mutablePeriod0, int0);
        // Undeclared exception!
        try {
            System.setCurrentTimeMillis(intArray0[1]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Types array must be in order largest-smallest: clockhourOfDay < era
            //
            verifyException("org.joda.time.Partial", e);
        }
    }

    @Test(timeout = 4000)
    public void test6610() throws Throwable {
        long long0 = 1017L;
        System.setCurrentTimeMillis(1017L);
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.dayOfMonth();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        int int0 = 32;
        int int1 = (-1892);
        intArray0[1] = (-1892);
        int int2 = 1552;
        intArray0[2] = 1552;
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        Partial partial0 = null;
        try {
            partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Types array must be in order largest-smallest: yearOfEra < year
            //
            verifyException("org.joda.time.Partial", e);
        }
    }
}
