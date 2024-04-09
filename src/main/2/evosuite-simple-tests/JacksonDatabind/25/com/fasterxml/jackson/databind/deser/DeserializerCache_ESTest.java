/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:18:50 GMT 2024
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.ShortNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DeserializerCache_ESTest extends DeserializerCache_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        int int0 = deserializerCache0.cachedDeserializersCount();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        Object object0 = deserializerCache0.writeReplace();
        assertSame(object0, deserializerCache0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<MissingNode> class1 = MissingNode.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class1);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapType0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) simpleType0);
        Class<CoreXMLDeserializers.Std> class0 = CoreXMLDeserializers.Std.class;
        ObjectReader objectReader1 = objectReader0.forType(class0);
        assertNotSame(objectReader0, objectReader1);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapType0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<CoreXMLDeserializers.Std> class0 = CoreXMLDeserializers.Std.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        objectMapper0.canDeserialize((JavaType) arrayType0, atomicReference0);
        boolean boolean0 = objectMapper0.canDeserialize((JavaType) arrayType0, atomicReference0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        Class<ArrayNode> class1 = ArrayNode.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class1);
        boolean boolean0 = objectMapper0.canDeserialize((JavaType) collectionLikeType0, atomicReference0);
        assertEquals("null", atomicReference0.toString());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        Class<ArrayNode> class1 = ArrayNode.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class1);
        boolean boolean0 = objectMapper0.canDeserialize((JavaType) collectionLikeType0, atomicReference0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        // Undeclared exception!
        try {
            deserializerCache0._findCachedDeserializer((JavaType) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Null JavaType passed
            //
            verifyException("com.fasterxml.jackson.databind.deser.DeserializerCache", e);
        }
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Class<CoreXMLDeserializers.Std> class0 = CoreXMLDeserializers.Std.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null);
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
        objectMapper0.enableDefaultTypingAsProperty(objectMapper_DefaultTyping0, "K8l.uqkS(\"t,Q!R=y");
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) arrayType0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ObjectMapper objectMapper0 = new ObjectMapper();
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        ObjectMapper objectMapper1 = objectMapper0.setSubtypeResolver(stdSubtypeResolver0);
        ObjectMapper objectMapper2 = objectMapper1.copy();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn(simpleType0, simpleType0, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        ObjectMapper objectMapper3 = objectMapper2.setTypeFactory(typeFactory1);
        // Undeclared exception!
        try {
            objectMapper3.readerFor((JavaType) simpleType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn(simpleType0, simpleType0, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        objectMapper0.setTypeFactory(typeFactory1);
        // Undeclared exception!
        try {
            objectMapper0.readerFor((JavaType) simpleType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        MapType mapType1 = mapType0.withContentValueHandler(deserializerCache0);
        // Undeclared exception!
        try {
            objectMapper0.readerFor((JavaType) mapType1);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // com.fasterxml.jackson.databind.deser.DeserializerCache cannot be cast to com.fasterxml.jackson.databind.JsonDeserializer
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Proxy.Type> class0 = Proxy.Type.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        CollectionType collectionType0 = CollectionType.construct(class0, simpleType0);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) collectionType0, (Object) "VI%&a<{9:a~(", (Object) deserializerCache0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) referenceType0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Object> class0 = Object.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapLikeType0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ShortNode> class0 = ShortNode.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        MapLikeType mapLikeType0 = mapType0.withKeyValueHandler(typeFactory0);
        // Undeclared exception!
        try {
            objectMapper0.readerFor((JavaType) mapLikeType0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // com.fasterxml.jackson.databind.type.TypeFactory cannot be cast to com.fasterxml.jackson.databind.KeyDeserializer
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        Class<InputStream> class0 = InputStream.class;
        Class<MapLikeType> class1 = MapLikeType.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class1);
        Integer integer0 = new Integer(2968);
        ArrayType arrayType0 = ArrayType.construct(simpleType0, deserializerCache0, integer0);
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct(class0, arrayType0);
        try {
            deserializerCache0._handleUnknownValueDeserializer(collectionLikeType0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not find a Value deserializer for abstract type [collection-like type; class java.io.InputStream, contains [array type, component type: [simple type, class com.fasterxml.jackson.databind.type.MapLikeType]]]
            //
            verifyException("com.fasterxml.jackson.databind.deser.DeserializerCache", e);
        }
    }
}
