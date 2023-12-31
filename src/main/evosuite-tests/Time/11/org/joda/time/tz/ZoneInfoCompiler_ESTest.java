/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 01:49:31 GMT 2023
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      // Undeclared exception!
      try { 
        zoneInfoCompiler_DateTimeOfYear0.addCutover((DateTimeZoneBuilder) null, (-2174));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-dst";
      stringArray0[1] = "";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-\"ew~P?7_k;Xpg");
      assertEquals("-\"ew~P?7_k;Xpg", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseDayOfWeek("3");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      try { 
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.test("o", (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear((String) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseOptional((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseMonth((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      PipedReader pipedReader0 = new PipedReader();
      BufferedReader bufferedReader0 = new BufferedReader(pipedReader0);
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[3];
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.compile((File) null, fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("-I%rwfe}24G>O&M1H", "-I%rwfe}24G>O&M1H");
      File[] fileArray0 = new File[6];
      fileArray0[0] = (File) mockFile0;
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Chronology chronology0 = ZoneInfoCompiler.getLenientISOChronology();
      Chronology chronology1 = ZoneInfoCompiler.getLenientISOChronology();
      assertSame(chronology1, chronology0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
      stringTokenizer0.nextElement();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DayOfMonth:
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("\nFormat: ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 47);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("Mont>KhOfear: ", ")m)4=>MAYq@Lw]7");
      File[] fileArray0 = new File[1];
      fileArray0[0] = file0;
      try { 
        zoneInfoCompiler0.compile(file0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/Mont>KhOfear: 0)m)4=>MAYq@Lw]7
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("E4kq\"mEi2kIZ?m(Zw#a", "Tho many time zon ids");
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: /Users/elliottzackrone/IdeaProjects/defects4jprefix/E4kq\"mEi2kIZ?m(Zw#a/Tho many time zon ids
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) null, fileArray0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("maximum", "co!");
      try { 
        zoneInfoCompiler0.compile(file0, (File[]) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/maximum0co!
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      boolean boolean0 = ZoneInfoCompiler.test("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Q');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("qJagA79?:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // qJagA79?:
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-0L0K)xA");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("zone", 83);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"zone\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("minimum", (-76));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      hashMap0.put("-*r* Error in ", dateTimeZone0);
      hashMap0.put("", dateTimeZone0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap((DataOutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Chronology chronology0 = ZoneInfoCompiler.getLenientISOChronology();
      assertNotNull(chronology0);
      
      int int0 = ZoneInfoCompiler.parseTime("24,G0");
      assertEquals(86400000, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      stringArray0[2] = "minimum";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"MonthOfYear: 1
         // DayOfMonth: 1
         // DayOfWeek: 0
         // AdvanceDayOfWeek: false
         // MillisOfDay: 0
         // ZoneChar: w
         // \" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseMonth("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("", "Too many time zone ids");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("2", "2", false);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "", (-1194), 594, 2050);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 0);
  }
}
