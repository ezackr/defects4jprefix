/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:04:11 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MapLikeType_ESTest extends MapLikeType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class0 = ReferenceType.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        String string0 = mapLikeType0.getGenericSignature();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withContentTypeHandler(mapLikeType0);
        mapLikeType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withContentTypeHandler(mapLikeType0);
        mapLikeType1.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withContentTypeHandler(mapLikeType0);
        mapLikeType1.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withContentTypeHandler(mapLikeType0);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyValueHandler(simpleType0);
        mapLikeType1.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyValueHandler(simpleType0);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyValueHandler(simpleType0);
        mapLikeType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        mapType0.getContentTypeHandler();
        mapType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        Class<JsonFormat.Feature> class0 = JsonFormat.Feature.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JavaType javaType0 = mapLikeType0._narrow(class0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapLikeType mapLikeType0 = new MapLikeType(simpleType0, simpleType0, simpleType0);
        objectMapper0.readerFor((JavaType) mapLikeType0);
        mapLikeType0.isMapLikeType();
    }

    @Test(timeout = 4000)
    public void test0511() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapLikeType mapLikeType0 = new MapLikeType(simpleType0, simpleType0, simpleType0);
        objectMapper0.readerFor((JavaType) mapLikeType0);
        mapLikeType0.isContainerType();
    }

    @Test(timeout = 4000)
    public void test0612() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<String> class0 = String.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        String string0 = mapLikeType0.getErasedSignature();
    }

    @Test(timeout = 4000)
    public void test0613() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<String> class0 = String.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        String string0 = mapLikeType0.getErasedSignature();
        mapLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test0714() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withValueHandler(class0);
        mapLikeType1.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test0715() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withValueHandler(class0);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test0816() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MapLikeType> class0 = MapLikeType.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class0);
        Object object0 = mapLikeType0.getContentValueHandler();
    }

    @Test(timeout = 4000)
    public void test0917() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<SimpleType> class0 = SimpleType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        JavaType[] javaTypeArray0 = new JavaType[0];
        JavaType javaType0 = mapLikeType0.refine(class0, typeBindings0, simpleType0, javaTypeArray0);
        javaType0.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test0918() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<SimpleType> class0 = SimpleType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        JavaType[] javaTypeArray0 = new JavaType[0];
        JavaType javaType0 = mapLikeType0.refine(class0, typeBindings0, simpleType0, javaTypeArray0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1019() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withContentValueHandler(class0);
        mapLikeType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test1020() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withContentValueHandler(class0);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1121() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyTypeHandler(simpleType0);
        mapLikeType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test1122() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyTypeHandler(simpleType0);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1123() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyTypeHandler(simpleType0);
        mapLikeType1.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test1224() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapType mapType0 = new MapType(simpleType0, simpleType0, mapLikeType0);
        MapType mapType1 = mapType0.withContentTypeHandler(mapLikeType0);
        mapLikeType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test1225() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapType mapType0 = new MapType(simpleType0, simpleType0, mapLikeType0);
        MapType mapType1 = mapType0.withContentTypeHandler(mapLikeType0);
        mapType1.equals((Object) mapType0);
    }

    @Test(timeout = 4000)
    public void test1226() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapType mapType0 = new MapType(simpleType0, simpleType0, mapLikeType0);
        MapType mapType1 = mapType0.withContentTypeHandler(mapLikeType0);
        mapLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1327() throws Throwable {
        MapLikeType.upgradeFrom((JavaType) null, (JavaType) null, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test1428() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        SimpleType simpleType1 = TypeFactory.CORE_TYPE_STRING;
        Class<Object> class0 = Object.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType1);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyType(simpleType1);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1429() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        SimpleType simpleType1 = TypeFactory.CORE_TYPE_STRING;
        Class<Object> class0 = Object.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType1);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyType(simpleType1);
    }

    @Test(timeout = 4000)
    public void test1430() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        SimpleType simpleType1 = TypeFactory.CORE_TYPE_STRING;
        Class<Object> class0 = Object.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType1);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyType(simpleType1);
        mapLikeType1.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test1531() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyType(simpleType0);
        mapLikeType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1532() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withKeyType(simpleType0);
    }

    @Test(timeout = 4000)
    public void test1633() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JavaType javaType0 = mapLikeType0.withContentType(mapLikeType0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1634() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JavaType javaType0 = mapLikeType0.withContentType(mapLikeType0);
        javaType0.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test1635() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JavaType javaType0 = mapLikeType0.withContentType(mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test1736() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<JsonFormat.Feature> class0 = JsonFormat.Feature.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JavaType javaType0 = mapLikeType0.withContentType(simpleType0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1737() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<JsonFormat.Feature> class0 = JsonFormat.Feature.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JavaType javaType0 = mapLikeType0.withContentType(simpleType0);
    }

    @Test(timeout = 4000)
    public void test1838() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withStaticTyping();
        MapLikeType mapLikeType2 = mapLikeType1.withStaticTyping();
        mapLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1839() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withStaticTyping();
        MapLikeType mapLikeType2 = mapLikeType1.withStaticTyping();
        mapLikeType2.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1840() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        MapLikeType mapLikeType1 = mapLikeType0.withStaticTyping();
        MapLikeType mapLikeType2 = mapLikeType1.withStaticTyping();
        mapLikeType2.equals((Object) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test1941() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapLikeType mapLikeType0 = new MapLikeType(mapType0, (JavaType) null, (JavaType) null);
        mapLikeType0.toCanonical();
        mapType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2042() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class0 = ReferenceType.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        String string0 = mapLikeType0.buildCanonicalName();
    }

    @Test(timeout = 4000)
    public void test2143() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        CollectionType collectionType0 = new CollectionType(mapType0, mapType0);
        CollectionType collectionType1 = collectionType0.withContentTypeHandler(class1);
        MapType mapType1 = typeFactory0.constructMapType((Class<? extends Map>) class0, (JavaType) mapType0, (JavaType) collectionType1);
        collectionType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2144() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        CollectionType collectionType0 = new CollectionType(mapType0, mapType0);
        CollectionType collectionType1 = collectionType0.withContentTypeHandler(class1);
        MapType mapType1 = typeFactory0.constructMapType((Class<? extends Map>) class0, (JavaType) mapType0, (JavaType) collectionType1);
        mapType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2245() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = mapType0.withContentTypeHandler(class0);
        MapLikeType mapLikeType0 = MapLikeType.upgradeFrom(mapType1, mapType1, mapType0);
        boolean boolean0 = mapLikeType0.hasHandlers();
        mapType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2246() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = mapType0.withContentTypeHandler(class0);
        MapLikeType mapLikeType0 = MapLikeType.upgradeFrom(mapType1, mapType1, mapType0);
        boolean boolean0 = mapLikeType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2347() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        boolean boolean0 = mapType0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test2448() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<JsonFormat.Feature> class1 = JsonFormat.Feature.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = typeFactory0.constructMapType(class0, class1, class0);
        boolean boolean0 = mapType0.equals(mapType1);
        mapType1.equals((Object) mapType0);
    }

    @Test(timeout = 4000)
    public void test2449() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<JsonFormat.Feature> class1 = JsonFormat.Feature.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = typeFactory0.constructMapType(class0, class1, class0);
        boolean boolean0 = mapType0.equals(mapType1);
    }

    @Test(timeout = 4000)
    public void test2450() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<JsonFormat.Feature> class1 = JsonFormat.Feature.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = typeFactory0.constructMapType(class0, class1, class0);
        boolean boolean0 = mapType0.equals(mapType1);
        mapType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2551() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        PropertyAccessor propertyAccessor0 = PropertyAccessor.ALL;
        JsonAutoDetect.Visibility jsonAutoDetect_Visibility0 = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC;
        ObjectMapper objectMapper1 = objectMapper0.setVisibility(propertyAccessor0, jsonAutoDetect_Visibility0);
        Class<CollectionType> class0 = CollectionType.class;
        ObjectReader objectReader0 = objectMapper1.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test2652() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = typeFactory0.constructMapType((Class<? extends Map>) class0, (JavaType) mapType0, (JavaType) mapType0);
        boolean boolean0 = mapType0.equals(mapType1);
        mapType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test2653() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class1);
        MapType mapType1 = typeFactory0.constructMapType((Class<? extends Map>) class0, (JavaType) mapType0, (JavaType) mapType0);
        boolean boolean0 = mapType0.equals(mapType1);
    }

    @Test(timeout = 4000)
    public void test2754() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class0);
        mapType0.isPrimitive();
    }
}
