/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 16:57:01 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.attribute.FileTime;
import java.sql.SQLDataException;
import java.sql.SQLNonTransientConnectionException;
import java.util.Date;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ZipArchiveInputStream_ESTest extends ZipArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        String string0 = "oRy[;Bc";
        MockFileInputStream mockFileInputStream0 = null;
        try {
            mockFileInputStream0 = new MockFileInputStream("oRy[;Bc");
            fail("Expecting exception: FileNotFoundException");
        } catch (Throwable e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        String string0 = "";
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0, "", true, true);
        zipArchiveInputStream0.read();
        BufferedInputStream bufferedInputStream0 = null;
        try {
            bufferedInputStream0 = new BufferedInputStream(zipArchiveInputStream0);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        ZipArchiveEntry zipArchiveEntry0 = zipArchiveInputStream0.getNextZipEntry();
        // Undeclared exception!
        try {
            zipArchiveInputStream0.canReadEntryData(zipArchiveEntry0);
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // Stream closed
            //
            verifyException("java.io.PushbackInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        MockFile mockFile0 = new MockFile((File) null, "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException("", " ~aM", 18);
        SQLDataException sQLDataException0 = new SQLDataException(sQLNonTransientConnectionException0);
        MockIOException mockIOException0 = new MockIOException("", sQLDataException0);
        zipArchiveEntry0.equals(mockIOException0);
        zipArchiveInputStream0.canReadEntryData(zipArchiveEntry0);
        byte[] byteArray0 = null;
        int int0 = zipArchiveInputStream0.read();
        zipArchiveInputStream0.read((byte[]) null, 3811, (-1927));
        int int1 = 1870;
        zipArchiveInputStream0.reset();
        zipArchiveInputStream0.mark(int1);
        long long0 = 255L;
        zipArchiveInputStream0.skip(long0);
        zipArchiveInputStream0.close();
        int int2 = (-1494);
        try {
            zipArchiveInputStream0.read(byteArray0, int0, int2);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // mark/reset not supported
            //
            verifyException("java.io.InputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test174() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(2568);
        int int0 = 1400;
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 1400);
        bufferedInputStream0.markSupported();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(bufferedInputStream0, "", true);
        zipArchiveInputStream0.getNextZipEntry();
        ZipArchiveEntry zipArchiveEntry0 = zipArchiveInputStream0.getNextZipEntry();
        // Undeclared exception!
        try {
            zipArchiveInputStream0.skip(zipArchiveEntry0.PLATFORM_FAT);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test185() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 54;
        zipArchiveInputStream0.read(byteArray0, (int) (byte) 54, (int) (byte) 54);
        zipArchiveInputStream0.getNextZipEntry();
        try {
            zipArchiveInputStream0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test196() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = 45;
        // Undeclared exception!
        try {
            ZipArchiveInputStream.matches((byte[]) null, 45);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test217() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = (byte) (-123);
        byteArray0[1] = (byte) 0;
        byteArray0[2] = (byte) (-17);
        byteArray0[3] = (byte) 0;
        ZipArchiveInputStream.matches(byteArray0, 3233);
        ZipArchiveInputStream.matches(byteArray0, (byte) 0);
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        pipedInputStream0.close();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        zipArchiveInputStream0.close();
        ZipArchiveEntry zipArchiveEntry0 = zipArchiveInputStream0.getNextZipEntry();
        pipedInputStream0.read(byteArray0);
        long long0 = 0L;
        zipArchiveEntry0.setCompressedSize(long0);
        zipArchiveInputStream0.markSupported();
        zipArchiveInputStream0.read(byteArray0);
        // Undeclared exception!
        try {
            zipArchiveInputStream0.markSupported();
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test278() throws Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) 0;
        byteArray0[1] = (byte) 50;
        byteArray0[2] = (byte) 86;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3430), (byte) 86);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        long long0 = 0L;
        zipArchiveInputStream0.getNextEntry();
        zipArchiveInputStream0.skip(long0);
        String string0 = "";
        JarEntry jarEntry0 = new JarEntry(string0);
        JarEntry jarEntry1 = null;
        try {
            jarEntry1 = new JarEntry(jarEntry0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test299() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 54;
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.read(byteArray0, (int) (byte) 54, (int) (byte) 54);
        try {
            zipArchiveInputStream0.getNextZipEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // The stream is closed
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test3110() throws Throwable {
        FileSystemHandling.shouldAllThrowIOExceptions();
        byte[] byteArray0 = new byte[0];
        int int0 = 2181;
        // Undeclared exception!
        try {
            ZipArchiveInputStream.matches(byteArray0, 2181);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test3211() throws Throwable {
        DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pushbackInputStream0);
        zipArchiveInputStream0.read();
        zipArchiveInputStream0.getNextZipEntry();
        // Undeclared exception!
        try {
            zipArchiveInputStream0.available();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.DataInputStream", e);
        }
    }
}
