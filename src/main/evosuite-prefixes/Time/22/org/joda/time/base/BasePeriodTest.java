/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 02:14:47 GMT 2023
 */
package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

public class BasePeriodTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MutablePeriod mutablePeriod0 = new MutablePeriod((-2880L));
        mutablePeriod0.setValue(1204, 18);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        Period period0 = new Period((-1458L), (Chronology) gJChronology0);
        PeriodType periodType0 = PeriodType.weeks();
        MutablePeriod mutablePeriod0 = new MutablePeriod(100000000L, periodType0);
        mutablePeriod0.add((ReadablePeriod) period0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Weeks weeks0 = Weeks.MIN_VALUE;
        PeriodType periodType0 = weeks0.getPeriodType();
        MutablePeriod mutablePeriod0 = new MutablePeriod(10000000000000000L, periodType0);
        mutablePeriod0.addYears((-1375));
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Period period0 = new Period(0L);
        Days days0 = period0.toStandardDays();
        PeriodType periodType0 = days0.getPeriodType();
        MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, periodType0);
        mutablePeriod0.setMillis((-1808));
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
        MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, islamicChronology0);
        mutablePeriod0.setPeriod(885, 1, (-795), 1, 355, 1, 0, 514);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
        MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, islamicChronology0);
        Months months0 = Months.ZERO;
        PeriodType periodType0 = months0.getPeriodType();
        Period period0 = new Period(mutablePeriod0, periodType0, islamicChronology0);
        period0.size();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Months months0 = Months.MIN_VALUE;
        PeriodType periodType0 = months0.getPeriodType();
        Period period0 = null;
        period0 = new Period(0, 0, 0, 0, 725, 3216, 0, 0, periodType0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        PeriodType periodType0 = PeriodType.standard();
        EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
        MutablePeriod mutablePeriod0 = new MutablePeriod(10000000000000L, periodType0, (Chronology) ethiopicChronology0);
        mutablePeriod0.setPeriod(0L, (Chronology) ethiopicChronology0);
        mutablePeriod0.addMonths((-499));
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        LocalDate localDate0 = new LocalDate(dateTimeZone0);
        DateMidnight dateMidnight0 = localDate0.toDateMidnight(dateTimeZone0);
        Duration duration0 = mutablePeriod0.toDurationTo(dateMidnight0);
        duration0.getMillis();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        GJChronology gJChronology0 = GJChronology.getInstance();
        DateTime dateTime0 = new DateTime((Chronology) gJChronology0);
        Interval interval0 = new Interval((ReadablePeriod) null, dateTime0);
        Period period0 = interval0.toPeriod();
        Period period1 = period0.plusYears(1024);
        Duration duration0 = period1.toDurationTo(dateTime0);
        duration0.getStandardSeconds();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Period period0 = Period.millis((-978));
        GJChronology gJChronology0 = GJChronology.getInstance();
        Instant instant0 = gJChronology0.getGregorianCutover();
        Duration duration0 = period0.toDurationTo(instant0);
        duration0.getMillis();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
        DateMidnight dateMidnight0 = new DateMidnight((Chronology) gregorianChronology0);
        MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, (ReadableInstant) null);
        mutablePeriod0.setDays(1576);
        Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
        duration0.getStandardHours();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Period period0 = Period.millis((-115));
        Period period1 = period0.withDays((-115));
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
        ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
        YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) iSOChronology0);
        DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight(dateTimeZone0);
        Duration duration0 = period1.toDurationFrom(dateMidnight0);
        duration0.getStandardSeconds();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
        DateMidnight dateMidnight0 = new DateMidnight((Chronology) gregorianChronology0);
        MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, (ReadableInstant) null);
        Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
        duration0.getStandardHours();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Period period0 = Period.millis((-115));
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
        ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
        YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) iSOChronology0);
        DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight(dateTimeZone0);
        Duration duration0 = period0.toDurationFrom(dateMidnight0);
        duration0.getMillis();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Days days0 = Days.THREE;
        Period period0 = days0.toPeriod();
        int int0 = period0.getValue(0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MutablePeriod mutablePeriod0 = new MutablePeriod((-1), (-1), (-1), 142);
        mutablePeriod0.setPeriod(142, 142, (-1), 1544, 0, 0, 60, (-1));
        int int0 = mutablePeriod0.getValue(1);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Period period0 = Period.hours(0);
        PeriodType periodType0 = period0.getPeriodType();
        periodType0.getName();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(528);
        Duration duration0 = Duration.standardSeconds(0L);
        MutableDateTime mutableDateTime0 = new MutableDateTime((-2456L), dateTimeZone0);
        PeriodType periodType0 = PeriodType.yearMonthDayTime();
        Period period0 = new Period(duration0, mutableDateTime0, periodType0);
        period0.getValue(900);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Period period0 = new Period(0L, (Chronology) null);
        DurationFieldType durationFieldType0 = period0.getFieldType(0);
        durationFieldType0.getName();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        PeriodType periodType0 = PeriodType.yearDayTime();
        Period period0 = new Period(0L, (-941L), periodType0);
        int int0 = period0.size();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        PeriodType periodType0 = PeriodType.yearMonthDay();
        MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0, (Chronology) null);
        Days days0 = Days.THREE;
        Period period0 = days0.toPeriod();
        Period period1 = period0.plusMinutes(903);
        mutablePeriod0.add((ReadablePeriod) period1);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        MutablePeriod mutablePeriod0 = new MutablePeriod(0, (-679), 2, (-1017));
        DateMidnight dateMidnight0 = new DateMidnight((long) (-679));
        Interval interval0 = dateMidnight0.toInterval();
        mutablePeriod0.add((ReadableInterval) interval0);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Instant instant0 = new Instant();
        MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
        MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, instant0);
        mutablePeriod0.add((ReadablePeriod) null);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(528);
        CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
        MutablePeriod mutablePeriod0 = new MutablePeriod((-3893L), (Chronology) copticChronology0);
        mutablePeriod0.mergePeriod((ReadablePeriod) null);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        PeriodType periodType0 = PeriodType.yearMonthDay();
        MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0, (Chronology) null);
        mutablePeriod0.setWeeks(0);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Period period0 = Period.millis((-579));
        PeriodType periodType0 = PeriodType.months();
        Instant instant0 = new Instant((-2788L));
        Chronology chronology0 = instant0.getChronology();
        MutablePeriod mutablePeriod0 = new MutablePeriod((long) (-579), periodType0, chronology0);
        mutablePeriod0.mergePeriod(period0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Period period0 = new Period((Object) null);
        period0.getFieldType(291);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        TimeOfDay timeOfDay0 = new TimeOfDay();
        PeriodType periodType0 = PeriodType.hours();
        Period period0 = new Period(timeOfDay0, timeOfDay0, periodType0);
        ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
        MutablePeriod mutablePeriod0 = new MutablePeriod(period0, iSOChronology0);
        mutablePeriod0.setWeeks(2);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        LocalTime localTime0 = new LocalTime();
        Period period0 = new Period(localTime0, localTime0);
        period0.size();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        LocalTime localTime0 = new LocalTime();
        Period period0 = null;
        period0 = new Period(localTime0, (ReadablePartial) null);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Period period0 = null;
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
        period0.size();
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        PeriodType periodType0 = PeriodType.minutes();
        MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0);
        mutablePeriod0.addDays(2000);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        PeriodType periodType0 = PeriodType.yearMonthDay();
        MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0, (Chronology) null);
        mutablePeriod0.addMinutes(0);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        MutablePeriod mutablePeriod0 = new MutablePeriod();
        Instant instant0 = new Instant((-2887L));
        Duration duration0 = mutablePeriod0.toDurationTo(instant0);
        duration0.getMillis();
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        PeriodType periodType0 = PeriodType.yearMonthDay();
        MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0, (Chronology) null);
        mutablePeriod0.setValue(0, 0);
        mutablePeriod0.size();
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Instant instant0 = new Instant();
        Duration duration0 = Duration.millis(0L);
        Period period0 = new Period(instant0, duration0);
        Duration duration1 = period0.toDurationFrom(instant0);
        duration1.getMillis();
    }
}
