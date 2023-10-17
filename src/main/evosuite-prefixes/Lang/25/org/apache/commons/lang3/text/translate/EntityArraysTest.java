/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:41:21 GMT 2023
 */
package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.junit.runner.RunWith;

public class EntityArraysTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String[][] stringArray0 = new String[0][0];
        String[][] stringArray1 = EntityArrays.invert(stringArray0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        EntityArrays.invert((String[][]) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String[][] stringArray0 = new String[8][1];
        EntityArrays.invert(stringArray0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        String[][] stringArray0 = EntityArrays.ISO8859_1_UNESCAPE();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        String[][] stringArray0 = EntityArrays.APOS_ESCAPE();
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_UNESCAPE();
        String[][] stringArray1 = EntityArrays.invert(stringArray0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        String[][] stringArray0 = EntityArrays.ISO8859_1_ESCAPE();
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        String[][] stringArray0 = EntityArrays.APOS_UNESCAPE();
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        String[][] stringArray0 = EntityArrays.BASIC_UNESCAPE();
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        String[][] stringArray0 = EntityArrays.BASIC_ESCAPE();
    }
}
