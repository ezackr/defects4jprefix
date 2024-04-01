/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 23:44:15 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DeserializerCache_ESTest extends DeserializerCache_ESTest_scaffolding {

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
    public void test022() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        JavaType javaType0 = TypeFactory.unknownType();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        deserializerCache0._handleUnknownKeyDeserializer(defaultDeserializationContext_Impl0, javaType0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<SimpleModule> class0 = SimpleModule.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<IntNode> class0 = IntNode.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        deserializerCache0.hasValueDeserializerFor(deserializationContext0, beanDeserializerFactory0, mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        deserializerCache0._createAndCacheValueDeserializer(defaultDeserializationContext_Impl0, beanDeserializerFactory0, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.NON_FINAL;
        objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0);
        Class<CollectionType> class0 = CollectionType.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<ArrayNode> class0 = ArrayNode.class;
        Class<CoreXMLDeserializers.Std> class1 = CoreXMLDeserializers.Std.class;
        TypeBindings typeBindings0 = TypeBindings.create(class1, (JavaType[]) null);
        JavaType javaType0 = TypeFactory.unknownType();
        ArrayType arrayType0 = ArrayType.construct(javaType0, typeBindings0);
        MapLikeType mapLikeType0 = MapLikeType.upgradeFrom(javaType0, arrayType0, javaType0);
        CollectionType collectionType0 = CollectionType.construct((Class<?>) class0, typeBindings0, javaType0, (JavaType[]) null, (JavaType) mapLikeType0);
        deserializerCache0.hasValueDeserializerFor(defaultDeserializationContext_Impl0, beanDeserializerFactory0, collectionType0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonParser.Feature jsonParser_Feature0 = JsonParser.Feature.AUTO_CLOSE_SOURCE;
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(jsonParser_Feature0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Object> class0 = Object.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class0);
        MapType mapType1 = mapType0.withContentValueHandler(deserializerCache0);
        JsonDeserializer<Object> jsonDeserializer0 = deserializerCache0._findCachedDeserializer(mapType1);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        JavaType javaType0 = TypeFactory.unknownType();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        deserializerCache0._handleUnknownValueDeserializer(defaultDeserializationContext_Impl0, javaType0);
    }
}
