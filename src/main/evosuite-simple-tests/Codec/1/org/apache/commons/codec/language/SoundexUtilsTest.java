/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 00:53:07 GMT 2023
 */
package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.apache.commons.codec.language.SoundexUtils;
import org.junit.runner.RunWith;

public class SoundexUtilsTest {

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
        int int0 = SoundexUtils.difference(doubleMetaphone0, "_}OLcxW09Vw<b:K~`|", "");
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        String string0 = SoundexUtils.clean((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        String string0 = SoundexUtils.clean("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        String string0 = SoundexUtils.clean(")Rl|!:5");
        assertEquals("RL", string0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        String string0 = SoundexUtils.clean("H");
        assertEquals("H", string0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
        int int0 = SoundexUtils.difference(doubleMetaphone0, "", (String) null);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test76() throws Throwable {
        DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
        int int0 = SoundexUtils.difference(doubleMetaphone0, "ILLO", "pS{q6zGQ?+REZy+?Js");
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        int int0 = SoundexUtils.differenceEncoded("L", "L");
        assertEquals(1, int0);
    }
}
