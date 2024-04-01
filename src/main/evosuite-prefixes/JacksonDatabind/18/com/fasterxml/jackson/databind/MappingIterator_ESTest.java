/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 17:17:10 GMT 2023
 */
package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.time.Month;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MappingIterator_ESTest extends MappingIterator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        mappingIterator0.next();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        mappingIterator0._handleIOException((IOException) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        boolean boolean0 = mappingIterator0.hasNext();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TextNode textNode0 = new TextNode("o*b%Gn");
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(textNode0);
        Class<Object> class0 = Object.class;
        MappingIterator<Object> mappingIterator0 = objectMapper0.readValues(jsonParser0, class0);
        List<Object> list0 = mappingIterator0.readAll();
        list0.contains("o*b%Gn");
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TextNode textNode0 = new TextNode("o*b%Gn");
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(textNode0);
        Class<Object> class0 = Object.class;
        MappingIterator<Object> mappingIterator0 = objectMapper0.readValues(jsonParser0, class0);
        List<Object> list0 = mappingIterator0.readAll();
        jsonParser0.isClosed();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BigIntegerNode> class0 = BigIntegerNode.class;
        MappingIterator<BigIntegerNode> mappingIterator0 = objectMapper0.readValues((JsonParser) null, class0);
        JsonParser jsonParser0 = mappingIterator0.getParser();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        mappingIterator0.getCurrentLocation();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        mappingIterator0.remove();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        mappingIterator0.getParserSchema();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        MappingIterator<Boolean> mappingIterator0 = MappingIterator.emptyIterator();
        JsonMappingException jsonMappingException0 = new JsonMappingException("1snoM[ZnLA.");
        mappingIterator0._handleMappingException(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JavaType javaType0 = TypeFactory.unknownType();
        ArrayNode arrayNode0 = objectMapper0.createArrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        JsonDeserializer<String> jsonDeserializer0 = (JsonDeserializer<String>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 289);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
        MappingIterator<String> mappingIterator0 = new MappingIterator<String>(javaType0, jsonParser0, defaultDeserializationContext_Impl0, jsonDeserializer0, true, bufferedInputStream0);
        mappingIterator0.hasNextValue();
        JsonDeserializer<Month> jsonDeserializer1 = (JsonDeserializer<Month>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        MappingIterator<String> mappingIterator1 = new MappingIterator<String>(javaType0, jsonParser0, defaultDeserializationContext_Impl0, jsonDeserializer1, true, jsonParser0);
        Class<Boolean> class0 = Boolean.class;
        MappingIterator<Boolean> mappingIterator2 = objectMapper0.readValues(jsonParser0, class0);
        mappingIterator2.nextValue();
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        BaseSettings baseSettings0 = ObjectMapper.DEFAULT_BASE;
        MappingIterator<BigIntegerNode> mappingIterator0 = new MappingIterator<BigIntegerNode>((JavaType) null, (JsonParser) null, defaultDeserializationContext_Impl0, (JsonDeserializer<?>) null, true, baseSettings0);
        mappingIterator0.close();
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TextNode textNode0 = new TextNode("o*b%Gn");
        JsonParser jsonParser0 = objectMapper0.treeAsTokens(textNode0);
        Class<Boolean> class0 = Boolean.class;
        MappingIterator<Boolean> mappingIterator0 = objectMapper0.readValues(jsonParser0, class0);
        mappingIterator0.close();
        jsonParser0.isClosed();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JavaType javaType0 = TypeFactory.unknownType();
        ArrayNode arrayNode0 = objectMapper0.createArrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        JsonDeserializer<String> jsonDeserializer0 = (JsonDeserializer<String>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 289);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
        MappingIterator<String> mappingIterator0 = new MappingIterator<String>(javaType0, jsonParser0, defaultDeserializationContext_Impl0, jsonDeserializer0, true, bufferedInputStream0);
        mappingIterator0.hasNextValue();
        boolean boolean0 = mappingIterator0.hasNextValue();
        jsonParser0.isExpectedStartArrayToken();
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JavaType javaType0 = TypeFactory.unknownType();
        ArrayNode arrayNode0 = objectMapper0.createArrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        JsonDeserializer<String> jsonDeserializer0 = (JsonDeserializer<String>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 289);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
        MappingIterator<String> mappingIterator0 = new MappingIterator<String>(javaType0, jsonParser0, defaultDeserializationContext_Impl0, jsonDeserializer0, true, bufferedInputStream0);
        mappingIterator0.hasNextValue();
        boolean boolean0 = mappingIterator0.hasNextValue();
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Class<Integer> class0 = Integer.class;
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 1);
        ArrayNode arrayNode0 = objectMapper0.createArrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        MappingIterator<String> mappingIterator0 = new MappingIterator<String>((JavaType) null, jsonParser0, defaultDeserializationContext_Impl0, coreXMLDeserializers_Std0, true, bufferRecycler0);
        mappingIterator0.hasNextValue();
        Class<Boolean> class1 = Boolean.TYPE;
        MappingIterator<Boolean> mappingIterator1 = objectMapper0.readValues(jsonParser0, class1);
        mappingIterator1.nextValue();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Class<Integer> class0 = Integer.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapType mapType0 = MapType.construct(class0, simpleType0, simpleType0);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, mapType0, true);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(defaultDeserializationContext_Impl0);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, (Reader) null, objectReader0, charsToNameCanonicalizer0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 1150);
        MappingIterator<String> mappingIterator0 = new MappingIterator<String>(mapType0, readerBasedJsonParser0, defaultDeserializationContext_Impl0, coreXMLDeserializers_Std0, true, iOContext0);
        mappingIterator0.nextValue();
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Class<Integer> class0 = Integer.class;
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 1);
        ArrayNode arrayNode0 = objectMapper0.createArrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        MappingIterator<String> mappingIterator0 = new MappingIterator<String>((JavaType) null, jsonParser0, defaultDeserializationContext_Impl0, coreXMLDeserializers_Std0, true, bufferRecycler0);
        Vector<Object> vector0 = new Vector<Object>();
        mappingIterator0.readAll((List<Object>) vector0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        MappingIterator<Object> mappingIterator0 = MappingIterator.emptyIterator();
        Vector<Object> vector0 = new Vector<Object>();
        List<Object> list0 = mappingIterator0.readAll((List<Object>) vector0);
        list0.size();
    }
}
