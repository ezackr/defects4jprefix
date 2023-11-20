/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 00:56:20 GMT 2023
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.codec.binary.Base64InputStream;
import org.junit.runner.RunWith;

public class Base64InputStreamTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(base64InputStream0, byteArrayInputStream0);
        Base64InputStream base64InputStream1 = new Base64InputStream(sequenceInputStream0, true, (-114), byteArray0);
        assertFalse(base64InputStream1.markSupported());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Base64InputStream base64InputStream0 = new Base64InputStream(sequenceInputStream0, true);
        boolean boolean0 = base64InputStream0.markSupported();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Base64InputStream base64InputStream0 = new Base64InputStream(sequenceInputStream0, true);
        int int0 = base64InputStream0.read();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        File file0 = MockFile.createTempFile("+THH#@na:M", "");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        Base64InputStream base64InputStream0 = new Base64InputStream(mockFileInputStream0);
        // Undeclared exception!
        try {
            base64InputStream0.read((byte[]) null, (-3341), (-3341));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        // Undeclared exception!
        try {
            base64InputStream0.read(byteArray0, (int) (byte) (-116), (int) (byte) (-116));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        // Undeclared exception!
        try {
            base64InputStream0.read(byteArray0, 474, (-1404));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        // Undeclared exception!
        try {
            base64InputStream0.read(byteArray0, 1505, 1505);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
        Base64InputStream base64InputStream0 = new Base64InputStream(bufferedInputStream0);
        byte[] byteArray0 = new byte[2];
        // Undeclared exception!
        try {
            base64InputStream0.read(byteArray0, 0, 105);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Base64InputStream base64InputStream0 = new Base64InputStream(sequenceInputStream0, true);
        byte[] byteArray0 = new byte[6];
        int int0 = base64InputStream0.read(byteArray0, (int) (byte) 0, 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        int int0 = base64InputStream0.read(byteArray0);
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test910() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        int int0 = base64InputStream0.read(byteArray0);
        assertEquals((-1), int0);
    }
}
