/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 12:11:30 GMT 2024
 */
package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.BitSet;
import org.apache.commons.codec.net.QuotedPrintableCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class QuotedPrintableCodec_ESTest extends QuotedPrintableCodec_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("UTF-16");
        Object object0 = quotedPrintableCodec0.encode((Object) "UTF-16");
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("UTF-16");
        Object object0 = quotedPrintableCodec0.encode((Object) "UTF-16");
        assertEquals("=FE=FF=00U=00T=00F=00-=001=006", object0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("org.apache.commons.codec.DecoderException");
        try {
            quotedPrintableCodec0.decode((Object) "org.apache.commons.codec.DecoderException");
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // org.apache.commons.codec.DecoderException
            //
            verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
        }
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = quotedPrintableCodec0.encode((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        byte[] byteArray0 = new byte[2];
        byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0);
        assertArrayEquals(new byte[] { (byte) 61, (byte) 48, (byte) 48, (byte) 61, (byte) 48, (byte) 48 }, byteArray1);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        byte[] byteArray0 = QuotedPrintableCodec.decodeQuotedPrintable((byte[]) null);
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        try {
            quotedPrintableCodec0.decode((Object) "&dh(=3GFQemTt.u<");
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Invalid URL encoding: not a valid digit (radix 16): 71
            //
            verifyException("org.apache.commons.codec.net.Utils", e);
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode((String) null, (String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.encode((Object) null);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        try {
            quotedPrintableCodec0.encode((Object) quotedPrintableCodec0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Objects of type org.apache.commons.codec.net.QuotedPrintableCodec cannot be quoted-printable encoded
            //
            verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.decode((Object) null);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        try {
            quotedPrintableCodec0.decode((Object) quotedPrintableCodec0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Objects of type org.apache.commons.codec.net.QuotedPrintableCodec cannot be quoted-printable decoded
            //
            verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode((String) null, (String) null);
        assertNull(string0);
    }
}
