/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 13:38:49 GMT 2024
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TarUtils_ESTest extends TarUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[3];
        int int0 = TarUtils.formatNameBytes("D/?&UUQlTU=", byteArray0, (int) (byte) 0, (-874));
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        byte[] byteArray0 = new byte[3];
        int int0 = TarUtils.formatNameBytes("D/?&UUQlTU=", byteArray0, (int) (byte) 0, (-874));
        assertEquals((-874), int0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatCheckSumOctalBytes(9492, (byte[]) null, 9492, 9492);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        byte[] byteArray0 = new byte[0];
        // Undeclared exception!
        try {
            TarUtils.formatOctalBytes(7L, byteArray0, 0, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 7=7 will not fit in octal number buffer of length -2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        int int0 = TarUtils.formatNameBytes("^zjzmK(Ki", byteArray0, (int) (byte) 0, (int) (byte) 0, zipEncoding0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        int int0 = TarUtils.formatNameBytes("^zjzmK(Ki", byteArray0, (int) (byte) 0, (int) (byte) 0, zipEncoding0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        byte[] byteArray0 = new byte[36];
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Length 0 must be at least 2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        byte[] byteArray0 = new byte[36];
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, (byte) 2);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        byte[] byteArray0 = new byte[20];
        byteArray0[3] = (byte) 32;
        byteArray0[4] = (byte) 32;
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, 3, 2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 32 at offset 2 in '  ' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        byte[] byteArray0 = new byte[27];
        byteArray0[2] = (byte) 2;
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, (byte) 2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 2 at offset 0 in '\u0002{NUL}' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        byte[] byteArray0 = new byte[6];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte) 2, byteArray0, (byte) 2, (byte) 2);
        assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        byte[] byteArray0 = new byte[6];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte) 2, byteArray0, (byte) 2, (byte) 2);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, 4);
        assertEquals(2L, long0);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        byte[] byteArray0 = new byte[6];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte) 2, byteArray0, (byte) 2, (byte) 2);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, 4);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 50, (byte) 32, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        byte[] byteArray0 = new byte[31];
        byteArray0[2] = (byte) 106;
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, (byte) 2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 106 at offset 0 in 'j{NUL}' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        byte[] byteArray0 = new byte[152];
        TarUtils.formatLongOctalOrBinaryBytes((-1585L), byteArray0, 13, 13);
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, 13, 26);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // At offset 13, 26 byte binary number exceeds maximum signed long value
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        byte[] byteArray0 = new byte[13];
        byteArray0[0] = (byte) (-14);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) (-14));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        byte[] byteArray0 = new byte[15];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((-26L), byteArray0, (byte) 2, (byte) 2);
        assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test1217() throws Throwable {
        byte[] byteArray0 = new byte[15];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((-26L), byteArray0, (byte) 2, (byte) 2);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, 4);
        assertEquals((-1703936L), long0);
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        byte[] byteArray0 = new byte[31];
        byteArray0[2] = (byte) (-122);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 2, 17);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        byte[] byteArray0 = new byte[174];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((-5018L), byteArray0, 6, 6);
        assertEquals(12, int0);
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        byte[] byteArray0 = new byte[174];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((-5018L), byteArray0, 6, 6);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, 6, 12);
        assertEquals((-1412441433134071808L), long0);
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        byte[] byteArray0 = new byte[7];
        boolean boolean0 = TarUtils.parseBoolean(byteArray0, 6);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[1] = (byte) 1;
        boolean boolean0 = TarUtils.parseBoolean(byteArray0, (byte) 1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        byte[] byteArray0 = new byte[8];
        String string0 = TarUtils.parseName(byteArray0, (int) (byte) 2, (int) (byte) 2);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = (byte) 2;
        String string0 = TarUtils.parseName(byteArray0, 0, (int) (byte) 2);
        assertEquals("\u0002", string0);
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        byte[] byteArray0 = new byte[8];
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes("R7{L] |a", byteArray0, (int) (byte) 0, (int) (byte) 76);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 8
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        byte[] byteArray0 = new byte[7];
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes((byte) 0, byteArray0, (byte) 0, (byte) 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        byte[] byteArray0 = new byte[67];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes(8589934591L, byteArray0, 8, 8);
        assertEquals(16, int0);
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, (byte[]) null, (-1049), (-1049));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 281474976710656 is too large for -1049 byte field.
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2329() throws Throwable {
        byte[] byteArray0 = new byte[3];
        long long0 = TarUtils.computeCheckSum(byteArray0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test2430() throws Throwable {
        byte[] byteArray0 = new byte[170];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((-1172L), byteArray0, 9, 143);
        assertEquals(152, int0);
    }

    @Test(timeout = 4000)
    public void test2431() throws Throwable {
        byte[] byteArray0 = new byte[170];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((-1172L), byteArray0, 9, 143);
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2532() throws Throwable {
        byte[] byteArray0 = new byte[170];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes(27, byteArray0, 143, 27);
        assertEquals(170, int0);
    }

    @Test(timeout = 4000)
    public void test2533() throws Throwable {
        byte[] byteArray0 = new byte[170];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes(27, byteArray0, 143, 27);
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2634() throws Throwable {
        byte[] byteArray0 = new byte[5];
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2735() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 25;
        byteArray0[1] = (byte) (-25);
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
        assertTrue(boolean0);
    }
}
