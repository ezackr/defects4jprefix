/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:24:03 GMT 2023
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ext.DOMSerializer;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;
import org.junit.runner.RunWith;

public class StdDelegatingSerializerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<Object> class0 = Object.class;
        Converter<Object, String> converter0 = (Converter<Object, String>) mock(Converter.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(converter0).toString();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer(class0, (Converter<Object, ?>) converter0);
        Converter<Object, ?> converter1 = stdDelegatingSerializer0.getConverter();
        assertNotNull(converter1);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, true);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 18);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, byteArrayBuilder0, byteArrayBuilder0.NO_BYTES, 3, true);
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProvider();
        // Undeclared exception!
        try {
            stdDelegatingSerializer0.serializeWithType((Object) null, uTF8JsonGenerator0, serializerProvider0, (TypeSerializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<DOMSerializer> class0 = DOMSerializer.class;
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer(class0, (Converter<DOMSerializer, ?>) null);
        JsonSerializer<?> jsonSerializer0 = stdDelegatingSerializer0.getDelegatee();
        assertNull(jsonSerializer0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        // Undeclared exception!
        try {
            stdDelegatingSerializer0.isEmpty((SerializerProvider) null, (Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        JavaType javaType0 = TypeFactory.unknownType();
        StdDelegatingSerializer stdDelegatingSerializer1 = stdDelegatingSerializer0.withDelegate((Converter<Object, ?>) null, javaType0, (JsonSerializer<?>) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            stdDelegatingSerializer1.createContextual(defaultSerializerProvider_Impl0, (BeanProperty) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        // Undeclared exception!
        try {
            stdDelegatingSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        // Undeclared exception!
        try {
            stdDelegatingSerializer0.isEmpty((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        stdDelegatingSerializer0.resolve(defaultSerializerProvider_Impl0);
        assertFalse(stdDelegatingSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<Object, ?>) null, simpleType0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        StdDelegatingSerializer stdDelegatingSerializer1 = new StdDelegatingSerializer((Converter<Object, ?>) null, simpleType0, stdDelegatingSerializer0);
        stdDelegatingSerializer1.resolve(defaultSerializerProvider_Impl0);
        assertFalse(stdDelegatingSerializer1.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            stdDelegatingSerializer0.createContextual(defaultSerializerProvider_Impl0, (BeanProperty) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<Object, ?>) null, simpleType0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        StdDelegatingSerializer stdDelegatingSerializer1 = new StdDelegatingSerializer((Converter<Object, ?>) null, simpleType0, stdDelegatingSerializer0);
        JsonSerializer<?> jsonSerializer0 = stdDelegatingSerializer1.createContextual(defaultSerializerProvider_Impl0, (BeanProperty) null);
        assertNotSame(stdDelegatingSerializer0, jsonSerializer0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Integer integer0 = new Integer(2994);
        Converter<Object, Integer> converter0 = (Converter<Object, Integer>) mock(Converter.class, new ViolatedAssumptionAnswer());
        doReturn(integer0).when(converter0).convert(any());
        Class<BeanSerializer> class0 = BeanSerializer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer(converter0, simpleType0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        try {
            stdDelegatingSerializer0.serialize(class0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Converter<Object, Integer> converter0 = (Converter<Object, Integer>) mock(Converter.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(converter0).convert(any());
        Class<BeanSerializer> class0 = BeanSerializer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer(converter0, simpleType0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        // Undeclared exception!
        try {
            stdDelegatingSerializer0.serialize(class0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        JsonNode jsonNode0 = stdDelegatingSerializer0.getSchema((SerializerProvider) null, (Type) simpleType0);
        assertFalse(jsonNode0.isFloatingPointNumber());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<StdDelegatingSerializer> class0 = StdDelegatingSerializer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<Object, ?>) null, simpleType0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        JsonNode jsonNode0 = stdDelegatingSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0);
        assertNull(jsonNode0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonNode jsonNode0 = stdDelegatingSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) null, false);
        assertFalse(jsonNode0.isLong());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Class<StdDelegatingSerializer> class0 = StdDelegatingSerializer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<Object, ?>) null, simpleType0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        JsonNode jsonNode0 = stdDelegatingSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0, true);
        assertNull(jsonNode0);
    }
}
