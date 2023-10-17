/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 02:14:47 GMT 2023
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2880L));
      // Undeclared exception!
      try { 
        mutablePeriod0.setValue(1204, 18);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1204
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((-1458L), (Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(100000000L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(10000000000000000L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addYears((-1375));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period(0L);
      Days days0 = period0.toStandardDays();
      PeriodType periodType0 = days0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 0L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis((-1808));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, islamicChronology0);
      mutablePeriod0.setPeriod(885, 1, (-795), 1, 355, 1, 0, 514);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, islamicChronology0);
      Months months0 = Months.ZERO;
      PeriodType periodType0 = months0.getPeriodType();
      Period period0 = new Period(mutablePeriod0, periodType0, islamicChronology0);
      assertEquals(1, period0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Months months0 = Months.MIN_VALUE;
      PeriodType periodType0 = months0.getPeriodType();
      Period period0 = null;
      try {
        period0 = new Period(0, 0, 0, 0, 725, 3216, 0, 0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(10000000000000L, periodType0, (Chronology) ethiopicChronology0);
      mutablePeriod0.setPeriod(0L, (Chronology) ethiopicChronology0);
      mutablePeriod0.addMonths((-499));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight(dateTimeZone0);
      Duration duration0 = mutablePeriod0.toDurationTo(dateMidnight0);
      assertEquals((-1312156800000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTime dateTime0 = new DateTime((Chronology) gJChronology0);
      Interval interval0 = new Interval((ReadablePeriod) null, dateTime0);
      Period period0 = interval0.toPeriod();
      Period period1 = period0.plusYears(1024);
      Duration duration0 = period1.toDurationTo(dateTime0);
      assertEquals(32313859622L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.millis((-978));
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = gJChronology0.getGregorianCutover();
      Duration duration0 = period0.toDurationTo(instant0);
      assertEquals((-978L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gregorianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, (ReadableInstant) null);
      mutablePeriod0.setDays(1576);
      Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
      assertEquals(37843L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.millis((-115));
      Period period1 = period0.withDays((-115));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight(dateTimeZone0);
      Duration duration0 = period1.toDurationFrom(dateMidnight0);
      assertEquals((-9936000L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gregorianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateMidnight0, (ReadableInstant) null);
      Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
      assertEquals(20L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.millis((-115));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) iSOChronology0);
      DateMidnight dateMidnight0 = yearMonthDay0.toDateMidnight(dateTimeZone0);
      Duration duration0 = period0.toDurationFrom(dateMidnight0);
      assertEquals((-115L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.THREE;
      Period period0 = days0.toPeriod();
      int int0 = period0.getValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1), (-1), (-1), 142);
      mutablePeriod0.setPeriod(142, 142, (-1), 1544, 0, 0, 60, (-1));
      int int0 = mutablePeriod0.getValue(1);
      assertEquals(142, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.hours(0);
      PeriodType periodType0 = period0.getPeriodType();
      assertEquals("Standard", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(528);
      Duration duration0 = Duration.standardSeconds(0L);
      MutableDateTime mutableDateTime0 = new MutableDateTime((-2456L), dateTimeZone0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(duration0, mutableDateTime0, periodType0);
      // Undeclared exception!
      try { 
        period0.getValue(900);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period(0L, (Chronology) null);
      DurationFieldType durationFieldType0 = period0.getFieldType(0);
      assertEquals("years", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period(0L, (-941L), periodType0);
      int int0 = period0.size();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0, (Chronology) null);
      Days days0 = Days.THREE;
      Period period0 = days0.toPeriod();
      Period period1 = period0.plusMinutes(903);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, (-679), 2, (-1017));
      DateMidnight dateMidnight0 = new DateMidnight((long) (-679));
      Interval interval0 = dateMidnight0.toInterval();
      mutablePeriod0.add((ReadableInterval) interval0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Instant instant0 = new Instant();
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, instant0);
      mutablePeriod0.add((ReadablePeriod) null);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(528);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-3893L), (Chronology) copticChronology0);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0, (Chronology) null);
      mutablePeriod0.setWeeks(0);
      assertEquals(3, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.millis((-579));
      PeriodType periodType0 = PeriodType.months();
      Instant instant0 = new Instant((-2788L));
      Chronology chronology0 = instant0.getChronology();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) (-579), periodType0, chronology0);
      // Undeclared exception!
      try { 
        mutablePeriod0.mergePeriod(period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period((Object) null);
      // Undeclared exception!
      try { 
        period0.getFieldType(291);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(timeOfDay0, timeOfDay0, periodType0);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(period0, iSOChronology0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setWeeks(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = new Period(localTime0, localTime0);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = null;
      try {
        period0 = new Period(localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(8, period0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addDays(2000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0, (Chronology) null);
      mutablePeriod0.addMinutes(0);
      assertEquals(3, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Instant instant0 = new Instant((-2887L));
      Duration duration0 = mutablePeriod0.toDurationTo(instant0);
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0, (Chronology) null);
      mutablePeriod0.setValue(0, 0);
      assertEquals(3, mutablePeriod0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Instant instant0 = new Instant();
      Duration duration0 = Duration.millis(0L);
      Period period0 = new Period(instant0, duration0);
      Duration duration1 = period0.toDurationFrom(instant0);
      assertEquals(0L, duration1.getMillis());
  }
}
