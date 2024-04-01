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
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 2;
        byteArray0[1] = (byte) 46;
        byteArray0[2] = (byte) 18;
        byteArray0[3] = (byte) 0;
        byteArray0[4] = (byte) 21;
        byteArray0[5] = (byte) (-10);
        byteArray0[6] = (byte) (-10);
        byteArray0[7] = (byte) 49;
        byteArray0[8] = (byte) (-70);
        ZipArchiveInputStream.matches(byteArray0, (-1076));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        byteArrayInputStream0.reset();
        byteArrayInputStream0.read();
        byteArrayInputStream0.mark(15);
        byteArrayInputStream0.mark(8192);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        zipArchiveInputStream0.read(byteArray0, (int) (byte) 46, (int) (byte) 46);
        ZipArchiveInputStream.matches(byteArray0, (byte) 21);
        zipArchiveInputStream0.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        sequenceInputStream0.mark(0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(bufferedInputStream0, "UTF8");
        sequenceInputStream0.read((byte[]) null, 46, 46);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N856");
        zipArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        zipArchiveInputStream0.skip(16877);
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) 83;
        byteArray0[1] = (byte) 15;
        byteArray0[2] = (byte) (-50);
        byteArray0[3] = (byte) 99;
        byteArray0[4] = (byte) 120;
        byteArray0[5] = (byte) 0;
        byteArray0[6] = (byte) (-5);
        ZipArchiveInputStream.matches(byteArray0, (byte) (-50));
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.skip((byte) (-5));
        zipArchiveInputStream0.getNextZipEntry();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("unsupported feature method '");
        AsiExtraField asiExtraField0 = new AsiExtraField();
        zipArchiveEntry0.addExtraField(asiExtraField0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = "oRy[;Bc";
        MockFileInputStream mockFileInputStream0 = null;
        mockFileInputStream0 = new MockFileInputStream("oRy[;Bc");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) (-103);
        byteArray0[2] = (byte) 82;
        byteArray0[2] = (byte) 10;
        byteArray0[3] = (byte) 3;
        byteArray0[4] = (byte) 80;
        byteArray0[5] = (byte) 90;
        byteArray0[6] = (byte) 123;
        ZipArchiveInputStream.matches(byteArray0, 98496370);
        byte[] byteArray1 = new byte[3];
        byteArray1[0] = (byte) 123;
        byteArray1[1] = (byte) 82;
        byteArray1[2] = (byte) 90;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        byteArrayInputStream0.mark((-419));
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Z:P[Q", (byte) 118, false);
        zipArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        zipArchiveInputStream0.getNextZipEntry();
        byteArrayInputStream0.read(byteArray0, 512, (int) (byte) 0);
        byteArrayInputStream0.read();
        long long0 = 0L;
        zipArchiveInputStream0.skip(long0);
        zipArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) (-103);
        byteArray0[1] = (byte) 82;
        byteArray0[2] = (byte) 0;
        byteArray0[3] = (byte) 3;
        byteArray0[4] = (byte) 80;
        byteArray0[5] = (byte) 90;
        byteArray0[6] = (byte) 123;
        ZipArchiveInputStream.matches(byteArray0, 98496370);
        byte[] byteArray1 = new byte[3];
        byteArray1[0] = (byte) 123;
        byteArray1[1] = (byte) 82;
        byteArray1[2] = (byte) 90;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        zipArchiveInputStream0.skip((byte) 90);
        byteArrayInputStream0.mark((-419));
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Z:P[Q", (byte) 118, false);
        zipArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.getNextZipEntry();
        int int0 = 512;
        zipArchiveInputStream0.read(byteArray0, 16877, (int) (byte) 82);
        byteArrayInputStream0.read(byteArray0, int0, (int) byteArray0[1]);
        byteArrayInputStream0.read();
        long long0 = 0L;
        zipArchiveInputStream0.skip(long0);
        zipArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        String string0 = "";
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0, "", true, true);
        zipArchiveInputStream0.read();
        BufferedInputStream bufferedInputStream0 = null;
        bufferedInputStream0 = new BufferedInputStream(zipArchiveInputStream0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        mockFileInputStream0.getChannel();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(mockFileInputStream0);
        mockFileInputStream0.getChannel();
        zipArchiveInputStream0.skip(2L);
        zipArchiveInputStream0.getNextZipEntry();
        byte[] byteArray0 = new byte[8];
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        ZipArchiveEntry zipArchiveEntry0 = zipArchiveInputStream0.getNextZipEntry();
        zipArchiveInputStream0.canReadEntryData(zipArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(18);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, "alphaSize");
        ZipArchiveInputStream zipArchiveInputStream1 = new ZipArchiveInputStream(zipArchiveInputStream0, "alphaSize", true, false);
        ZipArchiveInputStream zipArchiveInputStream2 = new ZipArchiveInputStream(zipArchiveInputStream1, "alphaSize", false);
        ZipArchiveInputStream zipArchiveInputStream3 = new ZipArchiveInputStream(zipArchiveInputStream2);
        zipArchiveInputStream3.getNextZipEntry();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
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
        zipArchiveInputStream0.read(byteArray0, int0, int2);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(611);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, (String) null, false);
        ZipArchiveInputStream zipArchiveInputStream1 = new ZipArchiveInputStream(zipArchiveInputStream0, "", false, true);
        zipArchiveInputStream1.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$1");
        zipArchiveInputStream0.getNextZipEntry();
        byte[] byteArray0 = new byte[5];
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 100;
        byteArray0[1] = (byte) (-19);
        byteArray0[2] = (byte) 0;
        byteArray0[3] = (byte) (-56);
        byteArray0[4] = (byte) (-80);
        byteArray0[5] = (byte) 0;
        byteArray0[6] = (byte) (-101);
        byteArray0[7] = (byte) 2;
        byteArray0[8] = (byte) 0;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, (-1));
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        zipArchiveInputStream0.close();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3048);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pushbackInputStream0, (String) null, false);
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = (byte) (-38);
        byteArray0[1] = (byte) 62;
        byteArray0[2] = (byte) (-83);
        byteArray0[3] = (byte) 41;
        zipArchiveInputStream0.mark(3207);
        byteArray0[4] = (byte) 76;
        zipArchiveInputStream0.canReadEntryData((ArchiveEntry) null);
        int int0 = 20;
        zipArchiveInputStream0.read(byteArray0, 20, (int) (byte) (-83));
        zipArchiveInputStream0.skip(3048);
        zipArchiveInputStream0.skip(3048);
        zipArchiveInputStream0.getNextEntry();
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.read(byteArray0, int0, (int) byteArray0[4]);
        long long0 = 0L;
        zipArchiveInputStream0.skip(long0);
        zipArchiveInputStream0.getNextEntry();
        zipArchiveInputStream0.getNextZipEntry();
        zipArchiveInputStream0.getNextEntry();
        int int1 = 3191;
        ZipArchiveInputStream.matches(byteArray0, int1);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) 65;
        byteArray0[1] = (byte) (-125);
        byteArray0[2] = (byte) 26;
        byteArray0[3] = (byte) 55;
        byteArray0[4] = (byte) 16;
        byteArray0[5] = (byte) 0;
        byteArray0[6] = (byte) 52;
        ZipArchiveInputStream.matches(byteArray0, (byte) 52);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(2568);
        int int0 = 1400;
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 1400);
        bufferedInputStream0.markSupported();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(bufferedInputStream0, "", true);
        zipArchiveInputStream0.getNextZipEntry();
        ZipArchiveEntry zipArchiveEntry0 = zipArchiveInputStream0.getNextZipEntry();
        zipArchiveInputStream0.skip(zipArchiveEntry0.PLATFORM_FAT);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 54;
        zipArchiveInputStream0.read(byteArray0, (int) (byte) 54, (int) (byte) 54);
        zipArchiveInputStream0.getNextZipEntry();
        zipArchiveInputStream0.close();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = 45;
        ZipArchiveInputStream.matches((byte[]) null, 45);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = (byte) 119;
        byteArray0[1] = (byte) 0;
        byteArray0[2] = (byte) 41;
        byteArray0[3] = (byte) (-76);
        byteArray0[4] = (byte) (-104);
        byteArray0[5] = (byte) 0;
        byteArray0[6] = (byte) 85;
        byteArray0[7] = (byte) 123;
        ZipArchiveInputStream.matches(byteArray0, 1447);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        byteArrayInputStream0.markSupported();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0, "");
        zipArchiveInputStream0.markSupported();
        zipArchiveInputStream0.getNextZipEntry();
        zipArchiveInputStream0.close();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
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
        zipArchiveInputStream0.markSupported();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(17);
        pipedInputStream0.skip((-45L));
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        zipArchiveInputStream0.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        byte[] byteArray0 = new byte[4];
        FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
        byteArray0[0] = (byte) (-78);
        byteArray0[1] = (byte) (-28);
        byteArray0[2] = (byte) 57;
        FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
        byteArray0[3] = (byte) 0;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        byteArrayInputStream0.mark((byte) (-28));
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0, "UTF8", false, true);
        zipArchiveInputStream0.getNextEntry();
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.markSupported();
        zipArchiveInputStream0.close();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 63;
        byteArray0[1] = (byte) (-69);
        byteArray0[2] = (byte) 0;
        byteArray0[3] = (byte) (-40);
        byteArray0[4] = (byte) 0;
        byteArray0[5] = (byte) 0;
        byteArray0[6] = (byte) 0;
        byteArray0[7] = (byte) 107;
        byteArray0[8] = (byte) 0;
        ZipArchiveInputStream.matches(byteArray0, (byte) 0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        zipArchiveInputStream0.skip(0L);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(128);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pushbackInputStream0, "BZLIB", false, false);
        DataInputStream dataInputStream0 = new DataInputStream(zipArchiveInputStream0);
        ZipArchiveInputStream zipArchiveInputStream1 = new ZipArchiveInputStream(dataInputStream0, (String) null, false);
        zipArchiveInputStream1.skip(16L);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        zipArchiveInputStream0.close();
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 3;
        byteArray0[1] = (byte) 0;
        byteArray0[2] = (byte) 91;
        byteArray0[3] = (byte) 0;
        byteArray0[4] = (byte) (-56);
        byteArray0[5] = (byte) (-70);
        zipArchiveInputStream0.read(byteArray0);
        ArchiveEntry archiveEntry0 = null;
        zipArchiveInputStream0.canReadEntryData(archiveEntry0);
        byte[] byteArray1 = new byte[5];
        byte byte0 = (byte) 0;
        byteArray1[0] = byte0;
        byte byte1 = (byte) 0;
        byteArray1[1] = byte1;
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
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
        jarEntry1 = new JarEntry(jarEntry0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        zipArchiveInputStream0.close();
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 3;
        zipArchiveInputStream0.mark((byte) 3);
        byteArray0[1] = (byte) 0;
        byteArray0[2] = (byte) 91;
        byteArray0[3] = (byte) 0;
        zipArchiveInputStream0.mark((byte) 0);
        byteArray0[4] = (byte) (-56);
        byte byte0 = (byte) (-70);
        zipArchiveInputStream0.skip(9223372036854775807L);
        byteArray0[5] = byte0;
        zipArchiveInputStream0.read(byteArray0);
        ArchiveEntry archiveEntry0 = null;
        zipArchiveInputStream0.canReadEntryData(archiveEntry0);
        byte[] byteArray1 = new byte[5];
        byte byte1 = (byte) 0;
        byteArray1[0] = byte1;
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 54;
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.read(byteArray0, (int) (byte) 54, (int) (byte) 54);
        zipArchiveInputStream0.getNextZipEntry();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, true).when(enumeration0).hasMoreElements();
        doReturn((Object) null).when(enumeration0).nextElement();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        sequenceInputStream0.mark(0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(bufferedInputStream0, "UTF8");
        sequenceInputStream0.read((byte[]) null, 46, 46);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N856");
        zipArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        zipArchiveInputStream0.skip(16877);
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) 83;
        byteArray0[1] = (byte) 15;
        byteArray0[2] = (byte) (-50);
        byteArray0[3] = (byte) 99;
        byteArray0[4] = (byte) 120;
        byteArray0[5] = (byte) 0;
        byteArray0[6] = (byte) (-5);
        ZipArchiveInputStream.matches(byteArray0, (byte) (-50));
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.skip(byteArray0[6]);
        zipArchiveInputStream0.getNextZipEntry();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        FileSystemHandling.shouldAllThrowIOExceptions();
        byte[] byteArray0 = new byte[0];
        int int0 = 2181;
        ZipArchiveInputStream.matches(byteArray0, 2181);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pushbackInputStream0);
        zipArchiveInputStream0.read();
        zipArchiveInputStream0.getNextZipEntry();
        zipArchiveInputStream0.available();
    }
}
