/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 12:13:30 GMT 2023
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Stack;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TarArchiveInputStream_ESTest extends TarArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[1] = (byte) (-70);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0);
        Map<String, String> map0 = tarArchiveInputStream0.parsePaxHeaders(byteArrayInputStream0);
        assertTrue(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0);
        long long0 = tarArchiveInputStream0.skip((-116444736000000000L));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        tarArchiveInputStream0.close();
        assertEquals(0L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 52, (byte) 1);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 0);
        long long0 = tarArchiveInputStream0.skip(33L);
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 52, (byte) 1);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, 0);
        long long0 = tarArchiveInputStream0.skip(33L);
        assertEquals((-43L), long0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        byte[] byteArray0 = tarArchiveInputStream0.readRecord();
        assertEquals(0, tarArchiveInputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        byte[] byteArray0 = tarArchiveInputStream0.readRecord();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertEquals(0L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-2779), 0, (String) null);
        int int0 = tarArchiveInputStream0.getRecordSize();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-90), (-1671));
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 100, (byte) (-79));
        int int0 = tarArchiveInputStream0.getRecordSize();
        assertEquals((-79), int0);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.readRecord();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) (-109), (-794), "CP850");
        // Undeclared exception!
        try {
            tarArchiveInputStream0.readRecord();
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0);
        try {
            tarArchiveInputStream0.readRecord();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(4578);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, "CLRI");
        try {
            tarArchiveInputStream0.parsePaxHeaders(pipedInputStream0);
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
        // Undeclared exception!
        try {
            TarArchiveInputStream.matches((byte[]) null, 4183);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1431, 1431);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (String) null);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.isEOFRecord(byteArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, (byte) 0);
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, (byte) 59, (-2146757655));
        // Undeclared exception!
        try {
            tarArchiveInputStream1.getNextTarEntry();
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        MockFile mockFile0 = new MockFile("3X%", "ustar\u0000");
        File file0 = MockFile.createTempFile("3X%", "3X%", (File) mockFile0);
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 0, 0);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getNextTarEntry();
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // / by zero
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(bufferedInputStream0);
        try {
            tarArchiveInputStream0.getNextTarEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream closed
            //
            verifyException("java.io.BufferedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getNextEntry();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 0, (-95));
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getNextEntry();
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, pushbackInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 2923);
        try {
            tarArchiveInputStream0.getNextEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
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
    public void test2124() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-1066), (-354));
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getLongNameData();
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = null;
        try {
            tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0, "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = null;
        try {
            tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, 257, "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        TarArchiveInputStream tarArchiveInputStream0 = null;
        try {
            tarArchiveInputStream0 = new TarArchiveInputStream(pipedInputStream0, 0, (-733), "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-178), 0);
        assertEquals(0, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-178), 0);
        byte[] byteArray0 = tarArchiveInputStream0.readRecord();
        assertNotNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-178), 0);
        byte[] byteArray0 = tarArchiveInputStream0.readRecord();
        tarArchiveInputStream0.setAtEOF(true);
        tarArchiveInputStream0.read(byteArray0, (-178), 1065);
        assertEquals(0, tarArchiveInputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 0, (String) null);
        byte[] byteArray0 = new byte[1];
        tarArchiveInputStream0.read(byteArray0, 0, 2546);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-178), 0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("wH;KCZva1", (byte) (-60));
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.getNextTarEntry();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        tarArchiveInputStream0.getNextTarEntry();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test2834() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        tarArchiveInputStream0.getNextTarEntry();
        assertEquals(0L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test2935() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            tarArchiveInputStream0.skip(1366L);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test3036() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-86));
        TarArchiveInputStream tarArchiveInputStream1 = new TarArchiveInputStream(tarArchiveInputStream0, (-86), (-86), (String) null);
        byte[] byteArray0 = new byte[6];
        tarArchiveInputStream1.isEOFRecord(byteArray0);
        assertEquals((-86), tarArchiveInputStream1.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        boolean boolean0 = TarArchiveInputStream.matches((byte[]) null, 31);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3238() throws Throwable {
        byte[] byteArray0 = new byte[20];
        // Undeclared exception!
        try {
            TarArchiveInputStream.matches(byteArray0, 1000);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 257
            //
            verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3339() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 0, (String) null);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("s [i5Ua3L", (byte) (-110));
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3340() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, 0, (String) null);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("s [i5Ua3L", (byte) (-110));
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(tarArchiveEntry0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, "linkpath");
        MockFile mockFile0 = new MockFile("linkpath", "linkpath");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "2F=ofs6aP)Q|sK");
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(zipArchiveEntry0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3442() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, "linkpath");
        MockFile mockFile0 = new MockFile("linkpath", "linkpath");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "2F=ofs6aP)Q|sK");
        boolean boolean0 = tarArchiveInputStream0.canReadEntryData(zipArchiveEntry0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3543() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = (byte) 22;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        boolean boolean0 = tarArchiveInputStream0.isEOFRecord(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3544() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = (byte) 22;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        boolean boolean0 = tarArchiveInputStream0.isEOFRecord(byteArray0);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3645() throws Throwable {
        MockFile mockFile0 = new MockFile("3X%", "3X%");
        File file0 = MockFile.createTempFile("3X%", "3X%", (File) mockFile0);
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 9574, 0);
        tarArchiveInputStream0.getNextTarEntry();
        assertEquals(0, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3646() throws Throwable {
        MockFile mockFile0 = new MockFile("3X%", "3X%");
        File file0 = MockFile.createTempFile("3X%", "3X%", (File) mockFile0);
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 9574, 0);
        tarArchiveInputStream0.getNextTarEntry();
        assertEquals(0L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test3647() throws Throwable {
        MockFile mockFile0 = new MockFile("3X%", "3X%");
        File file0 = MockFile.createTempFile("3X%", "3X%", (File) mockFile0);
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 9574, 0);
        tarArchiveInputStream0.getNextTarEntry();
        assertEquals(0, mockFileInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test3748() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        tarArchiveInputStream0.getNextEntry();
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("uC_^N/{u$i8{P!u", (byte) 108);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveInputStream0.getLongNameData();
        assertEquals(6L, tarArchiveInputStream0.getBytesRead());
    }

    @Test(timeout = 4000)
    public void test3849() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3850() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3851() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getNextTarEntry();
        byte[] byteArray0 = tarArchiveInputStream0.getLongNameData();
        assertEquals(0, tarArchiveInputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test3952() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        long long0 = tarArchiveInputStream0.skip(0L);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test3953() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        long long0 = tarArchiveInputStream0.skip(0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4054() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        int int0 = tarArchiveInputStream0.available();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test4055() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        int int0 = tarArchiveInputStream0.available();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4156() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.mark(3624);
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test4257() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        boolean boolean0 = tarArchiveInputStream0.markSupported();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test4258() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        boolean boolean0 = tarArchiveInputStream0.markSupported();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4359() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(mockFileInputStream0, 4183, "SHA1");
        try {
            tarArchiveInputStream0.getLongNameData();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
        }
    }

    @Test(timeout = 4000)
    public void test4460() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.getCurrentEntry();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test4561() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, "F-2H");
        // Undeclared exception!
        try {
            tarArchiveInputStream0.parsePaxHeaders((InputStream) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test4662() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveInputStream0.getLongNameData();
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test4663() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
        tarArchiveInputStream0.setCurrentEntry(tarArchiveEntry0);
        tarArchiveInputStream0.getLongNameData();
        assertEquals(4, tarArchiveInputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test4764() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0);
        int int0 = tarArchiveInputStream0.getRecordSize();
        assertEquals(512, int0);
    }

    @Test(timeout = 4000)
    public void test4865() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        tarArchiveInputStream0.reset();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test4966() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertEquals(512, tarArchiveInputStream0.getRecordSize());
    }

    @Test(timeout = 4000)
    public void test4967() throws Throwable {
        Stack<InputStream> stack0 = new Stack<InputStream>();
        Enumeration<InputStream> enumeration0 = stack0.elements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(sequenceInputStream0, (-391));
        boolean boolean0 = tarArchiveInputStream0.isAtEOF();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5068() throws Throwable {
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream((InputStream) null, (-86));
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
}
