/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 13:15:33 GMT 2024
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
        int int0 = TarUtils.formatNameBytes("4c}p*z.T\"YQp;IDCa&", byteArray0, (int) (byte) 0, (-858));
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        TarUtils.formatCheckSumOctalBytes(255, (byte[]) null, 255, 255);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        byte[] byteArray0 = new byte[137];
        byteArray0[0] = (byte) 32;
        TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) 32);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[0];
        TarUtils.formatOctalBytes(7L, byteArray0, 0, 0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
        int int0 = TarUtils.formatNameBytes("^zjzmK(Ki", byteArray0, (int) (byte) 0, (int) (byte) 0, zipEncoding0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        byte[] byteArray0 = new byte[9];
        TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) 0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        byte[] byteArray0 = new byte[22];
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, 21, 21);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) 32;
        byteArray0[3] = (byte) 32;
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, 2, (byte) 2);
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        byte[] byteArray0 = new byte[161];
        TarUtils.formatLongOctalOrBinaryBytes((-1633L), byteArray0, 4, 4);
        TarUtils.parseOctal(byteArray0, 4, 4);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        byte[] byteArray0 = new byte[18];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte) 9, byteArray0, (byte) 9, (byte) 9);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        byte[] byteArray0 = new byte[18];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte) 9, byteArray0, (byte) 9, (byte) 9);
        long long0 = TarUtils.parseOctal(byteArray0, (byte) 9, (byte) 9);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        byte[] byteArray0 = new byte[137];
        byteArray0[0] = (byte) 78;
        TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) 78);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        byte[] byteArray0 = new byte[164];
        byteArray0[0] = (byte) (-93);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, 145);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        byte[] byteArray0 = new byte[34];
        byteArray0[0] = (byte) (-1);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) 24);
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = (byte) (-1);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) (-1));
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        byte[] byteArray0 = new byte[10];
        byteArray0[0] = (byte) (-35);
        long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, (byte) 6);
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        byte[] byteArray0 = new byte[164];
        byteArray0[0] = (byte) (-93);
        byteArray0[16] = (byte) 17;
        TarUtils.parseOctalOrBinary(byteArray0, (byte) 0, 145);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        byte[] byteArray0 = new byte[7];
        boolean boolean0 = TarUtils.parseBoolean(byteArray0, (byte) 0);
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        byte[] byteArray0 = new byte[18];
        byteArray0[2] = (byte) 1;
        boolean boolean0 = TarUtils.parseBoolean(byteArray0, 2);
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        String string0 = TarUtils.parseName((byte[]) null, 0, 0);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        byte[] byteArray0 = new byte[11];
        byteArray0[0] = (byte) (-7);
        TarUtils.parseName(byteArray0, (int) (byte) (-7), (int) (byte) 11);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        byte[] byteArray0 = new byte[8];
        TarUtils.formatNameBytes("R7{L] |a", byteArray0, (int) (byte) 0, (int) (byte) 76);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        byte[] byteArray0 = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes((byte) 0, byteArray0, (byte) 0, (byte) 0);
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        byte[] byteArray0 = new byte[155];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, byteArray0, (byte) 27, (byte) 27);
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        TarUtils.formatLongOctalOrBinaryBytes((-1135), (byte[]) null, (-1135), (-1135));
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        byte[] byteArray0 = new byte[155];
        int int0 = TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, byteArray0, (byte) 8, (byte) 8);
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        byte[] byteArray0 = new byte[8];
        long long0 = TarUtils.computeCheckSum(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        byte[] byteArray0 = new byte[167];
        byteArray0[150] = (byte) 63;
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        byte[] byteArray0 = new byte[175];
        byteArray0[150] = (byte) 48;
        byteArray0[148] = (byte) 48;
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        byte[] byteArray0 = new byte[11];
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) (-32);
        byteArray0[1] = (byte) 32;
        boolean boolean0 = TarUtils.verifyCheckSum(byteArray0);
    }
}
