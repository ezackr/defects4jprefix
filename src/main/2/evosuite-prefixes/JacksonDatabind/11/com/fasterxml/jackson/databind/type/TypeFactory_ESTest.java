/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 18:28:23 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.HierarchicType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.type.TypeParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeFactory_ESTest extends TypeFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        collectionType0.isInterface();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeModifier[] typeModifierArray0 = new TypeModifier[0];
        TypeFactory typeFactory1 = new TypeFactory(typeParser0, typeModifierArray0);
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        TypeFactory typeFactory2 = typeFactory1.withModifier(typeModifier0);
        typeFactory2.equals((Object) typeFactory0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        InputDecorator inputDecorator0 = mock(InputDecorator.class, new ViolatedAssumptionAnswer());
        doReturn((InputStream) null).when(inputDecorator0).decorate(any(com.fasterxml.jackson.core.io.IOContext.class), any(byte[].class), anyInt(), anyInt());
        jsonFactory0.setInputDecorator(inputDecorator0);
        byte[] byteArray0 = new byte[3];
        jsonFactory0.createParser(byteArray0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        objectMapper0.writeValueAsString(jsonFactory0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<CollectionType> class0 = CollectionType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        typeFactory0.constructParametricType(class0, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class0);
        mapType0.hasGenericTypes();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectReader> class0 = ObjectReader.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class0);
        mapLikeType0.isAbstract();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.clearCache();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        collectionLikeType0.hasGenericTypes();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapType> class0 = MapType.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class0);
        JavaType javaType0 = typeFactory0.constructSpecializedType(collectionLikeType0, class0);
        javaType0.isConcrete();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MapType> class1 = MapType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        typeFactory0.constructParametrizedType(class0, class1, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Object> class0 = Object.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        arrayType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        typeFactory0.constructType((TypeReference<?>) null);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        mapType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, javaType0);
        collectionLikeType0.isConcrete();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        mapLikeType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.constructFromCanonical(" (and target ");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapLikeType> class0 = MapLikeType.class;
        Class<ObjectReader>[] classArray0 = (Class<ObjectReader>[]) Array.newInstance(Class.class, 0);
        JavaType javaType0 = typeFactory0.constructParametricType(class0, classArray0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType((Class<?>) class0, (JavaType) simpleType0, (JavaType) simpleType0);
        mapLikeType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        ArrayType arrayType0 = typeFactory0.constructArrayType((JavaType) simpleType0);
        arrayType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeFactory typeFactory1 = typeFactory0.withModifier((TypeModifier) null);
        typeFactory1.equals((Object) typeFactory0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Class<String> class0 = String.class;
        Class<?> class1 = TypeFactory.rawClass(class0);
        class1.isInterface();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        InputDecorator inputDecorator0 = mock(InputDecorator.class, new ViolatedAssumptionAnswer());
        jsonFactory0.setInputDecorator(inputDecorator0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        String string0 = objectMapper0.writeValueAsString(jsonFactory0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0._unknownType();
        JavaType javaType1 = typeFactory0.constructSpecializedType(javaType0, class0);
        javaType1.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        typeFactory0.constructSpecializedType(simpleType0, class0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
        JavaType[] javaTypeArray1 = typeFactory0.findTypeParameters(javaType0, class0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
        JavaType[] javaTypeArray1 = typeFactory0.findTypeParameters(javaType0, class0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        Class<SimpleType> class1 = SimpleType.class;
        typeFactory0.findTypeParameters(javaType0, class1);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        Class<PushbackInputStream> class1 = PushbackInputStream.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class1);
        javaType0.isAbstract();
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        Class<CollectionType> class1 = CollectionType.class;
        TypeBindings typeBindings0 = new TypeBindings(typeFactory0, class1);
        JavaType javaType0 = typeFactory0._fromClass(class0, typeBindings0);
        JavaType javaType1 = typeFactory0.moreSpecificType(typeBindings0.UNBOUND, javaType0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0.moreSpecificType((JavaType) null, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        JavaType javaType0 = typeFactory0.moreSpecificType(simpleType0, (JavaType) null);
        javaType0.isInterface();
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0._unknownType();
        JavaType javaType1 = typeFactory0.moreSpecificType(javaType0, javaType0);
        javaType1.isMapLikeType();
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<SimpleType> class0 = SimpleType.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (JavaType) simpleType0);
        JavaType javaType1 = typeFactory0.moreSpecificType(simpleType0, javaType0);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<SimpleType> class0 = SimpleType.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (JavaType) simpleType0);
        JavaType javaType1 = typeFactory0.moreSpecificType(simpleType0, javaType0);
        javaType0.isAbstract();
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.constructType((Type) null, (Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        JavaType javaType0 = typeFactory0.constructType((Type) simpleType0, (JavaType) null);
        javaType0.isMapLikeType();
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeModifier[] typeModifierArray0 = new TypeModifier[0];
        TypeFactory typeFactory1 = new TypeFactory(typeParser0, typeModifierArray0);
        JavaType javaType0 = typeFactory1.constructType((Type) class0);
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn((JavaType) null, (JavaType) null, (JavaType) null, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        typeFactory1.constructType((Type) class0);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectReader> class0 = ObjectReader.class;
        Class<SimpleType>[] classArray0 = (Class<SimpleType>[]) Array.newInstance(Class.class, 1);
        typeFactory0.constructParametricType(class0, classArray0);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Integer> class1 = Integer.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        typeFactory0.constructParametrizedType(class0, class1, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        JavaType[] javaTypeArray0 = new JavaType[2];
        typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ArrayList> class0 = ArrayList.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test4042() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        Class<IsoEra> class0 = IsoEra.class;
        CollectionType collectionType0 = CollectionType.construct(class0, simpleType0);
        ArrayType arrayType0 = ArrayType.construct(simpleType0, simpleType0, collectionType0);
        ArrayType arrayType1 = arrayType0.withStaticTyping();
        ArrayType arrayType2 = arrayType1.withStaticTyping();
        Class<?> class1 = TypeFactory.rawClass(arrayType2);
        TypeBindings typeBindings0 = new TypeBindings(typeFactory0, class0);
        typeFactory0._constructType(class1, typeBindings0);
        JavaType javaType0 = typeFactory0._fromClass(class1, typeBindings0);
        Class<ClassKey> class2 = ClassKey.class;
        Class<MapType> class3 = MapType.class;
        SimpleType simpleType1 = new SimpleType(class3);
        Class<Integer> class4 = Integer.class;
        JavaType[] javaTypeArray0 = new JavaType[7];
        javaTypeArray0[0] = (JavaType) arrayType1;
        javaTypeArray0[1] = (JavaType) simpleType0;
        javaTypeArray0[2] = (JavaType) simpleType0;
        javaTypeArray0[3] = (JavaType) simpleType0;
        javaTypeArray0[4] = (JavaType) arrayType0;
        javaTypeArray0[5] = (JavaType) simpleType0;
        javaTypeArray0[6] = javaType0;
    }

    @Test(timeout = 4000)
    public void test4143() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper();
        String string0 = objectMapper0.writeValueAsString(jsonFactory0);
    }

    @Test(timeout = 4000)
    public void test4244() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        javaType0.isMapLikeType();
    }

    @Test(timeout = 4000)
    public void test4345() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        Class<IsoEra> class0 = IsoEra.class;
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        javaType0.hasGenericTypes();
    }

    @Test(timeout = 4000)
    public void test4446() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, linkedList0);
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test4547() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        Vector<JavaType> vector0 = new Vector<JavaType>();
        vector0.add((JavaType) null);
        typeFactory0._fromParameterizedClass(class0, vector0);
    }

    @Test(timeout = 4000)
    public void test4648() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        Stack<JavaType> stack0 = new Stack<JavaType>();
        stack0.add((JavaType) simpleType0);
        stack0.add((JavaType) simpleType0);
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        javaType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test4749() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Stack<JavaType> stack0 = new Stack<JavaType>();
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test4850() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        linkedList0.add((JavaType) collectionType0);
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, linkedList0);
        javaType0.isCollectionLikeType();
    }

    @Test(timeout = 4000)
    public void test4951() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Stack<JavaType> stack0 = new Stack<JavaType>();
        stack0.add((JavaType) null);
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        typeFactory0._fromParameterizedClass(class0, stack0);
    }

    @Test(timeout = 4000)
    public void test5052() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0._resolveVariableViaSubTypes((HierarchicType) null, "[", (TypeBindings) null);
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test5153() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        Class<ArrayType> class0 = ArrayType.class;
        ObjectReader objectReader0 = objectMapper0.readerWithView((Class<?>) class0);
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        HierarchicType hierarchicType0 = typeFactory0._cachedHashMapType;
        JavaType javaType0 = typeFactory0._resolveVariableViaSubTypes(hierarchicType0, "V", (TypeBindings) null);
        javaType0.useStaticType();
    }

    @Test(timeout = 4000)
    public void test5254() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        Class<Object> class1 = Object.class;
        JavaType[] javaTypeArray0 = typeFactory0.findTypeParameters(class0, class1);
    }

    @Test(timeout = 4000)
    public void test5355() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Integer> class1 = Integer.class;
        HierarchicType hierarchicType0 = typeFactory0._findSuperInterfaceChain(class0, class1);
    }

    @Test(timeout = 4000)
    public void test5456() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Object> class1 = Object.class;
        HierarchicType hierarchicType0 = typeFactory0._findSuperInterfaceChain(class0, class1);
        hierarchicType0.isGeneric();
    }

    @Test(timeout = 4000)
    public void test5557() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        typeFactory0._arrayListSuperInterfaceChain((HierarchicType) null);
    }
}
