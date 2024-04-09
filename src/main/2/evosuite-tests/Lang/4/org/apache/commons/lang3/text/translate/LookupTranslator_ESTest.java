/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 11:29:48 GMT 2024
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LookupTranslator_ESTest extends LookupTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][1];
      CharSequence[] charSequenceArray1 = new CharSequence[2];
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      charSequenceArray0[0] = charSequenceArray1;
      charSequenceArray0[1] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter();
      lookupTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][1];
      CharSequence[] charSequenceArray1 = new CharSequence[2];
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      charSequenceArray1[1] = (CharSequence) charBuffer0;
      charSequenceArray0[0] = charSequenceArray1;
      charSequenceArray0[1] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = lookupTranslator0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000\u0000", stringWriter0.toString());
      assertEquals(3, int0);
  }
}
