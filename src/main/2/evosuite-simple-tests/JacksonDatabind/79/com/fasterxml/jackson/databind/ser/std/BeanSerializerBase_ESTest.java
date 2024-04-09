/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:13:58 GMT 2024
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.PipedOutputStream;
import java.lang.reflect.Type;
import java.sql.SQLClientInfoException;
import java.sql.SQLTransactionRollbackException;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanSerializerBase_ESTest extends BeanSerializerBase_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        Iterator<PropertyWriter> iterator0 = beanSerializer0.properties();
        assertNotNull(iterator0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        NameTransformer nameTransformer0 = NameTransformer.NOP;
        JsonSerializer<Object> jsonSerializer0 = beanSerializer0.unwrappingSerializer(nameTransformer0);
        assertFalse(jsonSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        JsonInclude.Include jsonInclude_Include0 = JsonInclude.Include.NON_EMPTY;
        objectMapper0.setSerializationInclusion(jsonInclude_Include0);
        IOContext iOContext0 = new IOContext(bufferRecycler0, objectMapper0, true);
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        // Undeclared exception!
        try {
            objectMapper0.convertValue((Object) iOContext0, class0);
            fail("Expecting exception: NoClassDefFoundError");
        } catch (NoClassDefFoundError e) {
            //
            // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.NON_FINAL;
        ObjectMapper objectMapper1 = objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0);
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException();
        try {
            objectMapper1.convertValue((Object) sQLTransactionRollbackException0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Class java.sql.SQLTransactionRollbackException not subtype of [simple type, class com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException();
        // Undeclared exception!
        try {
            objectMapper0.convertValue((Object) sQLClientInfoException0, class0);
            fail("Expecting exception: NoClassDefFoundError");
        } catch (NoClassDefFoundError e) {
            //
            // com.fasterxml.jackson.databind.JsonMappingException
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StdArraySerializers.FloatArraySerializer stdArraySerializers_FloatArraySerializer0 = new StdArraySerializers.FloatArraySerializer();
        JavaType javaType0 = stdArraySerializers_FloatArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        boolean boolean0 = beanSerializer0.usesObjectId();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StdArraySerializers.DoubleArraySerializer stdArraySerializers_DoubleArraySerializer0 = new StdArraySerializers.DoubleArraySerializer();
        JavaType javaType0 = stdArraySerializers_DoubleArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        PropertyName propertyName0 = new PropertyName("%AAlkU}Qp)Rk");
        ObjectIdGenerator<MapEntrySerializer> objectIdGenerator0 = (ObjectIdGenerator<MapEntrySerializer>) mock(ObjectIdGenerator.class, new ViolatedAssumptionAnswer());
        ObjectIdWriter objectIdWriter0 = ObjectIdWriter.construct(javaType0, propertyName0, objectIdGenerator0, false);
        BeanSerializerBase beanSerializerBase0 = beanSerializer0.withObjectIdWriter(objectIdWriter0);
        boolean boolean0 = beanSerializerBase0.usesObjectId();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        AsExistingPropertyTypeSerializer asExistingPropertyTypeSerializer0 = new AsExistingPropertyTypeSerializer(classNameIdResolver0, (BeanProperty) null, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$1");
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, simpleType0, false);
        ObjectMapper objectMapper0 = new ObjectMapper();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1, objectMapper0, pipedOutputStream0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanSerializerBase beanSerializerBase0 = beanSerializer0.withFilterId(pipedOutputStream0);
        // Undeclared exception!
        try {
            beanSerializerBase0.serializeWithType(classNameIdResolver0, uTF8JsonGenerator0, defaultSerializerProvider_Impl0, asExistingPropertyTypeSerializer0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        Class<StdArraySerializers.IntArraySerializer> class0 = StdArraySerializers.IntArraySerializer.class;
        PropertyName propertyName0 = PropertyName.construct("%;agl;ASn", "%;agl;ASn");
        ObjectIdGenerator<StdArraySerializers.DoubleArraySerializer> objectIdGenerator0 = (ObjectIdGenerator<StdArraySerializers.DoubleArraySerializer>) mock(ObjectIdGenerator.class, new ViolatedAssumptionAnswer());
        doReturn((ObjectIdGenerator) null).when(objectIdGenerator0).newForSerialization(any());
        ObjectIdWriter objectIdWriter0 = ObjectIdWriter.construct(javaType0, propertyName0, objectIdGenerator0, true);
        BeanSerializerBase beanSerializerBase0 = beanSerializer0.withObjectIdWriter(objectIdWriter0);
        SimpleObjectIdResolver simpleObjectIdResolver0 = new SimpleObjectIdResolver();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, class0, false);
        ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
        UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, byteArrayBuilder0, byteArrayBuilder0.NO_BYTES, 408, false);
        // Undeclared exception!
        try {
            beanSerializerBase0.serializeWithType(simpleObjectIdResolver0, uTF8JsonGenerator0, serializerProvider0, (TypeSerializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonNode jsonNode0 = beanSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) simpleType0);
        assertEquals(2, jsonNode0.size());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        BeanSerializerBase beanSerializerBase0 = beanSerializer0.withFilterId(jsonFormatVisitorWrapper_Base0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            beanSerializerBase0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) simpleType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        beanSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, simpleType0);
        assertFalse(simpleType0.isInterface());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        SimpleType simpleType0 = (SimpleType) MapSerializer.UNSPECIFIED_TYPE;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        beanSerializer0.acceptJsonFormatVisitor((JsonFormatVisitorWrapper) null, simpleType0);
        assertFalse(simpleType0.isCollectionLikeType());
    }
}
