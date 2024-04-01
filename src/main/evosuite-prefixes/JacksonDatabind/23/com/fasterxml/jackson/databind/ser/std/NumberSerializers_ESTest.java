/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 17:29:32 GMT 2023
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NumberSerializers_ESTest extends NumberSerializers_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer();
        JsonNode jsonNode0 = numberSerializers_DoubleSerializer0.getSchema((SerializerProvider) null, (Type) null, false);
        jsonNode0.booleanValue();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        NumberSerializers numberSerializers0 = new NumberSerializers();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
        NumberSerializers.IntegerSerializer numberSerializers_IntegerSerializer0 = new NumberSerializers.IntegerSerializer();
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
        MockFile mockFile0 = new MockFile("JSON");
        JsonEncoding jsonEncoding0 = JsonEncoding.UTF16_BE;
        JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((File) mockFile0, jsonEncoding0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        numberSerializers_IntegerSerializer0.serializeWithType(numberSerializers_FloatSerializer0, jsonGenerator0, defaultSerializerProvider_Impl0, (TypeSerializer) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = NumberSerializers.FloatSerializer.instance;
        Class<SimpleModule> class0 = SimpleModule.class;
        JsonFactory jsonFactory0 = new JsonFactory();
        File file0 = MockFile.createTempFile(".X8&Sd9LU`Pz~6d", "JSON");
        MockFileWriter mockFileWriter0 = new MockFileWriter(file0);
        JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((Writer) mockFileWriter0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        numberSerializers_FloatSerializer0.serialize(class0, jsonGenerator0, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        NumberSerializers.LongSerializer numberSerializers_LongSerializer0 = new NumberSerializers.LongSerializer();
        numberSerializers_LongSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        NumberSerializers.LongSerializer numberSerializers_LongSerializer0 = NumberSerializers.LongSerializer.instance;
        Integer integer0 = new Integer((-26));
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        numberSerializers_LongSerializer0.serialize(integer0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        NumberSerializers.IntLikeSerializer numberSerializers_IntLikeSerializer0 = NumberSerializers.IntLikeSerializer.instance;
        BigInteger bigInteger0 = BigInteger.ZERO;
        BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1, (ObjectCodec) null, byteArrayOutputStream0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        numberSerializers_IntLikeSerializer0.serialize((Number) bigDecimal0, (JsonGenerator) uTF8JsonGenerator0, (SerializerProvider) defaultSerializerProvider_Impl0);
        uTF8JsonGenerator0.canWriteBinaryNatively();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        NumberSerializers.IntLikeSerializer numberSerializers_IntLikeSerializer0 = new NumberSerializers.IntLikeSerializer();
        numberSerializers_IntLikeSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = NumberSerializers.DoubleSerializer.instance;
        Class<Object> class0 = numberSerializers_DoubleSerializer0.handledType();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        numberSerializers_DoubleSerializer0.serializeWithType(class0, (JsonGenerator) null, defaultSerializerProvider_Impl0, (TypeSerializer) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        numberSerializers_ShortSerializer0.serialize((Short) null, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        numberSerializers_DoubleSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
        numberSerializers_DoubleSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer();
        JsonSerializer<?> jsonSerializer0 = numberSerializers_DoubleSerializer0.createContextual((SerializerProvider) null, (BeanProperty) null);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanProperty.Std beanProperty_Std0 = new BeanProperty.Std((PropertyName) null, (JavaType) null, (PropertyName) null, (Annotations) null, (AnnotatedMember) null, (PropertyMetadata) null);
        JsonSerializer<?> jsonSerializer0 = numberSerializers_ShortSerializer0.createContextual(defaultSerializerProvider_Impl0, beanProperty_Std0);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        MockFile mockFile0 = new MockFile("oL", "JSON");
        objectMapper0.writeValue((File) mockFile0, (Object) defaultDeserializationContext_Impl0);
    }
}
