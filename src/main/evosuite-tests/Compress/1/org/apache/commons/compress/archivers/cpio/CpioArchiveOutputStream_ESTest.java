/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:26:54 GMT 2023
 */

package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CpioArchiveOutputStream_ESTest extends CpioArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[3];
      cpioArchiveOutputStream0.write(byteArray0, 0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YhNE?");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0, (short)4);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("YhNE?");
      cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
      assertFalse(cpioArchiveEntry0.isPipe());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("F/'-[TRfq&Hg?");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write((byte[]) null, 1440, 850);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[0];
      cpioArchiveOutputStream0.close();
      try { 
        cpioArchiveOutputStream0.write(byteArray0, 3, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("no current CPIO entry");
      mockFileOutputStream0.close();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0);
      try { 
        cpioArchiveOutputStream0.write(1309);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null, 1130L);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("'s no-arg constructor is not public");
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) zipArchiveEntry0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(jarArchiveEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_H ^I:?pEqpZb${bE", "Q_H ^I:?pEqpZb${bE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070707");
      cpioArchiveEntry0.setSize(83L);
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid entry size (expected 83 but got 0 bytes)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("CRC Error", " bytes)");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0, (short)2);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O>OHGn9/");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      cpioArchiveOutputStream0.close();
      cpioArchiveOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_H ^I:?pEqpZb${bE", "Q_H ^I:?pEqpZb${bE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_H ^I:?pEqpZb${bE");
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      cpioArchiveOutputStream0.finish();
      assertEquals(256L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_H ^I:?pEqpZb${bE", "Q_H ^I:?pEqpZb${bE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_H ^I:?pEqpZb${bE");
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      byte[] byteArray0 = new byte[1];
      try { 
        cpioArchiveOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // attempt to write past end of STORED entry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YhNE?");
      byte[] byteArray0 = new byte[3];
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, (int) (byte)124, (int) (short)4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, 409, (int) (byte) (-115));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_H ^I:?pEqpZb${bE", "Q_H ^I:?pEqpZb${bE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[1];
      try { 
        cpioArchiveOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no current CPIO entry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c@T");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0, (short)8);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, (-3345), (int) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_H ^I:?pEqpZb${bE", "Q_H ^I:?pEqpZb${bE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070707");
      cpioArchiveEntry0.setSize(83L);
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid entry size (expected 83 but got 0 bytes)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_H ^I:?pEqpZb${bE", "Q_H ^I:?pEqpZb${bE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070707");
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // duplicate entry: 070707
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null, (short) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = MockFile.createTempFile("Stream closed", "Stream closed");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0, (short)7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("duplicate entry: ", true);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(filterOutputStream0, (short)6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null, (short)5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null, (short)3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((short)2);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short)2);
      cpioArchiveOutputStream0.finish();
      assertEquals("0707020000000000000000000000000000000000000001ffffffff00000000000000000000000000000000000000000000000b00000000TRAILER!!!\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(124, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("org.apache.commons.compress.archivers.zip.JarMarker");
      cpioArchiveOutputStream0.close();
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YhNE?");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0, (short)4);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("YhNE?");
      cpioArchiveOutputStream0.putNextEntry(cpioArchiveEntry0);
      cpioArchiveOutputStream0.closeArchiveEntry();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YhNE?");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0, (short)4);
      cpioArchiveOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ustar");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(objectOutputStream0);
      cpioArchiveOutputStream0.write(716);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("c@T");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0, (short)8);
      cpioArchiveOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" instead of ");
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
