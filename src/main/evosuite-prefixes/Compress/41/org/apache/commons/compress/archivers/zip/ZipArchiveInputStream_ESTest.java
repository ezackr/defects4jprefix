/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 13:32:47 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.nio.charset.IllegalCharsetNameException;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ZipArchiveInputStream_ESTest extends ZipArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        File file0 = MockFile.createTempFile("Truncated ZIP entry: ", "uncompressed size is required for STORED method when not writing to a file");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        ZipArchiveInputStream zipArchiveInputStream0 = null;
        zipArchiveInputStream0 = new ZipArchiveInputStream(mockFileInputStream0, "Truncated ZIP entry: ", true, true);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        zipArchiveInputStream0.getNextEntry();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, (String) null, false);
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
        boolean boolean0 = zipArchiveInputStream0.canReadEntryData(jarArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, (String) null, false);
        byte[] byteArray0 = new byte[2];
        int int0 = zipArchiveInputStream0.read(byteArray0, (int) (byte) 106, (-2770));
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(mockFileInputStream0, (String) null);
        zipArchiveInputStream0.close();
        byte[] byteArray0 = new byte[8];
        zipArchiveInputStream0.read(byteArray0, 0, (int) (byte) 0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(1576);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.close();
        zipArchiveInputStream0.getBytesRead();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) 11);
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream(byteArrayInputStream0);
        zipArchiveInputStream0.skip((-291L));
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null);
        long long0 = zipArchiveInputStream0.skip(86L);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        ZipArchiveInputStream.matches((byte[]) null, 703);
    }

    @Test(timeout = 4000)
    public void test139() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, (String) null, false);
        zipArchiveInputStream0.getNextZipEntry();
    }

    @Test(timeout = 4000)
    public void test1410() throws Throwable {
        ZipArchiveInputStream zipArchiveInputStream0 = null;
        zipArchiveInputStream0 = new ZipArchiveInputStream((InputStream) null, "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$1");
    }

    @Test(timeout = 4000)
    public void test1511() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(407);
        ZipArchiveInputStream zipArchiveInputStream0 = null;
        zipArchiveInputStream0 = new ZipArchiveInputStream(pipedInputStream0, "", false);
    }
}
