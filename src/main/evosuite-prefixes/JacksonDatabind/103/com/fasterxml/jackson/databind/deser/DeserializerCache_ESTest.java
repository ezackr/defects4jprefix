/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:38:28 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.BatchUpdateException;
import java.time.chrono.ThaiBuddhistEra;
import java.util.HashMap;
import java.util.List;
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
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        Object object0 = deserializerCache0.writeReplace();
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DeserializerCache deserializerCache0 = new DeserializerCache();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        deserializerCache0._handleUnknownKeyDeserializer(defaultDeserializationContext_Impl0, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<List> class0 = List.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createNonBlockingByteArrayParser();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<BuilderBasedDeserializer> class0 = BuilderBasedDeserializer.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class0);
        objectMapper0.readValue(jsonParser0, (JavaType) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<POJONode> class0 = POJONode.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0);
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, javaType0);
        boolean boolean0 = objectMapper0.canDeserialize((JavaType) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        long[] longArray0 = new long[4];
        BatchUpdateException batchUpdateException0 = new BatchUpdateException("", "", 0, longArray0, (Throwable) null);
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>(batchUpdateException0);
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        boolean boolean0 = objectMapper0.canDeserialize(javaType0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        DeserializerCache deserializerCache0 = new DeserializerCache();
        deserializerCache0.hasValueDeserializerFor(defaultDeserializationContext_Impl0, beanDeserializerFactory0, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        objectMapper0.enableDefaultTyping();
        Class<CoreXMLDeserializers.Std> class0 = CoreXMLDeserializers.Std.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonAutoDetect jsonAutoDetect0 = mock(JsonAutoDetect.class, new ViolatedAssumptionAnswer());
        doReturn((JsonAutoDetect.Visibility) null).when(jsonAutoDetect0).creatorVisibility();
        doReturn((JsonAutoDetect.Visibility) null).when(jsonAutoDetect0).fieldVisibility();
        doReturn((JsonAutoDetect.Visibility) null).when(jsonAutoDetect0).getterVisibility();
        doReturn((JsonAutoDetect.Visibility) null).when(jsonAutoDetect0).isGetterVisibility();
        doReturn((JsonAutoDetect.Visibility) null).when(jsonAutoDetect0).setterVisibility();
        JsonAutoDetect.Value jsonAutoDetect_Value0 = JsonAutoDetect.Value.from(jsonAutoDetect0);
        objectMapper0.setDefaultVisibility(jsonAutoDetect_Value0);
        Class<HashMap> class0 = HashMap.class;
        objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ThaiBuddhistEra> class0 = ThaiBuddhistEra.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapType> class0 = MapType.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        deserializerCache0._createDeserializer2(deserializationContext0, (DeserializerFactory) null, arrayType0, (BeanDescription) null);
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        JavaType javaType0 = TypeFactory.unknownType();
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaType0, javaType0);
        deserializerCache0._createDeserializer2(deserializationContext0, (DeserializerFactory) null, referenceType0, (BeanDescription) null);
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        Class<DecimalNode> class0 = DecimalNode.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class0);
        MapLikeType mapLikeType0 = mapType0.withContentValueHandler(typeFactory0);
        MapLikeType mapLikeType1 = mapLikeType0.withValueHandler(typeFactory0);
        objectMapper0.convertValue((Object) mapLikeType1, (JavaType) mapLikeType1);
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JavaType javaType0 = TypeFactory.unknownType();
        DeserializerCache deserializerCache0 = new DeserializerCache();
        MapLikeType mapLikeType0 = MapLikeType.upgradeFrom(javaType0, (JavaType) null, (JavaType) null);
        deserializerCache0.hasValueDeserializerFor(defaultDeserializationContext_Impl0, beanDeserializerFactory0, mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        DeserializerCache deserializerCache0 = new DeserializerCache();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class0);
        MapType mapType1 = mapType0.withKeyValueHandler(defaultDeserializationContext_Impl0);
        deserializerCache0.hasValueDeserializerFor(defaultDeserializationContext_Impl0, beanDeserializerFactory0, mapType1);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        DeserializerCache deserializerCache0 = new DeserializerCache();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<List> class0 = List.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        deserializerCache0._handleUnknownValueDeserializer((DeserializationContext) null, collectionType0);
    }
}
