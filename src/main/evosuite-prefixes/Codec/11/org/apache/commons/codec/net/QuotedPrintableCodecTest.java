/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 03:35:44 GMT 2023
 */
package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import java.nio.LongBuffer;
import java.util.BitSet;
import org.apache.commons.codec.net.QuotedPrintableCodec;
import org.junit.runner.RunWith;

public class QuotedPrintableCodecTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        String string0 = quotedPrintableCodec0.getDefaultCharset();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        String string0 = quotedPrintableCodec0.getDefaultCharset();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        long[] longArray0 = new long[9];
        BitSet bitSet0 = BitSet.valueOf(longArray0);
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
        byteArray1.equals((Object) byteArray0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("V-SwopsGjdev!");
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode("UTF-8", "UTF-8");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode("", "UTF-8");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode("");
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode("");
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.encode((Object) "");
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.encode((Object) "");
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
        byteArray1.equals((Object) byteArray0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        byte[] byteArray0 = new byte[5];
        byte[] byteArray1 = quotedPrintableCodec0.decode(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = quotedPrintableCodec0.decode(byteArray0);
        byteArray1.equals((Object) byteArray0);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("ZlB8 3hK");
        String string0 = quotedPrintableCodec0.decode("ZlB8 3hK", "UTF-8");
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode("b.");
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode("b.");
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode("");
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode("");
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        quotedPrintableCodec0.encode("UTF-8", "zi#ThtC+iAsdS2");
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        quotedPrintableCodec0.encode("");
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        quotedPrintableCodec0.encode("+Iq?6$O!c");
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = new byte[7];
        byteArray0[5] = (byte) 61;
        quotedPrintableCodec0.decode(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("nL=*`V|f}<");
        quotedPrintableCodec0.decode("nL=*`V|f}<", "nL=*`V|f}<");
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        quotedPrintableCodec0.decode("i", "");
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        quotedPrintableCodec0.decode("'tJ~VTig-");
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        quotedPrintableCodec0.decode((Object) "3IA)]dL6mS7.Oi");
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        quotedPrintableCodec0.encode("", (String) null);
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        quotedPrintableCodec0.decode("");
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[2] = (byte) 61;
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        byte[] byteArray0 = new byte[5];
        byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        byte[] byteArray0 = QuotedPrintableCodec.decodeQuotedPrintable((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[1] = (byte) (-101);
        long[] longArray0 = new long[9];
        longArray0[2] = (long) (byte) (-5);
        LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
        BitSet bitSet0 = BitSet.valueOf(longBuffer0);
        byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        BitSet bitSet0 = new BitSet();
        byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, (byte[]) null);
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.getDefaultCharset();
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        String string0 = quotedPrintableCodec0.encode((String) null, "org.apache.commons.codec.DecoderException");
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = new Object();
        quotedPrintableCodec0.decode(object0);
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.decode((Object) null);
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = new Object();
        quotedPrintableCodec0.encode(object0);
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.encode((Object) null);
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode((String) null);
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.decode((String) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test3741() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode((String) null);
    }

    @Test(timeout = 4000)
    public void test3842() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.decode((Object) "VM=7F");
    }

    @Test(timeout = 4000)
    public void test3843() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        Object object0 = quotedPrintableCodec0.decode((Object) "VM=7F");
    }

    @Test(timeout = 4000)
    public void test3944() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        quotedPrintableCodec0.decode("UTF-8", (String) null);
    }

    @Test(timeout = 4000)
    public void test4045() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = quotedPrintableCodec0.decode((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test4146() throws Throwable {
        BitSet bitSet0 = new BitSet();
        byte[] byteArray0 = new byte[2];
        byteArray0[1] = (byte) (-7);
        byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
    }

    @Test(timeout = 4000)
    public void test4247() throws Throwable {
        byte[] byteArray0 = new byte[11];
        byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0);
    }

    @Test(timeout = 4000)
    public void test4348() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = quotedPrintableCodec0.encode((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test4449() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
    }

    @Test(timeout = 4000)
    public void test4450() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
    }

    @Test(timeout = 4000)
    public void test4551() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode("8Nmlf.>\"5Zl");
    }

    @Test(timeout = 4000)
    public void test4552() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
        String string0 = quotedPrintableCodec0.encode("8Nmlf.>\"5Zl");
    }

    @Test(timeout = 4000)
    public void test4653() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        String string0 = quotedPrintableCodec0.decode("", "UTF-8");
    }

    @Test(timeout = 4000)
    public void test4654() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec("");
        String string0 = quotedPrintableCodec0.decode("", "UTF-8");
    }

    @Test(timeout = 4000)
    public void test4755() throws Throwable {
        QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        quotedPrintableCodec0.encode((Object) "K");
    }
}
