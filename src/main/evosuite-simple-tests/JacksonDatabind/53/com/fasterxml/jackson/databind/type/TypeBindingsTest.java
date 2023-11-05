/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 18:57:58 GMT 2023
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;

public class TypeBindingsTest {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        Class<String> class1 = String.class;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class1, (List<JavaType>) stack0);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        JavaType[] javaTypeArray0 = resolvedRecursiveType0.findTypeParameters(class0);
        assertEquals(0, javaTypeArray0.length);
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        Class<CollectionType> class0 = CollectionType.class;
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        Class<Map> class1 = Map.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class1);
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) mapType0);
        assertTrue(typeBindings0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        Class<Vector> class0 = Vector.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        TypeBindings typeBindings1 = (TypeBindings) typeBindings0.readResolve();
        assertEquals(1, typeBindings1.size());
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        Object object0 = typeBindings0.readResolve();
        assertSame(object0, typeBindings0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        Class<Vector> class0 = Vector.class;
        // Undeclared exception!
        try {
            TypeBindings.create(class0, (List<JavaType>) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Vector with 0 type parameters: class expects 1
        }
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Class<Vector> class0 = Vector.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) simpleType0);
        List<JavaType> list0 = typeBindings0.getTypeParameters();
        TypeBindings typeBindings1 = TypeBindings.create(class0, list0);
        assertEquals(1, typeBindings1.size());
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Class<Vector> class0 = Vector.class;
        // Undeclared exception!
        try {
            TypeBindings.create(class0, (JavaType[]) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Vector with 0 type parameters: class expects 1
        }
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        Class<CollectionType> class0 = CollectionType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        // Undeclared exception!
        try {
            TypeBindings.create(class0, javaTypeArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class com.fasterxml.jackson.databind.type.CollectionType with 1 type parameter: class expects 0
        }
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        Class<Vector> class0 = Vector.class;
        JavaType[] javaTypeArray0 = new JavaType[2];
        // Undeclared exception!
        try {
            TypeBindings.create(class0, javaTypeArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Vector with 2 type parameters: class expects 1
        }
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        Class<Map> class0 = Map.class;
        // Undeclared exception!
        try {
            TypeBindings.createIfNeeded(class0, (JavaType) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Map with 1 type parameter: class expects 2
        }
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        Class<Vector> class0 = Vector.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        // Undeclared exception!
        try {
            TypeBindings.createIfNeeded(class0, javaTypeArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        Class<Integer> class0 = Integer.class;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, (JavaType[]) null);
        assertTrue(typeBindings0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        Class<Vector> class0 = Vector.class;
        // Undeclared exception!
        try {
            TypeBindings.createIfNeeded(class0, (JavaType[]) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Vector with 0 type parameters: class expects 1
        }
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        Class<Map> class0 = Map.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        // Undeclared exception!
        try {
            TypeBindings.createIfNeeded(class0, javaTypeArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Map with 1 type parameter: class expects 2
        }
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        TypeBindings typeBindings1 = typeBindings0.withUnboundVariable(" with 2 type parameters: class expects ");
        TypeBindings typeBindings2 = typeBindings1.withUnboundVariable(" with 2 type parameters: class expects ");
        assertTrue(typeBindings2.equals((Object) typeBindings1));
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        Class<Vector> class0 = Vector.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        assertEquals(0, arrayType0.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JavaType javaType0 = TypeFactory.unknownType();
        ObjectReader objectReader0 = objectMapper0.readerFor(javaType0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        Class<String> class1 = String.class;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class1, (List<JavaType>) stack0);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Vector> class2 = Vector.class;
        typeFactory0.constructCollectionType((Class<? extends Collection>) class2, (JavaType) resolvedRecursiveType0);
        assertTrue(typeBindings0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        Class<String> class1 = String.class;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class1, (List<JavaType>) stack0);
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        TypeFactory typeFactory0 = TypeFactory.instance;
        resolvedRecursiveType0.setReference(simpleType0);
        Class<Vector> class2 = Vector.class;
        typeFactory0.constructCollectionType((Class<? extends Collection>) class2, (JavaType) resolvedRecursiveType0);
        assertTrue(typeBindings0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        String string0 = typeBindings0.getBoundName((-537));
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        Class<Vector> class0 = Vector.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        String string0 = typeBindings0.getBoundName(0);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        Class<Vector> class0 = Vector.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        String string0 = typeBindings0.getBoundName(0);
        assertEquals("E", string0);
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        String string0 = typeBindings0.getBoundName(0);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        JavaType javaType0 = typeBindings0.getBoundType((-1018));
        assertNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        Class<Vector> class0 = Vector.class;
        JavaType javaType0 = TypeFactory.unknownType();
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, javaType0);
        JavaType javaType1 = typeBindings0.getBoundType(0);
        assertFalse(javaType1.isContainerType());
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        JavaType javaType0 = typeBindings0.getBoundType(0);
        assertNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        List<JavaType> list0 = typeBindings0.getTypeParameters();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        TypeBindings typeBindings1 = typeBindings0.withUnboundVariable("s");
        boolean boolean0 = typeBindings1.hasUnbound("s");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        TypeBindings typeBindings1 = typeBindings0.withUnboundVariable("S%");
        boolean boolean0 = typeBindings1.hasUnbound("(5 F\"'Y");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3029() throws Throwable {
        Class<CollectionType> class0 = CollectionType.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        Class<Map> class1 = Map.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class1);
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class1, (JavaType) mapType0, (JavaType) simpleType0);
        String string0 = typeBindings0.toString();
        assertEquals("<Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;,Ljava/lang/String;>", string0);
    }

    @Test(timeout = 4000)
    public void test3130() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        String string0 = typeBindings0.toString();
        assertEquals("<>", string0);
    }

    @Test(timeout = 4000)
    public void test3231() throws Throwable {
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        TypeBindings typeBindings1 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) simpleType0);
        boolean boolean0 = typeBindings1.equals(typeBindings0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        boolean boolean0 = typeBindings0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3433() throws Throwable {
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        boolean boolean0 = typeBindings0.equals("{n=p<Dj4+:v+3.6");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3534() throws Throwable {
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        TypeBindings typeBindings1 = TypeBindings.emptyBindings();
        boolean boolean0 = typeBindings1.equals(typeBindings0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        TypeBindings typeBindings1 = TypeBindings.emptyBindings();
        boolean boolean0 = typeBindings1.equals(typeBindings0);
        assertFalse(typeBindings0.equals((Object) typeBindings1));
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
        MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
        TypeBindings typeBindings1 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) mapType0);
        boolean boolean0 = typeBindings1.equals(typeBindings0);
        assertFalse(boolean0);
    }
}
