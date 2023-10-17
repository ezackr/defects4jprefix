/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 02:19:17 GMT 2023
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 73, 73, 73);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(offsetDateTimeField0, 73);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField0, "57600146", locale0);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDate.parse("43r]uw&4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"43r]uw&4\" is malformed at \"r]uw&4\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      Integer integer0 = new Integer(949);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, locale0, integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "|", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "dLa;;DP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"dLa;;DP\": Value \"|\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(24L, buddhistChronology0, locale0, (Integer) buddhistChronology0.BE, 1);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertNotNull(dateTimeZone0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2036L), gregorianChronology0, locale0);
      dateTimeParserBucket0.getPivotYear();
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      Locale locale0 = Locale.JAPANESE;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2289L), gregorianChronology0, locale0, integer0);
      dateTimeParserBucket0.getPivotYear();
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Integer integer0 = new Integer((-72));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, islamicChronology0, locale0, integer0);
      dateTimeParserBucket0.getPivotYear();
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(zonedChronology0);
      Locale locale0 = Locale.ROOT;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-45L), lenientChronology0, locale0, integer0, 0);
      dateTimeParserBucket0.setOffset(959);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(959, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1328L), gregorianChronology0, locale0);
      dateTimeParserBucket0.setOffset((-2297));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-2297), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1211L), islamicChronology0, locale0, (Integer) 1, (-306));
      long long0 = dateTimeParserBucket0.computeMillis(false, "an,em");
      assertEquals((-1211L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = copticChronology0.withUTC();
      Locale locale0 = new Locale("org.joda.time.DateTimeUtils$OffsetMillisProvider", "org.joda.time.DateTimeUtils$OffsetMillisProvider");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, chronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-28800000L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(millisDurationField0, durationFieldType0, 606);
      int int0 = DateTimeParserBucket.compareReverse(scaledDurationField0, millisDurationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0, (Integer) 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, "`2-T1=0IpZC7f>(iDw", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(912L, julianChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, (-2428));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, ethiopicChronology0, locale0, (Integer) 1, 169200000);
      dateTimeParserBucket0.saveField((DateTimeField) null, (-28800000));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "z6G8<MyYn0=nBd");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1321L), (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2281));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2281 for hourOfHalfday must be in the range [0,11]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      Integer integer0 = new Integer(949);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, locale0, integer0);
      dateTimeParserBucket0.saveField((DateTimeField) null, 2933);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1814));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 939, 1702, 3152);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(offsetDateTimeField0, 939);
      DateTimeField dateTimeField1 = buddhistChronology0.minuteOfHour();
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, "!g,P+:QrA'6M?8", locale0);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      Chronology chronology0 = lenientChronology0.withZone((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(606, chronology0, (Locale) null, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals(28800606L, long0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(243L, (Chronology) null, locale0, (Integer) null, (-3230));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      dateTimeParserBucket0.saveField(dateTimeField0, (-3230));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3230 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1120L), iSOChronology0, locale0, (Integer) null, 32);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "org.joda.time.format.DateTimeFormatterBuilder$Composite", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "America/Phoenix");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"America/Phoenix\": Value \"org.joda.time.format.DateTimeFormatterBuilder$Composite\" for centuryOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA;
      Integer integer0 = Integer.valueOf(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, julianChronology0, locale0, integer0);
      Object object0 = dateTimeParserBucket0.saveState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weekyears();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      dateTimeParserBucket0.saveField((DateTimeField) unsupportedDateTimeField0, 0);
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(true, "1");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2077L, ethiopicChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.setZone(dateTimeZone0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2077L, ethiopicChronology0, locale0, (Integer) 1, 1);
      TimeZone timeZone0 = TimeZone.getTimeZone("+01:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      dateTimeParserBucket0.setZone(dateTimeZone0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, (Locale) null, integer0, 0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0, dateTimeFieldType0);
      DurationField durationField0 = delegatedDateTimeField0.getLeapDurationField();
      DurationField durationField1 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1120L), iSOChronology0, locale0, (Integer) null, (-3660));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "org.joda.time.format.DateTimeFormatterBuilder$Composite", locale0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType1, "org.joda.time.format.DateTimeFormatterBuilder$Composite", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org.joda.time.format.DateTimeFormatterBuilder$Composite\" for centuryOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1120L), iSOChronology0, locale0, (Integer) null, (-3660));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "org.joda.time.format.DateTimeFormatterBuilder$Composite", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "org.joda.time.format.DateTimeFormatterBuilder$Composite", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org.joda.time.format.DateTimeFormatterBuilder$Composite\" for centuryOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      Integer integer0 = new Integer(949);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, locale0, integer0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "dLa;;DP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"dLa;;DP\": Value 10 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket_SavedField0.set(1, true);
      assertEquals((-57599000L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(31449599966L, gregorianChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "&h-UNPsd[>x7o=S", locale0);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(0, dateTimeParserBucket0.getOffset());
      assertEquals(31478399966L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      Integer integer0 = new Integer((-2347));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, gregorianChronology0, locale0, integer0);
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket(1L, gregorianChronology0, locale0, (Integer) null, (-2347));
      Object object0 = dateTimeParserBucket1.saveState();
      assertNotNull(object0);
      
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertFalse(boolean0);
      assertEquals(0, dateTimeParserBucket1.getOffset());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(31449599966L, gregorianChronology0, locale0);
      boolean boolean0 = dateTimeParserBucket0.restoreState(gregorianChronology0);
      assertFalse(boolean0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(31449599966L, gregorianChronology0, locale0);
      dateTimeParserBucket0.saveState();
      Object object0 = dateTimeParserBucket0.saveState();
      assertEquals(0, dateTimeParserBucket0.getOffset());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1328L), gregorianChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 3462);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1295L), gregorianChronology0, locale0);
      Integer integer0 = new Integer(3462);
      dateTimeParserBucket0.setPivotYear(integer0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      Integer integer0 = new Integer((-2347));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, gregorianChronology0, locale0, integer0);
      dateTimeParserBucket0.getLocale();
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2077L, ethiopicChronology0, locale0, (Integer) 1, 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(28802077L, long0);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(912L, julianChronology0, locale0);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.getPivotYear();
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1295L), gregorianChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-1295L), long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2077L, ethiopicChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.getChronology();
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1328L), gregorianChronology0, locale0);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertEquals(0, dateTimeParserBucket0.getOffset());
      assertNull(dateTimeZone0);
  }
}
