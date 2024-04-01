/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 02:15:08 GMT 2023
 */
package org.apache.commons.compress.compressors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CompressorStreamFactory_ESTest extends CompressorStreamFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        boolean boolean0 = compressorStreamFactory0.getDecompressConcatenated();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(true);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory(true);
        // Undeclared exception!
        try {
            compressorStreamFactory0.setDecompressConcatenated(true);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Cannot override the setting defined by the constructor
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        try {
            compressorStreamFactory0.createCompressorInputStream((InputStream) byteArrayInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // No Compressor found for the stream signature.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        // Undeclared exception!
        try {
            compressorStreamFactory0.createCompressorInputStream((InputStream) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Stream must not be null.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        // Undeclared exception!
        try {
            compressorStreamFactory0.createCompressorInputStream((InputStream) pipedInputStream0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Mark is not supported.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        // Undeclared exception!
        try {
            compressorStreamFactory0.createCompressorInputStream((String) null, (InputStream) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Compressor name and stream must not be null.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        byte[] byteArray0 = new byte[10];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        SnappyCompressorInputStream snappyCompressorInputStream0 = (SnappyCompressorInputStream) compressorStreamFactory0.createCompressorInputStream("snappy-raw", (InputStream) byteArrayInputStream0);
        assertEquals(0, snappyCompressorInputStream0.getSize());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        // Undeclared exception!
        try {
            compressorStreamFactory0.createCompressorInputStream("pack200", (InputStream) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Compressor name and stream must not be null.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        try {
            compressorStreamFactory0.createCompressorInputStream("gz", (InputStream) byteArrayInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        try {
            compressorStreamFactory0.createCompressorInputStream("bzip2", (InputStream) byteArrayInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        try {
            compressorStreamFactory0.createCompressorInputStream("xz", (InputStream) pipedInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        try {
            compressorStreamFactory0.createCompressorInputStream("lzma", (InputStream) pipedInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        try {
            compressorStreamFactory0.createCompressorInputStream("pack200", (InputStream) byteArrayInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        byte[] byteArray0 = new byte[13];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream("deflate", (InputStream) byteArrayInputStream0);
        assertEquals(13, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        try {
            compressorStreamFactory0.createCompressorInputStream("snappy-framed", (InputStream) pipedInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        try {
            compressorStreamFactory0.createCompressorInputStream("z", (InputStream) pipedInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorInputStream.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        try {
            compressorStreamFactory0.createCompressorInputStream("n2#_qxif8|", (InputStream) pipedInputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Compressor: n2#_qxif8| not found.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        // Undeclared exception!
        try {
            compressorStreamFactory0.createCompressorOutputStream((String) null, (OutputStream) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Compressor name and stream must not be null.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory(true);
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        try {
            compressorStreamFactory0.createCompressorOutputStream("lzma", pipedOutputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Compressor: lzma not found.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        // Undeclared exception!
        try {
            compressorStreamFactory0.createCompressorOutputStream("xz", (OutputStream) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Compressor name and stream must not be null.
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        try {
            compressorStreamFactory0.createCompressorOutputStream("gz", pipedOutputStream0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Could not create CompressorOutputStream
            //
            verifyException("org.apache.commons.compress.compressors.CompressorStreamFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("bzip2", byteArrayOutputStream0);
        assertEquals(3, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("bzip2", byteArrayOutputStream0);
        assertEquals("BZh", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("xz", byteArrayOutputStream0);
        assertEquals("\uFFFD7zXZ\u0000\u0000\u0004\uFFFD\u05B4F", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("xz", byteArrayOutputStream0);
        assertEquals(12, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        CompressorOutputStream compressorOutputStream0 = compressorStreamFactory0.createCompressorOutputStream("pack200", pipedOutputStream0);
        assertNotNull(compressorOutputStream0);
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CompressorOutputStream compressorOutputStream0 = compressorStreamFactory0.createCompressorOutputStream("deflate", byteArrayOutputStream0);
        assertNotNull(compressorOutputStream0);
    }
}
