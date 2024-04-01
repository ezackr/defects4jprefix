/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 18:30:48 GMT 2023
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.time.chrono.ChronoLocalDate;
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
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        Class<HashMap> class1 = HashMap.class;
        Class<BooleanNode> class2 = BooleanNode.class;
        MapType mapType0 = typeFactory0.constructMapType(class1, class0, class2);
        SimpleType simpleType0 = new SimpleType(mapType0);
        String string0 = simpleType0.toCanonical();
        assertEquals("java.util.HashMap<java.util.LinkedList<java.lang.Object>,com.fasterxml.jackson.databind.node.BooleanNode>", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        // Undeclared exception!
        try {
            simpleType0.withContentValueHandler(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Simple types have no content types; can not call withContenValueHandler()
            //
            verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        // Undeclared exception!
        try {
            simpleType0.withContentTypeHandler(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Simple types have no content types; can not call withContenTypeHandler()
            //
            verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<SimpleType> class0 = SimpleType.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        // Undeclared exception!
        try {
            simpleType0.withContentType(simpleType0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Simple types have no content types; can not call withContentType()
            //
            verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        ReferenceType referenceType0 = new ReferenceType(collectionType0, collectionType0);
        ReferenceType referenceType1 = referenceType0.withStaticTyping();
        assertFalse(referenceType1.isInterface());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        SimpleType simpleType1 = simpleType0.withStaticTyping();
        SimpleType simpleType2 = simpleType1.withStaticTyping();
        assertNotSame(simpleType2, simpleType0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        SimpleType simpleType1 = simpleType0.withStaticTyping();
        SimpleType simpleType2 = simpleType1.withStaticTyping();
        assertTrue(simpleType2.useStaticType());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        String string0 = simpleType0.getErasedSignature();
        assertEquals("Z", string0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = new SimpleType(class0);
        assertFalse(simpleType0.isArrayType());
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        // Undeclared exception!
        try {
            SimpleType.construct(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not construct SimpleType for a Map (class: java.util.HashMap)
            //
            verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Class<LinkedList> class0 = LinkedList.class;
        // Undeclared exception!
        try {
            SimpleType.construct(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not construct SimpleType for a Collection (class: java.util.LinkedList)
            //
            verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        JavaType javaType0 = simpleType0._narrow(class0);
        assertFalse(javaType0.isFinal());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        JavaType javaType0 = simpleType0._narrow(class0);
        assertSame(javaType0, simpleType0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Class<Integer> class0 = Integer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        SimpleType simpleType1 = simpleType0.withTypeHandler(class0);
        assertNotSame(simpleType1, simpleType0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        SimpleType simpleType1 = simpleType0.withTypeHandler((Object) null);
        assertSame(simpleType1, simpleType0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Class<BooleanNode> class0 = BooleanNode.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        SimpleType simpleType1 = simpleType0.withValueHandler(class0);
        assertTrue(simpleType1.hasValueHandler());
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        SimpleType simpleType1 = simpleType0.withValueHandler((Object) null);
        assertSame(simpleType1, simpleType0);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        SimpleType simpleType0 = new SimpleType(collectionType0);
        String string0 = simpleType0.getGenericSignature();
        assertEquals("Ljava/util/LinkedList<Ljava/util/LinkedList<Ljava/lang/Object;>;>;", string0);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        boolean boolean0 = simpleType0.equals((Object) null);
        assertFalse(boolean0);
    }
}
