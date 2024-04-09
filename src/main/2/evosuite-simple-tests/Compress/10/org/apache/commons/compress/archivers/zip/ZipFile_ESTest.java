/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 12:58:50 GMT 2024
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.charset.IllegalCharsetNameException;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ZipFile_ESTest extends ZipFile_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, "vr}Hm%r0rXZ8h.m7{");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // vr}Hm%r0rXZ8h.m7{
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        File file0 = MockFile.createTempFile("archive's ZIP64 end of central directory locator is corrupt.", "archive's ZIP64 end of central directory locator is corrupt.");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(file0);
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipFile", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("\"&[;r:W", "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        ZipFile.closeQuietly((ZipFile) null);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("failed to skip file name in local file header");
        byte[] byteArray0 = new byte[52];
        byteArray0[2] = (byte) 80;
        FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("failed to skip file name in local file header");
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipFile", e);
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("failed to skip file name in local file header");
        byte[] byteArray0 = new byte[52];
        byteArray0[2] = (byte) 80;
        byteArray0[3] = (byte) 75;
        FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("failed to skip file name in local file header");
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipFile", e);
        }
    }
}
