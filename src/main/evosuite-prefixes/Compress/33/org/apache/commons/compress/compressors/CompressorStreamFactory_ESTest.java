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
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory(true);
        compressorStreamFactory0.setDecompressConcatenated(true);
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        compressorStreamFactory0.createCompressorInputStream((InputStream) byteArrayInputStream0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream((InputStream) null);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        compressorStreamFactory0.createCompressorInputStream((InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream((String) null, (InputStream) null);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        byte[] byteArray0 = new byte[10];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        SnappyCompressorInputStream snappyCompressorInputStream0 = (SnappyCompressorInputStream) compressorStreamFactory0.createCompressorInputStream("snappy-raw", (InputStream) byteArrayInputStream0);
        snappyCompressorInputStream0.getSize();
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream("pack200", (InputStream) null);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream("gz", (InputStream) byteArrayInputStream0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        compressorStreamFactory0.createCompressorInputStream("bzip2", (InputStream) byteArrayInputStream0);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        compressorStreamFactory0.createCompressorInputStream("xz", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        compressorStreamFactory0.createCompressorInputStream("lzma", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream("pack200", (InputStream) byteArrayInputStream0);
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        byte[] byteArray0 = new byte[13];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorInputStream("deflate", (InputStream) byteArrayInputStream0);
        byteArrayInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        compressorStreamFactory0.createCompressorInputStream("snappy-framed", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        compressorStreamFactory0.createCompressorInputStream("z", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        compressorStreamFactory0.createCompressorInputStream("n2#_qxif8|", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorOutputStream((String) null, (OutputStream) null);
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory(true);
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("lzma", pipedOutputStream0);
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        compressorStreamFactory0.createCompressorOutputStream("xz", (OutputStream) null);
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("gz", pipedOutputStream0);
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("bzip2", byteArrayOutputStream0);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("bzip2", byteArrayOutputStream0);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("xz", byteArrayOutputStream0);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        compressorStreamFactory0.createCompressorOutputStream("xz", byteArrayOutputStream0);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        CompressorOutputStream compressorOutputStream0 = compressorStreamFactory0.createCompressorOutputStream("pack200", pipedOutputStream0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        CompressorStreamFactory compressorStreamFactory0 = new CompressorStreamFactory();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        CompressorOutputStream compressorOutputStream0 = compressorStreamFactory0.createCompressorOutputStream("deflate", byteArrayOutputStream0);
    }
}
