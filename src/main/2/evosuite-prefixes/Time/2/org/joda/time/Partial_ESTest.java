/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 03:47:59 GMT 2024
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Partial_ESTest extends Partial_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Partial partial0 = null;
        partial0 = new Partial((DateTimeFieldType[]) null, (int[]) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        Partial partial0 = new Partial(dateTimeFieldType0, 100, gJChronology0);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 100);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Partial partial0 = new Partial();
        partial0.size();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Partial partial0 = new Partial();
        JulianChronology julianChronology0 = JulianChronology.getInstance();
        Partial partial1 = partial0.withChronologyRetainFields(julianChronology0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-2));
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Partial partial0 = new Partial();
        Hours hours0 = Hours.TWO;
        Partial partial1 = partial0.plus(hours0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Partial partial0 = new Partial();
        Hours hours0 = Hours.TWO;
        Partial partial1 = partial0.plus(hours0);
        partial1.equals((Object) partial0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.minus((ReadablePeriod) null);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Partial partial0 = new Partial();
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        partial_Property0.setCopy("kvGqU~ ]bdc@b");
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        ZoneId zoneId0 = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(zoneId0);
        GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
        LocalDate localDate0 = LocalDate.fromCalendarFields(gregorianCalendar0);
        Partial partial0 = new Partial(localDate0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 1219);
        partial_Property0.get();
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Partial partial0 = new Partial();
        Partial.Property partial_Property0 = new Partial.Property(partial0, 45);
        partial_Property0.addWrapFieldToCopy(45);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1));
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Partial partial1 = partial_Property0.getPartial();
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        Partial partial0 = new Partial();
        Partial.Property partial_Property0 = new Partial.Property(partial0, (-1));
        partial_Property0.addToCopy((-1));
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Partial partial0 = new Partial();
        Partial.Property partial_Property0 = new Partial.Property(partial0, (-1187));
        partial_Property0.withMinimumValue();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Partial partial0 = null;
        partial0 = new Partial((DateTimeFieldType) null, 168);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, (int[]) null, (Chronology) null);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[5];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        partial0.size();
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[1];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.clockhourOfHalfday();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        dateTimeFieldTypeArray0[2] = dateTimeFieldType1;
        int[] intArray0 = new int[3];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType1, 1);
        partial0.with(dateTimeFieldType0, (-10));
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[1];
        dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
        int[] intArray0 = new int[4];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        partial0.with(dateTimeFieldType0, 572);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        partial0.with(dateTimeFieldType0, 557);
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekyearOfCentury();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DurationField durationField0 = buddhistChronology0.months();
        UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
        DateTimeFieldType dateTimeFieldType2 = unsupportedDateTimeField0.getType();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        int[] intArray0 = new int[2];
        Partial partial0 = null;
        partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        Partial partial0 = null;
        partial0 = new Partial((ReadablePartial) null);
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.withChronologyRetainFields((Chronology) null);
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        Partial partial0 = new Partial();
        partial0.with((DateTimeFieldType) null, 2380);
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        MonthDay monthDay0 = MonthDay.now();
        Partial partial0 = new Partial(monthDay0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        partial0.with(dateTimeFieldType0, 0);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
        partial0.with(dateTimeFieldType0, (-341));
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
        Partial partial0 = new Partial(dateTimeFieldType0, 2);
        Partial partial1 = partial0.with(dateTimeFieldType0, 2);
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        Partial partial1 = partial0.without(dateTimeFieldType0);
        partial1.size();
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.without(dateTimeFieldType0);
        partial1.size();
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        Partial partial1 = partial0.withField(dateTimeFieldType0, 3269);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 1);
        partial1.equals((Object) partial0);
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        Partial partial0 = new Partial();
        Hours hours0 = Hours.EIGHT;
        Partial partial1 = partial0.withPeriodAdded(hours0, 0);
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        boolean boolean0 = partial0.isMatch((ReadableInstant) null);
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
        StrictChronology strictChronology0 = StrictChronology.getInstance(iSOChronology0);
        int[] intArray0 = strictChronology0.get((ReadablePartial) partial0, 1L);
        Partial partial1 = new Partial(partial0, intArray0);
        boolean boolean0 = partial1.isMatch((ReadableInstant) null);
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        Partial partial0 = new Partial(localDateTime0);
        boolean boolean0 = partial0.isMatch((ReadablePartial) localDateTime0);
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        Partial partial0 = new Partial();
        partial0.isMatch((ReadablePartial) null);
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        LocalDateTime localDateTime0 = LocalDateTime.now();
        boolean boolean0 = partial0.isMatch((ReadablePartial) localDateTime0);
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime();
        Partial partial0 = new Partial(localDateTime0);
        partial0.toString();
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        dateTimeFormatter0.isParser();
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
        Partial partial0 = new Partial();
        Locale locale0 = Locale.ITALIAN;
        String string0 = partial0.toString((String) null, locale0);
    }

    @Test(timeout = 4000)
    public void test4750() throws Throwable {
        LocalTime localTime0 = new LocalTime(1203L, (Chronology) null);
        Partial partial0 = new Partial(localTime0);
        partial0.toString();
        String string0 = partial0.toString();
    }

    @Test(timeout = 4000)
    public void test4851() throws Throwable {
        Partial partial0 = new Partial();
        partial0.toString("No valid format for fields: ");
    }

    @Test(timeout = 4000)
    public void test4952() throws Throwable {
        Partial partial0 = new Partial();
        String string0 = partial0.toString((String) null);
    }

    @Test(timeout = 4000)
    public void test5053() throws Throwable {
        Partial partial0 = new Partial();
        Locale locale0 = new Locale("Types array must not contain null: index ");
        partial0.toString("Types array must not contain null: index ", locale0);
    }
}
