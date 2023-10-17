/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:37:09 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.junit.runner.RunWith;

public class ZipArchiveInputStreamTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 126;
        boolean boolean0 = ZipArchiveInputStream.matches(byteArray0, (byte) 76);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[6];
        boolean boolean0 = ZipArchiveInputStream.matches(byteArray0, (byte) 4);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0);
        zipArchiveInputStream0.close();
        try {
            zipArchiveInputStream0.skip(4278190080L);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // The stream is closed
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        // Undeclared exception!
        try {
            ZipArchiveInputStream.matches((byte[]) null, 1067);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            ZipArchiveInputStream.matches(byteArray0, 1558);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-625), 183);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        // Undeclared exception!
        try {
            zipArchiveInputStream0.getNextZipEntry();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        try {
            zipArchiveInputStream0.getNextEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream closed
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, true).when(enumeration0).hasMoreElements();
        doReturn((Object) null).when(enumeration0).nextElement();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0);
        // Undeclared exception!
        try {
            zipArchiveInputStream0.close();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        FileSystemHandling.shouldAllThrowIOExceptions();
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(mockFileInputStream0);
        try {
            zipArchiveInputStream0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Simulated IOException
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = null;
        try {
            zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, "TU?8MgY?uybyyW]R", false);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // TU?8MgY?uybyyW]R
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0);
        byte[] byteArray0 = new byte[2];
        int int0 = zipArchiveInputStream0.read(byteArray0, 303, (-1852));
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pushbackInputStream0);
        try {
            zipArchiveInputStream0.getNextZipEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream closed
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 2);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0, (String) null, false);
        zipArchiveInputStream0.getNextEntry();
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        boolean boolean0 = ZipArchiveInputStream.matches((byte[]) null, (-4782));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 2);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0, (String) null, false);
        long long0 = zipArchiveInputStream0.skip(2);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0);
        long long0 = zipArchiveInputStream0.skip(0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-165), (-165));
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0, "never", true);
        // Undeclared exception!
        try {
            zipArchiveInputStream0.skip((-165));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0);
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.close();
        assertEquals(0, zipArchiveInputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0);
        zipArchiveInputStream0.close();
        byte[] byteArray0 = new byte[7];
        try {
            zipArchiveInputStream0.read(byteArray0, 851, (int) (byte) 101);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // The stream is closed
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false, false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(sequenceInputStream0);
        zipArchiveInputStream0.close();
        ZipArchiveEntry zipArchiveEntry0 = zipArchiveInputStream0.getNextZipEntry();
        assertNull(zipArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(dataInputStream0);
        // Undeclared exception!
        try {
            zipArchiveInputStream0.getNextEntry();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
