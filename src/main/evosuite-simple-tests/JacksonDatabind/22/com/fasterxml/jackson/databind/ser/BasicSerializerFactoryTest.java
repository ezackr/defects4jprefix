/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 17:26:52 GMT 2023
 */
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.sql.BatchUpdateException;
import java.sql.ClientInfoStatus;
import java.sql.Date;
import java.sql.SQLClientInfoException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Time;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.runner.RunWith;

public class BasicSerializerFactoryTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<CharBuffer> class0 = CharBuffer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector0);
        AnnotatedClass annotatedClass0 = AnnotatedClass.construct(class0, annotationIntrospector1, (ClassIntrospector.MixInResolver) null);
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forOtherUse((MapperConfig<?>) null, simpleType0, annotatedClass0);
        // Undeclared exception!
        try {
            beanSerializerFactory0.buildIteratorSerializer((SerializationConfig) null, simpleType0, basicBeanDescription0, false, simpleType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        // Undeclared exception!
        try {
            beanSerializerFactory0.withSerializerModifier((BeanSerializerModifier) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not pass null modifier
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        JavaType javaType0 = TypeFactory.unknownType();
        // Undeclared exception!
        try {
            beanSerializerFactory0.buildMapEntrySerializer((SerializationConfig) null, javaType0, (BeanDescription) null, false, javaType0, javaType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        // Undeclared exception!
        try {
            beanSerializerFactory0.withAdditionalSerializers((Serializers) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not pass null Serializers
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        JavaType javaType0 = TypeFactory.unknownType();
        // Undeclared exception!
        try {
            beanSerializerFactory0.buildIterableSerializer((SerializationConfig) null, javaType0, (BeanDescription) null, true, javaType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ArrayDeque> class0 = ArrayDeque.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.buildCollectionSerializer((SerializationConfig) null, collectionType0, (BeanDescription) basicBeanDescription0, false, (TypeSerializer) null, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        ObjectMapper objectMapper0 = new ObjectMapper();
        try {
            objectMapper0.valueToTree((Object) beanSerializerFactory0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // No serializer found for class com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) ) (through reference chain: com.fasterxml.jackson.databind.ser.BeanSerializerFactory[\"factoryConfig\"])
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleSerializers simpleSerializers0 = new SimpleSerializers();
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withAdditionalKeySerializers(simpleSerializers0);
        assertNotSame(beanSerializerFactory0, serializerFactory0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        Class<EnumSet> class0 = EnumSet.class;
        Class<RawValue> class1 = RawValue.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.buildCollectionSerializer((SerializationConfig) null, collectionType0, (BeanDescription) basicBeanDescription0, false, (TypeSerializer) null, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withConfig((SerializerFactoryConfig) null);
        assertNotSame(beanSerializerFactory0, serializerFactory0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(true);
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0);
        JsonParser jsonParser0 = arrayNode0.traverse();
        TokenBuffer tokenBuffer0 = new TokenBuffer(jsonParser0);
        HashMap<String, ClientInfoStatus> hashMap0 = new HashMap<String, ClientInfoStatus>();
        SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException(hashMap0);
        objectMapper0.writeValue((JsonGenerator) tokenBuffer0, (Object) sQLClientInfoException0);
        assertNull(sQLClientInfoException0.getSQLState());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        objectMapper0.enableDefaultTyping();
        Class<Serializers.Base> class0 = Serializers.Base.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<ObjectNode> atomicReference0 = new AtomicReference<ObjectNode>();
        Class<ObjectIdGenerators.UUIDGenerator> class0 = ObjectIdGenerators.UUIDGenerator.class;
        ObjectIdGenerators.UUIDGenerator objectIdGenerators_UUIDGenerator0 = objectMapper0.convertValue((Object) atomicReference0, class0);
        assertNull(objectIdGenerators_UUIDGenerator0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<ObjectIdGenerators.UUIDGenerator> class0 = ObjectIdGenerators.UUIDGenerator.class;
        Class<MapperFeature> class1 = MapperFeature.class;
        SimpleType simpleType0 = SimpleType.construct(class1);
        MapType mapType0 = MapType.construct(class0, simpleType0, simpleType0);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) mapType0, (Object) null, (Object) mapType0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByLookup(referenceType0, (SerializationConfig) null, basicBeanDescription0, false);
        assertNull(jsonSerializer0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Time> class0 = Time.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<JSONPObject> class0 = JSONPObject.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
        boolean boolean0 = objectMapper0.canSerialize(class0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Date> class0 = Date.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProvider();
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByPrimaryType(serializerProvider0, simpleType0, (BeanDescription) null, false);
        assertFalse(jsonSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        Class<ByteBuffer> class0 = ByteBuffer.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<InetAddress> class0 = InetAddress.class;
        boolean boolean0 = objectMapper0.canSerialize(class0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<InetSocketAddress> class0 = InetSocketAddress.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Charset> class0 = Charset.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Class<Long> class0 = Long.class;
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, (Object) simpleType0, (Object) simpleType0);
        // Undeclared exception!
        try {
            beanSerializerFactory0.findSerializerByPrimaryType(defaultSerializerProvider_Impl0, referenceType0, (BeanDescription) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ArrayDeque> class0 = ArrayDeque.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        // Undeclared exception!
        try {
            beanSerializerFactory0.findSerializerByAddonType((SerializationConfig) null, collectionType0, basicBeanDescription0, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        JavaType javaType0 = TypeFactory.unknownType();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, javaType0, (BeanDescription) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<EnumSet> class0 = EnumSet.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        MapType mapType0 = MapType.construct(class0, collectionType0, collectionType0);
        MapType mapType1 = mapType0.withStaticTyping();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, mapType1, basicBeanDescription0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<EnumSet> class0 = EnumSet.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        CollectionType collectionType1 = collectionType0.withStaticTyping();
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, collectionType1, basicBeanDescription0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ArrayDeque> class0 = ArrayDeque.class;
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        Class<ArrayList> class1 = ArrayList.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class1, class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.buildCollectionSerializer((SerializationConfig) null, collectionType0, (BeanDescription) basicBeanDescription0, false, (TypeSerializer) null, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<MissingNode> class0 = MissingNode.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.buildArraySerializer((SerializationConfig) null, arrayType0, basicBeanDescription0, true, (TypeSerializer) null, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        assertFalse(jsonSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BatchUpdateException> class0 = BatchUpdateException.class;
        ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
        assertTrue(objectWriter0.hasPrefetchedSerializer());
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Class<Charset> class0 = Charset.class;
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("JSON");
        // Undeclared exception!
        try {
            beanSerializerFactory0._verifyAsClass(sQLSyntaxErrorException0, "JSON", class0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // AnnotationIntrospector.JSON() returned value of type java.sql.SQLSyntaxErrorException: expected type JsonSerializer or Class<JsonSerializer> instead
        }
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<TimeZone> class0 = TimeZone.class;
        Class<?> class1 = beanSerializerFactory0._verifyAsClass((Object) null, (String) null, class0);
        assertNull(class1);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<NullNode> class0 = NullNode.class;
        Class<MissingNode> class1 = MissingNode.class;
        Class<?> class2 = beanSerializerFactory0._verifyAsClass(class0, "Z", class1);
        assertEquals("class com.fasterxml.jackson.databind.node.NullNode", class2.toString());
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<NullNode> class0 = NullNode.class;
        Class<MissingNode> class1 = MissingNode.class;
        Class<?> class2 = beanSerializerFactory0._verifyAsClass(class0, "Z", class1);
        assertNotNull(class2);
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        Class<?> class1 = beanSerializerFactory0._verifyAsClass(class0, "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", class0);
        assertNull(class1);
    }
}
