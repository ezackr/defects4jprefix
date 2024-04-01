/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:24:10 GMT 2023
 */
package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DatabindContext_ESTest extends DatabindContext_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<SimpleObjectIdResolver> class0 = SimpleObjectIdResolver.class;
        defaultSerializerProvider_Impl0.reportBadDefinition((Class<?>) class0, "com.fasterxml.jacksonHdatabind.deser.std.NuEberDeserializers$CharacterDeseria3izer");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JavaType javaType0 = defaultSerializerProvider_Impl0.constructType((Type) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<Integer> class0 = Integer.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        Class<String> class1 = String.class;
        defaultSerializerProvider_Impl0.constructSpecializedType(simpleType0, class1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JavaType javaType0 = defaultSerializerProvider_Impl0.constructSpecializedType(simpleType0, class0);
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        TypeFactory typeFactory0 = serializerProvider0.getTypeFactory();
        Class<Module> class0 = Module.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class0);
        serializerProvider0.resolveSubType(mapLikeType0, "com.fasterxml.jackson.databind.type.ClassKey");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        defaultSerializerProvider_Impl0.resolveSubType((JavaType) null, "6!f'm]3N1cq.m<xRd8");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        PlaceholderForType placeholderForType0 = new PlaceholderForType(65534);
        JavaType javaType0 = serializerProvider0.resolveSubType(placeholderForType0, "com.fasterxml.jackson.databind.DatabindContext");
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        ObjectIdInfo objectIdInfo0 = ObjectIdInfo.empty();
        serializerProvider0.objectIdGeneratorInstance((Annotated) null, objectIdInfo0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        ObjectIdInfo objectIdInfo0 = ObjectIdInfo.empty();
        ObjectIdResolver objectIdResolver0 = serializerProvider0.objectIdResolverInstance((Annotated) null, objectIdInfo0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        defaultSerializerProvider_Impl0.converterInstance((Annotated) null, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Converter<Object, Object> converter0 = defaultSerializerProvider_Impl0.converterInstance((Annotated) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<Integer> class0 = Integer.TYPE;
        defaultSerializerProvider_Impl0.converterInstance((Annotated) null, class0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Object[] objectArray0 = new Object[0];
        defaultSerializerProvider_Impl0.reportMappingProblem("+!;2s`A;j&JT", objectArray0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Object[] objectArray0 = new Object[1];
        defaultSerializerProvider_Impl0.reportMappingProblem("+;2s`A;XJT", objectArray0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        String string0 = ((DatabindContext) defaultSerializerProvider_Impl0)._quotedString("; expected type Converter or Class<Converter> instead");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        String string0 = ((DatabindContext) defaultSerializerProvider_Impl0)._truncate((String) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = (DefaultSerializerProvider.Impl) objectMapper0.getSerializerProviderInstance();
        String string0 = ((DatabindContext) defaultSerializerProvider_Impl0)._quotedString((String) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        InvalidTypeIdException invalidTypeIdException0 = (InvalidTypeIdException) defaultSerializerProvider_Impl0.invalidTypeIdException((JavaType) null, (String) null, (String) null);
        invalidTypeIdException0.getTypeId();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        String string0 = ((DatabindContext) defaultSerializerProvider_Impl0)._desc("com.fasterxml.jackson.databind.DatabindContext");
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        String string0 = ((DatabindContext) defaultSerializerProvider_Impl0)._desc((String) null);
    }
}
