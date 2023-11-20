/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:05:30 GMT 2023
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.OutputStream;
import java.lang.reflect.Type;
import org.junit.runner.RunWith;

public class NumberSerializersTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<Double> class0 = Double.class;
        NumberSerializers.IntegerSerializer numberSerializers_IntegerSerializer0 = new NumberSerializers.IntegerSerializer(class0);
        JsonNode jsonNode0 = numberSerializers_IntegerSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0);
        assertEquals(1, jsonNode0.size());
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Long> class0 = Long.TYPE;
        NumberSerializers.IntegerSerializer numberSerializers_IntegerSerializer0 = new NumberSerializers.IntegerSerializer(class0);
        // Undeclared exception!
        try {
            numberSerializers_IntegerSerializer0.serializeWithType(beanProperty_Bogus0, (JsonGenerator) null, defaultSerializerProvider_Impl0, (TypeSerializer) null);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // com.fasterxml.jackson.databind.BeanProperty$Bogus cannot be cast to java.lang.Integer
        }
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            numberSerializers_FloatSerializer0.serialize(numberSerializers_FloatSerializer0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer cannot be cast to java.lang.Float
        }
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        Class<CoreXMLSerializers.XMLGregorianCalendarSerializer> class0 = CoreXMLSerializers.XMLGregorianCalendarSerializer.class;
        NumberSerializers.LongSerializer numberSerializers_LongSerializer0 = new NumberSerializers.LongSerializer(class0);
        Double double0 = new Double(0.0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            numberSerializers_LongSerializer0.serialize(double0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Double cannot be cast to java.lang.Long
        }
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        NumberSerializers.IntLikeSerializer numberSerializers_IntLikeSerializer0 = NumberSerializers.IntLikeSerializer.instance;
        Float float0 = new Float(2944.434F);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            numberSerializers_IntLikeSerializer0.serialize(float0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        NumberSerializers.IntLikeSerializer numberSerializers_IntLikeSerializer0 = new NumberSerializers.IntLikeSerializer();
        assertFalse(numberSerializers_IntLikeSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Class<Double> class0 = Double.TYPE;
        NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer(class0);
        Object object0 = new Object();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, numberSerializers_DoubleSerializer0, true);
        ObjectMapper objectMapper0 = new ObjectMapper();
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 2, objectMapper0, (OutputStream) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            numberSerializers_DoubleSerializer0.serializeWithType(object0, uTF8JsonGenerator0, defaultSerializerProvider_Impl0, (TypeSerializer) null);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Object cannot be cast to java.lang.Double
        }
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
        assertFalse(numberSerializers_ShortSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Class<CoreXMLSerializers.XMLGregorianCalendarSerializer> class0 = CoreXMLSerializers.XMLGregorianCalendarSerializer.class;
        NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer(class0);
        NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = NumberSerializers.ShortSerializer.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            numberSerializers_ShortSerializer0.serialize(numberSerializers_DoubleSerializer0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer cannot be cast to java.lang.Short
        }
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        numberSerializers_FloatSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
        assertFalse(numberSerializers_FloatSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        Class<String> class0 = String.class;
        NumberSerializers.IntegerSerializer numberSerializers_IntegerSerializer0 = new NumberSerializers.IntegerSerializer(class0);
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<BeanSerializer> class1 = BeanSerializer.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class1);
        numberSerializers_IntegerSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, arrayType0);
        assertFalse(arrayType0.isPrimitive());
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        JsonSerializer<?> jsonSerializer0 = numberSerializers_FloatSerializer0.createContextual(defaultSerializerProvider_Impl0, beanProperty_Bogus0);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }
}
