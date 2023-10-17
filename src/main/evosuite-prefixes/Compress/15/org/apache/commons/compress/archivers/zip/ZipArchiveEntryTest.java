/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 08:26:51 GMT 2023
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.nio.file.attribute.FileTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.junit.runner.RunWith;

public class ZipArchiveEntryTest {

    @Test(timeout = 4000)
    public void test240() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.setExtra((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test251() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.setCentralDirectoryExtra((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test262() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("GQ?+REZy+?");
        zipArchiveEntry0.addExtraField((ZipExtraField) null);
    }

    @Test(timeout = 4000)
    public void test273() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0);
        zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger0);
        zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
    }

    @Test(timeout = 4000)
    public void test284() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = null;
        zipArchiveEntry0 = new ZipArchiveEntry((ZipArchiveEntry) null);
    }

    @Test(timeout = 4000)
    public void test295() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = null;
        zipArchiveEntry0 = new ZipArchiveEntry((ZipEntry) null);
    }

    @Test(timeout = 4000)
    public void test306() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = null;
        zipArchiveEntry0 = new ZipArchiveEntry((String) null);
    }

    @Test(timeout = 4000)
    public void test317() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = null;
        zipArchiveEntry0 = new ZipArchiveEntry((File) null, "s1aT[?@{%;&56t6i`d");
    }

    @Test(timeout = 4000)
    public void test388() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
        UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
        zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
        zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
    }

    @Test(timeout = 4000)
    public void test409() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        zipArchiveEntry0.setMethod((-1));
    }

    @Test(timeout = 4000)
    public void test4110() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("invalid entry size");
        ZipArchiveEntry zipArchiveEntry1 = null;
        zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test6811() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.setSize((-524L));
    }

    @Test(timeout = 4000)
    public void test7412() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        zipArchiveEntry0.removeUnparseableExtraFieldData();
    }

    @Test(timeout = 4000)
    public void test7513() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-92);
        zipArchiveEntry0.setExtra(byteArray0);
        zipArchiveEntry0.removeUnparseableExtraFieldData();
        zipArchiveEntry0.setExtra(byteArray0);
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test7614() throws Throwable {
        MockFile mockFile0 = new MockFile("KS!!0%&{&8{b(W'LqVf", "KS!!0%&{&8{b(W'LqVf");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        JarMarker jarMarker0 = new JarMarker();
        ZipShort zipShort0 = jarMarker0.getHeaderId();
        zipArchiveEntry0.removeExtraField(zipShort0);
    }

    @Test(timeout = 4000)
    public void test7715() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-92);
        zipArchiveEntry0.setExtra(byteArray0);
        UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
        ZipShort zipShort0 = unparseableExtraFieldData0.getHeaderId();
        zipArchiveEntry0.removeExtraField(zipShort0);
    }

    @Test(timeout = 4000)
    public void test7816() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addExtraField(jarMarker0);
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test7817() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addExtraField(jarMarker0);
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test7818() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addExtraField(jarMarker0);
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test7819() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addExtraField(jarMarker0);
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test7820() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addExtraField(jarMarker0);
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test7921() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test7922() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test7923() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test7924() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test7925() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        JarMarker jarMarker0 = new JarMarker();
        zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8026() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8027() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
        zipArchiveEntry0.getName();
    }

    @Test(timeout = 4000)
    public void test8028() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8029() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8030() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
        zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8131() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-4);
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
    }

    @Test(timeout = 4000)
    public void test8132() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-4);
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8133() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-4);
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8134() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-4);
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8135() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        byte[] byteArray0 = new byte[5];
        byteArray0[2] = (byte) (-4);
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8236() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
        zipArchiveEntry0.addAsFirstExtraField(unparseableExtraFieldData0);
    }

    @Test(timeout = 4000)
    public void test8337() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        int int0 = zipArchiveEntry0.getUnixMode();
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8338() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        int int0 = zipArchiveEntry0.getUnixMode();
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8339() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        int int0 = zipArchiveEntry0.getUnixMode();
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8340() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        int int0 = zipArchiveEntry0.getUnixMode();
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8341() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        int int0 = zipArchiveEntry0.getUnixMode();
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8342() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        int int0 = zipArchiveEntry0.getUnixMode();
    }

    @Test(timeout = 4000)
    public void test8443() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " is not a concrete class/");
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8444() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " is not a concrete class/");
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8445() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " is not a concrete class/");
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8446() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " is not a concrete class/");
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8447() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " is not a concrete class/");
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8548() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8549() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        zipArchiveEntry0.setMethod(0);
        ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8650() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setExtra(byteArray0);
        ZipArchiveEntry zipArchiveEntry1 = null;
        zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test8751() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(true);
        zipArchiveEntry0.getGeneralPurposeBit();
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8752() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(true);
        zipArchiveEntry0.getGeneralPurposeBit();
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8753() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(true);
        zipArchiveEntry0.getGeneralPurposeBit();
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8754() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(true);
        zipArchiveEntry0.getGeneralPurposeBit();
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8755() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(true);
        zipArchiveEntry0.getGeneralPurposeBit();
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8856() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8857() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8858() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8859() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8860() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8961() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.hashCode();
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test8962() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.hashCode();
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test8963() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.hashCode();
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test8964() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.hashCode();
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test8965() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        zipArchiveEntry0.hashCode();
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9066() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test9067() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9068() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.getName();
    }

    @Test(timeout = 4000)
    public void test9069() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test9070() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9071() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%]\"");
        byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
        zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test9172() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        zipArchiveEntry0.getLastModifiedDate();
        zipArchiveEntry0.getMethod();
    }

    @Test(timeout = 4000)
    public void test9173() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        zipArchiveEntry0.getLastModifiedDate();
        zipArchiveEntry0.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9174() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        zipArchiveEntry0.getLastModifiedDate();
        zipArchiveEntry0.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9175() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        zipArchiveEntry0.getLastModifiedDate();
        zipArchiveEntry0.getPlatform();
    }

    @Test(timeout = 4000)
    public void test9176() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        zipArchiveEntry0.getLastModifiedDate();
        zipArchiveEntry0.getSize();
    }

    @Test(timeout = 4000)
    public void test9277() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is not a concrete class");
        ZipArchiveEntry zipArchiveEntry1 = null;
        zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
    }

    @Test(timeout = 4000)
    public void test9378() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry) zipArchiveEntry0.clone();
        zipArchiveEntry1.getPlatform();
    }

    @Test(timeout = 4000)
    public void test9379() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry) zipArchiveEntry0.clone();
        zipArchiveEntry1.getInternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9380() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry) zipArchiveEntry0.clone();
        zipArchiveEntry1.getMethod();
    }

    @Test(timeout = 4000)
    public void test9381() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry) zipArchiveEntry0.clone();
        zipArchiveEntry1.getExternalAttributes();
    }

    @Test(timeout = 4000)
    public void test9382() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry) zipArchiveEntry0.clone();
    }

    @Test(timeout = 4000)
    public void test9383() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
        ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry) zipArchiveEntry0.clone();
        zipArchiveEntry1.getSize();
    }

    @Test(timeout = 4000)
    public void test9484() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%r/8&E).&ivm/");
        zipArchiveEntry0.setUnixMode(1865);
        int int0 = zipArchiveEntry0.getPlatform();
        zipArchiveEntry0.getUnixMode();
    }

    @Test(timeout = 4000)
    public void test9485() throws Throwable {
        ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%r/8&E).&ivm/");
        zipArchiveEntry0.setUnixMode(1865);
        int int0 = zipArchiveEntry0.getPlatform();
    }
}
