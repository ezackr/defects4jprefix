/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:57:39 GMT 2023
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassStack;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeFactory_ESTest extends TypeFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapperFeature> class0 = MapperFeature.class;
        JavaType[] javaTypeArray0 = typeFactory0.findTypeParameters(class0, class0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapperFeature> class0 = MapperFeature.class;
        Class<String> class1 = String.class;
        JavaType javaType0 = typeFactory0.constructSimpleType(class0, class1, (JavaType[]) null);
        javaType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        CollectionType collectionType1 = collectionType0.withTypeHandler(collectionType0);
        CollectionType collectionType2 = typeFactory0.constructCollectionType((Class<? extends Collection>) class0, (JavaType) collectionType1);
        collectionType2.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<MapType> atomicReference0 = new AtomicReference<MapType>();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(atomicReference0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
        Class<ArrayType>[] classArray0 = (Class<ArrayType>[]) Array.newInstance(Class.class, 0);
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, classArray0);
        javaType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
        Class<ArrayType>[] classArray0 = (Class<ArrayType>[]) Array.newInstance(Class.class, 0);
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, classArray0);
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<CollectionType> class0 = CollectionType.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<CollectionType> class0 = CollectionType.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        javaType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<CollectionType> class0 = CollectionType.class;
        Class<SerializationFeature> class1 = SerializationFeature.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class1, class0);
        mapLikeType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<CollectionType> class0 = CollectionType.class;
        Class<SerializationFeature> class1 = SerializationFeature.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class1, class0);
        mapLikeType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MapType> class0 = MapType.class;
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, (JavaType[]) null);
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        File file0 = MockFile.createTempFile("v3z8+'A1P4/(oT", "v3z8+'A1P4/(oT");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(mockFileInputStream0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.clearCache();
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<AnnotationIntrospector.ReferenceProperty.Type> class0 = AnnotationIntrospector.ReferenceProperty.Type.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        collectionLikeType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        Class<ArrayType> class1 = ArrayType.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        Class<Object> class2 = Object.class;
        JavaType javaType0 = typeFactory0.constructGeneralizedType(collectionType0, class2);
        JavaType javaType1 = typeFactory0.constructType((Type) javaType0, javaType0);
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class0);
        Class<CollectionType> class1 = CollectionType.class;
        typeFactory0.findTypeParameters((JavaType) collectionLikeType0, (Class<?>) class1);
        collectionLikeType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<SerializationFeature> class0 = SerializationFeature.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        arrayType0.hasHandlers();
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.constructType((TypeReference<?>) null);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        typeFactory0.constructRawMapType(class0);
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Properties> class0 = Properties.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        JavaType javaType0 = typeFactory0.moreSpecificType(mapLikeType0, mapLikeType0);
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructFromCanonical("com.fasterxml.jackson.databind.type.TypeFactory");
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        TypeFactory typeFactory1 = typeFactory0.withClassLoader(classLoader0);
        typeFactory1.findClass("&paEo@");
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class0 = ReferenceType.class;
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        JavaType[] javaTypeArray0 = typeFactory0.findTypeParameters(class0, class0, typeBindings0);
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<AnnotationIntrospector.ReferenceProperty.Type> class0 = AnnotationIntrospector.ReferenceProperty.Type.class;
        typeFactory0.constructReferenceType(class0, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeFactory typeFactory1 = typeFactory0.withCache((LRUMap<Object, JavaType>) null);
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        typeFactory0.findClass("jS?hC(*");
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.constructArrayType((JavaType) null);
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        LRUMap<Object, JavaType> lRUMap0 = new LRUMap<Object, JavaType>(2459, 2459);
        TypeFactory typeFactory0 = new TypeFactory(lRUMap0);
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        TypeFactory typeFactory0 = new TypeFactory((LRUMap<Object, JavaType>) null);
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        TypeModifier typeModifier1 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        TypeFactory typeFactory2 = typeFactory1.withModifier(typeModifier1);
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeFactory typeFactory1 = typeFactory0.withModifier((TypeModifier) null);
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        TypeFactory.rawClass((Type) null);
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        Class<CollectionType> class0 = CollectionType.class;
        Class<?> class1 = TypeFactory.rawClass(class0);
        class1.isInterface();
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("double");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("int");
        class0.isAnnotation();
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("long");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("float");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("boolean");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("byte");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("char");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3741() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("short");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3842() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("void");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test3943() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashSet> class0 = HashSet.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        JavaType javaType1 = typeFactory0.constructSpecializedType(javaType0, class0);
    }

    @Test(timeout = 4000)
    public void test4044() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        typeFactory0.constructSpecializedType(simpleType0, class0);
    }

    @Test(timeout = 4000)
    public void test4145() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<AnnotationIntrospector.ReferenceProperty.Type> class0 = AnnotationIntrospector.ReferenceProperty.Type.class;
        JavaType javaType0 = typeFactory0.constructSpecializedType(simpleType0, class0);
        javaType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<CollectionType> class0 = CollectionType.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        JavaType javaType0 = typeFactory0.constructGeneralizedType(mapLikeType0, class0);
        javaType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test4347() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
        typeFactory0.constructGeneralizedType(simpleType0, class0);
    }

    @Test(timeout = 4000)
    public void test4448() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        Class<Object> class1 = Object.class;
        typeFactory0.constructGeneralizedType(resolvedRecursiveType0, class1);
    }

    @Test(timeout = 4000)
    public void test4549() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        Class<MapType> class1 = MapType.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        JavaType javaType0 = TypeFactory.unknownType();
        typeFactory0.moreSpecificType(javaType0, collectionType0);
        javaType0.isFinal();
    }

    @Test(timeout = 4000)
    public void test4550() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        Class<MapType> class1 = MapType.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        JavaType javaType0 = TypeFactory.unknownType();
        typeFactory0.moreSpecificType(javaType0, collectionType0);
        javaType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test4651() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.moreSpecificType((JavaType) null, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test4752() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Object> class0 = Object.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        JavaType javaType0 = typeFactory0.moreSpecificType(resolvedRecursiveType0, (JavaType) null);
        javaType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test4853() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = TypeFactory.unknownType();
        Class<ObjectMapper.DefaultTyping> class0 = ObjectMapper.DefaultTyping.class;
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
        ArrayType arrayType0 = ArrayType.construct(javaType0, (TypeBindings) null, (Object) resolvedRecursiveType0, (Object) resolvedRecursiveType0);
        typeFactory0.moreSpecificType(arrayType0, javaType0);
        javaType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test4954() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        typeFactory0.constructType((Type) null, (Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test5055() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Double> class0 = Double.TYPE;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (JavaType) null);
        javaType0.isAbstract();
    }

    @Test(timeout = 4000)
    public void test5156() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashSet> class0 = HashSet.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class0);
        Class<CollectionLikeType> class1 = CollectionLikeType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        javaTypeArray0[0] = (JavaType) collectionLikeType0;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, javaTypeArray0);
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaTypeArray0[0], javaTypeArray0[0]);
        JavaType javaType0 = typeFactory0._constructSimple(class1, typeBindings0, referenceType0, javaTypeArray0);
        referenceType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test5157() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashSet> class0 = HashSet.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class0);
        Class<CollectionLikeType> class1 = CollectionLikeType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        javaTypeArray0[0] = (JavaType) collectionLikeType0;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, javaTypeArray0);
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaTypeArray0[0], javaTypeArray0[0]);
        JavaType javaType0 = typeFactory0._constructSimple(class1, typeBindings0, referenceType0, javaTypeArray0);
        javaType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test5258() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        typeFactory0.constructMapType((Class<? extends Map>) null, class0, class0);
    }

    @Test(timeout = 4000)
    public void test5359() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Properties> class0 = Properties.class;
        typeFactory0.constructMapType(class0, class0, class0);
    }

    @Test(timeout = 4000)
    public void test5460() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectIdResolver> class0 = ObjectIdResolver.class;
        Class<JsonSerializer<SimpleType>>[] classArray0 = (Class<JsonSerializer<SimpleType>>[]) Array.newInstance(Class.class, 1);
        typeFactory0.constructParametricType(class0, classArray0);
    }

    @Test(timeout = 4000)
    public void test5561() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        javaType0.isAbstract();
    }

    @Test(timeout = 4000)
    public void test5562() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        javaType0.isJavaLangObject();
    }

    @Test(timeout = 4000)
    public void test5563() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
    }

    @Test(timeout = 4000)
    public void test5664() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Long> class0 = Long.TYPE;
        Class<SimpleType> class1 = SimpleType.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class1);
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test5765() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeModifier[] typeModifierArray0 = new TypeModifier[0];
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        TypeFactory typeFactory1 = new TypeFactory((LRUMap<Object, JavaType>) null, typeParser0, typeModifierArray0, classLoader0);
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory1.constructCollectionType(class0, class0);
        collectionType0.containedTypeCount();
    }

    @Test(timeout = 4000)
    public void test5866() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn(simpleType0).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory1.constructType((Type) class0, (JavaType) simpleType0);
        javaType0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test5967() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn((JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        doReturn((String) null).when(typeModifier0).toString();
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        typeFactory1.constructCollectionLikeType(class0, class0);
    }

    @Test(timeout = 4000)
    public void test6068() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(typeBindings0);
    }

    @Test(timeout = 4000)
    public void test6169() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        Class<ArrayType> class1 = ArrayType.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        Class<Object> class2 = Object.class;
        JavaType javaType0 = typeFactory0.constructGeneralizedType(collectionType0, class2);
        JavaType javaType1 = TypeFactory.unknownType();
        Class<Integer> class3 = Integer.class;
        typeFactory0.constructSpecializedType(javaType0, class3);
    }

    @Test(timeout = 4000)
    public void test6270() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
        doReturn((Type[]) null).when(parameterizedType0).getActualTypeArguments();
        doReturn((Type) null).when(parameterizedType0).getRawType();
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        typeFactory0._fromParamType((ClassStack) null, parameterizedType0, typeBindings0);
    }
}
