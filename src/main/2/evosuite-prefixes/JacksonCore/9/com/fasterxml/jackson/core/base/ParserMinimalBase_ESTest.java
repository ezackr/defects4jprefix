/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 16:44:36 GMT 2024
 */
package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ParserMinimalBase_ESTest extends ParserMinimalBase_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ParserMinimalBase._ascii((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        StringReader stringReader0 = new StringReader("0f@\">7B!W }kh%6");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(3);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = ByteQuadsCanonicalizer.createRoot();
        byte[] byteArray0 = new byte[0];
        UTF8StreamJsonParser uTF8StreamJsonParser0 = new UTF8StreamJsonParser(iOContext0, 2, pushbackInputStream0, objectCodec0, byteQuadsCanonicalizer0, byteArray0, 789, (-5092), false);
        uTF8StreamJsonParser0.getLastClearedToken();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("+");
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 34, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue((-1L));
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        char[] charArray0 = new char[2];
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, (-355), (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0, charArray0, '\u0000', 1, true);
        readerBasedJsonParser0.nextValue();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.getBooleanValue();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("\"mDk ~/}'*&-");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        stringReader0.reset();
        readerBasedJsonParser0.getValueAsBoolean();
        readerBasedJsonParser0.getBinaryValue();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("true");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1001, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(1);
        int int0 = readerBasedJsonParser0.getCurrentTokenId();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 3, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        int int0 = readerBasedJsonParser0.getCurrentTokenId();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.hasCurrentToken();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("true");
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1001, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(1);
        boolean boolean0 = readerBasedJsonParser0.hasCurrentToken();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        IOContext iOContext0 = new IOContext(bufferRecycler0, charsToNameCanonicalizer0, false);
        StringReader stringReader0 = new StringReader("false");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        boolean boolean0 = readerBasedJsonParser0.hasTokenId(2986);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 3, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.hasTokenId(1);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 33, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.hasTokenId(0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 9, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(3);
        boolean boolean0 = readerBasedJsonParser0.hasTokenId(11);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
        StringReader stringReader0 = new StringReader("");
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 3, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        JsonToken jsonToken0 = JsonToken.VALUE_FALSE;
        boolean boolean0 = readerBasedJsonParser0.hasToken(jsonToken0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
        StringReader stringReader0 = new StringReader("");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.hasToken((JsonToken) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 33, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.isExpectedStartArrayToken();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        Double double0 = new Double(903.03903086);
        IOContext iOContext0 = new IOContext(bufferRecycler0, double0, false);
        StringReader stringReader0 = new StringReader("[J {E");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, (-112), stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0);
        boolean boolean0 = readerBasedJsonParser0.isExpectedStartArrayToken();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("\"mDk ~/}'*&-");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.isExpectedStartObjectToken();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("true");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 32, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextValue();
        readerBasedJsonParser0.getCurrentTokenId();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        JsonParser jsonParser0 = readerBasedJsonParser0.skipChildren();
        jsonParser0.isClosed();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.clearCurrentToken();
        readerBasedJsonParser0.isClosed();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("true");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(33);
        readerBasedJsonParser0.clearCurrentToken();
        readerBasedJsonParser0.hasCurrentToken();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("false");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        boolean boolean0 = readerBasedJsonParser0.getValueAsBoolean();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        IOContext iOContext0 = new IOContext(bufferRecycler0, charsToNameCanonicalizer0, false);
        StringReader stringReader0 = new StringReader("false");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        boolean boolean0 = readerBasedJsonParser0.getValueAsBoolean();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("NaN");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, (-765), stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue((-1L));
        boolean boolean0 = readerBasedJsonParser0.getValueAsBoolean();
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("true");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 32, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        boolean boolean0 = readerBasedJsonParser0.getValueAsBoolean();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 33, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(1);
        boolean boolean0 = readerBasedJsonParser0.getValueAsBoolean();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        Double double0 = new Double(903.03903086);
        IOContext iOContext0 = new IOContext(bufferRecycler0, double0, false);
        StringReader stringReader0 = new StringReader("[J {E");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, (-112), stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0);
        boolean boolean0 = readerBasedJsonParser0.getValueAsBoolean();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        IOContext iOContext0 = new IOContext(bufferRecycler0, charsToNameCanonicalizer0, false);
        StringReader stringReader0 = new StringReader("false");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        int int0 = readerBasedJsonParser0.getValueAsInt();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        StringReader stringReader0 = new StringReader("3  DZgOenN#E;I%");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 33, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        int int0 = readerBasedJsonParser0.getValueAsInt(0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("NaN");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 785, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue((-345L));
        int int0 = readerBasedJsonParser0.getValueAsInt((-765));
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        IOContext iOContext0 = new IOContext(bufferRecycler0, charsToNameCanonicalizer0, false);
        StringReader stringReader0 = new StringReader("false");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        int int0 = readerBasedJsonParser0.getValueAsInt();
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("true");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        int int0 = readerBasedJsonParser0.getValueAsInt();
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0);
        int int0 = readerBasedJsonParser0.getValueAsInt();
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("[");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, (-7236), stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        int int0 = readerBasedJsonParser0.getValueAsInt(101);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("\"Dk /}'*&-");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(1);
        stringReader0.reset();
        int int0 = readerBasedJsonParser0.getValueAsInt(bufferRecycler0.BYTE_BASE64_CODEC_BUFFER);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        StringReader stringReader0 = new StringReader("false");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        IOContext iOContext0 = new IOContext(bufferRecycler0, charsToNameCanonicalizer0, false);
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        long long0 = readerBasedJsonParser0.getValueAsLong();
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        StringReader stringReader0 = new StringReader("3  DZgOenN#E;I%");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 33, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        long long0 = readerBasedJsonParser0.getValueAsLong(0L);
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        StringReader stringReader0 = new StringReader("false");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        IOContext iOContext0 = new IOContext(bufferRecycler0, charsToNameCanonicalizer0, false);
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        long long0 = readerBasedJsonParser0.getValueAsLong();
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("true");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, objectCodec0, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(33);
        long long0 = readerBasedJsonParser0.getValueAsLong();
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 3, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        long long0 = readerBasedJsonParser0.getValueAsLong();
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("[Ifc4");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0L);
        long long0 = readerBasedJsonParser0.getValueAsLong();
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("\"mDk ~/}'*&-");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        stringReader0.reset();
        long long0 = readerBasedJsonParser0.getValueAsLong();
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, (Reader) null, (ObjectCodec) null, charsToNameCanonicalizer0);
        double double0 = readerBasedJsonParser0.getValueAsDouble((double) 2);
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("false");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(1);
        double double0 = readerBasedJsonParser0.getValueAsDouble(Double.NaN);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("\"mDk ~/}'*&-");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        readerBasedJsonParser0.getValueAsDouble((double) 1);
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("true");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(5092L);
        double double0 = readerBasedJsonParser0.getValueAsDouble((-1.0));
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(3);
        double double0 = readerBasedJsonParser0.getValueAsDouble(748.7571932279491);
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, false);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        StringReader stringReader0 = new StringReader("\"mDk ~/}'*&-");
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(2);
        stringReader0.reset();
        double double0 = readerBasedJsonParser0.getValueAsDouble((double) 1);
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("false");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        String string0 = readerBasedJsonParser0.getValueAsString();
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("false");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 2, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(1);
        String string0 = readerBasedJsonParser0.getValueAsString();
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        StringReader stringReader0 = new StringReader("null");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        readerBasedJsonParser0.nextLongValue(0);
        String string0 = readerBasedJsonParser0.getValueAsString("null");
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        String string0 = ParserMinimalBase._getCharDesc(1038);
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        byte[] byteArray0 = ParserMinimalBase._asciiBytes("K ");
    }
}
