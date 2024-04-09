/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 17:44:10 GMT 2024
 */
package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DefaultPrettyPrinter_ESTest extends DefaultPrettyPrinter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.createInstance();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        defaultPrettyPrinter0.writeObjectEntrySeparator((JsonGenerator) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        defaultPrettyPrinter0.beforeArrayValues((JsonGenerator) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        defaultPrettyPrinter0.beforeObjectEntries((JsonGenerator) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withoutSpacesInObjectEntries();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withSpacesInObjectEntries();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        StringWriter stringWriter0 = new StringWriter();
        WriterBasedJsonGenerator writerBasedJsonGenerator0 = new WriterBasedJsonGenerator(iOContext0, 0, (ObjectCodec) null, stringWriter0);
        defaultPrettyPrinter0.writeArrayValueSeparator(writerBasedJsonGenerator0);
        writerBasedJsonGenerator0.canWriteTypeId();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0._withSpaces(true);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1111, (ObjectCodec) null, (OutputStream) null);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        DefaultPrettyPrinter.NopIndenter defaultPrettyPrinter_NopIndenter0 = new DefaultPrettyPrinter.NopIndenter();
        defaultPrettyPrinter1._objectIndenter = (DefaultPrettyPrinter.Indenter) defaultPrettyPrinter_NopIndenter0;
        defaultPrettyPrinter1._objectIndenter.isInline();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0._withSpaces(true);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1111, (ObjectCodec) null, (OutputStream) null);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        DefaultPrettyPrinter.NopIndenter defaultPrettyPrinter_NopIndenter0 = new DefaultPrettyPrinter.NopIndenter();
        defaultPrettyPrinter1._objectIndenter = (DefaultPrettyPrinter.Indenter) defaultPrettyPrinter_NopIndenter0;
        FilteringGeneratorDelegate filteringGeneratorDelegate0 = new FilteringGeneratorDelegate(uTF8JsonGenerator0, tokenFilter0, true, true);
        defaultPrettyPrinter0.writeStartObject(filteringGeneratorDelegate0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0._withSpaces(true);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1111, (ObjectCodec) null, (OutputStream) null);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        DefaultPrettyPrinter.NopIndenter defaultPrettyPrinter_NopIndenter0 = new DefaultPrettyPrinter.NopIndenter();
        defaultPrettyPrinter1._objectIndenter = (DefaultPrettyPrinter.Indenter) defaultPrettyPrinter_NopIndenter0;
        FilteringGeneratorDelegate filteringGeneratorDelegate0 = new FilteringGeneratorDelegate(uTF8JsonGenerator0, tokenFilter0, true, true);
        defaultPrettyPrinter1.writeEndObject(filteringGeneratorDelegate0, 593);
        filteringGeneratorDelegate0.getOutputBuffered();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0._withSpaces(true);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1111, (ObjectCodec) null, (OutputStream) null);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        DefaultPrettyPrinter.NopIndenter defaultPrettyPrinter_NopIndenter0 = new DefaultPrettyPrinter.NopIndenter();
        defaultPrettyPrinter1._objectIndenter = (DefaultPrettyPrinter.Indenter) defaultPrettyPrinter_NopIndenter0;
        FilteringGeneratorDelegate filteringGeneratorDelegate0 = new FilteringGeneratorDelegate(uTF8JsonGenerator0, tokenFilter0, true, true);
        defaultPrettyPrinter1.writeEndObject(filteringGeneratorDelegate0, 593);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        defaultPrettyPrinter0.writeStartArray((JsonGenerator) null);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withRootSeparator((SerializableString) defaultPrettyPrinter0.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        SerializedString serializedString0 = PrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withRootSeparator((SerializableString) serializedString0);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withRootSeparator("d6)[R)^!HjVS&s|");
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withRootSeparator((String) null);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        defaultPrettyPrinter0.indentArraysWith((DefaultPrettyPrinter.Indenter) null);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultIndenter defaultIndenter0 = new DefaultIndenter();
        defaultPrettyPrinter0.indentObjectsWith(defaultIndenter0);
        defaultIndenter0.isInline();
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        defaultPrettyPrinter0.indentObjectsWith((DefaultPrettyPrinter.Indenter) null);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withArrayIndenter((DefaultPrettyPrinter.Indenter) null);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter.FixedSpaceIndenter defaultPrettyPrinter_FixedSpaceIndenter0 = new DefaultPrettyPrinter.FixedSpaceIndenter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withArrayIndenter(defaultPrettyPrinter_FixedSpaceIndenter0);
        DefaultPrettyPrinter defaultPrettyPrinter2 = defaultPrettyPrinter1.withArrayIndenter(defaultPrettyPrinter_FixedSpaceIndenter0);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withObjectIndenter((DefaultPrettyPrinter.Indenter) null);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        SerializedString serializedString0 = PrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter(serializedString0);
        DefaultIndenter defaultIndenter0 = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withObjectIndenter(defaultIndenter0);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        StringWriter stringWriter0 = new StringWriter();
        WriterBasedJsonGenerator writerBasedJsonGenerator0 = new WriterBasedJsonGenerator(iOContext0, 0, (ObjectCodec) null, stringWriter0);
        DefaultPrettyPrinter defaultPrettyPrinter1 = new DefaultPrettyPrinter((String) null);
        defaultPrettyPrinter1.writeRootValueSeparator(writerBasedJsonGenerator0);
        writerBasedJsonGenerator0.canOmitFields();
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1111, (ObjectCodec) null, (OutputStream) null);
        defaultPrettyPrinter0.writeRootValueSeparator(uTF8JsonGenerator0);
        uTF8JsonGenerator0.getOutputBuffered();
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultPrettyPrinter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1111, (ObjectCodec) null, (OutputStream) null);
        defaultPrettyPrinter0.writeStartObject(uTF8JsonGenerator0);
        uTF8JsonGenerator0.getFeatureMask();
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultIndenter defaultIndenter0 = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0._withSpaces(false);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, defaultIndenter0, true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1, (ObjectCodec) null, (OutputStream) null);
        defaultPrettyPrinter1.writeObjectFieldValueSeparator(uTF8JsonGenerator0);
        uTF8JsonGenerator0.getOutputBuffered();
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        Object object0 = new Object();
        IOContext iOContext0 = new IOContext(bufferRecycler0, object0, false);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1338, (ObjectCodec) null, (OutputStream) null);
        defaultPrettyPrinter0.writeObjectFieldValueSeparator(uTF8JsonGenerator0);
        uTF8JsonGenerator0.getOutputBuffered();
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, "bX", true);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, (-151), (ObjectCodec) null, (OutputStream) null);
        defaultPrettyPrinter0.writeEndObject(uTF8JsonGenerator0, (-321));
        uTF8JsonGenerator0.getHighestEscapedChar();
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter();
        DefaultIndenter defaultIndenter0 = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.withArrayIndenter(defaultIndenter0);
        defaultPrettyPrinter1.writeStartArray((JsonGenerator) null);
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter");
        BufferRecycler bufferRecycler0 = new BufferRecycler(1, 3);
        IOContext iOContext0 = new IOContext(bufferRecycler0, "", false);
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 3);
        byte[] byteArray0 = new byte[1];
        DefaultIndenter defaultIndenter0 = new DefaultIndenter();
        defaultPrettyPrinter0.indentArraysWith(defaultIndenter0);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 710, (ObjectCodec) null, bufferedOutputStream0, byteArray0, 0, false);
        defaultPrettyPrinter0.writeEndArray(uTF8JsonGenerator0, (-853));
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        DefaultPrettyPrinter defaultPrettyPrinter0 = new DefaultPrettyPrinter("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter");
        BufferRecycler bufferRecycler0 = new BufferRecycler(1, 3);
        IOContext iOContext0 = new IOContext(bufferRecycler0, "", false);
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 3);
        byte[] byteArray0 = new byte[1];
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 710, (ObjectCodec) null, bufferedOutputStream0, byteArray0, 0, false);
        defaultPrettyPrinter0.writeEndArray(uTF8JsonGenerator0, 2);
    }
}
