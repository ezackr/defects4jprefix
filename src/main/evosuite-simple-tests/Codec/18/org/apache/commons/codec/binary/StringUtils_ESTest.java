/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 04:17:25 GMT 2023
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
    public void test010() throws Throwable {
        StringUtils.newStringUtf8((byte[]) null);
        StringUtils.newString((byte[]) null, (String) null);
        byte[] byteArray0 = StringUtils.getBytesUtf16Be((String) null);
        StringUtils.getBytesUtf16Be((String) null);
        StringUtils.newStringIso8859_1((byte[]) null);
        String string0 = "&TI'*F^;FSQMt_tI";
        byte[] byteArray1 = StringUtils.getBytesUsAscii("&TI'*F^;FSQMt_tI");
        StringUtils.getByteBufferUtf8((String) null);
        StringUtils.equals((CharSequence) null, (CharSequence) null);
        StringUtils.getBytesUtf16Be((String) null);
        StringUtils.newString(byteArray1, (String) null);
        StringUtils.getBytesUtf16Be(string0);
        // Undeclared exception!
        try {
            StringUtils.newStringUtf16Be(byteArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test181() throws Throwable {
        byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
        StringUtils.equals((CharSequence) "", (CharSequence) "");
        String string0 = "8!,H/6RhUL8L}x";
        StringUtils.newString(byteArray0, "8!,H/6RhUL8L}x");
        // Undeclared exception!
        try {
            StringUtils.getBytesUtf8(string0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // 8!,H/6RhUL8L}x: java.io.UnsupportedEncodingException: 8!,H/6RhUL8L}x
            //
            verifyException("org.apache.commons.codec.binary.StringUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test232() throws Throwable {
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
        // Undeclared exception!
        try {
            StringUtils.getBytesUtf16Le(string1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}
