/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 08:38:25 GMT 2023
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TarUtils_ESTest extends TarUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-15);
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray0, 1407, 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1405
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 116;
        byteArray0[1] = (byte) (-1);
        // Undeclared exception!
        try {
            TarUtils.parseOctal(byteArray0, 0, (byte) 2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte -1 at offset 1 in 't\uFFFD' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[8] = (byte) (-86);
        // Undeclared exception!
        try {
            TarUtils.parseOctal(byteArray0, 8, 5396);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 5403
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        byte[] byteArray0 = new byte[4];
        // Undeclared exception!
        try {
            TarUtils.formatOctalBytes(0L, byteArray0, (byte) 3, (byte) 48);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 48
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        byte[] byteArray0 = new byte[5];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalBytes(0L, byteArray0, (byte) 32, (byte) 3);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 33
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
        int int0 = TarUtils.formatNameBytes("AEp]<", byteArray0, (int) (byte) 0, (int) (byte) 0, zipEncoding0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
        int int0 = TarUtils.formatNameBytes("AEp]<", byteArray0, (int) (byte) 0, (int) (byte) 0, zipEncoding0);
        assertArrayEquals(new byte[] { (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        byte[] byteArray0 = new byte[3];
        int int0 = TarUtils.formatNameBytes("IBM850", byteArray0, (int) (byte) 0, 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        byte[] byteArray0 = new byte[1];
        int int0 = TarUtils.formatNameBytes(" is too large for ", byteArray0, (int) (byte) 1, 0);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        byte[] byteArray0 = new byte[7];
        int int0 = TarUtils.formatNameBytes("Jx0DNRLj<alwcB8)!l", byteArray0, 0, (int) (byte) (-7));
        assertEquals((-7), int0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[1] = (byte) (-2);
        long long0 = TarUtils.computeCheckSum(byteArray0);
        assertEquals(254L, long0);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.verifyCheckSum((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary((byte[]) null, (-1010), 2270);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, 846, 846);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 846
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.parseOctal((byte[]) null, 9557, 9557);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
        // Undeclared exception!
        try {
            TarUtils.parseName((byte[]) null, (-4302), 253, zipEncoding0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        byte[] byteArray0 = new byte[4];
        // Undeclared exception!
        try {
            TarUtils.parseName(byteArray0, (-590), 9);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -582
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.parseBoolean((byte[]) null, (-49));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        byte[] byteArray0 = new byte[8];
        // Undeclared exception!
        try {
            TarUtils.parseBoolean(byteArray0, 55);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 55
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatUnsignedOctalString((-1L), (byte[]) null, 97, 156);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatOctalBytes(0L, (byte[]) null, 3293, 3293);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        byte[] byteArray0 = new byte[7];
        // Undeclared exception!
        try {
            TarUtils.formatOctalBytes(929L, byteArray0, 225, (-3730));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 929=1641 will not fit in octal number buffer of length -3732
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes("\"jpGIED/po-SHzQnU", byteArray0, 0, (int) (byte) 106, (ZipEncoding) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes("", byteArray0, 1846, 566);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalBytes(0L, (byte[]) null, 9, 2);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        byte[] byteArray0 = new byte[5];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalBytes((-217L), byteArray0, 170, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -217=1777777777777777777447 will not fit in octal number buffer of length -1
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatCheckSumOctalBytes(0L, (byte[]) null, 789, 789);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            TarUtils.formatCheckSumOctalBytes((-5965L), byteArray0, (byte) 0, 787);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 784
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.computeCheckSum((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes((-1259L), byteArray0, 68, (-1715));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        byte[] byteArray0 = new byte[5];
        // Undeclared exception!
        try {
            TarUtils.formatUnsignedOctalString((-570L), byteArray0, (byte) (-63), (byte) 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -570=1777777777777777776706 will not fit in octal number buffer of length 0
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            TarUtils.formatUnsignedOctalString(0L, byteArray0, 4572, 913);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 5484
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[2] = (byte) 3;
        ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
        String string0 = TarUtils.parseName(byteArray0, 0, (int) (byte) 3, zipEncoding0);
        assertEquals("\u0000\u0000\u0003", string0);
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        String string0 = TarUtils.parseName(byteArray0, (-1173), (-1173), zipEncoding0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
        // Undeclared exception!
        try {
            TarUtils.parseName(byteArray0, (int) (byte) (-101), 226, zipEncoding0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 124
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3536() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            TarUtils.parseOctal(byteArray0, (byte) 0, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Length 0 must be at least 2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3637() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = (byte) 97;
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3738() throws Throwable {
        byte[] byteArray0 = new byte[8];
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3839() throws Throwable {
        byte[] byteArray0 = new byte[8];
        long long0 = TarUtils.computeCheckSum(byteArray0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test3940() throws Throwable {
        byte[] byteArray0 = new byte[3];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes((-4136L), byteArray0, 0, (byte) (-63));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value -4136 is too large for -63 byte field.
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4041() throws Throwable {
        byte[] byteArray0 = new byte[5];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes((-646L), byteArray0, 2, (byte) 80);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test4142() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes(8589934591L, (byte[]) null, 1, 1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 8589934591=77777777777 will not fit in octal number buffer of length 0
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4243() throws Throwable {
        byte[] byteArray0 = new byte[7];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes((-1510L), byteArray0, (byte) 26, 3);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 28
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4344() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[4] = (byte) (-94);
        String string0 = TarUtils.parseName(byteArray0, (int) (byte) 0, 8);
        assertEquals("\u0000\u0000\u0000\u0000\uFFFD", string0);
    }

    @Test(timeout = 4000)
    public void test4445() throws Throwable {
        byte[] byteArray0 = new byte[8];
        String string0 = TarUtils.parseName(byteArray0, (int) (byte) 0, 8);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test4546() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[1] = (byte) 1;
        boolean boolean0 = TarUtils.parseBoolean(byteArray0, (byte) 1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4647() throws Throwable {
        byte[] byteArray0 = new byte[5];
        boolean boolean0 = TarUtils.parseBoolean(byteArray0, 0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4748() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-5);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, 0, (byte) (-5));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4849() throws Throwable {
        byte[] byteArray0 = new byte[9];
        TarUtils.formatUnsignedOctalString(540L, byteArray0, 0, 9);
        // Undeclared exception!
        try {
            TarUtils.parseOctal(byteArray0, 0, (byte) 2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 48 at offset 1 in '00' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4950() throws Throwable {
        byte[] byteArray0 = new byte[4];
        long long0 = TarUtils.parseOctal(byteArray0, (byte) 0, (byte) 67);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5051() throws Throwable {
        byte[] byteArray0 = new byte[1];
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, 0, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Length 0 must be at least 2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5152() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        int int0 = TarUtils.formatNameBytes("dv@VnX%", byteArray0, 0, (-668), zipEncoding0);
        assertEquals((-668), int0);
    }

    @Test(timeout = 4000)
    public void test5153() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        int int0 = TarUtils.formatNameBytes("dv@VnX%", byteArray0, 0, (-668), zipEncoding0);
        assertArrayEquals(new byte[] { (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test5254() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes("", byteArray0, 227, (int) (byte) 0, zipEncoding0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test5355() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 116;
        // Undeclared exception!
        try {
            TarUtils.parseOctal(byteArray0, 0, (byte) 2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 116 at offset 0 in 't{NUL}' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5456() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            TarUtils.formatCheckSumOctalBytes((-1260L), byteArray0, 55, (-3132));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -1260=1777777777777777775424 will not fit in octal number buffer of length -3134
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5557() throws Throwable {
        byte[] byteArray0 = new byte[7];
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes((String) null, byteArray0, (int) (byte) 0, (int) (byte) (-128));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }
}
