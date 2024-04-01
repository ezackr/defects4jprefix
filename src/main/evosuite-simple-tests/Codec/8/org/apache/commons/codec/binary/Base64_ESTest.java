/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 03:30:01 GMT 2023
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Base64_ESTest extends Base64_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        BigInteger bigInteger0 = BigInteger.probablePrime(64, mockRandom0);
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        assertEquals(8, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        BigInteger bigInteger0 = BigInteger.probablePrime(64, mockRandom0);
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        assertArrayEquals(new byte[] { (byte) (-128), (byte) 0, (byte) 0, (byte) 56, (byte) 0, (byte) 0, (byte) 0, (byte) 57 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        MockRandom mockRandom0 = new MockRandom((byte) (-1));
        BigInteger bigInteger0 = new BigInteger(1858, mockRandom0);
        // Undeclared exception!
        try {
            Base64.encodeInteger(bigInteger0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(997);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[2];
        // Undeclared exception!
        try {
            Base64.encodeBase64URLSafe(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(1371);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64();
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(true);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        String string0 = Base64.encodeBase64URLSafeString((byte[]) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64URLSafe((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        String string0 = Base64.encodeBase64String((byte[]) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        String string0 = Base64.encodeBase64String(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64Chunked((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, true);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null, false);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = Base64.encodeBase64(byteArray0, true);
        assertEquals(0, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = Base64.encodeBase64(byteArray0);
        assertEquals(0, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(0, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertNotSame(byteArray1, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[1] = (byte) 105;
        byteArray0[2] = (byte) 73;
        byteArray0[3] = (byte) 77;
        // Undeclared exception!
        try {
            Base64.decodeInteger(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 88;
        byteArray0[4] = (byte) 74;
        // Undeclared exception!
        try {
            Base64.decodeInteger(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        // Undeclared exception!
        try {
            Base64.decodeBase64((byte[]) null);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.decodeBase64(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        // Undeclared exception!
        try {
            Base64.decodeBase64("");
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(121);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        // Undeclared exception!
        try {
            Base64.toIntegerBytes((BigInteger) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.encodeBase64Chunked(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        // Undeclared exception!
        try {
            Base64.isArrayByteBase64((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64(6, byteArray0, false);
        byte[] byteArray1 = new byte[2];
        // Undeclared exception!
        try {
            base64_0.encodeToString(byteArray1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(0, (byte[]) null);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64(0, byteArray0, false);
        BigInteger bigInteger0 = BigInteger.TEN;
        // Undeclared exception!
        try {
            Base64.encodeInteger(bigInteger0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3033() throws Throwable {
        // Undeclared exception!
        try {
            Base64.discardWhitespace((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(395, (byte[]) null);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.decodeInteger(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3336() throws Throwable {
        byte[] byteArray0 = new byte[7];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, false, true, (int) (byte) 14);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3437() throws Throwable {
        byte[] byteArray0 = new byte[6];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, true, false, (int) (byte) 114);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test3538() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, 15);
        assertEquals(0, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test3639() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) 116);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) 0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) (-1));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) 127);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(43);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(32, (byte[]) null, false);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(false);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(87, (byte[]) null, true);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[1] = (byte) 55;
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(43, byteArray0, false);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u00007\u0000\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, true);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
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
    public void test4750() throws Throwable {
        byte[] byteArray0 = new byte[1];
        Base64 base64_0 = new Base64(478, byteArray0);
        Object object0 = base64_0.decode((Object) ": ");
        Object object1 = base64_0.encode(object0);
        assertSame(object1, object0);
    }

    @Test(timeout = 4000)
    public void test4751() throws Throwable {
        byte[] byteArray0 = new byte[1];
        Base64 base64_0 = new Base64(478, byteArray0);
        Object object0 = base64_0.decode((Object) ": ");
        Object object1 = base64_0.encode(object0);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test4852() throws Throwable {
        // Undeclared exception!
        try {
            Base64.decodeBase64("'RCAcJ");
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test4953() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = (byte) 85;
        byteArray0[1] = (byte) 100;
        byteArray0[2] = (byte) 9;
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5054() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[2] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(3, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test5055() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[2] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 9, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test5056() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[2] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test5157() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0, false, true, (-5091));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Input array too big, the output array would be bigger (6) than the specified maxium size of -5091
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test5258() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, true, 0);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test5359() throws Throwable {
        // Undeclared exception!
        try {
            Base64.decodeBase64((String) null);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test5460() throws Throwable {
        byte[] byteArray0 = new byte[7];
        Base64 base64_0 = new Base64((byte) 4, byteArray0, false);
        Object object0 = new Object();
        try {
            base64_0.decode(object0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Parameter supplied to Base64 decode is not a byte[] or a String
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test5561() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[3] = (byte) 123;
        Base64 base64_0 = new Base64((byte) 4, byteArray0, false);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test5662() throws Throwable {
        byte[] byteArray0 = new byte[8];
        // Undeclared exception!
        try {
            Base64.encodeBase64(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test5763() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 71;
        byteArray0[4] = (byte) 52;
        // Undeclared exception!
        try {
            Base64.decodeBase64(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test5864() throws Throwable {
        byte[] byteArray0 = new byte[7];
        Base64 base64_0 = new Base64((byte) 4, byteArray0, false);
        byte[] byteArray1 = base64_0.encode(byteArray0);
        String string0 = base64_0.encodeToString(byteArray1);
        assertEquals("QUFB\u0000\u0000\u0000\u0000\u0000\u0000\u0000QQAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000AAAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000AABB\u0000\u0000\u0000\u0000\u0000\u0000\u0000QUFB\u0000\u0000\u0000\u0000\u0000\u0000\u0000AAAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000AAAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000AEFB\u0000\u0000\u0000\u0000\u0000\u0000\u0000PT0A\u0000\u0000\u0000\u0000\u0000\u0000\u0000AAAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000AAAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
    }

    @Test(timeout = 4000)
    public void test5965() throws Throwable {
        // Undeclared exception!
        try {
            Base64.decodeBase64("lineSeperator must not contain base64 characters: [");
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test6066() throws Throwable {
        byte[] byteArray0 = new byte[1];
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(true);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test6167() throws Throwable {
        byte[] byteArray0 = new byte[7];
        Base64 base64_0 = new Base64((byte) 4, byteArray0, false);
        base64_0.setInitialBuffer(byteArray0, (-1388), (-1812));
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test6268() throws Throwable {
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64((-1));
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test6369() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[5] = (byte) 68;
        Base64 base64_0 = null;
        try {
            base64_0 = new Base64(1, byteArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [\u0000\u0000\u0000\u0000\u0000D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test6470() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            Base64.encodeBase64URLSafeString(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test6571() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            Base64.encodeBase64String(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }

    @Test(timeout = 4000)
    public void test6672() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            Base64.decodeInteger(byteArray0);
            //  fail("Expecting exception: IllegalArgumentException");
            // Unstable assertion
        } catch (IllegalArgumentException e) {
            //
            // lineSeperator must not contain base64 characters: [D\u0000]
            //
            verifyException("org.apache.commons.codec.binary.Base64", e);
        }
    }
}
