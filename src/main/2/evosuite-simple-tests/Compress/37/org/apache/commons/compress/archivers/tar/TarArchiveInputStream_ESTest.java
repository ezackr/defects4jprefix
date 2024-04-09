/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 14:22:50 GMT 2024
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.time.ZoneId;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TarArchiveInputStream_ESTest extends TarArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.close();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 7, (byte) 7);
        tarArchiveInputStream0.getLongNameData();
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.setAtEOF(true);
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.setAtEOF(true);
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 32);
        tarArchiveInputStream0.reset();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        File file0 = MockFile.createTempFile("GROUP_EXEC", "] ");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 2025, "GROUP_EXEC");
        int int0 = tarArchiveInputStream0.getRecordSize();
        assertEquals(512, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("h#F.k[GRZ,iB3rV]j3.", (byte) (-1));
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        try {
            tarArchiveInputStream0.getLongNameData();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, "X");
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.getCurrentEntry();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 32);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 932, (byte) 0);
        byte[] byteArray1 = tarArchiveInputStream1.getLongNameData();
        assertNull(byteArray1);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 32);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 932, (byte) 0);
        byte[] byteArray1 = tarArchiveInputStream1.getLongNameData();
        assertFalse(tarArchiveInputStream1.markSupported());
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 32);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 932, (byte) 0);
        byte[] byteArray1 = tarArchiveInputStream1.getLongNameData();
        assertEquals(0L, tarArchiveInputStream1.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 32);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, 932, (byte) 0);
        byte[] byteArray1 = tarArchiveInputStream1.getLongNameData();
        assertEquals(0, tarArchiveInputStream1.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.mark((byte) 0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        int int0 = tarArchiveInputStream0.available();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        int int0 = tarArchiveInputStream0.available();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        File file0 = MockFile.createTempFile("sarse", "sarse");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, (byte) 53, "sarse");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("sarse", (byte) 53);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        int int0 = tarArchiveInputStream0.available();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1219() throws Throwable {
        File file0 = MockFile.createTempFile("sarse", "sarse");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, (byte) 53, "sarse");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("sarse", (byte) 53);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        int int0 = tarArchiveInputStream0.available();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1320() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (-2687));
        long long0 = tarArchiveInputStream0.skip((-2687));
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1321() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (-2687));
        long long0 = tarArchiveInputStream0.skip((-2687));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1422() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        MockFile mockFile0 = new MockFile("", "");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(mockFile0, "");
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getLongNameData();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1523() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 1;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 1, (byte) 1);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getLongNameData();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 99
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1624() throws Throwable {
        File file0 = MockFile.createTempFile("sparse", "sparse");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, (byte) 39, "sparse");
        tarArchiveInputStream0.getLongNameData();
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("sparse", (byte) 39);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveInputStream0.getLongNameData();
        assertEquals((-1), mockFileInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test1725() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        tarArchiveInputStream0.parsePaxHeaders(byteArrayInputStream0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1826() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[3] = (byte) 32;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 32);
        tarArchiveInputStream0.parsePaxHeaders(byteArrayInputStream0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1927() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData((ArchiveEntry) null);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1928() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData((ArchiveEntry) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2029() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Major device number is out of range: ");
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test2030() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Major device number is out of range: ");
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2131() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Major device number is out of range: ");
        Map<String, String> map0 = ZoneId.SHORT_IDS;
        tarArchiveEntry0.fillStarSparseData(map0);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2132() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Major device number is out of range: ");
        Map<String, String> map0 = ZoneId.SHORT_IDS;
        tarArchiveEntry0.fillStarSparseData(map0);
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test2233() throws Throwable {
        // Undeclared exception!
        try {
            TarArchiveInputStream.matches((byte[]) null, 382);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2334() throws Throwable {
        byte[] byteArray0 = new byte[7];
        boolean boolean0 = TarArchiveInputStream.matches(byteArray0, (byte) (-128));
        assertFalse(boolean0);
    }
}
