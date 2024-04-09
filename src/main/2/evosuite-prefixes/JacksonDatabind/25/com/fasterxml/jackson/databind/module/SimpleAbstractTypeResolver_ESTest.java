/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:22:52 GMT 2024
 */
package com.fasterxml.jackson.databind.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SimpleAbstractTypeResolver_ESTest extends SimpleAbstractTypeResolver_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        JavaType javaType0 = TypeFactory.unknownType();
        JavaType javaType1 = simpleAbstractTypeResolver0.resolveAbstractType((DeserializationConfig) null, javaType0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        Class<ClassNameIdResolver> class1 = ClassNameIdResolver.class;
        SimpleAbstractTypeResolver simpleAbstractTypeResolver1 = simpleAbstractTypeResolver0.addMapping(class0, (Class<? extends TypeIdResolver>) class1);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructType((Type) class0);
        JavaType javaType1 = simpleAbstractTypeResolver1.findTypeMapping((DeserializationConfig) null, javaType0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        Class<ClassNameIdResolver> class1 = ClassNameIdResolver.class;
        SimpleAbstractTypeResolver simpleAbstractTypeResolver1 = simpleAbstractTypeResolver0.addMapping(class0, (Class<? extends TypeIdResolver>) class1);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructType((Type) class0);
        JavaType javaType1 = simpleAbstractTypeResolver1.findTypeMapping((DeserializationConfig) null, javaType0);
        javaType1.isInterface();
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        Class<Object> class0 = Object.class;
        simpleAbstractTypeResolver0.addMapping(class0, (Class<?>) class0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        Class<Object> class0 = Object.class;
        Class<Integer> class1 = Integer.TYPE;
        simpleAbstractTypeResolver0.addMapping(class0, (Class<?>) class1);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        Class<Object> class0 = Object.class;
        Class<Integer> class1 = Integer.class;
        simpleAbstractTypeResolver0.addMapping(class0, (Class<?>) class1);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        JavaType javaType0 = TypeFactory.unknownType();
        JavaType javaType1 = simpleAbstractTypeResolver0.findTypeMapping((DeserializationConfig) null, javaType0);
    }
}
