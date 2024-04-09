/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 12:56:10 GMT 2024
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TarArchiveOutputStream_ESTest extends TarArchiveOutputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.flush();
        assertEquals(2, TarArchiveOutputStream.LONGFILE_GNU);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0, 10240);
        assertEquals(2, TarArchiveOutputStream.LONGFILE_GNU);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        int int0 = tarArchiveOutputStream0.getRecordSize();
        assertEquals(512, int0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.close();
        tarArchiveOutputStream0.close();
        assertEquals(10240, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.finish();
        try {
            tarArchiveOutputStream0.finish();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // This archive has already been finished
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        try {
            tarArchiveOutputStream0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // This archives contains unclosed entries.
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        MockFile mockFile0 = new MockFile(" is not a concrete class", " is not a concrete class");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(mockFileOutputStream0);
        tarArchiveOutputStream0.close();
        try {
            tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream has already been finished
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        MockFile mockFile0 = new MockFile(" is not a!c5ns6et6 ?la{s", " is not a!c5ns6et6 ?la{s");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" is not a!c5ns6et6 ?la{s");
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(mockFileOutputStream0);
        // Undeclared exception!
        try {
            tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // file name 'Users/elliottzackrone/IdeaProjects/defects4jprefix/ is not a!c5ns6et6 ?la{s/ is not a!c5ns6et6 ?la{s' is too long ( > 100 bytes)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        MockFile mockFile0 = new MockFile(" is not a!c5ns6et6 ?la{s", " is not a!c5ns6et6 ?la{s");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" is not a!c5ns6et6 ?la{s");
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(mockFileOutputStream0);
        tarArchiveOutputStream0.setLongFileMode(2);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        assertEquals(100, tarArchiveOutputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        MockFile mockFile0 = new MockFile(" is not a!c5ns6et6 ?la{s", " is not a!c5ns6et6 ?la{s");
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" is not a!c5ns6et6 ?la{s");
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(mockFileOutputStream0);
        tarArchiveOutputStream0.setLongFileMode(1);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        assertEquals(0L, tarArchiveOutputStream0.getBytesWritten());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("./");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("./");
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(mockFileOutputStream0);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        assertEquals(33188, TarArchiveEntry.DEFAULT_FILE_MODE);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.finish();
        try {
            tarArchiveOutputStream0.closeArchiveEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream has already been finished
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        try {
            tarArchiveOutputStream0.closeArchiveEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // No current entry to close
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        tarArchiveOutputStream0.closeArchiveEntry();
        assertEquals(0, tarArchiveOutputStream0.getCount());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
        tarArchiveEntry0.setSize(1);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        try {
            tarArchiveOutputStream0.closeArchiveEntry();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // entry '' closed at '0' before the '1' bytes specified in the header were written
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.close();
        try {
            byteArrayOutputStream0.writeTo(tarArchiveOutputStream0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // request to write '10240' bytes exceeds size in header of '0' bytes for entry 'null'
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(pipedOutputStream0, 5682, 5629);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" bytes)", (byte) (-81));
        tarArchiveEntry0.setSize(5682);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        tarArchiveOutputStream0.write(5682);
        // Undeclared exception!
        try {
            tarArchiveOutputStream0.write((byte[]) null, 1000, 5682);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(pipedOutputStream0, 5715, 5715);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RG,y4.fUDu@kIZ)J");
        tarArchiveEntry0.setSize(33188);
        tarArchiveOutputStream0.putArchiveEntry(tarArchiveEntry0);
        // Undeclared exception!
        try {
            tarArchiveOutputStream0.write((byte[]) null, 33188, 33188);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarBuffer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        MockFile mockFile0 = new MockFile("", "");
        TarArchiveEntry tarArchiveEntry0 = (TarArchiveEntry) tarArchiveOutputStream0.createArchiveEntry(mockFile0, "");
        assertEquals(33188, TarArchiveEntry.DEFAULT_FILE_MODE);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
        tarArchiveOutputStream0.close();
        MockFile mockFile0 = new MockFile("q#Ry");
        try {
            tarArchiveOutputStream0.createArchiveEntry(mockFile0, "q#Ry");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream has already been finished
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
        }
    }
}
