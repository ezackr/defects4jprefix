/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 13:55:33 GMT 2024
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TarArchiveInputStream_ESTest extends TarArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.close();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (byte) 33);
        tarArchiveInputStream0.setAtEOF(true);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("}Y", (byte) 33);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (byte) 33);
        tarArchiveInputStream0.setAtEOF(true);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("}Y", (byte) 33);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 75, 75);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 75, 75);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-18), (byte) (-18));
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) (-120), 56);
        tarArchiveInputStream0.reset();
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 75);
        int int0 = tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, "org.apache.commons.compress.archivers.zip.ZipEncodingHelper");
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (byte) 98);
        tarArchiveInputStream0.getCurrentEntry();
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, (-2813), (byte) 0);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
        tarArchiveInputStream1.markSupported();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, (-2813), (byte) 0);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, (-2813), (byte) 0);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, (-2813), (byte) 0);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
        tarArchiveInputStream1.getBytesRead();
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        byte[] byteArray0 = new byte[12];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 10, (byte) 0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 524, (String) null);
        tarArchiveInputStream0.mark((byte) 10);
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        byte[] byteArray0 = new byte[20];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 75, 75);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        tarArchiveInputStream0.skip(75);
        tarArchiveInputStream0.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 256);
        long long0 = tarArchiveInputStream0.skip((-1717L));
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 256);
        long long0 = tarArchiveInputStream0.skip((-1717L));
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 2, (byte) 2);
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.getLongNameData();
        byteArrayInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test1118() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 2, (byte) 2);
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.getCount();
    }

    @Test(timeout = 4000)
    public void test1219() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (byte) 33);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(y0AGCdHs$V:", (byte) 33);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveInputStream0.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test1320() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = (byte) 33;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 2, (byte) 2);
        tarArchiveInputStream0.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test1421() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 53, 53);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
        tarArchiveInputStream1.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test1422() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 53, 53);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test1423() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 53, 53);
        byte[] byteArray0 = tarArchiveInputStream1.getLongNameData();
        tarArchiveInputStream1.getBytesRead();
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        byte[] byteArray0 = new byte[20];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        tarArchiveInputStream0.parsePaxHeaders(byteArrayInputStream0);
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test1625() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[3] = (byte) 96;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 2, (byte) 2);
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.getCount();
    }

    @Test(timeout = 4000)
    public void test1726() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 75, 75);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        tarArchiveInputStream0.skip(75);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(y0AGCdHs$V:", false);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveInputStream0.getLongNameData();
    }

    @Test(timeout = 4000)
    public void test1827() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 2, (byte) 2);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData((ArchiveEntry) null);
    }

    @Test(timeout = 4000)
    public void test1828() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 2, (byte) 2);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData((ArchiveEntry) null);
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test1929() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 75, 75);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) 83);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test1930() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 75, 75);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) 83);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test2031() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("kiy2", (byte) 0);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        tarArchiveInputStream0.getRecordSize();
    }

    @Test(timeout = 4000)
    public void test2032() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("kiy2", (byte) 0);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test2133() throws Throwable {
        byte[] byteArray0 = new byte[0];
        TarArchiveInputStream.matches(byteArray0, 2080374784);
    }

    @Test(timeout = 4000)
    public void test2234() throws Throwable {
        byte[] byteArray0 = new byte[0];
        boolean boolean0 = TarArchiveInputStream.matches(byteArray0, (-873));
    }
}
