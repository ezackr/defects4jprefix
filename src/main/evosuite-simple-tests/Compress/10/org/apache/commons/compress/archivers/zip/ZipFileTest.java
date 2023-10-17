/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 07:44:56 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.IllegalCharsetNameException;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.junit.runner.RunWith;

public class ZipFileTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o`PrmGD*GT");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o({OAaYTZp2P");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("r", "r");
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'s size exceeds the limit of 4GByte.");
        byte[] byteArray0 = new byte[14];
        FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
        FileSystemHandling.appendStringToFile(evoSuiteFile0, "archive is not a ZIP archive");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("'s size exceeds the limit of 4GByte.");
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("Cleaning up unclosed ZipFile for archive ", (String) null);
            fail("Expecting exception: FileNotFoundException");
        } catch (Throwable e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("encryption");
            fail("Expecting exception: FileNotFoundException");
        } catch (Throwable e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("", "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile((String) null, (String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
        byte[] byteArray0 = new byte[2];
        FileSystemHandling.shouldAllThrowIOExceptions();
        FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("r", "r");
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // Simulated IOException
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("");
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        File file0 = MockFile.createTempFile("UTF-8", "\":d*gb.0KJ0>b&ec S");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(file0, "UTF-8", false);
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.ZipFile", "org.apache.commons.compress.archivers.zip.ZipFile");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, "w(\"4x", false);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // w(\"4x
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile((File) null, "T*w+\"We6~Sc5F1", false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        MockFile mockFile0 = new MockFile("Uf),J");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, "org.apache.commons.compress.archivers.zip.Zip64RequiredException", true);
            fail("Expecting exception: FileNotFoundException");
        } catch (Throwable e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            //
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile((File) null, "jcwc.MP^5nK.NR%o");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.ZipFile$BoundedInputStream");
        mockFile0.mkdirs();
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, (String) null);
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        MockFile mockFile0 = new MockFile("'s size exceeds the limit of 4GByte.", ":5aizPAkkf'V>J");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, "UTF8");
            fail("Expecting exception: FileNotFoundException");
        } catch (Throwable e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        File file0 = MockFile.createTempFile("bad size for entry ", "] for UniCode path extra data.");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(file0);
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0);
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        MockFile mockFile0 = new MockFile(" - ", "");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0);
            fail("Expecting exception: FileNotFoundException");
        } catch (Throwable e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(mockFile0, (String) null, false);
            fail("Expecting exception: IOException");
        } catch (Throwable e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o`P?rmGD*GT");
        FileSystemHandling.appendLineToFile(evoSuiteFile0, "o({OAaYTZp2P");
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile("r", "r");
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
        }
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile((File) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        File file0 = MockFile.createTempFile("SZrrwyX4MFq[V,\"mRVJ", (String) null);
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(file0, (String) null);
            fail("Expecting exception: ZipException");
        } catch (Throwable e) {
            //
            // archive is not a ZIP archive
        }
    }
}
