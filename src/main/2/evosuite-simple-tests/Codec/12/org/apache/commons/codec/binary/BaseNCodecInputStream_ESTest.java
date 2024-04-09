/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 12:14:52 GMT 2024
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.binary.BaseNCodecInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BaseNCodecInputStream_ESTest extends BaseNCodecInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Base32 base32_0 = new Base32();
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, false);
        int int0 = baseNCodecInputStream0.read();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, (BaseNCodec) null, true);
        boolean boolean0 = baseNCodecInputStream0.markSupported();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Base64 base64_0 = new Base64(5);
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, true);
        baseNCodecInputStream0.read();
        int int0 = baseNCodecInputStream0.read();
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Base64 base64_0 = new Base64(5);
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, true);
        baseNCodecInputStream0.read();
        int int0 = baseNCodecInputStream0.read();
        assertEquals(65, int0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        Base64 base64_0 = new Base64((-112));
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 52;
        byteArray0[1] = (byte) 52;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, false);
        int int0 = baseNCodecInputStream0.read();
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        Base64 base64_0 = new Base64((-112));
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 52;
        byteArray0[1] = (byte) 52;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, false);
        int int0 = baseNCodecInputStream0.read();
        assertEquals(227, int0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, (BaseNCodec) null, true);
        // Undeclared exception!
        try {
            baseNCodecInputStream0.read((byte[]) null, 104, (int) (byte) 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 627);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, bufferedInputStream0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, (BaseNCodec) null, false);
        byte[] byteArray0 = new byte[8];
        // Undeclared exception!
        try {
            baseNCodecInputStream0.read(byteArray0, (-4218), 59);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        byte[] byteArray0 = new byte[0];
        Base32 base32_0 = new Base32(0, byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base32_0, true);
        byte[] byteArray1 = new byte[3];
        // Undeclared exception!
        try {
            baseNCodecInputStream0.read(byteArray1, 2238, (-236));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        byte[] byteArray0 = new byte[0];
        Base32 base32_0 = new Base32(0, byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base32_0, true);
        // Undeclared exception!
        try {
            baseNCodecInputStream0.read(byteArray0, (int) (byte) 74, (int) (byte) 101);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test810() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        byte[] byteArray0 = new byte[0];
        Base32 base32_0 = new Base32(0, byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base32_0, true);
        byte[] byteArray1 = new byte[3];
        // Undeclared exception!
        try {
            baseNCodecInputStream0.read(byteArray1, (int) (byte) 0, 1024);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test911() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        byte[] byteArray0 = new byte[0];
        Base32 base32_0 = new Base32(0, byteArray0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base32_0, true);
        byte[] byteArray1 = new byte[3];
        int int0 = baseNCodecInputStream0.read(byteArray1, 0, 0);
        assertEquals(0, int0);
    }
}
