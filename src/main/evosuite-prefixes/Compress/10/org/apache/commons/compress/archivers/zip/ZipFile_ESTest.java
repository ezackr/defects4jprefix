/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:44:56 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ZipFile_ESTest extends ZipFile_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o`PrmGD*GT");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o({OAaYTZp2P");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("r", "r");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'s size exceeds the limit of 4GByte.");
        byte[] byteArray0 = new byte[14];
        FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
        FileSystemHandling.appendStringToFile(evoSuiteFile0, "archive is not a ZIP archive");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("'s size exceeds the limit of 4GByte.");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("Cleaning up unclosed ZipFile for archive ", (String) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("encryption");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("", "");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile((String) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
        byte[] byteArray0 = new byte[2];
        FileSystemHandling.shouldAllThrowIOExceptions();
        FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("r", "r");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile((String) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        File file0 = MockFile.createTempFile("UTF-8", "\":d*gb.0KJ0>b&ec S");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(file0, "UTF-8", false);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0, "w(\"4x", false);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile((File) null, "T*w+\"We6~Sc5F1", false);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        MockFile mockFile0 = new MockFile("Uf),J");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0, "org.apache.commons.compress.archivers.zip.Zip64RequiredException", true);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0, "");
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile((File) null, "jcwc.MP^5nK.NR%o");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.ZipFile$BoundedInputStream");
        mockFile0.mkdirs();
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0, (String) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        MockFile mockFile0 = new MockFile("'s size exceeds the limit of 4GByte.", ":5aizPAkkf'V>J");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0, "UTF8");
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        File file0 = MockFile.createTempFile("bad size for entry ", "] for UniCode path extra data.");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(file0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        MockFile mockFile0 = new MockFile(" - ", "");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(mockFile0, (String) null, false);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o`P?rmGD*GT");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o({OAaYTZp2P");
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile("r", "r");
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile((File) null);
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        File file0 = MockFile.createTempFile("SZrrwyX4MFq[V,\"mRVJ", (String) null);
        ZipFile zipFile0 = null;
        zipFile0 = new ZipFile(file0, (String) null);
    }
}
