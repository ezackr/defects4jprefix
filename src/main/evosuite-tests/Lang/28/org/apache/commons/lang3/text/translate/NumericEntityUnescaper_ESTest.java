/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:46:58 GMT 2023
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      char[] charArray0 = new char[2];
      charArray0[0] = '&';
      charArray0[1] = '#';
      stringWriter0.write(charArray0);
      stringWriter0.write(445);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('&');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      stringWriter1.append(';');
      String string0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0);
      assertEquals("&;", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) null, (-179), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.NumericEntityUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(59);
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, 59, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter(0);
      char[] charArray0 = new char[2];
      charArray0[0] = '&';
      charArray0[1] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringWriter0.append('X');
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityUnescaper0.translate((CharSequence) "3B", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(35);
      numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      char[] charArray0 = new char[2];
      charArray0[0] = '&';
      charArray0[1] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringWriter stringWriter1 = stringWriter0.append('x');
      stringWriter1.write("<`eJKt;a|no1-Pzcz9");
      int int0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 35, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[9];
      charArray0[0] = '&';
      charArray0[1] = '#';
      charArray0[3] = ';';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      int int0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(35);
      numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      char[] charArray0 = new char[2];
      charArray0[0] = '&';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      int int0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 35, (Writer) stringWriter0);
      assertEquals(0, int0);
  }
}
