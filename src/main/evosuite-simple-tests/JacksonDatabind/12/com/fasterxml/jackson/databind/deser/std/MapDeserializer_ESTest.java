/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 16:48:18 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.sql.SQLNonTransientConnectionException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MapDeserializer_ESTest extends MapDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        // Undeclared exception!
        try {
            mapDeserializer0.deserializeWithType((JsonParser) null, defaultDeserializationContext_Impl0, (TypeDeserializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.MapDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        MapDeserializer mapDeserializer1 = new MapDeserializer(mapDeserializer0);
        assertTrue(mapDeserializer1.isCachable());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, (TypeFactory) null);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(simpleType0, classNameIdResolver0, "Invalid 'any-getter' annotation on method ", false, class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, asExternalTypeDeserializer0);
        JavaType javaType0 = mapDeserializer0.getValueType();
        assertNotNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, (TypeFactory) null);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(simpleType0, classNameIdResolver0, "Invalid 'any-getter' annotation on method ", false, class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, asExternalTypeDeserializer0);
        JavaType javaType0 = mapDeserializer0.getValueType();
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
        InvocationTargetException invocationTargetException0 = new InvocationTargetException(sQLNonTransientConnectionException0);
        // Undeclared exception!
        try {
            mapDeserializer0.wrapAndThrow(invocationTargetException0, "ag/RAmC$Ff2UQ94Z\"u");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // Can not pass null fieldName
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Object> class0 = Object.class;
        ObjectReader objectReader0 = objectMapper0.reader(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        // Undeclared exception!
        try {
            mapDeserializer0.findBackReference("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not handle managed/back reference 'com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.MapDeserializer returned null for 'getContentDeserializer()'
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", e);
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        MapDeserializer mapDeserializer0 = new MapDeserializer((JavaType) null, jsonLocationInstantiator0, (KeyDeserializer) null, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        // Undeclared exception!
        try {
            mapDeserializer0.deserialize((JsonParser) null, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.MapDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Class<String> class0 = String.class;
        Class<RoundingMode> class1 = RoundingMode.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class1);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class1, 3);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, (TypeIdResolver) null, "L1Q+8xi#-w%9f\"t15C", false, class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(mapLikeType0, jsonLocationInstantiator0, stdKeyDeserializer0, coreXMLDeserializers_Std0, asPropertyTypeDeserializer0);
        mapDeserializer0.getContentType();
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        MapDeserializer mapDeserializer0 = new MapDeserializer((JavaType) null, jsonLocationInstantiator0, (KeyDeserializer) null, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        HashSet<String> hashSet0 = new HashSet<String>();
        MapDeserializer mapDeserializer1 = mapDeserializer0.withResolved((KeyDeserializer) null, (TypeDeserializer) null, (JsonDeserializer<?>) null, hashSet0);
        assertFalse(mapDeserializer1.isCachable());
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Class<String> class0 = String.class;
        Class<RoundingMode> class1 = RoundingMode.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class1);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class1, 3);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, (TypeIdResolver) null, "L1Q+8xi#-w%9f\"t15C", false, class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(mapLikeType0, jsonLocationInstantiator0, stdKeyDeserializer0, coreXMLDeserializers_Std0, asPropertyTypeDeserializer0);
        Stack<String> stack0 = new Stack<String>();
        HashSet<String> hashSet0 = new HashSet<String>(stack0);
        mapDeserializer0.withResolved(stdKeyDeserializer0, asPropertyTypeDeserializer0, mapDeserializer0, hashSet0);
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<Object> class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class1);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 1745);
        Class<TypeNameIdResolver> class2 = TypeNameIdResolver.class;
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(mapLikeType0, (TypeIdResolver) null, "So8YM!V>", true, class2);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer0, coreXMLDeserializers_Std0, asExternalTypeDeserializer0);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(mapLikeType0, (TypeIdResolver) null, "So8YM!V>", true, class1);
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        mapDeserializer0.withResolved(stdKeyDeserializer0, asPropertyTypeDeserializer0, coreXMLDeserializers_Std0, linkedHashSet0);
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 5);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, coreXMLDeserializers_Std0, (TypeDeserializer) null);
        MapDeserializer mapDeserializer1 = mapDeserializer0.withResolved(stdKeyDeserializer_StringKD0, (TypeDeserializer) null, coreXMLDeserializers_Std0, (HashSet<String>) null);
        assertSame(mapDeserializer1, mapDeserializer0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(mapLikeType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        assertTrue(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, (TypeFactory) null);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<JsonMappingException> class1 = JsonMappingException.class;
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(simpleType0, classNameIdResolver0, "Q/<l$kE(Y~?ig~d'5", false, class1);
        Class<RoundingMode> class2 = RoundingMode.class;
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class2, (JsonDeserializer<?>) null);
        MapDeserializer mapDeserializer0 = new MapDeserializer(mapLikeType0, jsonLocationInstantiator0, stdKeyDeserializer_DelegatingKD0, (JsonDeserializer<Object>) null, asExternalTypeDeserializer0);
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        MapDeserializer mapDeserializer0 = new MapDeserializer((JavaType) null, jsonLocationInstantiator0, (KeyDeserializer) null, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        String[] stringArray0 = new String[1];
        mapDeserializer0.setIgnorableProperties(stringArray0);
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 11);
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(simpleType0, (TypeIdResolver) null, "", false, class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, (KeyDeserializer) null, coreXMLDeserializers_Std0, asExternalTypeDeserializer0);
        String[] stringArray0 = new String[0];
        mapDeserializer0.setIgnorableProperties(stringArray0);
        assertFalse(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        // Undeclared exception!
        try {
            mapDeserializer0.resolve(defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        // Undeclared exception!
        try {
            mapDeserializer0.createContextual(defaultDeserializationContext_Impl0, (BeanProperty) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.NON_FINAL;
        objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0);
        Class<Object> class0 = Object.class;
        ObjectReader objectReader0 = objectMapper0.reader(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        Class<String> class0 = String.class;
        Class<RoundingMode> class1 = RoundingMode.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class1);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class1, 3);
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        MapDeserializer mapDeserializer0 = new MapDeserializer(mapLikeType0, jsonLocationInstantiator0, stdKeyDeserializer0, coreXMLDeserializers_Std0, (TypeDeserializer) null);
        MapDeserializer mapDeserializer1 = new MapDeserializer(mapDeserializer0, stdKeyDeserializer0, coreXMLDeserializers_Std0, (TypeDeserializer) null, linkedHashSet0);
        boolean boolean0 = mapDeserializer1.isCachable();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Class<String> class0 = String.class;
        Class<RoundingMode> class1 = RoundingMode.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class1);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, simpleType0, simpleType0);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class1, 3);
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        MapDeserializer mapDeserializer0 = new MapDeserializer(mapLikeType0, jsonLocationInstantiator0, stdKeyDeserializer0, coreXMLDeserializers_Std0, (TypeDeserializer) null);
        MapDeserializer mapDeserializer1 = new MapDeserializer(mapDeserializer0, stdKeyDeserializer0, coreXMLDeserializers_Std0, (TypeDeserializer) null, linkedHashSet0);
        boolean boolean0 = mapDeserializer1.isCachable();
        assertTrue(mapDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 11);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, coreXMLDeserializers_Std0, (TypeDeserializer) null);
        // Undeclared exception!
        try {
            mapDeserializer0.deserialize(jsonParser0, (DeserializationContext) null, (Map<Object, Object>) hashMap0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.MapDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 11);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, coreXMLDeserializers_Std0, (TypeDeserializer) null);
        mapDeserializer0._readAndBind(jsonParser0, (DeserializationContext) null, hashMap0);
        assertFalse(jsonParser0.hasCurrentToken());
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 11);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, coreXMLDeserializers_Std0, (TypeDeserializer) null);
        mapDeserializer0._readAndBindStringMap(jsonParser0, (DeserializationContext) null, hashMap0);
        assertNull(jsonParser0.getCurrentName());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        Class<MockFileInputStream> class1 = MockFileInputStream.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class1);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        InvocationTargetException invocationTargetException0 = new InvocationTargetException((Throwable) null);
        // Undeclared exception!
        try {
            mapDeserializer0.wrapAndThrow(invocationTargetException0, jsonLocationInstantiator0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // Can not pass null fieldName
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, (TypeFactory) null);
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(simpleType0, classNameIdResolver0, "Invalid 'any-getmer' annotation on method ", false, class0);
        IntNode intNode0 = new IntNode(1);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, asExternalTypeDeserializer0);
        MockError mockError0 = new MockError();
        // Undeclared exception!
        try {
            mapDeserializer0.wrapAndThrow(mockError0, intNode0, "Invalid 'any-getmer' annotation on method ");
            fail("Expecting exception: Error");
        } catch (Error e) {
        }
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        JsonMappingException jsonMappingException0 = new JsonMappingException("Invalid delegate-creator definition for ");
        // Undeclared exception!
        try {
            mapDeserializer0.wrapAndThrow(jsonMappingException0, stdKeyDeserializer_StringKD0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // Can not pass null fieldName
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        MapDeserializer mapDeserializer0 = new MapDeserializer(simpleType0, jsonLocationInstantiator0, stdKeyDeserializer_StringKD0, (JsonDeserializer<Object>) null, (TypeDeserializer) null);
        MockIOException mockIOException0 = new MockIOException("Invalid delegate-creator definition for ");
        try {
            mapDeserializer0.wrapAndThrow(mockIOException0, stdKeyDeserializer_StringKD0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
        }
    }
}
