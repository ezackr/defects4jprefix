/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:25:00 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
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
        resolvedRecursiveType0.getGenericSignature((StringBuilder) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        ResolvedRecursiveType resolvedRecursiveType1 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType1.setReference(resolvedRecursiveType0);
        boolean boolean0 = resolvedRecursiveType1.equals(resolvedRecursiveType0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        Integer integer0 = Integer.valueOf(1);
        JavaType javaType0 = resolvedRecursiveType0.withTypeHandler(integer0);
        javaType0.isArrayType();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        JavaType javaType0 = resolvedRecursiveType0.withContentType(simpleType0);
        javaType0.isConcrete();
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
        javaType0.isPrimitive();
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
        JavaType javaType0 = resolvedRecursiveType0.withValueHandler(resolvedRecursiveType0);
        javaType0.hasContentType();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType[] javaTypeArray0 = new JavaType[2];
        JavaType javaType0 = resolvedRecursiveType0.refine(class0, (TypeBindings) null, (JavaType) null, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType javaType0 = resolvedRecursiveType0.withStaticTyping();
        javaType0.hasValueHandler();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
        Class<String> class1 = String.class;
        TypeBindings typeBindings0 = TypeBindings.create(class1, (JavaType[]) null);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        JavaType javaType0 = resolvedRecursiveType0.withContentValueHandler(class1);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType javaType0 = resolvedRecursiveType0._narrow(class0);
        javaType0.isInterface();
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
        Class<Object> class1 = Object.class;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class1, (JavaType) null);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
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
        boolean boolean0 = resolvedRecursiveType1.equals(resolvedRecursiveType0);
        resolvedRecursiveType1.equals((Object) resolvedRecursiveType0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        ResolvedRecursiveType resolvedRecursiveType1 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType1.setReference(resolvedRecursiveType0);
        boolean boolean0 = resolvedRecursiveType1.equals(resolvedRecursiveType0);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        boolean boolean0 = resolvedRecursiveType0.equals(class0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Class<String> class0 = String.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        resolvedRecursiveType0.setReference(resolvedRecursiveType0);
        JsonGenerator.Feature jsonGenerator_Feature0 = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        boolean boolean0 = resolvedRecursiveType0.equals(jsonGenerator_Feature0);
    }
}
