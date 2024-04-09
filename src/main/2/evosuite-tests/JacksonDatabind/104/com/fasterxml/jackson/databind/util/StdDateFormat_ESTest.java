/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 00:00:08 GMT 2024
 */

package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdDateFormat_ESTest extends StdDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      StdDateFormat stdDateFormat0 = new StdDateFormat((TimeZone) null, locale0);
      boolean boolean0 = stdDateFormat0.isColonIncludedInTimeZone();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
      assertFalse(stdDateFormat1.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.instance.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      Date date0 = stdDateFormat0.parse("0000-00-00");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      String string0 = stdDateFormat0.instance.toString();
      assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null)", string0);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      TimeZone timeZone0 = stdDateFormat0.getTimeZone();
      assertNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getRFC1123Format((TimeZone) null, locale0);
      assertEquals("EEE, jj nnn aaaa HH:mm:ss zzz", mockSimpleDateFormat0.toLocalizedPattern());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      Boolean boolean0 = Boolean.TRUE;
      StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0, locale0, boolean0);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)StdDateFormat.DEFAULT_TIMEZONE;
      Locale locale0 = Locale.ITALIAN;
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getISO8601Format(zoneInfo0, locale0);
      assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", mockSimpleDateFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      stdDateFormat0.instance.setLenient(true);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0, locale0);
      stdDateFormat0.hashCode();
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone((TimeZone) null);
      assertNotSame(stdDateFormat1, stdDateFormat0);
      assertFalse(stdDateFormat1.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
      StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
      assertFalse(stdDateFormat1.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      Locale locale0 = Locale.FRANCE;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
      assertNotSame(stdDateFormat1, stdDateFormat0);
      assertFalse(stdDateFormat1.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      Locale locale0 = Locale.US;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
      assertFalse(stdDateFormat1.isColonIncludedInTimeZone());
      assertSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      stdDateFormat0.instance.withLenient((Boolean) null);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withColonInTimeZone(true);
      Date date0 = stdDateFormat0.parse("7");
      String string0 = stdDateFormat1.format(date0);
      assertEquals("1970-01-01T00:00:00.007+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withColonInTimeZone(false);
      assertSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      TimeZone timeZone0 = TimeZone.getDefault();
      stdDateFormat0.instance.setTimeZone(timeZone0);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      // Undeclared exception!
      try { 
        stdDateFormat0.parse("0000-00-00T00:00");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match available
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("2.2250738585072012e-308");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"2.2250738585072012e-308\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.parse("-");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Timestamp value - out of 64-bit value range
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("+0000");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"+0000\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      Integer integer0 = new Integer(1395);
      stdDateFormat0.instance.formatToCharacterIterator(integer0);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      Date date0 = stdDateFormat0.parse("7");
      String string0 = stdDateFormat0.format(date0);
      assertEquals("1970-01-01T00:00:00.007+0000", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      MockDate mockDate0 = new MockDate((-1789), (-1789), (-1789), (-1789), (-1789), (-1789));
      String string0 = stdDateFormat0.instance.format((Date) mockDate0);
      assertEquals("0045-10-22T04:41:11.000+0000", string0);
      assertTrue(stdDateFormat0.isLenient());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      String string0 = stdDateFormat0.toPattern();
      assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      boolean boolean0 = stdDateFormat0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      boolean boolean0 = stdDateFormat0.equals(stdDateFormat0);
      assertFalse(stdDateFormat0.isColonIncludedInTimeZone());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.parse("39|<~PY");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"39|<~PY\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("0000-D00-00T00:00");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"0000-D00-00T00:00\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      ParsePosition parsePosition0 = new ParsePosition(10);
      try { 
        stdDateFormat0.instance._parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', parsing fails (leniency? null)
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.parse("0000-00-0");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Cannot parse date \"0000-00-0\": while it seems to fit format 'yyyy-MM-dd', parsing fails (leniency? null)
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }
}
