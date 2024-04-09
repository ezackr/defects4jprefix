/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 13:10:03 GMT 2024
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.Format;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.apache.commons.lang3.text.FormatFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("n'{ 1,|,U']&}&", hashMap0);
      assertEquals("n'{'1,|,U]&}&", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("9H>xd'RH");
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat(32, dateFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
      Format[] formatArray0 = new Format[0];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>(0);
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Unreadable format element at position ", hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormats((Format[]) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("org.apache.commons.lang3.text.StrMatcher$StringMatcher", locale0);
      String string0 = extendedMessageFormat0.toPattern();
      assertEquals("org.apache.commons.lang3.text.StrMatcher$StringMatcher", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("org.apache.commons.lang3.text.StrMatcher$CharMatcher");
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex((-1), dateFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(";w{6 }I", hashMap0);
      assertEquals(";w{6}I", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("n'{ 1,,U']&}&z]", hashMap0);
      assertEquals("n'{'1,,U]&}&z]", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      FormatFactory formatFactory0 = mock(FormatFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Format) null).when(formatFactory0).getFormat(anyString() , anyString() , any(java.util.Locale.class));
      hashMap0.put("", formatFactory0);
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("{ 1,}&0]", hashMap0);
      assertEquals("{1}&0]", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("tTVFk~o;%HY={}", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 13: }
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{ ", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 1
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{6 ,]", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 4
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("{6 1,}(0]", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 1: 6 1
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("n'{ 1,{]&}LzE]", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 6
         //
         verifyException("org.apache.commons.lang3.text.ExtendedMessageFormat", e);
      }
  }
}
