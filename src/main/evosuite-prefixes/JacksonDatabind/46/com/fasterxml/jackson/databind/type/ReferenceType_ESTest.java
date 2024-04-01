/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 18:33:38 GMT 2023
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.math.RoundingMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ReferenceType_ESTest extends ReferenceType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Class<Integer> class0 = Integer.TYPE;
        Object object0 = new Object();
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, object0, object0);
        FloatNode floatNode0 = FloatNode.valueOf(9.223372E18F);
        ReferenceType referenceType1 = referenceType0.withContentValueHandler(floatNode0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Class<Integer> class0 = Integer.TYPE;
        Object object0 = new Object();
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, object0, object0);
        FloatNode floatNode0 = FloatNode.valueOf(9.223372E18F);
        ReferenceType referenceType1 = referenceType0.withContentValueHandler(floatNode0);
        referenceType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Class<Object> class0 = Object.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ReferenceType> class1 = ReferenceType.class;
        SimpleType simpleType0 = new SimpleType(class1, 0, class0, "nQm{gSQ", false);
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType((Class<?>) class0, (JavaType) simpleType0);
        Integer integer0 = new Integer(1301);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) collectionLikeType0, (Object) typeFactory0, (Object) integer0);
        StringBuilder stringBuilder0 = new StringBuilder();
        referenceType0.getGenericSignature(stringBuilder0);
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        Object object0 = new Object();
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, object0, simpleType0, false);
        JavaType javaType0 = referenceType0.getReferencedType();
        javaType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<String> class1 = String.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        CollectionType collectionType0 = CollectionType.construct(class1, simpleType0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, collectionType0, simpleType0);
        MapType mapType0 = MapType.construct(class0, collectionType0, mapLikeType0);
        RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
        ReferenceType referenceType0 = new ReferenceType(class0, mapType0, roundingMode0, collectionType0, true);
        boolean boolean0 = referenceType0.isReferenceType();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Class<RoundingMode> class0 = RoundingMode.class;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, "T", "T", false);
        String string0 = referenceType0.getTypeName();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, class0, (Object) null, true);
        StringBuilder stringBuilder0 = new StringBuilder(0);
        referenceType0.getErasedSignature(stringBuilder0);
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Object object0 = new Object();
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, object0, object0);
        referenceType0.getParameterSource();
        referenceType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class1 = ReferenceType.class;
        Class<String> class2 = String.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class1, class2);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) collectionLikeType0, (Object) class2, (Object) collectionLikeType0);
        JavaType javaType0 = referenceType0._narrow(class2);
        javaType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class1 = ReferenceType.class;
        Class<String> class2 = String.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class1, class2);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) collectionLikeType0, (Object) class2, (Object) collectionLikeType0);
        JavaType javaType0 = referenceType0._narrow(class2);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, integer0, true);
        int int0 = referenceType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, class0, (Object) null, true);
        ReferenceType referenceType1 = referenceType0.withTypeHandler("eBh,");
        boolean boolean0 = referenceType1.equals(referenceType0);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        Class<FloatNode> class0 = FloatNode.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, simpleType0, false);
        ReferenceType referenceType1 = referenceType0.withTypeHandler(simpleType0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, integer0, true);
        ReferenceType referenceType1 = referenceType0.withContentTypeHandler(class0);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, (Object) integer0, (Object) null);
        ReferenceType referenceType1 = referenceType0.withContentTypeHandler((Object) null);
        referenceType1.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, (Object) integer0, (Object) null);
        ReferenceType referenceType1 = referenceType0.withContentTypeHandler((Object) null);
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        Object object0 = new Object();
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, object0, object0);
        ReferenceType referenceType1 = referenceType0.withValueHandler(integer0);
        ReferenceType referenceType2 = referenceType1.withValueHandler(integer0);
        referenceType2.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        Object object0 = new Object();
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, object0, object0);
        ReferenceType referenceType1 = referenceType0.withValueHandler(integer0);
        ReferenceType referenceType2 = referenceType1.withValueHandler(integer0);
        referenceType2.hasValueHandler();
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<String> class1 = String.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        CollectionType collectionType0 = CollectionType.construct(class1, simpleType0);
        MapLikeType mapLikeType0 = MapLikeType.construct(class0, collectionType0, simpleType0);
        MapType mapType0 = MapType.construct(class0, collectionType0, mapLikeType0);
        Class<RoundingMode> class2 = RoundingMode.class;
        ReferenceType referenceType0 = new ReferenceType(class2, mapType0, class0, mapType0, false);
        ReferenceType referenceType1 = referenceType0.withContentValueHandler((Object) null);
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        Class<String> class0 = String.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        Object object0 = new Object();
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, object0, simpleType0, false);
        ReferenceType referenceType1 = referenceType0.withStaticTyping();
        ReferenceType referenceType2 = referenceType1.withStaticTyping();
        referenceType2.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, integer0, true);
        JavaType javaType0 = referenceType0.containedType(1);
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, integer0, true);
        JavaType javaType0 = referenceType0.containedTypeOrUnknown(0);
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, integer0, true);
        String string0 = referenceType0.containedTypeName(1);
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        Integer integer0 = new Integer(0);
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, integer0, true);
        String string0 = referenceType0.containedTypeName(0);
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        Class<FloatNode> class0 = FloatNode.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, simpleType0, simpleType0, false);
        FloatNode floatNode0 = new FloatNode(0.0F);
        boolean boolean0 = referenceType0.equals(floatNode0);
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, class0, (Object) null, true);
        boolean boolean0 = referenceType0.equals(referenceType0);
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        Class<String> class0 = String.class;
        Class<Object> class1 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        Integer integer0 = new Integer((-802));
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class1, (JavaType) simpleType0, (Object) integer0, (Object) null);
        boolean boolean0 = referenceType0.equals((Object) null);
        referenceType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        Class<String> class0 = String.class;
        Class<Object> class1 = Object.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        Integer integer0 = new Integer((-802));
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class1, (JavaType) simpleType0, (Object) integer0, (Object) null);
        boolean boolean0 = referenceType0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, class0, (Object) null, true);
        Object object0 = new Object();
        Class<ReferenceType> class1 = ReferenceType.class;
        ReferenceType referenceType1 = ReferenceType.construct((Class<?>) class1, (JavaType) referenceType0, object0, (Object) "");
        boolean boolean0 = referenceType0.equals(referenceType1);
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        Class<RoundingMode> class0 = RoundingMode.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
        ReferenceType referenceType0 = new ReferenceType(class0, simpleType0, class0, (Object) null, true);
        Object object0 = new Object();
        Class<ReferenceType> class1 = ReferenceType.class;
        ReferenceType referenceType1 = ReferenceType.construct((Class<?>) class1, (JavaType) referenceType0, object0, (Object) "");
        boolean boolean0 = referenceType0.equals(referenceType1);
        referenceType1.useStaticType();
    }
}
