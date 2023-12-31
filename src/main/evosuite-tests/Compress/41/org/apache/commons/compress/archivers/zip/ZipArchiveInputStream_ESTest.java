/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 13:32:47 GMT 2023
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.nio.charset.IllegalCharsetNameException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZipArchiveInputStream_ESTest extends ZipArchiveInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = MockFile.createTempFile("Truncated ZIP entry: ", "uncompressed size is required for STORED method when not writing to a file");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ZipArchiveInputStream zipArchiveInputStream0 = null;
      try {
        zipArchiveInputStream0 = new ZipArchiveInputStream(mockFileInputStream0, "Truncated ZIP entry: ", true, true);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // Truncated ZIP entry: 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
      try { 
        zipArchiveInputStream0.getNextEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, (String) null, false);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      boolean boolean0 = zipArchiveInputStream0.canReadEntryData(jarArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, (String) null, false);
      byte[] byteArray0 = new byte[2];
      int int0 = zipArchiveInputStream0.read(byteArray0, (int) (byte)106, (-2770));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(mockFileInputStream0, (String) null);
      zipArchiveInputStream0.close();
      byte[] byteArray0 = new byte[8];
      try { 
        zipArchiveInputStream0.read(byteArray0, 0, (int) (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The stream is closed
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1576);
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
      zipArchiveInputStream0.close();
      zipArchiveInputStream0.close();
      assertEquals(0L, zipArchiveInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)11);
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        zipArchiveInputStream0.skip((-291L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
      long long0 = zipArchiveInputStream0.skip(86L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
      zipArchiveInputStream0.skip(1041L);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipArchiveInputStream.matches((byte[]) null, 703);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipArchiveInputStream.matches(byteArray0, 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipArchiveInputStream.matches(byteArray0, 2048);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0, "0");
      zipArchiveInputStream0.getNextEntry();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, (String) null, false);
      try { 
        zipArchiveInputStream0.getNextZipEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipArchiveInputStream zipArchiveInputStream0 = null;
      try {
        zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$1");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$1
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(407);
      ZipArchiveInputStream zipArchiveInputStream0 = null;
      try {
        zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, "", false);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)11);
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
      zipArchiveInputStream0.getNextZipEntry();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1576);
      ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(zipArchiveInputStream0, 1576);
      ZipArchiveInputStream zipArchiveInputStream1 = new ZipArchiveInputStream(pushbackInputStream0, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", true, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)117;
      ZipArchiveInputStream.matches(byteArray0, 1367);
  }
}
