/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:46:26 GMT 2023
 */

package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveStreamFactory_ESTest extends ArchiveStreamFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0, 1881);
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) bufferedInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not use reset and mark operations.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-115), 1388);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) bufferedInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0, 12);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mark is not supported.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Stream must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        archiveStreamFactory0.createArchiveOutputStream("dump", byteArrayOutputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver: dump not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ArchiveOutputStream archiveOutputStream0 = archiveStreamFactory0.createArchiveOutputStream("cpio", pipedOutputStream0);
      assertNotNull(archiveOutputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = (TarArchiveOutputStream)archiveStreamFactory0.createArchiveOutputStream("tar", byteArrayOutputStream0);
      assertEquals(2, TarArchiveOutputStream.LONGFILE_GNU);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      MockFile mockFile0 = new MockFile("cpio", "L_?Qx<(wwxMQxd~k}&");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      JarArchiveOutputStream jarArchiveOutputStream0 = (JarArchiveOutputStream)archiveStreamFactory0.createArchiveOutputStream("jar", mockPrintStream0);
      assertEquals("UTF8", jarArchiveOutputStream0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = (ArArchiveOutputStream)archiveStreamFactory0.createArchiveOutputStream("ar", filterOutputStream0);
      assertEquals(0, ArArchiveOutputStream.LONGFILE_ERROR);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveOutputStream("BokyF;97;ZK9g9W%|~", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // OutputStream must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(657);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveOutputStream((String) null, byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Archivername must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ZipArchiveOutputStream zipArchiveOutputStream0 = (ZipArchiveOutputStream)archiveStreamFactory0.createArchiveOutputStream("zip", byteArrayOutputStream0);
      assertEquals(0, ZipArchiveOutputStream.STORED);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)24, (byte)24);
      try { 
        archiveStreamFactory0.createArchiveInputStream("dump", (InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unexpected EOF
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      try { 
        archiveStreamFactory0.createArchiveInputStream("]e", (InputStream) pipedInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver: ]e not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ArchiveInputStream archiveInputStream0 = archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
      ArchiveInputStream archiveInputStream1 = archiveStreamFactory0.createArchiveInputStream("jar", (InputStream) archiveInputStream0);
      assertNotNull(archiveInputStream1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 498);
      TarArchiveInputStream tarArchiveInputStream0 = (TarArchiveInputStream)archiveStreamFactory0.createArchiveInputStream("tar", (InputStream) bufferedInputStream0);
      assertEquals(512, tarArchiveInputStream0.getRecordSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ArchiveInputStream archiveInputStream0 = archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
      ArchiveInputStream archiveInputStream1 = archiveStreamFactory0.createArchiveInputStream("zip", (InputStream) archiveInputStream0);
      assertNotNull(archiveInputStream1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ArchiveInputStream archiveInputStream0 = archiveStreamFactory0.createArchiveInputStream("ar", (InputStream) pipedInputStream0);
      assertNotNull(archiveInputStream0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream("=U.L$D", (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[13];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)14, (byte)14);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((String) null, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Archivername must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ArchiveInputStream archiveInputStream0 = archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
      ArchiveInputStream archiveInputStream1 = archiveStreamFactory0.createArchiveInputStream("cpio", (InputStream) archiveInputStream0);
      assertNotNull(archiveInputStream1);
  }
}
