/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 03:37:39 GMT 2023
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodecInputStream;
import org.junit.runner.RunWith;

public class BaseNCodecInputStreamTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        byte[] byteArray0 = new byte[2];
        byte[] byteArray1 = new byte[0];
        Base64 base64_0 = new Base64((-734), byteArray0, false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base64_0, false);
        baseNCodecInputStream0.read(byteArray1, 0, 3440);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) 0);
        Base32 base32_0 = new Base32(false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, false);
        int int0 = baseNCodecInputStream0.read(byteArray0, 0, (int) (byte) 1);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Base64 base64_0 = new Base64((-3173));
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base64_0, true);
        baseNCodecInputStream0.read();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        Base64 base64_0 = new Base64(false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(mockFileInputStream0, base64_0, false);
        baseNCodecInputStream0.read();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Base32 base32_0 = new Base32();
        byte[] byteArray0 = new byte[3];
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
        int int0 = baseNCodecInputStream0.read(byteArray0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base32 base32_0 = new Base32(0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, false);
        int int0 = baseNCodecInputStream0.read();
        byteArrayInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base32 base32_0 = new Base32(0);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, false);
        int int0 = baseNCodecInputStream0.read();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Base32 base32_0 = new Base32(false);
        base32_0.ensureBufferSize(68);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
        int int0 = baseNCodecInputStream0.read();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 551);
        Base64 base64_0 = new Base64(551);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(bufferedInputStream0, base64_0, true);
        byte[] byteArray0 = new byte[7];
        int int0 = baseNCodecInputStream0.read(byteArray0, (int) (byte) 0, (int) (byte) 0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, (byte) 0);
        Base64 base64_0 = new Base64(2543);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, false);
        baseNCodecInputStream0.read(byteArray0, 2543, 757);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Base32 base32_0 = new Base32(false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
        byte[] byteArray0 = new byte[0];
        baseNCodecInputStream0.read(byteArray0, 76, (-353));
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base32 base32_0 = new Base32((byte) (-1), byteArray0, false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, true);
        baseNCodecInputStream0.read(byteArray0, (-823), (int) (byte) (-1));
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        Base64 base64_0 = new Base64();
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base64_0, true);
        baseNCodecInputStream0.read((byte[]) null, (-319), 76);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base32 base32_0 = new Base32((byte) (-1), byteArray0, false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, true);
        int int0 = baseNCodecInputStream0.read();
        byteArrayInputStream0.available();
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Base32 base32_0 = new Base32((byte) (-1), byteArray0, false);
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, true);
        int int0 = baseNCodecInputStream0.read();
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Base64 base64_0 = new Base64((-195));
        BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base64_0, true);
        boolean boolean0 = baseNCodecInputStream0.markSupported();
    }
}
