/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 09:30:44 GMT 2023
 */

package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BZip2CompressorInputStream_ESTest extends BZip2CompressorInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        BZip2CompressorInputStream.matches((byte[]) null, 1027);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = BZip2CompressorInputStream.matches(byteArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = BZip2CompressorInputStream.matches(byteArray0, 849);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      BZip2CompressorInputStream bZip2CompressorInputStream0 = null;
      try {
        bZip2CompressorInputStream0 = new BZip2CompressorInputStream(dataInputStream0, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream is not in the BZip2 format
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BZip2CompressorInputStream bZip2CompressorInputStream0 = null;
      try {
        bZip2CompressorInputStream0 = new BZip2CompressorInputStream(byteArrayInputStream0, false);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream is not in the BZip2 format
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, (InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      BZip2CompressorInputStream bZip2CompressorInputStream0 = null;
      try {
        bZip2CompressorInputStream0 = new BZip2CompressorInputStream(bufferedInputStream0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BZip2CompressorInputStream bZip2CompressorInputStream0 = null;
      try {
        bZip2CompressorInputStream0 = new BZip2CompressorInputStream((InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // No InputStream
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream", e);
      }
  }
}
