/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:28:11 GMT 2023
 */
package org.apache.commons.compress.archivers.ar;

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
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ArArchiveInputStream_ESTest extends ArArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[17];
        byteArray0[0] = (byte) 126;
        boolean boolean0 = ArArchiveInputStream.matches(byteArray0, (byte) 126);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = ArArchiveInputStream.matches(byteArray0, 8);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        byte[] byteArray0 = new byte[17];
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
        int int0 = arArchiveInputStream0.read(byteArray0, 3826, (-77));
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[0];
        int int0 = arArchiveInputStream0.read(byteArray0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        int int0 = arArchiveInputStream0.read(byteArray0);
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        int int0 = arArchiveInputStream0.read(byteArray0);
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-277), (-277));
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        int int0 = arArchiveInputStream0.read();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(5);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, pipedInputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
        // Undeclared exception!
        try {
            arArchiveInputStream0.read((byte[]) null, 5, 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.SequenceInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            arArchiveInputStream0.read(byteArray0, 10, (-470));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pushbackInputStream0);
        arArchiveInputStream0.close();
        try {
            arArchiveInputStream0.read((byte[]) null, 1930, 33);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream closed
            //
            verifyException("java.io.PushbackInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
        // Undeclared exception!
        try {
            arArchiveInputStream0.read((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[5];
        try {
            arArchiveInputStream0.read(byteArray0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            arArchiveInputStream0.read();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-7), (byte) 63);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        // Undeclared exception!
        try {
            arArchiveInputStream0.read();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -7
            //
            verifyException("java.io.ByteArrayInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
        try {
            arArchiveInputStream0.read();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        // Undeclared exception!
        try {
            ArArchiveInputStream.matches((byte[]) null, 1686);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            ArArchiveInputStream.matches(byteArray0, 728);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            arArchiveInputStream0.getNextArEntry();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            arArchiveInputStream0.close();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        MockFile mockFile0 = new MockFile("@-dw}?TDcHSV", "@-dw}?TDcHSV");
        File file0 = MockFile.createTempFile("@-dw}?TDcHSV", "n", (File) mockFile0);
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(mockFileInputStream0);
        byte[] byteArray0 = new byte[4];
        int int0 = arArchiveInputStream0.read(byteArray0, 1, 33188);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-31);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
        arArchiveInputStream0.read();
        ArArchiveEntry arArchiveEntry0 = arArchiveInputStream0.getNextArEntry();
        assertNull(arArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        byte[] byteArray0 = new byte[20];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        try {
            arArchiveInputStream0.getNextArEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // invalid header \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) (-30);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        arArchiveInputStream0.read();
        try {
            arArchiveInputStream0.getNextArEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // failed to read entry header
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = ArArchiveInputStream.matches(byteArray0, (-1));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
        int int0 = arArchiveInputStream0.read();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
        int int0 = arArchiveInputStream0.read();
        int int1 = arArchiveInputStream0.read(byteArray0);
        assertEquals((-1), int1);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        try {
            arArchiveInputStream0.getNextArEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // failed to read header
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(byteArrayInputStream0);
        try {
            arArchiveInputStream0.getNextEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // invalid header \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-31);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream(sequenceInputStream0);
        arArchiveInputStream0.read();
        ArchiveEntry archiveEntry0 = arArchiveInputStream0.getNextEntry();
        assertNull(archiveEntry0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        ArArchiveInputStream arArchiveInputStream0 = new ArArchiveInputStream((InputStream) null);
        // Undeclared exception!
        try {
            arArchiveInputStream0.getNextEntry();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveInputStream", e);
        }
    }
}
