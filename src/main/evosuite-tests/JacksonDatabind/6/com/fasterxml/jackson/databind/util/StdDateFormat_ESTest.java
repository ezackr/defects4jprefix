/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 16:30:29 GMT 2023
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdDateFormat_ESTest extends StdDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat((TimeZone) null);
      String string0 = stdDateFormat0.toString();
      assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
      assertNotSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getBlueprintRFC1123Format();
      assertEquals("EEE, dd MMM yyyy HH:mm:ss zzz", mockSimpleDateFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getISO8601Format(timeZone0);
      assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", mockSimpleDateFormat0.toLocalizedPattern());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getRFC1123Format(timeZone0);
      assertEquals("EEE, dd MMM yyyy HH:mm:ss zzz", mockSimpleDateFormat0.toLocalizedPattern());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getBlueprintISO8601Format();
      assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", mockSimpleDateFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      TimeZone timeZone0 = TimeZone.getDefault();
      StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
      assertNotSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone((TimeZone) null);
      assertNotSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      Locale locale0 = Locale.CHINA;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
      assertNotSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      Locale locale0 = Locale.US;
      StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
      assertSame(stdDateFormat1, stdDateFormat0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
      StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0);
      stdDateFormat0.setTimeZone(timeZone0);
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      TimeZone timeZone0 = TimeZone.getDefault();
      stdDateFormat0.setTimeZone(timeZone0);
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      Date date0 = stdDateFormat0.parse("0");
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      // Undeclared exception!
      try { 
        stdDateFormat0.parse("-");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("{");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Can not parse date \"{\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      // Undeclared exception!
      try { 
        stdDateFormat0.instance.format((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      // Undeclared exception!
      try { 
        stdDateFormat0.instance.format((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
      StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0);
      String string0 = stdDateFormat0.toString();
      assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.parse("0;sJ%][*cF#}-");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Can not parse date \"0;sJ%][*cF#}-\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("2.25073858507202-308");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Can not parse date \"2.25073858507202-308\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      try { 
        stdDateFormat0.parse("6Bt3-Xab<{e4");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Can not parse date \"6Bt3-Xab<{e4\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      // Undeclared exception!
      try { 
        stdDateFormat0.parseAsISO8601(".000", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      ParsePosition parsePosition0 = new ParsePosition(43);
      Date date0 = stdDateFormat0.parseAsISO8601("-wa!HW:$[Z", parsePosition0);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      ParsePosition parsePosition0 = new ParsePosition(10);
      Date date0 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition0);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ParsePosition parsePosition0 = new ParsePosition(10);
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      Date date0 = stdDateFormat0.parseAsISO8601("\"9z!^-$W2\"-H<:90", parsePosition0);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      ParsePosition parsePosition0 = new ParsePosition(10);
      Date date0 = stdDateFormat0.parseAsISO8601("jqpsB+41v;grwj4*+(R", parsePosition0);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      try { 
        stdDateFormat0.parse("8.;2-{G");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Can not parse date \"8.;2-{G\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
         //
         verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      // Undeclared exception!
      try { 
        stdDateFormat0.parseAsISO8601("l.", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StdDateFormat stdDateFormat0 = StdDateFormat.instance;
      // Undeclared exception!
      try { 
        stdDateFormat0.parseAsISO8601("mk$X+@+Le4}f", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      ParsePosition parsePosition0 = new ParsePosition(2);
      Date date0 = stdDateFormat0.parseAsISO8601("\"z!^)$(823+:90'", parsePosition0);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StdDateFormat stdDateFormat0 = new StdDateFormat();
      // Undeclared exception!
      try { 
        stdDateFormat0.parseAsISO8601("zd891_YWNnn-56^'", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat)StdDateFormat.getRFC1123Format((TimeZone) null, locale0);
      assertEquals("EEE, dd MMM yyyy HH:mm:ss zzz", mockSimpleDateFormat0.toPattern());
  }
}
