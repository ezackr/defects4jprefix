/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 04:02:04 GMT 2023
 */
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.codec.binary.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringUtils.getBytesUtf16Be((String) null);
        StringUtils.newStringUtf16Le((byte[]) null);
        StringUtils stringUtils0 = new StringUtils();
        StringUtils.newString((byte[]) null, (String) null);
        StringUtils.getBytesUnchecked((String) null, (String) null);
        StringUtils.getBytesUtf16((String) null);
        StringUtils.equals((CharSequence) "UTF-16BE", (CharSequence) "%");
        StringUtils.getBytesIso8859_1((String) null);
        StringUtils.newStringUtf16Be((byte[]) null);
        StringUtils.getBytesUsAscii((String) null);
        StringUtils.newStringUtf16((byte[]) null);
        StringUtils.equals((CharSequence) "UTF-16BE", (CharSequence) null);
        StringUtils.newStringIso8859_1((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[16];
        StringUtils.newStringUsAscii(byteArray0);
        CharBuffer charBuffer0 = CharBuffer.allocate((byte) 16);
        StringUtils.equals((CharSequence) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (CharSequence) charBuffer0);
        StringUtils.getByteBufferUtf8("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        byte[] byteArray0 = new byte[1];
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.equals((CharSequence) "\u0000", (CharSequence) "\u0000");
        byte[] byteArray1 = StringUtils.getBytesUtf8("\u0000");
        StringUtils.getBytesUtf16Le("\u0000");
        StringUtils.newString(byteArray1, "\u0000");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StringUtils.equals((CharSequence) null, (CharSequence) "&");
        StringUtils.getByteBufferUtf8((String) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CharBuffer charBuffer0 = CharBuffer.allocate(1308);
        CharBuffer charBuffer1 = CharBuffer.allocate(1308);
        StringUtils.equals((CharSequence) charBuffer0, (CharSequence) charBuffer1);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUnchecked("+!:l/zq;tD2R", "+!:l/zq;tD2R");
        StringUtils.newStringUtf8(byteArray0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StringUtils stringUtils0 = new StringUtils();
        StringUtils.getBytesIso8859_1((String) null);
        StringUtils.getByteBufferUtf8("TLK .xCO$m");
        StringUtils.newStringUtf16Le((byte[]) null);
        StringUtils.getByteBufferUtf8("");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        StringUtils.newStringUsAscii((byte[]) null);
        StringUtils.equals((CharSequence) null, (CharSequence) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        StringUtils.getBytesUtf16Le("Bvu");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StringUtils.getBytesUsAscii("");
        StringUtils.getBytesUsAscii("> FNW0uFPtx!%");
        StringUtils.getBytesUnchecked("w}?TDcHSVa_C\u0000]", "w}?TDcHSVa_C\u0000]");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StringUtils.getBytesUtf8("qQn<6$94fs6)");
        StringUtils.getBytesUsAscii("qQn<6$94fs6)");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StringUtils.newStringUtf8((byte[]) null);
        StringUtils.getBytesUsAscii((String) null);
        StringUtils.newStringUtf8((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StringUtils.getByteBufferUtf8((String) null);
        StringUtils.getByteBufferUtf8("");
        StringUtils.equals((CharSequence) "", (CharSequence) null);
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
        StringUtils.equals((CharSequence) null, (CharSequence) null);
        StringUtils.getBytesUtf16Le((String) null);
        StringUtils.newStringUsAscii(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        byte[] byteArray0 = new byte[0];
        StringUtils.newStringUsAscii(byteArray0);
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.newStringUtf16Be(byteArray0);
        StringUtils.getBytesUtf8("yI_I6oCIR&s");
        StringUtils.getByteBufferUtf8("zG");
        StringUtils.newStringUtf16Le(byteArray0);
        byte[] byteArray1 = StringUtils.getBytesUtf16(": ");
        StringUtils.newStringUtf16(byteArray1);
        StringUtils.equals((CharSequence) ": ", (CharSequence) "yI_I6oCIR&s");
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("US-ASCII");
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.newStringIso8859_1(byteArray0);
        StringUtils.getBytesUtf8("3f;Tmok6+f");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        byte[] byteArray0 = new byte[0];
        StringUtils.newString(byteArray0, "");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        StringUtils stringUtils0 = new StringUtils();
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = (byte) 0;
        byteArray0[1] = (byte) 1;
        byteArray0[2] = (byte) 0;
        byteArray0[3] = (byte) (-100);
        byteArray0[4] = (byte) 55;
        byteArray0[5] = (byte) (-1);
        byteArray0[6] = (byte) (-92);
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.getBytesUtf16Le("29JMm8,&AoRu]*'L#oc");
        StringUtils.getByteBufferUtf8("");
        StringUtils.getBytesUtf8("0%Jd}BE$.w");
        StringUtils.getBytesUnchecked("fmYW", "0%Jd}BE$.w");
        byte[] byteArray1 = new byte[4];
        byte byte0 = (byte) 0;
        byteArray1[0] = byte0;
        byte byte1 = (byte) 0;
        byteArray1[1] = byte1;
        byte byte2 = (byte) 92;
        byteArray1[2] = byte2;
        byte byte3 = (byte) 0;
        byteArray1[3] = byte3;
        StringUtils.newStringIso8859_1(byteArray1);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        byte[] byteArray0 = new byte[0];
        String string0 = StringUtils.newStringUsAscii(byteArray0);
        StringUtils.newStringUtf16Be(byteArray0);
        StringUtils.equals((CharSequence) "", (CharSequence) "");
        StringUtils.equals((CharSequence) "", (CharSequence) "");
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.newStringIso8859_1(byteArray0);
        byte[] byteArray1 = StringUtils.getBytesUtf16Be("");
        String string1 = "UTF-16LE";
        StringUtils.newString(byteArray1, "UTF-16LE");
        StringUtils.getBytesUtf16Le("");
        StringUtils.getBytesUtf16("");
        StringUtils.getBytesUtf8("#U,t");
        StringUtils.getBytesUsAscii(")]fjo;OJj}O7W");
        StringUtils.getBytesUsAscii("");
        StringUtils.newString(byteArray1, "`EY,:'[S6tXE");
        StringUtils.getBytesUtf16Le(string0);
        String string2 = "org.apache.commons.codec.binary.StringUtils";
        StringUtils.getBytesUnchecked(string1, string2);
        String string3 = "(G3~{dE,6nC";
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-67);
        String string0 = StringUtils.newStringUtf16Be(byteArray0);
        byte[] byteArray1 = StringUtils.getBytesUtf16("");
        StringUtils.newStringUtf16(byteArray1);
        StringUtils.newStringUsAscii(byteArray0);
        StringUtils.newString(byteArray1, "");
        StringUtils.getBytesUsAscii(string0);
        String string1 = "";
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
        String string0 = "y22Pi3($^nL:";
        StringUtils.getBytesIso8859_1("y22Pi3($^nL:");
        StringUtils.getBytesUtf16Be("");
        byte[] byteArray1 = StringUtils.getBytesUtf16Le("");
        byte[] byteArray2 = StringUtils.getBytesUtf16Be("");
        StringUtils.newStringUsAscii(byteArray2);
        StringUtils.newStringIso8859_1(byteArray0);
        StringUtils.newStringUtf16(byteArray1);
        StringUtils.getBytesUnchecked("mvQ'c_y4`a}$l^J", (String) null);
        String string1 = "C)IX*%\\&sV4pZ1IE";
        StringUtils.getBytesUtf8(string1);
        StringUtils.equals((CharSequence) string1, (CharSequence) string0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Le("-?n}t3oZ#S'V4mL]");
        StringUtils.newStringUtf16(byteArray0);
        StringUtils.newStringUtf8(byteArray0);
        StringUtils stringUtils0 = new StringUtils();
        byte[] byteArray1 = StringUtils.getBytesUsAscii("");
        byte[] byteArray2 = StringUtils.getBytesUtf16Be("\u0000-\u0000?\u0000n\u0000}\u0000t\u00003\u0000o\u0000Z\u0000#\u0000S\u0000'\u0000V\u00004\u0000m\u0000L\u0000]\u0000");
        StringUtils.newStringUtf16Be(byteArray2);
        StringUtils.newStringUtf16Be(byteArray1);
        byte[] byteArray3 = new byte[2];
        byteArray3[0] = (byte) 73;
        byteArray3[1] = (byte) (-58);
        StringUtils.newString(byteArray3, "\u0000-\u0000?\u0000n\u0000}\u0000t\u00003\u0000o\u0000Z\u0000#\u0000S\u0000'\u0000V\u00004\u0000m\u0000L\u0000]\u0000");
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        StringUtils.getByteBufferUtf8("L0<w9n' K%<a ||!-O");
        StringUtils.newStringUtf16Le((byte[]) null);
        StringUtils.newStringUtf16((byte[]) null);
        StringUtils.getBytesUtf8((String) null);
        StringUtils.newStringUtf8((byte[]) null);
        StringUtils.newStringUtf16((byte[]) null);
        StringUtils.newStringUtf16Le((byte[]) null);
        StringUtils.newStringUtf16Be((byte[]) null);
        StringUtils.getBytesUnchecked("\"mrWYsn", "\"mrWYsn");
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
        StringUtils.equals((CharSequence) "", (CharSequence) "");
        String string0 = "8!,H/6RhUL8L}x";
        StringUtils.newString(byteArray0, "8!,H/6RhUL8L}x");
        StringUtils.getBytesUtf8(string0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-1);
        StringUtils.newStringUtf16Le(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        StringUtils.getBytesUnchecked(": ", "UTF-8");
        StringUtils.getBytesUtf16(": ");
        StringUtils.getBytesUtf16(": ");
        StringUtils.getBytesUtf8("");
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        StringUtils.getByteBufferUtf8((String) null);
        byte[] byteArray0 = new byte[0];
        StringUtils.newStringUtf16Be(byteArray0);
        byte[] byteArray1 = StringUtils.getBytesUnchecked("", "US-ASCII");
        StringUtils.newStringUtf8(byteArray1);
        StringUtils.newStringUtf16Le(byteArray1);
        StringUtils.getBytesIso8859_1("");
        StringUtils.getBytesUtf8("N");
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        StringUtils.getBytesUtf8("");
        byte[] byteArray0 = StringUtils.getBytesUtf16("");
        byte[] byteArray1 = StringUtils.getBytesUsAscii((String) null);
        StringUtils stringUtils0 = new StringUtils();
        StringUtils.getBytesUtf16Be("");
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.getBytesUnchecked("", (String) null);
        String string0 = "org.apache.commons.codec.binary.StringUtils";
        StringUtils.newString(byteArray1, string0);
        String string1 = "org.apache.commons.codec.Charsets";
        StringUtils.getBytesUtf16Le(string1);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        StringUtils.getBytesUsAscii((String) null);
        StringUtils.getBytesUnchecked((String) null, ": ");
        StringUtils.getBytesUtf16(": ");
        StringUtils.getBytesUtf16Be("");
        StringUtils.newStringUsAscii((byte[]) null);
        StringUtils.newStringUtf16Be((byte[]) null);
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) 1;
        byteArray0[1] = (byte) 0;
        byteArray0[2] = (byte) 1;
        StringUtils.newStringUtf16Le(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 0;
        byteArray0[1] = (byte) 89;
        StringUtils.newStringUtf8(byteArray0);
        StringUtils.getBytesIso8859_1((String) null);
        byte[] byteArray1 = StringUtils.getBytesUtf8("\u0000Y");
        StringUtils.getBytesUtf8((String) null);
        StringUtils.getBytesUtf16((String) null);
        StringUtils.getBytesUtf16((String) null);
        StringUtils.newStringIso8859_1(byteArray0);
        StringUtils.newStringUtf16Be(byteArray1);
        StringUtils.getBytesUtf16Le("Y");
        StringUtils.newStringUtf16Be(byteArray0);
        StringUtils.equals((CharSequence) "Y", (CharSequence) "Y");
        StringUtils.getBytesUsAscii("3hQ\"~ejLg;=`mCF'-$5");
        StringUtils.getByteBufferUtf8((String) null);
        StringUtils.getBytesUtf8((String) null);
        StringUtils.getBytesUtf16("l\u0002&}j>4?g+\"<,");
        StringUtils.newStringUsAscii(byteArray0);
        StringUtils.equals((CharSequence) "\u0000Y", (CharSequence) null);
        StringUtils.getByteBufferUtf8("\u0000Y");
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-93);
        StringUtils.newString(byteArray0, "UTF-16");
        StringUtils.getByteBufferUtf8("");
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        StringUtils.newString((byte[]) null, "dzT1_@'Zx4^+oj7)*@n");
        byte[] byteArray0 = StringUtils.getBytesUtf8("dzT1_@'Zx4^+oj7)*@n");
        StringUtils.getBytesUsAscii("");
        StringUtils stringUtils0 = new StringUtils();
        StringUtils.newString(byteArray0, (String) null);
        String string0 = "US-ASCII";
        StringUtils.getBytesUtf16Le(string0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesUtf16Be((String) null);
        StringUtils.newStringIso8859_1((byte[]) null);
        StringUtils.newStringUtf16Be(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 1;
        byteArray0[1] = (byte) 79;
        byteArray0[2] = (byte) 45;
        byteArray0[3] = (byte) 0;
        byteArray0[4] = (byte) 88;
        byteArray0[5] = (byte) 70;
        byteArray0[6] = (byte) 0;
        byteArray0[7] = (byte) 18;
        byteArray0[8] = (byte) (-1);
        StringUtils.newStringIso8859_1(byteArray0);
        StringUtils.newStringUsAscii(byteArray0);
        StringUtils.equals((CharSequence) "\u0001O-\u0000XF\u0000\u0012\uFFFD", (CharSequence) "\u0001O-\u0000XF\u0000\u0012\u00FF");
        CharBuffer charBuffer0 = CharBuffer.allocate(512);
        StringUtils.equals((CharSequence) "\u0001O-\u0000XF\u0000\u0012\uFFFD", (CharSequence) charBuffer0);
        StringUtils.getByteBufferUtf8("\u0001O-\u0000XF\u0000\u0012\uFFFD");
        StringUtils.getByteBufferUtf8("\u0001O-\u0000XF\u0000\u0012\uFFFD");
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        String string0 = "hL4thij4z(P1nbP}ph";
        String string1 = "";
        StringUtils.getBytesUnchecked((String) null, "");
        StringUtils.equals((CharSequence) null, (CharSequence) "hL4thij4z(P1nbP}ph");
        StringUtils.newStringIso8859_1((byte[]) null);
        StringUtils stringUtils0 = null;
        stringUtils0 = new StringUtils();
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        CharBuffer charBuffer0 = CharBuffer.allocate(1241);
        charBuffer0.limit(1241);
        CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
        charBuffer1.codePoints();
        charBuffer0.clear();
        StringUtils.equals((CharSequence) charBuffer1, (CharSequence) charBuffer0);
        StringUtils.equals((CharSequence) charBuffer0, (CharSequence) charBuffer1);
        StringUtils.equals((CharSequence) charBuffer1, (CharSequence) charBuffer0);
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = (byte) (-123);
        byteArray0[1] = (byte) 0;
        byteArray0[2] = (byte) 1;
        StringUtils.newStringIso8859_1(byteArray0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = (byte) 1;
        byteArray0[1] = (byte) 79;
        byteArray0[2] = (byte) 45;
        byteArray0[3] = (byte) 0;
        byteArray0[4] = (byte) 88;
        byteArray0[5] = (byte) 70;
        byteArray0[6] = (byte) 0;
        byteArray0[7] = (byte) 18;
        byteArray0[8] = (byte) (-1);
        StringUtils.newStringIso8859_1(byteArray0);
        String string0 = StringUtils.newStringUsAscii(byteArray0);
        StringUtils.equals((CharSequence) "\u0001O-\u0000XF\u0000\u0012\uFFFD", (CharSequence) "\u0001O-\u0000XF\u0000\u0012\u00FF");
        CharBuffer charBuffer0 = CharBuffer.allocate(512);
        charBuffer0.compact();
        StringUtils.equals((CharSequence) "\u0001O-\u0000XF\u0000\u0012\uFFFD", (CharSequence) charBuffer0);
        StringUtils.getByteBufferUtf8(string0);
        StringUtils.getByteBufferUtf8(string0);
        String string1 = "";
        StringUtils.getByteBufferUtf8(string1);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        byte[] byteArray0 = new byte[9];
        StringUtils.newStringUsAscii(byteArray0);
        CharBuffer charBuffer0 = CharBuffer.allocate((byte) 94);
        StringUtils.equals((CharSequence) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (CharSequence) charBuffer0);
    }
}
