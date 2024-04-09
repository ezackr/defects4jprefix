/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:27:56 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ResolvedRecursiveType_ESTest extends ResolvedRecursiveType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        ResolvedRecursiveType resolvedRecursiveType1 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        boolean boolean0 = resolvedRecursiveType0.equals(resolvedRecursiveType1);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Integer> class0 = Integer.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.getGenericSignature();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<String> class0 = String.class;
        Class<Object> class1 = Object.class;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class1, (JavaType) null);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        JavaType javaType0 = resolvedRecursiveType0.withTypeHandler((Object) null);
        javaType0.isArrayType();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType javaType0 = resolvedRecursiveType0.withContentType(resolvedRecursiveType0);
        javaType0.isAbstract();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        boolean boolean0 = resolvedRecursiveType0.isContainerType();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<String> class0 = String.class;
        Class<Object> class1 = Object.class;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class1, (JavaType) null);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        JavaType javaType0 = resolvedRecursiveType0.withContentTypeHandler((Object) null);
        javaType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.getErasedSignature();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType javaType0 = resolvedRecursiveType0.withValueHandler(class0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<String> class0 = String.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        Class<Object> class1 = Object.class;
        JavaType[] javaTypeArray0 = new JavaType[2];
        JavaType javaType0 = resolvedRecursiveType0.refine(class1, typeBindings0, resolvedRecursiveType0, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        CollectionType collectionType0 = new CollectionType(resolvedRecursiveType0, resolvedRecursiveType0);
        CollectionType collectionType1 = collectionType0.withStaticTyping();
        collectionType1.isInterface();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<String> class0 = String.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        JavaType javaType0 = resolvedRecursiveType0.withContentValueHandler((Object) null);
        javaType0.isMapLikeType();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType javaType0 = resolvedRecursiveType0._narrow(class0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        String string0 = resolvedRecursiveType0.toString();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        ResolvedRecursiveType resolvedRecursiveType1 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType1.equals((Object) resolvedRecursiveType0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        ResolvedRecursiveType resolvedRecursiveType1 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType1.setReference(resolvedRecursiveType0);
        boolean boolean0 = resolvedRecursiveType0.equals(resolvedRecursiveType1);
        resolvedRecursiveType1.equals((Object) resolvedRecursiveType0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        ResolvedRecursiveType resolvedRecursiveType1 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType1.setReference(resolvedRecursiveType0);
        boolean boolean0 = resolvedRecursiveType0.equals(resolvedRecursiveType1);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Class<Object> class0 = Object.class;
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        boolean boolean0 = resolvedRecursiveType0.equals(typeBindings0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType[] javaTypeArray0 = new JavaType[6];
        javaTypeArray0[0] = (JavaType) resolvedRecursiveType0;
        MapType mapType0 = MapType.construct((Class<?>) class0, (TypeBindings) null, (JavaType) resolvedRecursiveType0, javaTypeArray0, javaTypeArray0[0], (JavaType) resolvedRecursiveType0);
        resolvedRecursiveType0.setReference(mapType0);
        Object object0 = new Object();
        boolean boolean0 = resolvedRecursiveType0.equals(object0);
    }
}
