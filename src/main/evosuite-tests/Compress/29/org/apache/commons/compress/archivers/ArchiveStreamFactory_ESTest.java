/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 10:23:32 GMT 2023
 */

package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.URI;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Enumeration;
import java.util.Locale;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveStreamFactory_ESTest extends ArchiveStreamFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      String string0 = "x+,#@H\\z=0e(X(p>";
      String string1 = "3hQ\"~ejLg;=`mCF'-$5";
      String string2 = "";
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)89;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No Archiver found for the stream signature
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("#1/");
      String string0 = ")'xg+s;M5w0D$s#tbs";
      // Undeclared exception!
      try { 
        archiveStreamFactory0.setEntryEncoding(")'xg+s;M5w0D$s#tbs");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot overide encoding set by the constructor
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      String string0 = "g}t";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      int int0 = 1228;
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1228);
      pipedInputStream0.mark(1228);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        archiveStreamFactory0.createArchiveInputStream("g}t", (InputStream) dataInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver: g}t not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)21;
      byteArray0[1] = (byte) (-58);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)59;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)61;
      byteArray0[6] = (byte)55;
      byteArray0[7] = (byte)95;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      byteArray0[8] = (byte) (-8);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 122);
      byteArrayInputStream0.read(byteArray0);
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No Archiver found for the stream signature
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "z:";
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      String string1 = " read=";
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      mockFile0.setReadOnly();
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      try { 
        archiveStreamFactory0.createArchiveOutputStream(" read=", mockPrintStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver:  read= not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        mockFileInputStream0.skip((-2080L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      archiveStreamFactory0.setEntryEncoding("VL_ILzC|G=W9wsC}}&e");
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream("zip", (InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // VL_ILzC|G=W9wsC}}&e
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("");
      archiveStreamFactory0.getEntryEncoding();
      String string0 = null;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      String string1 = "(+(y\\?l!oHH=";
      MockPrintStream mockPrintStream0 = new MockPrintStream("cpio");
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) enumeration0;
      objectArray0[3] = (Object) null;
      objectArray0[4] = (Object) "(+(y?l!oHH=";
      // Undeclared exception!
      try { 
        mockPrintStream0.printf((Locale) null, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      archiveStreamFactory0.setEntryEncoding("");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)30;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-19);
      byteArray0[3] = (byte) (-91);
      byteArray0[4] = (byte) (-91);
      byteArray0[6] = (byte) (-117);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)70;
      byteArrayOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveOutputStream("tar", byteArrayOutputStream0);
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("");
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream("", (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      archiveStreamFactory0.setEntryEncoding("m4RASdK%JHwUdMZ)Mm");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("jar");
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveOutputStream("jar", (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // OutputStream must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("@w,4Gt<*hB:-f3ha~^");
      MockPrintStream mockPrintStream0 = new MockPrintStream("_");
      try { 
        archiveStreamFactory0.createArchiveOutputStream("@w,4Gt<*hB:-f3ha~^", mockPrintStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver: @w,4Gt<*hB:-f3ha~^ not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      archiveStreamFactory0.getEntryEncoding();
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
  public void test14()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory((String) null);
      String string0 = "s>";
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream("s>", (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      try { 
        archiveStreamFactory0.createArchiveInputStream("]p~+@BV1@", (InputStream) dataInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver: ]p~+@BV1@ not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      String string0 = ",";
      MockFile mockFile0 = new MockFile("'PF:vg&>96:qIxO", "ar");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      String string1 = "G{?";
      try { 
        archiveStreamFactory0.createArchiveOutputStream("", mockPrintStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver:  not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "Archiver: ";
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("Archiver: ");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
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
  public void test18()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)96;
      byteArray0[1] = (byte)33;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No Archiver found for the stream signature
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      archiveStreamFactory0.setEntryEncoding(".jb1AOICW");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mark is not supported.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-62);
      byteArray0[4] = (byte)23;
      byteArray0[5] = (byte) (-21);
      byteArray0[6] = (byte)7;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)59);
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
      String string0 = "=KsU+-";
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("=KsU+-");
      archiveStreamFactory0.getEntryEncoding();
      MockPrintStream mockPrintStream0 = new MockPrintStream("jar");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(bufferedOutputStream0, false);
      mockPrintStream1.print((Object) null);
      try { 
        archiveStreamFactory0.createArchiveOutputStream("=KsU+-", mockPrintStream1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Archiver: =KsU+- not found.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.close();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
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
  public void test23()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("");
      // Undeclared exception!
      try { 
        archiveStreamFactory0.setEntryEncoding("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot overide encoding set by the constructor
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      archiveStreamFactory0.getEntryEncoding();
      archiveStreamFactory0.getEntryEncoding();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveOutputStream((String) null, pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Archivername must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveOutputStream((String) null, filterOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Archivername must not be null.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      archiveStreamFactory0.createArchiveInputStream("cpio", (InputStream) pipedInputStream0);
      String string0 = "\"YcRu=7";
      String string1 = "Unimplemented";
      URI uRI0 = MockURI.URI("Unimplemented");
      URI uRI1 = MockURI.relativize(uRI0, uRI0);
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile(uRI1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI is not absolute
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = null;
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory((String) null);
      archiveStreamFactory0.setEntryEncoding((String) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.close();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.markSupported();
      archiveStreamFactory0.createArchiveInputStream("jar", (InputStream) pipedInputStream0);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mark is not supported.
         //
         verifyException("org.apache.commons.compress.archivers.ArchiveStreamFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'i';
      char char0 = '+';
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory("W#ikA<b");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)72;
      byteArray0[1] = (byte)29;
      byteArray0[2] = (byte) (-33);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)89;
      byteArray0[5] = (byte)20;
      byteArray0[6] = (byte)18;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3732), (byte)1);
      // Undeclared exception!
      try { 
        archiveStreamFactory0.createArchiveInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      archiveStreamFactory0.setEntryEncoding("KdJB87ac_wFD98U");
      archiveStreamFactory0.createArchiveInputStream("cpio", (InputStream) pipedInputStream0);
      String string0 = "\"YcRu=7";
      String string1 = "Unimplemented";
      URI uRI0 = MockURI.URI("Unimplemented");
      URI uRI1 = MockURI.relativize(uRI0, uRI0);
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile(uRI1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI is not absolute
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArchiveStreamFactory archiveStreamFactory0 = new ArchiveStreamFactory();
      archiveStreamFactory0.setEntryEncoding("");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)30;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-19);
      byteArray0[3] = (byte) (-91);
      byteArray0[4] = (byte) (-91);
      byteArray0[5] = (byte) (-57);
      byteArray0[6] = (byte) (-117);
      byteArray0[8] = (byte)70;
      byteArrayOutputStream0.write(byteArray0);
      archiveStreamFactory0.createArchiveOutputStream("ar", byteArrayOutputStream0);
      InputStream inputStream0 = null;
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
}
