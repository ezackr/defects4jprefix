/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:01:31 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBase;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.time.format.FormatStyle;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CollectionLikeType_ESTest extends CollectionLikeType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<ReferenceType> class0 = ReferenceType.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        String string0 = collectionLikeType0.getErasedSignature();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        String string0 = collectionLikeType0.toString();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withContentTypeHandler(simpleType0);
        collectionLikeType1.isContainerType();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        Object object0 = collectionLikeType0.getContentValueHandler();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        CollectionType collectionType0 = new CollectionType(simpleType0, simpleType0);
        Object object0 = collectionType0.getContentTypeHandler();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        Class<FormatStyle> class0 = FormatStyle.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) simpleType0);
        JavaType javaType0 = collectionLikeType0.refine(class0, typeBindings0, simpleType0, (JavaType[]) null);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
        Class<FormatStyle> class0 = FormatStyle.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) simpleType0);
        JavaType javaType0 = collectionLikeType0.refine(class0, typeBindings0, simpleType0, (JavaType[]) null);
        javaType0.equals((Object) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        String string0 = collectionLikeType0.getGenericSignature();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_CLASS;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withTypeHandler(simpleType0);
        collectionLikeType1.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withValueHandler("uDE@Y70mO\b2");
        collectionLikeType1.isAbstract();
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        Class<Integer> class0 = Integer.class;
        TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (List<JavaType>) linkedList0);
        JavaType[] javaTypeArray0 = new JavaType[2];
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, typeBindings0, (JavaType) simpleType0, javaTypeArray0, (JavaType) simpleType0);
        collectionLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withContentValueHandler("long<long>");
        collectionLikeType1.isConcrete();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_CLASS;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
        JavaType javaType0 = collectionLikeType0._narrow(class0);
        javaType0.equals((Object) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<JsonSerializer> class0 = JsonSerializer.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        collectionLikeType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<JsonSerializer> class0 = JsonSerializer.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        collectionLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        CollectionLikeType.upgradeFrom((JavaType) null, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.upgradeFrom(simpleType0, simpleType0);
        collectionLikeType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        JavaType javaType0 = collectionLikeType0.withContentType(collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        JavaType javaType0 = collectionLikeType0.withContentType(collectionLikeType0);
        javaType0.equals((Object) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        JavaType javaType0 = collectionLikeType0.withContentType(simpleType0);
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<MapType> class0 = MapType.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withStaticTyping();
        CollectionLikeType collectionLikeType2 = collectionLikeType1.withStaticTyping();
        collectionLikeType2.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<MapType> class0 = MapType.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withStaticTyping();
        CollectionLikeType collectionLikeType2 = collectionLikeType1.withStaticTyping();
        collectionLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<MapType> class0 = MapType.class;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (JavaType) simpleType0);
        CollectionLikeType collectionLikeType1 = collectionLikeType0.withStaticTyping();
        CollectionLikeType collectionLikeType2 = collectionLikeType1.withStaticTyping();
        collectionLikeType2.equals((Object) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<Integer> class0 = Integer.TYPE;
        CollectionType collectionType0 = new CollectionType(simpleType0, simpleType0);
        CollectionType collectionType1 = collectionType0.withTypeHandler(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class1 = LinkedList.class;
        CollectionType collectionType2 = typeFactory0.constructCollectionType((Class<? extends Collection>) class1, (JavaType) collectionType1);
        collectionType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<Integer> class0 = Integer.TYPE;
        CollectionType collectionType0 = new CollectionType(simpleType0, simpleType0);
        CollectionType collectionType1 = collectionType0.withTypeHandler(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class1 = LinkedList.class;
        CollectionType collectionType2 = typeFactory0.constructCollectionType((Class<? extends Collection>) class1, (JavaType) collectionType1);
        collectionType2.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test1926() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Class<Integer> class0 = Integer.TYPE;
        CollectionType collectionType0 = new CollectionType(simpleType0, simpleType0);
        CollectionType collectionType1 = collectionType0.withTypeHandler(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class1 = LinkedList.class;
        CollectionType collectionType2 = typeFactory0.constructCollectionType((Class<? extends Collection>) class1, (JavaType) collectionType1);
        collectionType2.equals((Object) collectionType0);
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, (JavaType) null);
        String string0 = collectionLikeType0.buildCanonicalName();
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        String string0 = collectionLikeType0.toCanonical();
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(simpleType0, simpleType0);
        boolean boolean0 = collectionLikeType0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        Class<Object> class0 = Object.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        Class<MapLikeType> class1 = MapLikeType.class;
        JavaType javaType0 = TypeBase._bogusSuperClass(class1);
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct(class0, javaType0);
        ArrayType arrayType0 = ArrayType.construct(javaType0, typeBindings0, (Object) class0, (Object) javaType0);
        CollectionLikeType collectionLikeType1 = new CollectionLikeType(collectionLikeType0, arrayType0);
        boolean boolean0 = collectionLikeType0.equals(collectionLikeType1);
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        Class<Object> class0 = Object.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        Class<MapLikeType> class1 = MapLikeType.class;
        JavaType javaType0 = TypeBase._bogusSuperClass(class1);
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct(class0, javaType0);
        ArrayType arrayType0 = ArrayType.construct(javaType0, typeBindings0, (Object) class0, (Object) javaType0);
        CollectionLikeType collectionLikeType1 = new CollectionLikeType(collectionLikeType0, arrayType0);
        boolean boolean0 = collectionLikeType0.equals(collectionLikeType1);
        collectionLikeType1.useStaticType();
    }
}
