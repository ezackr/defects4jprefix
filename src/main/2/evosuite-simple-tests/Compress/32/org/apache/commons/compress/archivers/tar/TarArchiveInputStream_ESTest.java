/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 14:09:12 GMT 2024
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Stack;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TarArchiveInputStream_ESTest extends TarArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        tarArchiveInputStream0.close();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        tarArchiveInputStream0.setAtEOF(false);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Stack<TarArchiveInputStream> stack0 = new Stack<TarArchiveInputStream>();
        Enumeration<TarArchiveInputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 948, 948);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Stack<TarArchiveInputStream> stack0 = new Stack<TarArchiveInputStream>();
        Enumeration<TarArchiveInputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 948, 948);
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertEquals(948, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Stack<TarArchiveInputStream> stack0 = new Stack<TarArchiveInputStream>();
        Enumeration<TarArchiveInputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 948, 948);
        tarArchiveInputStream0.reset();
        assertEquals(948, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3720, 3720);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 3720, (-5153));
        int int0 = tarArchiveInputStream0.getRecordSize();
        assertEquals((-5153), int0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, "org.apache.commons.compress.archivers.arj.LocalFileHeader");
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        tarArchiveInputStream0.getCurrentEntry();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 1, "GMT+0");
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 0);
        boolean boolean0 = tarArchiveInputStream0.markSupported();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 0);
        boolean boolean0 = tarArchiveInputStream0.markSupported();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Stack<TarArchiveInputStream> stack0 = new Stack<TarArchiveInputStream>();
        Enumeration<TarArchiveInputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 948, 948);
        tarArchiveInputStream0.mark(948);
        assertEquals(948, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        int int0 = tarArchiveInputStream0.available();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        int int0 = tarArchiveInputStream0.available();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";Q/A}sp;aTuZ(7CyW\"");
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
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
    public void test1215() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 256);
        long long0 = tarArchiveInputStream0.skip((-1717L));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 256);
        long long0 = tarArchiveInputStream0.skip((-1717L));
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 99);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        byte[] byteArray1 = tarArchiveInputStream0.getLongNameData();
        assertNotNull(byteArray1);
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 99);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        byte[] byteArray1 = tarArchiveInputStream0.getLongNameData();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 99);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
        tarArchiveInputStream0.getLongNameData();
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        byte[] byteArray1 = tarArchiveInputStream0.getLongNameData();
        assertEquals(0L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (byte) 50, (byte) 50);
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 50;
        boolean boolean0 = tarArchiveInputStream0.isEOFRecord(byteArray0);
        assertEquals(50, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1421() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (byte) 50, (byte) 50);
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 50;
        boolean boolean0 = tarArchiveInputStream0.isEOFRecord(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1522() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 100);
        tarArchiveInputStream0.parsePaxHeaders(byteArrayInputStream0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1623() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 32;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, (byte) 32);
        tarArchiveInputStream0.parsePaxHeaders(byteArrayInputStream0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1724() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 1890, (byte) 0);
        assertEquals(0, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test1725() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 1890, (byte) 0);
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertEquals(0L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test1726() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 1890, (byte) 0);
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1827() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 234, 234);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 234, 471);
        tarArchiveInputStream0.skip(471);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getLongNameData();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // No current tar entry
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
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
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("UZF-8");
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 33188, 31, "UZF-8");
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2130() throws Throwable {
        byte[] byteArray0 = new byte[29];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 249, 15);
        tarArchiveInputStream0.getLongNameData();
        assertEquals(29L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test2231() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            TarArchiveInputStream.matches(byteArray0, 3720);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 257
            //
            verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        byte[] byteArray0 = new byte[1];
        boolean boolean0 = TarArchiveInputStream.matches(byteArray0, (byte) 0);
        assertFalse(boolean0);
    }
}
