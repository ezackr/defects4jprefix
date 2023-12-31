/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 31 04:25:57 GMT 2023
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.codec.binary.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Base64_ESTest extends Base64_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        BigInteger bigInteger0 = new BigInteger(1135, 818, mockRandom0);
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64(835);
        base64_0.decode(byteArray0, 2, 773);
        int int0 = base64_0.readResults(byteArray0, 0, 94);
        assertEquals(192, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        BigInteger bigInteger0 = new BigInteger(1135, 818, mockRandom0);
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64(835);
        base64_0.decode(byteArray0, 2, 773);
        int int0 = base64_0.readResults(byteArray0, 0, 94);
        assertEquals(94, int0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("]");
        BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
        byte[] byteArray1 = Base64.toIntegerBytes(bigInteger0);
        assertEquals(0, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("]");
        BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
        byte[] byteArray1 = Base64.toIntegerBytes(bigInteger0);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Base64 base64_0 = new Base64(true);
        byte[] byteArray0 = new byte[0];
        String string0 = base64_0.encodeToString(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("org.apache.commons.codec.EncoderException");
        String string0 = Base64.encodeBase64String(byteArray0);
        assertEquals("orgapachecommonscodecEncoderExceptio", string0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
        String string0 = Base64.encodeBase64URLSafeString(byteArray0);
        assertEquals("AAo", string0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64URLSafe((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("org.apache.commons.codec.EncoderException");
        byte[] byteArray1 = Base64.encodeBase64(byteArray0);
        assertEquals(36, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
        boolean boolean0 = Base64.isArrayByteBase64(byteArray1);
        assertArrayEquals(new byte[] { (byte) 65, (byte) 65, (byte) 65, (byte) 61, (byte) 0, (byte) 10 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
        boolean boolean0 = Base64.isArrayByteBase64(byteArray1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        Base64 base64_0 = new Base64(1939, (byte[]) null, true);
        assertTrue(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("@mitSsw0vd");
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(0, byteArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\uFFFD+R\uFFFD\r/]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        Base64 base64_0 = new Base64(false);
        boolean boolean0 = base64_0.isUrlSafe();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        Base64 base64_0 = new Base64(true);
        boolean boolean0 = base64_0.isUrlSafe();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        Base64 base64_0 = new Base64();
        boolean boolean0 = base64_0.hasData();
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        Base64 base64_0 = new Base64();
        boolean boolean0 = base64_0.hasData();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("]");
        Base64 base64_0 = new Base64(0);
        base64_0.encode(byteArray0, 0, (-1892));
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("]");
        Base64 base64_0 = new Base64(0);
        base64_0.encode(byteArray0, 0, (-1892));
        boolean boolean0 = base64_0.hasData();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        Base64 base64_0 = new Base64();
        int int0 = base64_0.avail();
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        Base64 base64_0 = new Base64();
        int int0 = base64_0.avail();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        byte[] byteArray0 = new byte[6];
        Base64 base64_0 = new Base64((byte) 4);
        int int0 = base64_0.readResults(byteArray0, 13, (byte) 1);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1522() throws Throwable {
        byte[] byteArray0 = new byte[6];
        Base64 base64_0 = new Base64((byte) 4);
        int int0 = base64_0.readResults(byteArray0, 13, (byte) 1);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test1623() throws Throwable {
        byte[] byteArray0 = new byte[6];
        Base64 base64_0 = new Base64((byte) 4);
        byte[] byteArray1 = base64_0.encode(byteArray0);
        assertEquals(12, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1624() throws Throwable {
        byte[] byteArray0 = new byte[6];
        Base64 base64_0 = new Base64((byte) 4);
        byte[] byteArray1 = base64_0.encode(byteArray0);
        int int0 = base64_0.readResults(byteArray0, 13, (byte) 1);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test2025() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("org.apache.commons.codec.EncoderException");
        Base64 base64_0 = new Base64();
        base64_0.decode("org.apache.commons.codec.EncoderException");
        base64_0.encode(byteArray0, (-2840), (-2840));
        assertEquals(27, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64("org.apache.commons.codec.EncoderException");
        Base64 base64_0 = new Base64();
        base64_0.decode("org.apache.commons.codec.EncoderException");
        base64_0.encode(byteArray0, (-2840), (-2840));
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true);
        assertArrayEquals(new byte[] { (byte) 65, (byte) 65, (byte) 0, (byte) 10 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) 126);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ONE;
        Base64 base64_0 = new Base64(8168);
        try {
            base64_0.decode((Object) bigInteger0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Parameter supplied to Base64 decode is not a byte[] or a String
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3130() throws Throwable {
        byte[] byteArray0 = new byte[2];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, true, true, (int) (byte) (-92));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Input array too big, the output array would be bigger (6) than the specified maxium size of -92
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3331() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 9, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(4, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(2, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertNotSame(byteArray1, byteArray0);
    }

    @Test(timeout = 4000)
    public void test3536() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[5] = (byte) 32;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(5, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test3637() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 9;
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3738() throws Throwable {
        Base64 base64_0 = new Base64();
        Object object0 = new Object();
        try {
            base64_0.encode(object0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Parameter supplied to Base64 encode is not a byte[]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3839() throws Throwable {
        Base64 base64_0 = new Base64(2);
        byte[] byteArray0 = base64_0.encode((byte[]) null);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        Base64 base64_0 = new Base64(2);
        byte[] byteArray0 = base64_0.encode((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        BigInteger bigInteger0 = BigInteger.probablePrime(334, mockRandom0);
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
        assertEquals(78, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test4042() throws Throwable {
        // Undeclared exception!
        try {
            Base64.encodeInteger((BigInteger) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // encodeInteger called with null parameter
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }
}
