/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:31:09 GMT 2023
 */
package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.junit.runner.RunWith;

public class CpioArchiveOutputStreamTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("}U*Q$D");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("}U*Q$D");
        cpioArchiveEntry0.setTime((-1906L));
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        assertFalse(cpioArchiveEntry0.isDirectory());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
        byte[] byteArray0 = new byte[4];
        cpioArchiveOutputStream0.write(byteArray0, (int) (byte) 0, (int) (byte) 0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("4l]<dXp<75<ps`yF");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        MockFile mockFile0 = new MockFile("", "4l]<dXp<75<ps`yF");
        mockFile0.mkdirs();
        CpioArchiveEntry cpioArchiveEntry0 = (CpioArchiveEntry) cpioArchiveOutputStream0.createArchiveEntry(mockFile0, "57A=bIz*i\"|3<sq");
        assertEquals(2, cpioArchiveEntry0.getHeaderPadCount());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("4l]<dXp<75<ps`yF");
        mockPrintStream0.append((CharSequence) "4l]<dXp<75<ps`yF");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        MockFile mockFile0 = new MockFile("4l]<dXp<75<ps`yF");
        ArchiveEntry archiveEntry0 = cpioArchiveOutputStream0.createArchiveEntry(mockFile0, "");
        assertEquals("", archiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.write((byte[]) null, 26, 26);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        cpioArchiveOutputStream0.close();
        byte[] byteArray0 = new byte[0];
        try {
            cpioArchiveOutputStream0.write(byteArray0, 3858, 2438);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream closed
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("6hqo$Jh4!6\u0004", true);
        DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
        MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.putArchiveEntry((ArchiveEntry) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 29127L);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.finish();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("#p<`9]?z~");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.closeArchiveEntry();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.close();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("#p<`9]?z~");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("#p<`9]?z~");
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        try {
            cpioArchiveOutputStream0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // This archives contains unclosed entries.
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("}U*Q$D");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("}U*Q$D");
        cpioArchiveEntry0.setSize(29127L);
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        byte[] byteArray0 = new byte[5];
        cpioArchiveOutputStream0.write(byteArray0);
        assertEquals(5, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(16384);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("FH$Zv6");
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        try {
            byteArrayOutputStream0.writeTo(cpioArchiveOutputStream0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // attempt to write past end of STORED entry
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(16384);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0);
        cpioArchiveOutputStream0.finish();
        try {
            byteArrayOutputStream0.writeTo(cpioArchiveOutputStream0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no current CPIO entry
        }
    }

    @Test(timeout = 4000)
    public void test1815() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("}U*Q$D");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("}U*Q$D");
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        try {
            cpioArchiveOutputStream0.finish();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // This archives contains unclosed entries.
        }
    }

    @Test(timeout = 4000)
    public void test1916() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(24576);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 4);
        byteArrayOutputStream0.writeTo(cpioArchiveOutputStream0);
        assertEquals("", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test2017() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(24609);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 4);
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.write(byteArray0, 24608, 1);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2118() throws Throwable {
        byte[] byteArray0 = new byte[4];
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">QDkwC/'");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.write(byteArray0, 6, (-746));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2219() throws Throwable {
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0, (short) 2);
        byte[] byteArray0 = new byte[8];
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.write(byteArray0, (int) (byte) (-2), (int) (byte) 0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2320() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("}U*Q$D");
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("}U*Q$D");
        cpioArchiveEntry0.setSize(4L);
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        try {
            cpioArchiveOutputStream0.closeArchiveEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // invalid entry size (expected 4 but got 0 bytes)
        }
    }

    @Test(timeout = 4000)
    public void test2421() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(24576);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 4);
        File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.UnicodePathExtraField", "org.apache.commons.compress.archivers.zip.UnicodePathExtraField");
        ArchiveEntry archiveEntry0 = cpioArchiveOutputStream0.createArchiveEntry(file0, "");
        try {
            cpioArchiveOutputStream0.putArchiveEntry(archiveEntry0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Header format: 1 does not match existing format: 4
        }
    }

    @Test(timeout = 4000)
    public void test2522() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
        try {
            cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) (-893));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unknown format: -893
        }
    }

    @Test(timeout = 4000)
    public void test2623() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
        try {
            cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 7);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unknown format: 7
        }
    }

    @Test(timeout = 4000)
    public void test2724() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(255);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
        try {
            cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 6);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unknown format: 6
        }
    }

    @Test(timeout = 4000)
    public void test2825() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
        try {
            cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 5);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unknown format: 5
        }
    }

    @Test(timeout = 4000)
    public void test2926() throws Throwable {
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", false);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
        try {
            cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockFileOutputStream0, (short) 3);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unknown format: 3
        }
    }

    @Test(timeout = 4000)
    public void test3027() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 2);
        cpioArchiveOutputStream0.finish();
        assertEquals("07070200000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000b00000000TRAILER!!!\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test3028() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 2);
        cpioArchiveOutputStream0.finish();
        assertEquals(124, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test3129() throws Throwable {
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream((OutputStream) null);
        // Undeclared exception!
        try {
            cpioArchiveOutputStream0.createArchiveEntry((File) null, "070702");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3230() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(24609);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 4);
        cpioArchiveOutputStream0.finish();
        assertEquals("0707070000000000000000000000000000000000010000000000000000000001300000000000TRAILER!!!\u0000", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test3231() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(24609);
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0, (short) 4);
        cpioArchiveOutputStream0.finish();
        assertEquals(87, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test3432() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(byteArrayOutputStream0);
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("WHnZv6");
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        try {
            cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // duplicate entry: WHnZv6
        }
    }
}
