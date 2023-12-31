/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 18:14:07 GMT 2023
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SimpleType_ESTest extends SimpleType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<InputStream> class0 = InputStream.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class1 = HashMap.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        JavaType javaType0 = objectMapper0.constructType(class0);
        MapType mapType0 = typeFactory0.constructMapType(class1, javaType0, javaType0);
        SimpleType simpleType0 = new SimpleType(mapType0);
        String string0 = simpleType0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        simpleType0.withContentValueHandler(simpleType0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Object object0 = new Object();
        simpleType0.withContentTypeHandler(object0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<InputStream> class0 = InputStream.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        JavaType javaType0 = objectMapper0.constructType(class0);
        String string0 = javaType0.toString();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        boolean boolean0 = simpleType0.isContainerType();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        simpleType0.withContentType(simpleType0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(simpleType0, simpleType0);
        SimpleType simpleType1 = referenceType0.withValueHandler(simpleType0);
        simpleType1.isConcrete();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        simpleType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        String string0 = simpleType0.getErasedSignature();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<ObjectMapper.DefaultTyping> class0 = ObjectMapper.DefaultTyping.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        JavaType javaType0 = simpleType0._narrow(class0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        SimpleType.construct(class0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<LinkedList> class0 = LinkedList.class;
        SimpleType.construct(class0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<Object> class0 = Object.class;
        JavaType javaType0 = simpleType0._narrow(class0);
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        SimpleType simpleType1 = simpleType0.withTypeHandler(simpleType0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        SimpleType simpleType1 = simpleType0.withTypeHandler((Object) null);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        SimpleType simpleType1 = simpleType0.withValueHandler(simpleType0);
        simpleType1.hasValueHandler();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        SimpleType simpleType1 = simpleType0.withValueHandler((Object) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        SimpleType simpleType1 = simpleType0.withStaticTyping();
        SimpleType simpleType2 = simpleType1.withStaticTyping();
        simpleType2.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Class<InputStream> class0 = InputStream.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class1 = HashMap.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        JavaType javaType0 = objectMapper0.constructType(class0);
        MapType mapType0 = typeFactory0.constructMapType(class1, javaType0, javaType0);
        SimpleType simpleType0 = new SimpleType(mapType0);
        StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "[simple type, class java.util.HashMap<java.io.InputStream,java.io.InputStream>]");
        simpleType0.getGenericSignature(stringBuilder0);
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        SimpleType simpleType1 = new SimpleType(simpleType0);
        boolean boolean0 = simpleType0.equals(simpleType1);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean0 = simpleType0.equals(simpleType0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        boolean boolean0 = simpleType0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        Object object0 = new Object();
        boolean boolean0 = simpleType0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        SimpleType simpleType1 = TypeFactory.CORE_TYPE_COMPARABLE;
        boolean boolean0 = simpleType0.equals(simpleType1);
    }
}
