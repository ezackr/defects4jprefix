/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 11:49:00 GMT 2024
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Base64_ESTest extends Base64_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64((-4099), byteArray0);
        int int0 = base64_0.readResults(byteArray0, (-4099), 1548);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64((-4099), byteArray0);
        int int0 = base64_0.readResults(byteArray0, (-4099), 1548);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64((-4099), byteArray0);
        int int0 = base64_0.readResults(byteArray0, (-4099), 1548);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        byte[] byteArray0 = new byte[2];
        BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
        assertEquals((byte) 0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Base64 base64_0 = new Base64(0);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        byte[] byteArray0 = new byte[25];
        byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
        assertEquals(38, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64(128, byteArray0);
        int int0 = base64_0.avail();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64(128, byteArray0);
        int int0 = base64_0.avail();
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        Base64 base64_0 = new Base64(0, byteArray0);
        base64_0.setInitialBuffer(byteArray0, 1609, 0);
        int int0 = base64_0.readResults(byteArray0, 0, 1609);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        Base64 base64_0 = new Base64(0, byteArray0);
        base64_0.setInitialBuffer(byteArray0, 1609, 0);
        int int0 = base64_0.readResults(byteArray0, 0, 1609);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
        Base64 base64_0 = new Base64(0, byteArray0);
        base64_0.setInitialBuffer(byteArray0, 1609, 0);
        int int0 = base64_0.readResults(byteArray0, 0, 1609);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test0713() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64((-4099), byteArray0);
        base64_0.decode(byteArray0, (-4099), (-4099));
        int int0 = base64_0.readResults(byteArray0, (-4099), 1548);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test0714() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        Base64 base64_0 = new Base64((-4099), byteArray0);
        base64_0.decode(byteArray0, (-4099), (-4099));
        int int0 = base64_0.readResults(byteArray0, (-4099), 1548);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test0815() throws Throwable {
        byte[] byteArray0 = new byte[0];
        Base64 base64_0 = new Base64((-961), byteArray0);
        base64_0.encode(byteArray0, (-961), (-961));
        base64_0.encode(byteArray0, (-961), (-961));
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test0916() throws Throwable {
        boolean boolean0 = Base64.isBase64((byte) (-109));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1017() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) 124;
        Base64 base64_0 = new Base64(1627, byteArray0);
        assertFalse(base64_0.isUrlSafe());
    }

    @Test(timeout = 4000)
    public void test1118() throws Throwable {
        byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1219() throws Throwable {
        byte[] byteArray0 = new byte[14];
        byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true);
        assertEquals(21, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1320() throws Throwable {
        byte[] byteArray0 = Base64.decodeBase64((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1421() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = Base64.decodeBase64(byteArray0);
        assertSame(byteArray1, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1522() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[1] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(7, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1523() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[1] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 9, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[1] = (byte) 9;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test1625() throws Throwable {
        byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertNotSame(byteArray1, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1626() throws Throwable {
        byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(2, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1727() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[2] = (byte) 32;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1728() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[2] = (byte) 32;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertEquals(7, byteArray1.length);
    }

    @Test(timeout = 4000)
    public void test1729() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[2] = (byte) 32;
        byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test1830() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 90;
        byteArray0[1] = (byte) 90;
        byteArray0[2] = (byte) 9;
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1931() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = (byte) 32;
        boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2032() throws Throwable {
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
    public void test2133() throws Throwable {
        BigInteger bigInteger0 = BigInteger.TEN;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        assertArrayEquals(new byte[] { (byte) 67, (byte) 103, (byte) 61, (byte) 61 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test2134() throws Throwable {
        BigInteger bigInteger0 = BigInteger.TEN;
        byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
        assertEquals(4, byteArray0.length);
    }
}
