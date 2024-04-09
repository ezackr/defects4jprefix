/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 13:04:17 GMT 2024
 */

package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.StringReader;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TarArchiveInputStream_ESTest extends TarArchiveInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 1143);
      boolean boolean0 = tarArchiveInputStream0.isAtEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 1143);
      tarArchiveInputStream0.reset();
      assertEquals(0, tarArchiveInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 1636);
      int int0 = tarArchiveInputStream0.getRecordSize();
      assertEquals(512, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      tarArchiveInputStream0.close();
      assertEquals(0L, tarArchiveInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N=OQB_?PoUn");
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
      assertFalse(tarArchiveEntry0.isExtended());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 329);
      try { 
        tarArchiveInputStream0.getNextEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
      TarArchiveEntry tarArchiveEntry0 = tarArchiveInputStream0.getCurrentEntry();
      assertNull(tarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      tarArchiveInputStream0.setAtEOF(false);
      assertEquals(0, tarArchiveInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
      int int0 = tarArchiveInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      long long0 = tarArchiveInputStream0.skip((-2793L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      long long0 = tarArchiveInputStream0.skip(1143);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      long long0 = tarArchiveInputStream0.skip(36864L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(dataInputStream0);
      tarArchiveInputStream0.getNextTarEntry();
      tarArchiveInputStream0.getNextTarEntry();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-21);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      tarArchiveInputStream0.getNextTarEntry();
      tarArchiveInputStream0.getNextTarEntry();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 424935705, 424935705);
      TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 424935705);
      TarArchiveEntry tarArchiveEntry0 = tarArchiveInputStream1.getNextTarEntry();
      assertNull(tarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vWnnu*5Y>,7zKF}SmL");
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      Map<String, String> map0 = tarArchiveInputStream0.parsePaxHeaders(stringReader0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 1134, 1134);
      StringReader stringReader0 = new StringReader(" =PC6/*");
      // Undeclared exception!
      try { 
        tarArchiveInputStream0.parsePaxHeaders(stringReader0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      StringReader stringReader0 = new StringReader("JarMarker doesn't expect any data");
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
      Map<String, String> map0 = tarArchiveInputStream0.parsePaxHeaders(stringReader0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
      boolean boolean0 = tarArchiveInputStream0.canReadEntryData((ArchiveEntry) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N=OQB_?PoUn");
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
      boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        TarArchiveInputStream.matches(byteArray0, 1143);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 257
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = TarArchiveInputStream.matches(byteArray0, 110);
      assertFalse(boolean0);
  }
}
