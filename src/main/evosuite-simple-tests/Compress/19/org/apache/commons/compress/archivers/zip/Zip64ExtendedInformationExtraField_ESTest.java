/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 08:58:15 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Zip64ExtendedInformationExtraField_ESTest extends Zip64ExtendedInformationExtraField_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
        byte[] byteArray0 = new byte[4];
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 4, 0);
        try {
            zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, true, false, false);
            fail("Expecting exception: ZipException");
        } catch (ZipException e) {
            //
            // central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length 16 but is 0
            //
            verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
        byte[] byteArray0 = new byte[4];
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 4, 0);
        try {
            zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, false, true, false);
            fail("Expecting exception: ZipException");
        } catch (ZipException e) {
            //
            // central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length 16 but is 0
            //
            verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        byte[] byteArray0 = new byte[6];
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, 310, (byte) 16);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 317
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
        ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getSize();
        assertNull(zipEightByteInteger0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
        assertNull(zipEightByteInteger0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BigInteger bigInteger0 = BigInteger.TEN;
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
        ZipLong zipLong0 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
        assertNull(zipLong0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ONE;
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
        ZipLong zipLong0 = new ZipLong(0);
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong0);
        ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
        assertEquals(0L, zipLong1.getValue());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
        ZipLong zipLong0 = ZipLong.DD_SIG;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getCompressedSize();
        assertSame(zipEightByteInteger0, zipEightByteInteger1);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null, (ZipEightByteInteger) null, zipLong0);
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData((byte[]) null, 48, 48);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData((byte[]) null, 0, 65280);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        byte[] byteArray0 = new byte[4];
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, (-1810), (-1810));
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        byte[] byteArray0 = new byte[4];
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) 0, 3160);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
        ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, false, false, true);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
        byte[] byteArray0 = new byte[6];
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, 0, (-2159));
            fail("Expecting exception: ZipException");
        } catch (ZipException e) {
            //
            // Zip64 extended information must contain both size values in the local file header.
            //
            verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        BigInteger bigInteger0 = BigInteger.ZERO;
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
        byte[] byteArray0 = new byte[4];
        zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (-1809), (byte) 0);
        assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        byte[] byteArray0 = new byte[8];
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (byte) 0, 2037);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 15
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
        ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 4, 4);
        zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, false, false, true);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(814L);
        ZipLong zipLong0 = ZipLong.LFH_SIG;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, (ZipEightByteInteger) null, (ZipEightByteInteger) null, zipLong0);
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.getLocalFileDataData();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Zip64 extended information must contain both size values in the local file header.
            //
            verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger0);
        // Undeclared exception!
        try {
            zip64ExtendedInformationExtraField0.getLocalFileDataData();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Zip64 extended information must contain both size values in the local file header.
            //
            verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        assertArrayEquals(new byte[] {}, byteArray0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
        ZipLong zipLong0 = ZipLong.DD_SIG;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        assertEquals(16, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
        ZipLong zipLong0 = ZipLong.DD_SIG;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
        assertEquals(28, zipShort0.getValue());
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
        ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
        assertEquals(0, zipShort0.getValue());
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
        ZipLong zipLong0 = ZipLong.DD_SIG;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        assertEquals(16, zipShort0.getValue());
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
        ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        assertEquals(0, zipShort0.getValue());
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
        ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getSize();
        assertSame(zipEightByteInteger0, zipEightByteInteger1);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
        ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getHeaderId();
        assertEquals(1, zipShort0.getValue());
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
        ZipLong zipLong0 = ZipLong.LFH_SIG;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
        assertSame(zipEightByteInteger0, zipEightByteInteger1);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
        ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
        ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
        ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
        assertSame(zipLong1, zipLong0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
        zip64ExtendedInformationExtraField0.setSize((ZipEightByteInteger) null);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getCompressedSize();
        zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger0);
    }
}
