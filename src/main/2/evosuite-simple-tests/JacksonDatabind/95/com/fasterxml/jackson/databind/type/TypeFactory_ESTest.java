/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:55:09 GMT 2024
 */
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassStack;
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
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeFactory_ESTest extends TypeFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<CollectionType> class0 = CollectionType.class;
        JavaType javaType0 = typeFactory0.constructSimpleType(class0, class0, (JavaType[]) null);
        assertNotNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<CollectionType> class0 = CollectionType.class;
        JavaType javaType0 = typeFactory0.constructSimpleType(class0, class0, (JavaType[]) null);
        assertTrue(javaType0.isFinal());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ArrayList> class0 = ArrayList.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        assertFalse(collectionType0.isAbstract());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, (JavaType[]) null);
        assertFalse(javaType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        assertNotNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        Class<AnnotationIntrospector.ReferenceProperty.Type> class1 = AnnotationIntrospector.ReferenceProperty.Type.class;
        TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, javaType0);
        JavaType[] javaTypeArray0 = new JavaType[23];
        JavaType javaType1 = typeFactory0._constructSimple(class1, typeBindings0, javaType0, javaTypeArray0);
        assertEquals(1, javaType1.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectMapper.DefaultTyping> class0 = ObjectMapper.DefaultTyping.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class0);
        assertEquals(0, mapLikeType0.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        typeFactory0.clearCache();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<TreeSet> class0 = TreeSet.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        JavaType javaType0 = typeFactory0.constructSpecializedType(collectionType0, class0);
        assertEquals(1, javaType0.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class0);
        assertFalse(collectionLikeType0.isAbstract());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectMapper.DefaultTyping> class0 = ObjectMapper.DefaultTyping.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        Class<Object> class1 = Object.class;
        // Undeclared exception!
        try {
            typeFactory0.constructGeneralizedType(arrayType0, class1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Internal error: class java.lang.Object not included as super-type for [array type, component type: [simple type, class com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping]]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        // Undeclared exception!
        try {
            typeFactory0.constructType((TypeReference<?>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Properties> class0 = Properties.class;
        // Undeclared exception!
        try {
            typeFactory0.constructRawMapType(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not create TypeBindings for class java.util.Properties with 2 type parameters: class expects 0
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
        }
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        assertFalse(mapLikeType0.hasHandlers());
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructFromCanonical("long");
        assertTrue(javaType0.isPrimitive());
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        TypeFactory typeFactory1 = typeFactory0.withClassLoader(classLoader0);
        try {
            typeFactory1.findClass("{TC6+sA\"[Q?");
            fail("Expecting exception: ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            //
            // {TC6+sA\"[Q?
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapperFeature> class0 = MapperFeature.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        JavaType[] javaTypeArray0 = typeFactory0.findTypeParameters(class0, class0, typeBindings0);
        assertEquals(0, javaTypeArray0.length);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        Class<AnnotationIntrospector.ReferenceProperty.Type> class0 = AnnotationIntrospector.ReferenceProperty.Type.class;
        JavaType javaType0 = typeFactory0.constructReferenceType(class0, simpleType0);
        JavaType javaType1 = typeFactory0.moreSpecificType(simpleType0, javaType0);
        assertFalse(javaType1.isAbstract());
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeFactory typeFactory1 = typeFactory0.withCache((LRUMap<Object, JavaType>) null);
        assertFalse(typeFactory1.equals((Object) typeFactory0));
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        // Undeclared exception!
        try {
            typeFactory0.constructArrayType((JavaType) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.ArrayType", e);
        }
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        LRUMap<Object, JavaType> lRUMap0 = new LRUMap<Object, JavaType>(13, 13);
        TypeFactory typeFactory0 = new TypeFactory(lRUMap0);
        JavaType javaType0 = typeFactory0._unknownType();
        JavaType javaType1 = typeFactory0.constructType((Type) javaType0, (Class<?>) null);
        assertTrue(javaType1.isJavaLangObject());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        TypeFactory typeFactory0 = new TypeFactory((LRUMap<Object, JavaType>) null);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeFactory typeFactory1 = typeFactory0.withModifier((TypeModifier) null);
        assertFalse(typeFactory1.equals((Object) typeFactory0));
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        TypeModifier typeModifier1 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        TypeFactory typeFactory2 = typeFactory1.withModifier(typeModifier1);
        assertFalse(typeFactory2.equals((Object) typeFactory0));
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Module> class0 = Module.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        Class<?> class1 = TypeFactory.rawClass(collectionLikeType0);
        assertEquals(1025, class1.getModifiers());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        Class<Properties> class0 = Properties.class;
        Class<?> class1 = TypeFactory.rawClass(class0);
        assertFalse(class1.isInterface());
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("com.fasterxml.jackson.databind.cfg.ContextAttributes");
        assertFalse(class0.isEnum());
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("int");
        assertEquals("int", class0.toString());
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0.constructFromCanonical("float");
        assertFalse(javaType0.isJavaLangObject());
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("double");
        assertEquals("double", class0.toString());
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("boolean");
        assertEquals("boolean", class0.toString());
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0.findClass("byte");
        assertEquals("byte", class0.toString());
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("char");
        assertEquals("char", class0.toString());
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<?> class0 = typeFactory0.findClass("short");
        assertEquals("short", class0.toString());
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0._findPrimitive("void");
        assertEquals("void", class0.toString());
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<?> class0 = typeFactory0._findPrimitive("void");
        assertNotNull(class0);
    }

    @Test(timeout = 4000)
    public void test3336() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
        Class<AnnotationIntrospector.ReferenceProperty.Type> class0 = AnnotationIntrospector.ReferenceProperty.Type.class;
        JavaType javaType0 = typeFactory0.constructSpecializedType(simpleType0, class0);
        assertFalse(javaType0.isJavaLangObject());
    }

    @Test(timeout = 4000)
    public void test3437() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class0 = ReferenceType.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        // Undeclared exception!
        try {
            typeFactory0.constructSpecializedType(simpleType0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Class com.fasterxml.jackson.databind.type.ReferenceType not subtype of [simple type, class java.lang.Enum]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test3538() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
        Class<AnnotationIntrospector.ReferenceProperty.Type> class0 = AnnotationIntrospector.ReferenceProperty.Type.class;
        JavaType javaType0 = typeFactory0.constructSpecializedType(simpleType0, class0);
        assertTrue(javaType0.isEnumType());
    }

    @Test(timeout = 4000)
    public void test3639() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        Class<Object> class1 = Object.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        JavaType javaType0 = typeFactory0.constructGeneralizedType(collectionType0, class1);
        assertFalse(javaType0.isInterface());
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        JavaType javaType0 = typeFactory0.constructGeneralizedType(mapLikeType0, class0);
        assertTrue(javaType0.hasContentType());
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectMapper.DefaultTyping> class0 = ObjectMapper.DefaultTyping.class;
        JavaType javaType0 = TypeBase._bogusSuperClass(class0);
        // Undeclared exception!
        try {
            typeFactory0.constructGeneralizedType(javaType0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Class com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping not a super-type of [simple type, class java.lang.Object]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        Class<ReferenceType> class1 = ReferenceType.class;
        JavaType[] javaTypeArray0 = typeFactory0.findTypeParameters(class0, class1);
        assertEquals(0, javaTypeArray0.length);
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        JavaType javaType0 = typeFactory0.moreSpecificType(collectionType0, collectionType0);
        assertTrue(javaType0.isConcrete());
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.moreSpecificType((JavaType) null, (JavaType) null);
        assertNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = TypeFactory.unknownType();
        JavaType javaType1 = typeFactory0.moreSpecificType(javaType0, (JavaType) null);
        assertTrue(javaType1.isJavaLangObject());
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = TypeFactory.unknownType();
        JavaType javaType1 = typeFactory0.moreSpecificType(javaType0, (JavaType) null);
        assertNotNull(javaType1);
    }

    @Test(timeout = 4000)
    public void test4347() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Properties> class0 = Properties.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        JavaType javaType0 = typeFactory0.constructReferenceType(class0, simpleType0);
        JavaType javaType1 = typeFactory0.moreSpecificType(javaType0, simpleType0);
        assertTrue(javaType1.hasContentType());
    }

    @Test(timeout = 4000)
    public void test4448() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        Class<ReferenceType> class1 = ReferenceType.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class1);
        JavaType javaType1 = typeFactory0.constructType((Type) javaType0, (Class<?>) class0);
        assertFalse(javaType1.isArrayType());
    }

    @Test(timeout = 4000)
    public void test4549() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Module> class0 = Module.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        assertFalse(javaType0.isEnumType());
    }

    @Test(timeout = 4000)
    public void test4650() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MapperFeature> class0 = MapperFeature.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        JavaType javaType0 = typeFactory0.constructType((Type) collectionLikeType0, (Class<?>) class0);
        assertTrue(javaType0.isFinal());
    }

    @Test(timeout = 4000)
    public void test4751() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Properties> class0 = Properties.class;
        // Undeclared exception!
        try {
            typeFactory0.constructMapType((Class<? extends Map>) null, class0, class0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash", e);
        }
    }

    @Test(timeout = 4000)
    public void test4852() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ReferenceType> class0 = ReferenceType.class;
        Class<ClientInfoStatus>[] classArray0 = (Class<ClientInfoStatus>[]) Array.newInstance(Class.class, 0);
        JavaType javaType0 = typeFactory0.constructParametricType(class0, classArray0);
        assertFalse(javaType0.isJavaLangObject());
    }

    @Test(timeout = 4000)
    public void test4953() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Properties> class0 = Properties.class;
        Class<CollectionLikeType>[] classArray0 = (Class<CollectionLikeType>[]) Array.newInstance(Class.class, 1);
        // Undeclared exception!
        try {
            typeFactory0.constructParametrizedType(class0, class0, classArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test5054() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        AtomicReference<Object> atomicReference0 = new AtomicReference<Object>();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(atomicReference0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test5155() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Integer> class0 = Integer.TYPE;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        assertTrue(javaType0.isPrimitive());
    }

    @Test(timeout = 4000)
    public void test5156() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Integer> class0 = Integer.TYPE;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        assertNotNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test5257() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        // Undeclared exception!
        try {
            typeFactory0.constructType((Type) null, (JavaType) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unrecognized Type: [null]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test5358() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<LinkedList> class0 = LinkedList.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn(collectionType0, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        doReturn((String) null).when(typeModifier0).toString();
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        // Undeclared exception!
        try {
            typeFactory1.constructRawCollectionLikeType(class0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // TypeModifier null (of type com.fasterxml.jackson.databind.type.TypeModifier$MockitoMock$332916971) return null for type [collection type; class java.util.LinkedList, contains [collection type; class java.util.LinkedList, contains [simple type, class java.lang.Object]]]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test5459() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn((JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        doReturn((String) null).when(typeModifier0).toString();
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        Class<HashSet> class0 = HashSet.class;
        // Undeclared exception!
        try {
            typeFactory1.constructCollectionType(class0, class0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // TypeModifier Mock for TypeModifier, hashCode: 1936027418 (of type com.fasterxml.jackson.databind.type.TypeModifier$MockitoMock$332916971) return null for type [simple type, class java.lang.Object]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test5560() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<NullNode> class0 = NullNode.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        assertTrue(collectionLikeType0.isFinal());
    }

    @Test(timeout = 4000)
    public void test5661() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        objectMapper0.writerFor(class0);
        AtomicReference<Object> atomicReference0 = new AtomicReference<Object>();
        assertEquals("null", atomicReference0.toString());
    }

    @Test(timeout = 4000)
    public void test5762() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ArrayList> class0 = ArrayList.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
        MapLikeType mapLikeType0 = mapType0.withContentTypeHandler(mapType0);
        CollectionLikeType collectionLikeType0 = new CollectionLikeType(mapLikeType0, mapLikeType0);
        CollectionType collectionType0 = typeFactory0.constructCollectionType((Class<? extends Collection>) class0, (JavaType) collectionLikeType0);
        assertTrue(collectionType0.hasHandlers());
    }

    @Test(timeout = 4000)
    public void test5863() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(typeFactory0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test5964() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
        doReturn((Type[]) null).when(parameterizedType0).getActualTypeArguments();
        doReturn((Type) null).when(parameterizedType0).getRawType();
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        // Undeclared exception!
        try {
            typeFactory0._fromParamType((ClassStack) null, parameterizedType0, typeBindings0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }
}
