/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 03:38:58 GMT 2023
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.binary.StringUtils;
import org.junit.runner.RunWith;

public class StringUtilsTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        byte[] byteArray0 = new byte[1];
        String string0 = StringUtils.newStringUtf8(byteArray0);
        assertEquals("\u0000", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16("");
        String string0 = StringUtils.newStringUtf16Le(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        byte[] byteArray0 = new byte[2];
        String string0 = StringUtils.newStringUtf16(byteArray0);
        assertEquals("\u0000", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
        String string0 = StringUtils.newStringUtf16(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16("gg^l/MDsc]j:vl~'1d");
        String string0 = StringUtils.newStringUsAscii(byteArray0);
        assertEquals("\uFFFD\uFFFD\u0000g\u0000g\u0000^\u0000l\u0000/\u0000M\u0000D\u0000s\u0000c\u0000]\u0000j\u0000:\u0000v\u0000l\u0000~\u0000\u0000'\u00001\u0000d", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        byte[] byteArray0 = new byte[1];
        String string0 = StringUtils.newStringIso8859_1(byteArray0);
        assertEquals("\u0000", string0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf8((String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Le("US-ASCII");
        assertEquals(16, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Le("");
        String string0 = StringUtils.newStringUsAscii(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be((String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("f}#dr6sV057A");
        assertEquals(24, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16((String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16("");
        String string0 = StringUtils.newString(byteArray0, "UTF-8");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUsAscii((String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUsAscii("");
        assertArrayEquals(new byte[] {}, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUnchecked("US-ASCII", "US-ASCII");
        assertEquals(8, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUnchecked("", "US-ASCII");
        assertEquals(0, byteArray0.length);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesIso8859_1("`BdD[J=D");
        assertArrayEquals(new byte[] { (byte) 96, (byte) 66, (byte) 100, (byte) 68, (byte) 91, (byte) 74, (byte) 61, (byte) 68 }, byteArray0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
        String string0 = StringUtils.newStringUtf16Be(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.newStringUtf16Le((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.newStringUtf16Be((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.newStringIso8859_1((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        byte[] byteArray0 = new byte[7];
        // Undeclared exception!
        try {
            StringUtils.newString(byteArray0, (String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUsAscii("B{@C0i5[3H");
        // Undeclared exception!
        try {
            StringUtils.newString(byteArray0, "P7f0y+_QYCVHDSHt5Ej");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // P7f0y+_QYCVHDSHt5Ej: java.io.UnsupportedEncodingException: P7f0y+_QYCVHDSHt5Ej
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.getBytesUnchecked("\u00C8\u5BCC\uFF4C\uFFFD", (String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        String string0 = StringUtils.newString((byte[]) null, (String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf8("UTF-16LE");
        String string0 = StringUtils.newString(byteArray0, "UTF-16LE");
        assertEquals("\u5455\u2D46\u3631\u454C", string0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        String string0 = StringUtils.newStringUtf8((byte[]) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUnchecked((String) null, (String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
        String string0 = StringUtils.newStringUtf8(byteArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf8("");
        assertArrayEquals(new byte[] {}, byteArray0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesIso8859_1((String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.newStringUtf16((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3433() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Le((String) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3534() throws Throwable {
        byte[] byteArray0 = new byte[7];
        String string0 = StringUtils.newStringUtf16Le(byteArray0);
        assertEquals("\u0000\u0000\u0000\uFFFD", string0);
    }

    @Test(timeout = 4000)
    public void test3635() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUsAscii("o@kJusIi|n");
        String string0 = StringUtils.newStringUtf16Be(byteArray0);
        assertEquals("\u6F40\u6B4A\u7573\u4969\u7C6E", string0);
    }

    @Test(timeout = 4000)
    public void test3736() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.newStringUsAscii((byte[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3837() throws Throwable {
        // Undeclared exception!
        try {
            StringUtils.getBytesUnchecked("]*'L#oc,5:]B-V'bp", "");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // : java.io.UnsupportedEncodingException:
        }
    }

    @Test(timeout = 4000)
    public void test3938() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
        String string0 = StringUtils.newStringIso8859_1(byteArray0);
        assertEquals("", string0);
    }
}
