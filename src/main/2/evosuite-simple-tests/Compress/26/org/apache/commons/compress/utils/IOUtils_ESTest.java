/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 13:36:07 GMT 2024
 */
package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.utils.IOUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 0);
        byte[] byteArray1 = IOUtils.toByteArray(byteArrayInputStream0);
        int int0 = IOUtils.readFully((InputStream) byteArrayInputStream0, byteArray1);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        // Undeclared exception!
        try {
            IOUtils.copy((InputStream) pipedInputStream0, (OutputStream) null, (int) (byte) 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        long long0 = IOUtils.skip(byteArrayInputStream0, 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (-3219));
        long long0 = IOUtils.skip(byteArrayInputStream0, 49L);
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (-3219));
        long long0 = IOUtils.skip(byteArrayInputStream0, 49L);
        assertEquals((-3219L), long0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 0);
        // Undeclared exception!
        try {
            IOUtils.readFully((InputStream) byteArrayInputStream0, byteArray0, 0, (-2001));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 0);
        int int0 = IOUtils.readFully((InputStream) byteArrayInputStream0, byteArray0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        byte[] byteArray0 = new byte[9];
        // Undeclared exception!
        try {
            IOUtils.readFully((InputStream) sequenceInputStream0, byteArray0, (-1895), 0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        // Undeclared exception!
        try {
            IOUtils.readFully((InputStream) byteArrayInputStream0, byteArray0, 2676, 2676);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.IOUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        int int0 = IOUtils.readFully((InputStream) byteArrayInputStream0, byteArray0);
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        int int0 = IOUtils.readFully((InputStream) byteArrayInputStream0, byteArray0);
        assertEquals(9, int0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        IOUtils.closeQuietly((Closeable) null);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 0);
        IOUtils.closeQuietly(byteArrayInputStream0);
        assertEquals(0, byteArrayInputStream0.available());
    }
}
