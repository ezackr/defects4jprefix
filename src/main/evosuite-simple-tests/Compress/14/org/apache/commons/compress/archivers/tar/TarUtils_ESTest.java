/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 08:07:21 GMT 2023
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TarUtils_ESTest extends TarUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0010() throws Throwable {
        byte[] byteArray0 = new byte[1];
        int int0 = 0;
        int int1 = 3872;
        TarUtils.formatLongOctalOrBinaryBytes(36028797018963933L, byteArray0, 0, 0);
        // Undeclared exception!
        try {
            TarUtils.computeCheckSum(byteArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 36028797018963933 is too large for 0 byte field.
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0031() throws Throwable {
        byte[] byteArray0 = new byte[20];
        int int0 = 8;
        TarUtils.formatLongOctalOrBinaryBytes(36028797018963933L, byteArray0, 8, 8);
        int int1 = 0;
        TarUtils.formatNameBytes("Jr", byteArray0, 0, 8);
        TarUtils.formatLongOctalOrBinaryBytes(16, byteArray0, 8, 8);
        int int2 = 1396;
        TarUtils.formatLongOctalOrBinaryBytes((-3658L), byteArray0, 1396, 16);
        int int3 = 0;
        int int4 = (-620);
        TarUtils.parseOctal(byteArray0, int3, int4);
        // Undeclared exception!
        try {
            TarUtils.formatCheckSumOctalBytes(int2, byteArray0, int1, int0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test0072() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[1] = (byte) 1;
        TarUtils.parseBoolean(byteArray0, (byte) 1);
        byte[] byteArray1 = new byte[5];
        byteArray1[2] = (byte) 77;
        byteArray1[3] = (byte) 1;
        byteArray1[4] = (byte) 1;
        TarUtils.parseOctal(byteArray1, (byte) 0, (byte) 0);
        int int0 = 737;
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalBytes(byteArray0[1], byteArray1, int0, byteArray1[4]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Length 0 must be at least 2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0123() throws Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[2] = (byte) 4;
        byteArray0[6] = (byte) 4;
        TarUtils.parseOctal(byteArray0, (byte) 0, (byte) 4);
        long long0 = 414L;
        String string0 = "";
        int int0 = 674;
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes(string0, byteArray0, int0, byteArray0[0]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 0 at offset 0 in '{NUL}{NUL}\u0004{NUL}' len=4
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0164() throws Throwable {
        byte[] byteArray0 = new byte[17];
        byte byte0 = (byte) (-55);
        byteArray0[0] = (byte) (-55);
        byte byte1 = (byte) 56;
        byteArray0[1] = (byte) 56;
        byteArray0[0] = (byte) 56;
        byteArray0[3] = (byte) (-26);
        int int0 = 1;
        int int1 = 2;
        TarUtils.parseOctal(byteArray0, 1, 2);
        // Undeclared exception!
        try {
            TarUtils.parseOctalOrBinary(byteArray0, byte0, byteArray0[2]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 56 at offset 0 in '8{NUL}' len=2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0235() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-1);
        int int0 = 1219;
        TarUtils.formatCheckSumOctalBytes((-3524L), byteArray0, (byte) (-1), 1219);
        int int1 = (-1087);
        // Undeclared exception!
        try {
            TarUtils.parseOctal(byteArray0, int1, int0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1215
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0256() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = 2028;
        // Undeclared exception!
        try {
            TarUtils.parseBoolean((byte[]) null, 2028);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0317() throws Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) (-103);
        byteArray0[1] = (byte) (-109);
        byteArray0[2] = (byte) 4;
        int int0 = 32;
        TarUtils.parseName(byteArray0, 32, 0);
        TarUtils.computeCheckSum(byteArray0);
        int int1 = TarUtils.formatLongOctalBytes((byte) 4, byteArray0, (-1972), 0);
        int int2 = 0;
        int int3 = TarUtils.formatOctalBytes(int1, byteArray0, int2, int0);
        int int4 = 2659;
        int int5 = 55;
        // Undeclared exception!
        try {
            TarUtils.formatUnsignedOctalString(int3, byteArray0, int4, int5);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 4=4 will not fit in octal number buffer of length -1
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0398() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byte byte0 = (byte) 1;
        byteArray0[0] = (byte) 1;
        int int0 = 32;
        // Undeclared exception!
        try {
            TarUtils.parseBoolean(byteArray0, 32);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 32
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0519() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byte byte0 = (byte) 0;
        byteArray0[0] = (byte) 0;
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
    public void test05310() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byte byte0 = (byte) 56;
        byteArray0[0] = (byte) 56;
        byte byte1 = (byte) 25;
        byteArray0[1] = (byte) 25;
        byte byte2 = (byte) 17;
        byteArray0[2] = (byte) 17;
        byteArray0[3] = (byte) (-6);
        TarUtils.computeCheckSum(byteArray0);
        int int0 = 1;
        TarUtils.parseOctalOrBinary(byteArray0, 1, (byte) (-6));
        // Undeclared exception!
        try {
            TarUtils.computeCheckSum(byteArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Length -6 must be at least 2
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test06011() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = (-1156);
        int int1 = 1005;
        // Undeclared exception!
        try {
            TarUtils.parseOctal((byte[]) null, (-1156), 1005);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test06212() throws Throwable {
        byte[] byteArray0 = new byte[0];
        int int0 = (-1);
        // Undeclared exception!
        try {
            TarUtils.parseName(byteArray0, (-1), (-1));
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.lang.AbstractStringBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test06313() throws Throwable {
        byte[] byteArray0 = new byte[0];
        int int0 = 2;
        TarUtils.formatLongOctalOrBinaryBytes(650L, byteArray0, 2714, 2);
        int int1 = (-5137);
        // Undeclared exception!
        try {
            TarUtils.parseBoolean(byteArray0, int1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 2714
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test06514() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byte byte0 = (byte) 1;
        byteArray0[0] = (byte) 1;
        byteArray0[1] = (byte) (-121);
        byteArray0[2] = (byte) 0;
        byteArray0[3] = (byte) 55;
        byteArray0[4] = (byte) 86;
        byteArray0[5] = (byte) (-46);
        byteArray0[6] = (byte) (-105);
        byteArray0[7] = (byte) 90;
        byteArray0[8] = (byte) 0;
        TarUtils.parseName(byteArray0, (byte) (-46), (byte) 0);
        TarUtils.parseOctalOrBinary(byteArray0, 1, 32);
        int int0 = 2456;
        int int1 = 0;
        TarUtils.parseOctal(byteArray0, int0, int1);
        TarUtils.parseBoolean(byteArray0, byteArray0[0]);
        int int2 = 0;
        int int3 = 0;
        TarUtils.parseOctal(byteArray0, int2, int3);
        long long0 = 1994L;
        int int4 = 0;
        // Undeclared exception!
        try {
            TarUtils.formatCheckSumOctalBytes(long0, byteArray0, byteArray0[3], int4);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // At offset 1, 32 byte binary number exceeds maximum signed long value
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test06715() throws Throwable {
        long long0 = (-159L);
        byte[] byteArray0 = null;
        int int0 = 0;
        int int1 = 533;
        // Undeclared exception!
        try {
            TarUtils.formatUnsignedOctalString((-159L), (byte[]) null, 0, 533);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07016() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = 2922;
        int int1 = 3355;
        TarUtils.formatNameBytes("[+|5F@V:Eyhv?(a6", (byte[]) null, 2922, 3355);
        // Undeclared exception!
        try {
            TarUtils.parseBoolean(byteArray0, int0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07417() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = 2;
        // Undeclared exception!
        try {
            TarUtils.parseOctal((byte[]) null, 2, 2);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07518() throws Throwable {
        byte[] byteArray0 = null;
        int int0 = 630;
        int int1 = TarUtils.formatOctalBytes(722L, (byte[]) null, 630, 630);
        // Undeclared exception!
        try {
            TarUtils.formatUnsignedOctalString(int0, byteArray0, int1, int1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07619() throws Throwable {
        byte[] byteArray0 = null;
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
    public void test08720() throws Throwable {
        byte[] byteArray0 = null;
        TarUtils.parseName((byte[]) null, 1717986918, 1717986918);
        TarUtils.formatOctalBytes(1717986918, (byte[]) null, 1717986918, (-1));
        TarUtils.computeCheckSum(byteArray0);
        // Undeclared exception!
        try {
            TarUtils.computeCheckSum(byteArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 1717986918=14631463146 will not fit in octal number buffer of length -3
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test09021() throws Throwable {
        long long0 = (-1338L);
        byte[] byteArray0 = null;
        int int0 = 0;
        int int1 = 3523;
        // Undeclared exception!
        try {
            TarUtils.formatLongOctalOrBinaryBytes((-1338L), (byte[]) null, 0, 3523);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test10122() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) 32;
        byteArray0[1] = (byte) 74;
        byteArray0[3] = (byte) 32;
        byteArray0[4] = (byte) 0;
        byteArray0[5] = (byte) 58;
        byteArray0[6] = (byte) 6;
        TarUtils.computeCheckSum(byteArray0);
        TarUtils.parseOctal(byteArray0, (byte) 0, (byte) 6);
        TarUtils.computeCheckSum(byteArray0);
        int int0 = 2142308988;
        int int1 = 847;
        TarUtils.parseOctalOrBinary(byteArray0, int0, int1);
        String string0 = "`UmwD*+";
        int int2 = (-21);
        // Undeclared exception!
        try {
            TarUtils.formatNameBytes(string0, byteArray0, int2, byteArray0[4]);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid byte 58 at offset 5 in ' J{NUL} {NUL}:' len=6
            //
            verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
        }
    }
}
