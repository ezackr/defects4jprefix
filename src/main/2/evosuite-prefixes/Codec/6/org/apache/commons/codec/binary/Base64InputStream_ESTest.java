/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 11:58:09 GMT 2024
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.codec.binary.Base64InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Base64InputStream_ESTest extends Base64InputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        int int0 = base64InputStream0.read();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 1, 1592);
        DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
        Base64InputStream base64InputStream0 = new Base64InputStream(dataInputStream0);
        boolean boolean0 = base64InputStream0.markSupported();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 48;
        byteArray0[2] = (byte) 48;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        int int0 = base64InputStream0.read();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = (byte) 117;
        byteArray0[1] = (byte) 117;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        Base64InputStream base64InputStream1 = new Base64InputStream(base64InputStream0, true);
        base64InputStream1.read();
        int int0 = base64InputStream1.read();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        Base64InputStream base64InputStream0 = new Base64InputStream(pipedInputStream0);
        base64InputStream0.read((byte[]) null, (-70), (-70));
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Base64InputStream base64InputStream0 = new Base64InputStream((InputStream) null);
        byte[] byteArray0 = new byte[4];
        base64InputStream0.read(byteArray0, (-821), (int) (byte) 0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        base64InputStream0.read(byteArray0, 8192, (int) (byte) (-70));
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        base64InputStream0.read(byteArray0, 7, 658);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 416);
        byte[] byteArray0 = new byte[1];
        Base64InputStream base64InputStream0 = new Base64InputStream(pipedInputStream0, true, 416, byteArray0);
        base64InputStream0.read(byteArray0, (int) (byte) 0, 4);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(1746);
        byte[] byteArray0 = new byte[0];
        Base64InputStream base64InputStream0 = new Base64InputStream(pipedInputStream0);
        int int0 = base64InputStream0.read(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0);
        base64InputStream0.read(byteArray0, 1, 1);
        byteArrayInputStream0.available();
    }
}
