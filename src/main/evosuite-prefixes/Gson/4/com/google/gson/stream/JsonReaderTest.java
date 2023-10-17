/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 16:21:39 GMT 2023
 */
package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import org.junit.runner.RunWith;

public class JsonReaderTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringReader stringReader0 = new StringReader("[kUiS");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-852);
        jsonReader0.nextLong();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StringReader stringReader0 = new StringReader("o2;$}Pr6#<");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-3232);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-710);
        jsonReader0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StringReader stringReader0 = new StringReader("Expected value");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 819;
        jsonReader0.nextString();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StringReader stringReader0 = new StringReader("o2;$}Pr6#<");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-3232);
        jsonReader0.nextName();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 325;
        boolean boolean0 = jsonReader0.hasNext();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 325;
        boolean boolean0 = jsonReader0.hasNext();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        StringReader stringReader0 = new StringReader("Vw");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-1);
        jsonReader0.endObject();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        int int0 = jsonReader0.getLineNumber();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        int int0 = jsonReader0.getLineNumber();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        StringReader stringReader0 = new StringReader("{=NHuXD");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        int int0 = jsonReader0.getColumnNumber();
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        StringReader stringReader0 = new StringReader("{=NHuXD");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        int int0 = jsonReader0.getColumnNumber();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        StringReader stringReader0 = new StringReader("{xZ(:Tf'2xODyGOcB");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.doPeek();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        StringReader stringReader0 = new StringReader("BEGIN_ARRAY");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.skipValue();
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        StringReader stringReader0 = new StringReader("Y~g'!2ABYI}q6)Q=");
        CharBuffer charBuffer0 = CharBuffer.allocate(2765);
        stringReader0.read(charBuffer0);
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.skipValue();
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peek();
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        StringReader stringReader0 = new StringReader("com.google.gson.stream.JsonReader$1");
        stringReader0.skip(71L);
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peek();
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        StringReader stringReader0 = new StringReader("NULL");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.nextString();
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        StringReader stringReader0 = new StringReader("E.t<O");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextString();
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextString();
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        StringReader stringReader0 = new StringReader("~)iy");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.nextNull();
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextNull();
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextNull();
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        StringReader stringReader0 = new StringReader("2^|9>G;}Hn[0;1");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextName();
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextName();
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        StringReader stringReader0 = new StringReader("null");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        stringReader0.close();
        jsonReader0.nextLong();
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextLong();
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.nextInt();
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        stringReader0.close();
        jsonReader0.nextInt();
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextInt();
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        StringReader stringReader0 = new StringReader("vutvuVq7c!");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        StringReader stringReader0 = new StringReader("U<`f");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 3462;
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        StringReader stringReader0 = new StringReader("E.t<O");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        stringReader0.close();
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test3033() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        StringReader stringReader0 = new StringReader("5z4*+u(T@G:Y|U");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        StringReader stringReader0 = new StringReader("End of input at line ");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test3336() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test3437() throws Throwable {
        StringReader stringReader0 = new StringReader("w>kn;I~^0>49%4");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        stringReader0.close();
        jsonReader0.hasNext();
    }

    @Test(timeout = 4000)
    public void test3538() throws Throwable {
        StringReader stringReader0 = new StringReader(" ");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.hasNext();
    }

    @Test(timeout = 4000)
    public void test3639() throws Throwable {
        StringReader stringReader0 = new StringReader("KZN~No|f/");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.endObject();
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        StringReader stringReader0 = new StringReader("GcL]e(y^RI+KJ3*7S");
        stringReader0.skip(71);
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.endObject();
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        StringReader stringReader0 = new StringReader("null");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.endArray();
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.endArray();
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.doPeek();
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        StringReader stringReader0 = new StringReader("o`sn^h~6't");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.doPeek();
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.doPeek();
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        StringReader stringReader0 = new StringReader("A>72fe3ax;<v^");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.beginObject();
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.beginObject();
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        stringReader0.close();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.beginObject();
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
        StringReader stringReader0 = new StringReader("o2;$}Pr6#<");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-3232);
        jsonReader0.beginArray();
    }

    @Test(timeout = 4000)
    public void test4750() throws Throwable {
        StringReader stringReader0 = new StringReader("*d\"");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        stringReader0.close();
        jsonReader0.beginArray();
    }

    @Test(timeout = 4000)
    public void test4851() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.beginArray();
    }

    @Test(timeout = 4000)
    public void test4952() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        String string0 = jsonReader0.getPath();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test4953() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        String string0 = jsonReader0.getPath();
    }

    @Test(timeout = 4000)
    public void test5054() throws Throwable {
        StringReader stringReader0 = new StringReader("#U5!q");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.skipValue();
    }

    @Test(timeout = 4000)
    public void test5155() throws Throwable {
        StringReader stringReader0 = new StringReader("/{O");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.skipValue();
    }

    @Test(timeout = 4000)
    public void test5256() throws Throwable {
        StringReader stringReader0 = new StringReader("Expected value");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 819;
        jsonReader0.nextInt();
    }

    @Test(timeout = 4000)
    public void test5357() throws Throwable {
        StringReader stringReader0 = new StringReader("`711./t<5S");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.setLenient(true);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test5458() throws Throwable {
        StringReader stringReader0 = new StringReader("JSON forbids NaN and infinities: ");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.setLenient(true);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test5559() throws Throwable {
        StringReader stringReader0 = new StringReader("<.23g}'754qX%");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextLong();
    }

    @Test(timeout = 4000)
    public void test5660() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 325;
        jsonReader0.nextLong();
    }

    @Test(timeout = 4000)
    public void test5761() throws Throwable {
        StringReader stringReader0 = new StringReader("9If^oD|XB12`zHog0");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextNull();
    }

    @Test(timeout = 4000)
    public void test5862() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-710);
        jsonReader0.nextNull();
    }

    @Test(timeout = 4000)
    public void test5963() throws Throwable {
        StringReader stringReader0 = new StringReader("AUsg9fN-2a");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test6064() throws Throwable {
        StringReader stringReader0 = new StringReader("Expected value");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 819;
        jsonReader0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test6165() throws Throwable {
        StringReader stringReader0 = new StringReader("o2;$}Pr6#<");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-3232);
        jsonReader0.nextString();
    }

    @Test(timeout = 4000)
    public void test6266() throws Throwable {
        StringReader stringReader0 = new StringReader("Expected value");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 819;
        jsonReader0.nextName();
    }

    @Test(timeout = 4000)
    public void test6367() throws Throwable {
        StringReader stringReader0 = new StringReader("EGIN_BECT");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.setLenient(true);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test6468() throws Throwable {
        StringReader stringReader0 = new StringReader(";c<H4");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextString();
    }

    @Test(timeout = 4000)
    public void test6569() throws Throwable {
        StringReader stringReader0 = new StringReader("'q8p&$");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.doPeek();
    }

    @Test(timeout = 4000)
    public void test6670() throws Throwable {
        StringReader stringReader0 = new StringReader("1\"a!");
        stringReader0.read();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.doPeek();
    }

    @Test(timeout = 4000)
    public void test6771() throws Throwable {
        StringReader stringReader0 = new StringReader("BEGIN_OBJECT");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.setLenient(true);
        jsonReader0.nextString();
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test6872() throws Throwable {
        StringReader stringReader0 = new StringReader("@0C@S3y");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        jsonReader0.hasNext();
    }

    @Test(timeout = 4000)
    public void test6973() throws Throwable {
        StringReader stringReader0 = new StringReader("U<`f");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 13;
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test7074() throws Throwable {
        StringReader stringReader0 = new StringReader("JSON forbids NaN and infinities: ");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.setLenient(true);
        jsonReader0.nextName();
    }

    @Test(timeout = 4000)
    public void test7175() throws Throwable {
        StringReader stringReader0 = new StringReader("BEGIN_OBJECT");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 7;
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test7276() throws Throwable {
        StringReader stringReader0 = new StringReader("[SqKW5ra{K'pBQP|w7_");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        JsonToken jsonToken0 = jsonReader0.peek();
    }

    @Test(timeout = 4000)
    public void test7377() throws Throwable {
        StringReader stringReader0 = new StringReader("t{~wEAbQS]>VfH");
        stringReader0.read();
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.beginArray();
    }

    @Test(timeout = 4000)
    public void test7478() throws Throwable {
        StringReader stringReader0 = new StringReader("com.google.gson.stream.JsonReader$1");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peek();
    }

    @Test(timeout = 4000)
    public void test7579() throws Throwable {
        StringReader stringReader0 = new StringReader("$VALUES");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.hasNext();
    }

    @Test(timeout = 4000)
    public void test7680() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-710);
        boolean boolean0 = jsonReader0.hasNext();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test7681() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-710);
        boolean boolean0 = jsonReader0.hasNext();
    }

    @Test(timeout = 4000)
    public void test7782() throws Throwable {
        StringReader stringReader0 = new StringReader("E.t<O");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.endObject();
    }

    @Test(timeout = 4000)
    public void test7883() throws Throwable {
        StringReader stringReader0 = new StringReader("Cv2W#S#jiAa");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 4281;
        jsonReader0.endObject();
    }

    @Test(timeout = 4000)
    public void test7984() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.beginObject();
    }

    @Test(timeout = 4000)
    public void test8085() throws Throwable {
        StringReader stringReader0 = new StringReader("$[5E-<");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 74;
        jsonReader0.beginObject();
    }

    @Test(timeout = 4000)
    public void test8186() throws Throwable {
        StringReader stringReader0 = new StringReader("-xt:13';.P");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.endArray();
    }

    @Test(timeout = 4000)
    public void test8287() throws Throwable {
        StringReader stringReader0 = new StringReader(":ZF&&3Z>c+v^.68s0<&");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = (-710);
        jsonReader0.endArray();
    }

    @Test(timeout = 4000)
    public void test8388() throws Throwable {
        StringReader stringReader0 = new StringReader(")&5AMT~.rI");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.beginArray();
    }

    @Test(timeout = 4000)
    public void test8489() throws Throwable {
        StringReader stringReader0 = new StringReader("z");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.peeked = 4;
        jsonReader0.beginArray();
    }

    @Test(timeout = 4000)
    public void test8590() throws Throwable {
        JsonReader jsonReader0 = null;
        jsonReader0 = new JsonReader((Reader) null);
    }

    @Test(timeout = 4000)
    public void test8691() throws Throwable {
        StringReader stringReader0 = new StringReader(" at line ");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.nextInt();
    }

    @Test(timeout = 4000)
    public void test8792() throws Throwable {
        StringReader stringReader0 = new StringReader("BEGIN_OBJECT");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        String string0 = jsonReader0.getPath();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test8793() throws Throwable {
        StringReader stringReader0 = new StringReader("BEGIN_OBJECT");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.close();
        String string0 = jsonReader0.getPath();
    }

    @Test(timeout = 4000)
    public void test8894() throws Throwable {
        StringReader stringReader0 = new StringReader("-sTt<sLSsC(H+;");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        String string0 = jsonReader0.toString();
        jsonReader0.isLenient();
    }

    @Test(timeout = 4000)
    public void test8895() throws Throwable {
        StringReader stringReader0 = new StringReader("-sTt<sLSsC(H+;");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        String string0 = jsonReader0.toString();
    }

    @Test(timeout = 4000)
    public void test8996() throws Throwable {
        StringReader stringReader0 = new StringReader("-sTt<sLSsC(H+;");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        jsonReader0.setLenient(true);
        jsonReader0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test9097() throws Throwable {
        StringReader stringReader0 = new StringReader("Expected a boolean but was ");
        JsonReader jsonReader0 = new JsonReader(stringReader0);
        boolean boolean0 = jsonReader0.isLenient();
    }
}
