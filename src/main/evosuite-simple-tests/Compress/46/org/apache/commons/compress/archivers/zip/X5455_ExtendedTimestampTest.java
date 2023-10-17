/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 16:43:11 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.MinguoDate;
import java.time.temporal.TemporalAmount;
import java.util.Date;
import java.util.Map;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.junit.runner.RunWith;

public class X5455_ExtendedTimestampTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime((Date) null);
        x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime((Date) null);
        x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        x5455_ExtendedTimestamp0.setCreateJavaTime((Date) null);
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = (byte) 1;
        byteArray0[1] = (byte) 1;
        byteArray0[2] = (byte) 1;
        byteArray0[3] = (byte) 4;
        x5455_ExtendedTimestamp0.setAccessJavaTime((Date) null);
        x5455_ExtendedTimestamp0.getModifyTime();
        x5455_ExtendedTimestamp0.equals((Object) null);
        x5455_ExtendedTimestamp0.setFlags((byte) 98);
        x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        x5455_ExtendedTimestamp0.setCreateTime((ZipLong) null);
        x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setModifyJavaTime((Date) null);
        int int0 = 1219;
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray1, 1219, (byte) 1);
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.setFlags(byteArray0[2]);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1219
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.setFlags((byte) (-24));
        x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        x5455_ExtendedTimestamp0.getModifyJavaTime();
        x5455_ExtendedTimestamp0.setCreateJavaTime((Date) null);
        x5455_ExtendedTimestamp0.getAccessTime();
        x5455_ExtendedTimestamp0.setCreateJavaTime((Date) null);
        x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setCreateJavaTime((Date) null);
        x5455_ExtendedTimestamp0.getLocalFileDataLength();
        int int0 = 259;
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, 259, 259);
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.getAccessJavaTime();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 259
        }
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        MockDate mockDate0 = new MockDate(1509L);
        ZipLong zipLong0 = new ZipLong(33639248L);
        zipLong0.getBytes();
        ZipLong.getBytes((long) (byte) 4);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
        x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
        MockDate mockDate1 = new MockDate(22, (byte) 4, (byte) 1);
        mockDate1.after(mockDate0);
        x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate1);
        x5455_ExtendedTimestamp0.setFlags((byte) (-9));
        byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, 22, 4);
        x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
        x5455_ExtendedTimestamp0.getLocalFileDataData();
        x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.clone();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 22
        }
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        byte byte0 = (byte) 3;
        x5455_ExtendedTimestamp0.setFlags((byte) 3);
        x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.getLocalFileDataLength();
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.getCentralDirectoryData();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        long long0 = 284L;
        System.setCurrentTimeMillis(284L);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.getModifyJavaTime();
        x5455_ExtendedTimestamp0.getModifyJavaTime();
        ZipLong zipLong0 = ZipLong.DD_SIG;
        byte[] byteArray0 = new byte[5];
        x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
        byteArray0[0] = (byte) 2;
        byteArray0[1] = (byte) 1;
        zipLong0.putLong(byteArray0, 741);
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.getLocalFileDataData();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 741
        }
    }

    @Test(timeout = 4000)
    public void test165() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setCreateTime((ZipLong) null);
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        x5455_ExtendedTimestamp0.getCreateTime();
        x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte byte0 = (byte) 0;
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        x5455_ExtendedTimestamp0.setCreateJavaTime((Date) null);
        byte byte1 = (byte) (-94);
        x5455_ExtendedTimestamp0.setFlags((byte) (-94));
        x5455_ExtendedTimestamp0.toString();
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can only convert non-negative integers between [0,255] to byte: [-94]
        }
    }

    @Test(timeout = 4000)
    public void test216() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp2.getAccessTime();
        x5455_ExtendedTimestamp2.getModifyJavaTime();
        x5455_ExtendedTimestamp2.parseFromCentralDirectoryData(byteArray1, (byte) 1, 3750);
        // Undeclared exception!
        try {
            ZipLong.getValue(byteArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
        }
    }

    @Test(timeout = 4000)
    public void test237() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.getModifyJavaTime();
        x5455_ExtendedTimestamp0.setAccessJavaTime((Date) null);
        byte byte0 = (byte) 0;
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        byte[] byteArray0 = null;
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData((byte[]) null, (byte) 0, (byte) 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test278() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 65);
        x5455_ExtendedTimestamp0.getCentralDirectoryData();
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.getCreateJavaTime();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test409() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = (byte) 4;
        byteArray0[1] = (byte) 1;
        byteArray0[2] = (byte) 1;
        byteArray0[3] = (byte) 4;
        byteArray0[4] = (byte) 1;
        byteArray0[5] = (byte) 4;
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, (byte) 4, (byte) 1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 6
        }
    }

    @Test(timeout = 4000)
    public void test4210() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.getHeaderId();
        MockDate mockDate0 = new MockDate(1068, (byte) 2, 1068, (byte) 2, (byte) 1, (byte) 2);
        x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.getCreateTime();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // X5455 timestamps must fit in a signed 32 bit integer: 31591216862
        }
    }

    @Test(timeout = 4000)
    public void test4511() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = (byte) (-1);
        byteArray0[1] = (byte) 4;
        byteArray0[2] = (byte) 1;
        byteArray0[3] = (byte) 2;
        byteArray0[4] = (byte) 2;
        MockDate mockDate0 = new MockDate(1747, (byte) 4, (-1574), (byte) 2, (-1574), 865);
        MockDate.UTC((byte) (-1), (byte) 1, (-5), 865, 1214, (-5));
        x5455_ExtendedTimestamp0.setAccessJavaTime(mockDate0);
        byteArray0[5] = x5455_ExtendedTimestamp0.MODIFY_TIME_BIT;
        byteArray0[6] = x5455_ExtendedTimestamp0.CREATE_TIME_BIT;
        byteArray0[7] = x5455_ExtendedTimestamp0.MODIFY_TIME_BIT;
        ZipLong.getValue(byteArray0);
        zipLong0.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.isBit2_createTimePresent();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // X5455 timestamps must fit in a signed 32 bit integer: 52795238425
        }
    }

    @Test(timeout = 4000)
    public void test5612() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        x5455_ExtendedTimestamp0.getAccessJavaTime();
        MockDate mockDate0 = new MockDate((-3502L));
        mockDate0.toInstant();
        x5455_ExtendedTimestamp0.setAccessJavaTime(mockDate0);
        byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, 0, 938);
        x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte byte0 = (byte) (-69);
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.setFlags(byte0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
        }
    }

    @Test(timeout = 4000)
    public void test6113() throws Throwable {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
        Object object0 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.hashCode();
        x5455_ExtendedTimestamp0.equals(object0);
        x5455_ExtendedTimestamp0.setFlags((byte) 21);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp1.hashCode();
        x5455_ExtendedTimestamp1.getCentralDirectoryLength();
        x5455_ExtendedTimestamp0.getLocalFileDataData();
        // Undeclared exception!
        try {
            x5455_ExtendedTimestamp0.getLocalFileDataLength();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
