/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 03:24:52 GMT 2023
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.codec.binary.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Base64_ESTest extends Base64_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) 127;
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) 61;
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(0, byteArray0, true);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000\u0000=\u0000\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        String string0 = Base64.encodeBase64URLSafeString(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        String string0 = Base64.encodeBase64String((byte[]) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        byte[] byteArray1 = base64_0.decode("Parameter supplied to Base64 encode is not a byte[]");
        // Undeclared exception!
        try {
            Base64.encodeBase64URLSafe(byteArray1);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.encodeBase64String(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.encodeBase64Chunked(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, false, false);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, true);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        byte[] byteArray0 = new byte[7];
        Base64 base64_0 = new Base64((byte) (-100), byteArray0);
        try {
            base64_0.encode((Object) "vQ-VN{ ujU/");
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Parameter supplied to Base64 encode is not a byte[]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        // Undeclared exception!
        try {
            Base64.decodeBase64("'RAcJ");
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        BigInteger bigInteger0 = BigInteger.ZERO;
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
    public void test1415() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(false);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64((-1));
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 3;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertNotSame(byteArray1, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 3;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(1, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 3;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 3 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        byte[] byteArray0 = new byte[9];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, false, true, 1509);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) 0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) (-100));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        byte[] byteArray0 = new byte[1];
        Base64 base64_0 = new Base64((-1142), byteArray0, true);
        base64_0.decode(byteArray0, (int) (byte) 0, 1);
        // Undeclared exception!
        try {
            base64_0.readResults((byte[]) null, (-209), (-1142));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        Base64 base64_0 = new Base64(0, byteArray0, false);
        boolean boolean0 = base64_0.isUrlSafe();
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        Base64 base64_0 = new Base64(0, byteArray0, false);
        boolean boolean0 = base64_0.isUrlSafe();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(87, (byte[]) null, true);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.decodeInteger(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
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

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        BigInteger bigInteger0 = BigInteger.TEN;
        // Undeclared exception!
        try {
            Base64.encodeInteger(bigInteger0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        byte[] byteArray0 = new byte[1];
        Base64 base64_0 = new Base64((-1142), byteArray0, true);
        String string0 = base64_0.encodeToString(byteArray0);
        assertEquals("AA", string0);
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        String string0 = base64_0.encodeToString(byteArray0);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        String string0 = base64_0.encodeToString(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[6] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test2935() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[6] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 9, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test2936() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[6] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(7, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test3037() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, true, 0);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3138() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        base64_0.decode((Object) "");
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test3239() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) 123);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3340() throws Throwable {
        byte[] byteArray0 = new byte[4];
        // Undeclared exception!
        try {
            Base64.encodeBase64URLSafeString(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-3431), byteArray0);
        base64_0.decode((Object) "]");
        base64_0.decode(byteArray0, (-2294), 0);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) (-1);
        Base64 base64_0 = new Base64(1, byteArray0);
        byte[] byteArray1 = base64_0.encode(byteArray0);
        assertArrayEquals(new byte[] { (byte) 47, (byte) 119, (byte) 65, (byte) 65 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test3543() throws Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) (-1);
        Base64 base64_0 = new Base64(1, byteArray0);
        byte[] byteArray1 = base64_0.encode(byteArray0);
        assertEquals(4, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test3644() throws Throwable {
        byte[] byteArray0 = new byte[4];
        Base64 base64_0 = new Base64(45, byteArray0);
        // Undeclared exception!
        try {
            base64_0.encode(byteArray0, (int) (byte) 0, 40);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 4
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3745() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        base64_0.encode(byteArray0, (-1), (-1790));
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test3846() throws Throwable {
        byte[] byteArray0 = new byte[1];
        Base64 base64_0 = new Base64((-1142), byteArray0, true);
        base64_0.setInitialBuffer((byte[]) null, (-209), 0);
        assertTrue(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test3947() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-1), byteArray0);
        byte[] byteArray1 = base64_0.decode("Parameter supplied to Base64 encode is not a byte[]");
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray1);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4048() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64((-1918), (byte[]) null);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4149() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64();
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000A]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4250() throws Throwable {
        byte[] byteArray0 = new byte[0];
        String string0 = Base64.encodeBase64String(byteArray0);
        assertEquals("", string0);
    }
}
