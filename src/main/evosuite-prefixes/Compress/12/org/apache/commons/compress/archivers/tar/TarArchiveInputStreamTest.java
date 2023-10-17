/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:47:56 GMT 2023
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.junit.runner.RunWith;

public class TarArchiveInputStreamTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        File file0 = MockFile.createTempFile("input buffer is closed", "input buffer is closed");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 0);
        long long0 = tarArchiveInputStream0.skip(0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.setAtEOF(true);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(891);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 891, (-1356));
        int int0 = tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 65, 0);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte) 59);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pushbackInputStream0, 65, (-1052));
        tarArchiveInputStream0.parsePaxHeaders((Reader) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-103), (-2820));
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        PipedReader pipedReader0 = new PipedReader();
        tarArchiveInputStream0.parsePaxHeaders(pipedReader0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        tarArchiveInputStream0.getNextTarEntry();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        File file0 = MockFile.createTempFile("input buffer is closed", "input buffer is closed");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 0);
        tarArchiveInputStream0.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = null;
        tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-2880), (-2880));
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = null;
        tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 0, (byte) 0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = null;
        tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-257));
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0);
        byte[] byteArray0 = new byte[5];
        int int0 = tarArchiveInputStream0.read(byteArray0, 0, (int) (byte) 40);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = TarArchiveInputStream.matches(byteArray0, (byte) 67);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        byte[] byteArray0 = new byte[0];
        TarArchiveInputStream.matches(byteArray0, 1811);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-126), 1039);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 2599);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(bufferedInputStream0, 2599);
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("?mXq[jk3");
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(zipArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        StringReader stringReader0 = new StringReader("Output buffer is closed");
        Map<String, String> map0 = tarArchiveInputStream0.parsePaxHeaders(stringReader0);
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(bufferedInputStream0, 715);
        StringReader stringReader0 = new StringReader("");
        Map<String, String> map0 = tarArchiveInputStream0.parsePaxHeaders(stringReader0);
        map0.size();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        File file0 = MockFile.createTempFile("^/\"jW {GAaT0/", "ZipEightByteInteger value: ");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 679, 679);
        tarArchiveInputStream0.getNextTarEntry();
        tarArchiveInputStream0.getNextTarEntry();
        mockFileInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 7;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 108, (byte) 7);
        tarArchiveInputStream0.getNextTarEntry();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        long long0 = tarArchiveInputStream0.skip(2147483647L);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        long long0 = tarArchiveInputStream0.skip(1933L);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(bufferedInputStream0, 715);
        long long0 = tarArchiveInputStream0.skip((byte) (-72));
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        File file0 = MockFile.createTempFile("^/\"jW {GAaT0/", "ZipEightByteInteger value: ");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 679, 679);
        int int0 = tarArchiveInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.setAtEOF(true);
        ArchiveEntry archiveEntry0 = tarArchiveInputStream0.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-126), 1039);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 2599);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(bufferedInputStream0, 2599);
        TarArchiveEntry tarArchiveEntry0 = tarArchiveInputStream0.getCurrentEntry();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("{LO[+G`'|8EET1", false);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveEntry0.getGroupName();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        File file0 = MockFile.createTempFile("^/\"jW {GAaT0/", "ZipEightByteInteger value: ");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 679, 679);
        tarArchiveInputStream0.close();
        tarArchiveInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        File file0 = MockFile.createTempFile("^/\"jW {GAaT0/", "ZipEightByteInteger value: ");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 679, 679);
        int int0 = tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.reset();
        tarArchiveInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
    }
}
