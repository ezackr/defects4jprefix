/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:32:24 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.util.HashMap;
import org.junit.runner.RunWith;

public class DeserializerCacheTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        int int0 = deserializerCache0.cachedDeserializersCount();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        Object object0 = deserializerCache0.writeReplace();
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        MapType mapType1 = MapType.construct(class0, mapType0, mapType0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapType1);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ObjectMapper objectMapper0 = new ObjectMapper();
        objectMapper0.canDeserialize(javaType0);
        ObjectReader objectReader0 = objectMapper0.readerFor(javaType0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MissingNode> class0 = MissingNode.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<POJONode> class0 = POJONode.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        boolean boolean0 = objectMapper0.canDeserialize((JavaType) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        deserializerCache0.hasValueDeserializerFor(defaultDeserializationContext_Impl0, beanDeserializerFactory0, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Class<NullNode> class0 = NullNode.class;
        CollectionType collectionType0 = CollectionType.construct(class0, simpleType0);
        CollectionType collectionType1 = collectionType0.withContentTypeHandler(deserializerCache0);
        objectMapper0.readerFor((JavaType) collectionType1);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        JsonFactory jsonFactory0 = new JsonFactory();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn(simpleType0, (JavaType) null, (JavaType) null, (JavaType) null, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        ObjectMapper objectMapper1 = objectMapper0.setTypeFactory(typeFactory1);
        ObjectReader objectReader0 = objectMapper1.readerFor((JavaType) simpleType0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        JsonFactory jsonFactory0 = new JsonFactory();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn((JavaType) null, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        ObjectMapper objectMapper1 = objectMapper0.setTypeFactory(typeFactory1);
        objectMapper1.readerFor((JavaType) simpleType0);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Proxy.Type> class0 = Proxy.Type.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        MapType mapType0 = MapType.construct(class0, simpleType0, simpleType0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(mapType0, typeFactory0);
        MapType mapType1 = mapType0.withContentValueHandler(classNameIdResolver0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapType1);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        ArrayType arrayType0 = typeFactory0.constructArrayType((JavaType) mapType0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) arrayType0);
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ArrayNode> class0 = ArrayNode.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        MapType mapType1 = mapType0.withKeyValueHandler(annotationIntrospector0);
        objectMapper0.readerFor((JavaType) mapType1);
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        Class<InputStream> class0 = InputStream.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        deserializerCache0._handleUnknownValueDeserializer(simpleType0);
    }
}
