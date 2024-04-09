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
        assertFalse(collectionType0.isInterface());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeModifier[] typeModifierArray0 = new TypeModifier[0];
        TypeFactory typeFactory1 = new TypeFactory(typeParser0, typeModifierArray0);
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        TypeFactory typeFactory2 = typeFactory1.withModifier(typeModifier0);
        assertFalse(typeFactory2.equals((Object) typeFactory0));
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
        try {
            objectMapper0.writeValueAsString(jsonFactory0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // No serializer found for class org.evosuite.shaded.org.mockito.internal.matchers.Equals and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) ) (through reference chain: com.fasterxml.jackson.core.JsonFactory[\"inputDecorator\"]->com.fasterxml.jackson.core.io.InputDecorator$MockitoMock$769178168[\"mockitoInterceptor\"]->org.evosuite.shaded.org.mockito.internal.creation.bytebuddy.MockMethodInterceptor[\"mockHandler\"]->org.evosuite.shaded.org.mockito.internal.handler.InvocationNotifierHandler[\"invocationContainer\"]->org.evosuite.shaded.org.mockito.internal.stubbing.InvocationContainerImpl[\"invocationForStubbing\"]->org.evosuite.shaded.org.mockito.internal.invocation.InvocationMatcher[\"matchers\"]->java.util.ArrayList[0])
            //
            verifyException("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<CollectionType> class0 = CollectionType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        // Undeclared exception!
        try {
            typeFactory0.constructParametricType(class0, javaTypeArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Parameter type mismatch for com.fasterxml.jackson.databind.type.CollectionType (and target com.fasterxml.jackson.databind.type.CollectionType): expected 0 parameters, was given 1
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class0);
        assertTrue(mapType0.hasGenericTypes());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectReader> class0 = ObjectReader.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class0);
        assertFalse(mapLikeType0.isAbstract());
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
        assertTrue(collectionLikeType0.hasGenericTypes());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapType> class0 = MapType.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, class0);
        JavaType javaType0 = typeFactory0.constructSpecializedType(collectionLikeType0, class0);
        assertTrue(javaType0.isConcrete());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MapType> class1 = MapType.class;
        JavaType[] javaTypeArray0 = new JavaType[1];
        // Undeclared exception!
        try {
            typeFactory0.constructParametrizedType(class0, class1, javaTypeArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.CollectionLikeType", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Object> class0 = Object.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        assertEquals(1, arrayType0.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
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
    public void test1212() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        assertFalse(mapType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType(class0, javaType0);
        assertTrue(collectionLikeType0.isConcrete());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        assertFalse(mapLikeType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        try {
            typeFactory0.constructFromCanonical(" (and target ");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Failed to parse type '(and target' (remaining: ''): Can not locate class '(and target', problem: Class '(and target.class' should be in target project, but could not be found!
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<MapLikeType> class0 = MapLikeType.class;
        Class<ObjectReader>[] classArray0 = (Class<ObjectReader>[]) Array.newInstance(Class.class, 0);
        JavaType javaType0 = typeFactory0.constructParametricType(class0, classArray0);
        assertFalse(javaType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType((Class<?>) class0, (JavaType) simpleType0, (JavaType) simpleType0);
        assertFalse(mapLikeType0.isPrimitive());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
        ArrayType arrayType0 = typeFactory0.constructArrayType((JavaType) simpleType0);
        assertTrue(arrayType0.isFinal());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeFactory typeFactory1 = typeFactory0.withModifier((TypeModifier) null);
        assertFalse(typeFactory1.equals((Object) typeFactory0));
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Class<String> class0 = String.class;
        Class<?> class1 = TypeFactory.rawClass(class0);
        assertFalse(class1.isInterface());
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        InputDecorator inputDecorator0 = mock(InputDecorator.class, new ViolatedAssumptionAnswer());
        jsonFactory0.setInputDecorator(inputDecorator0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        String string0 = objectMapper0.writeValueAsString(jsonFactory0);
        assertEquals("{\"characterEscapes\":null,\"codec\":null,\"inputDecorator\":{\"mockitoInterceptor\":{\"serializationSupport\":{},\"mockHandler\":{\"invocationContainer\":{\"invocationForStubbing\":null,\"stubbingsAscending\":[],\"invocations\":[],\"stubbingsDescending\":[]},\"mockSettings\":{\"outerClassInstance\":null,\"constructorArgs\":null,\"lenient\":false,\"stripAnnotations\":false,\"stubOnly\":false,\"typeToMock\":\"com.fasterxml.jackson.core.io.InputDecorator\",\"spiedInstance\":null,\"name\":null,\"invocationListeners\":[{\"copyOfMethodDescriptors\":[]}],\"stubbingLookupListeners\":[],\"verificationStartedListeners\":[],\"extraInterfaces\":[],\"mockName\":{\"default\":true},\"serializableMode\":\"NONE\",\"defaultAnswer\":\"RETURNS_DEFAULTS\",\"serializable\":false,\"usingConstructor\":false}}}},\"outputDecorator\":null,\"rootValueSeparator\":\" \",\"formatName\":\"JSON\"}", string0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0._unknownType();
        JavaType javaType1 = typeFactory0.constructSpecializedType(javaType0, class0);
        assertEquals(1, javaType1.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
        // Undeclared exception!
        try {
            typeFactory0.constructSpecializedType(simpleType0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Class java.lang.Class not subtype of [simple type, class boolean]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
        JavaType[] javaTypeArray1 = typeFactory0.findTypeParameters(javaType0, class0);
        assertNull(javaTypeArray1);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        JavaType javaType0 = typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
        JavaType[] javaTypeArray1 = typeFactory0.findTypeParameters(javaType0, class0);
        assertFalse(javaType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        Class<SimpleType> class1 = SimpleType.class;
        // Undeclared exception!
        try {
            typeFactory0.findTypeParameters(javaType0, class1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Class java.util.HashMap is not a subtype of com.fasterxml.jackson.databind.type.SimpleType
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        Class<PushbackInputStream> class1 = PushbackInputStream.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class1);
        assertFalse(javaType0.isAbstract());
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        Class<CollectionType> class1 = CollectionType.class;
        TypeBindings typeBindings0 = new TypeBindings(typeFactory0, class1);
        JavaType javaType0 = typeFactory0._fromClass(class0, typeBindings0);
        JavaType javaType1 = typeFactory0.moreSpecificType(typeBindings0.UNBOUND, javaType0);
        assertSame(javaType1, javaType0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0.moreSpecificType((JavaType) null, (JavaType) null);
        assertNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        JavaType javaType0 = typeFactory0.moreSpecificType(simpleType0, (JavaType) null);
        assertFalse(javaType0.isInterface());
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0._unknownType();
        JavaType javaType1 = typeFactory0.moreSpecificType(javaType0, javaType0);
        assertFalse(javaType1.isMapLikeType());
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<SimpleType> class0 = SimpleType.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (JavaType) simpleType0);
        JavaType javaType1 = typeFactory0.moreSpecificType(simpleType0, javaType0);
        assertNotSame(javaType1, javaType0);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
        Class<SimpleType> class0 = SimpleType.class;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (JavaType) simpleType0);
        JavaType javaType1 = typeFactory0.moreSpecificType(simpleType0, javaType0);
        assertFalse(javaType0.isAbstract());
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        // Undeclared exception!
        try {
            typeFactory0.constructType((Type) null, (Class<?>) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unrecognized Type: [null]
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        SimpleType simpleType0 = new SimpleType(class0);
        JavaType javaType0 = typeFactory0.constructType((Type) simpleType0, (JavaType) null);
        assertFalse(javaType0.isMapLikeType());
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeParser typeParser0 = new TypeParser(typeFactory0);
        TypeModifier[] typeModifierArray0 = new TypeModifier[0];
        TypeFactory typeFactory1 = new TypeFactory(typeParser0, typeModifierArray0);
        JavaType javaType0 = typeFactory1.constructType((Type) class0);
        assertFalse(javaType0.isPrimitive());
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        Class<HashMap> class0 = HashMap.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
        doReturn((JavaType) null, (JavaType) null, (JavaType) null, (JavaType) null).when(typeModifier0).modifyType(any(com.fasterxml.jackson.databind.JavaType.class), any(java.lang.reflect.Type.class), any(com.fasterxml.jackson.databind.type.TypeBindings.class), any(com.fasterxml.jackson.databind.type.TypeFactory.class));
        TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
        // Undeclared exception!
        try {
            typeFactory1.constructType((Type) class0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.MapLikeType", e);
        }
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectReader> class0 = ObjectReader.class;
        Class<SimpleType>[] classArray0 = (Class<SimpleType>[]) Array.newInstance(Class.class, 1);
        // Undeclared exception!
        try {
            typeFactory0.constructParametricType(class0, classArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Integer> class1 = Integer.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        // Undeclared exception!
        try {
            typeFactory0.constructParametrizedType(class0, class1, javaTypeArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Need exactly 2 parameter types for Map types (java.util.HashMap)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        JavaType[] javaTypeArray0 = new JavaType[2];
        // Undeclared exception!
        try {
            typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.MapLikeType", e);
        }
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<ArrayList> class0 = ArrayList.class;
        JavaType[] javaTypeArray0 = new JavaType[0];
        // Undeclared exception!
        try {
            typeFactory0.constructParametrizedType(class0, class0, javaTypeArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Need exactly 1 parameter type for Collection types (java.util.ArrayList)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
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
        assertEquals("{\"characterEscapes\":null,\"codec\":null,\"inputDecorator\":null,\"outputDecorator\":null,\"rootValueSeparator\":\" \",\"formatName\":\"JSON\"}", string0);
    }

    @Test(timeout = 4000)
    public void test4244() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        assertFalse(javaType0.isMapLikeType());
    }

    @Test(timeout = 4000)
    public void test4345() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Stack<JavaType> stack0 = new Stack<JavaType>();
        Class<IsoEra> class0 = IsoEra.class;
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        assertFalse(javaType0.hasGenericTypes());
    }

    @Test(timeout = 4000)
    public void test4446() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, linkedList0);
        assertFalse(javaType0.isPrimitive());
    }

    @Test(timeout = 4000)
    public void test4547() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<HashMap> class0 = HashMap.class;
        Vector<JavaType> vector0 = new Vector<JavaType>();
        vector0.add((JavaType) null);
        // Undeclared exception!
        try {
            typeFactory0._fromParameterizedClass(class0, vector0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.MapLikeType", e);
        }
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
        assertEquals(2, javaType0.containedTypeCount());
    }

    @Test(timeout = 4000)
    public void test4749() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Stack<JavaType> stack0 = new Stack<JavaType>();
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, stack0);
        assertFalse(javaType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test4850() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        linkedList0.add((JavaType) collectionType0);
        JavaType javaType0 = typeFactory0._fromParameterizedClass(class0, linkedList0);
        assertTrue(javaType0.isCollectionLikeType());
    }

    @Test(timeout = 4000)
    public void test4951() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Stack<JavaType> stack0 = new Stack<JavaType>();
        stack0.add((JavaType) null);
        Class<CollectionLikeType> class0 = CollectionLikeType.class;
        // Undeclared exception!
        try {
            typeFactory0._fromParameterizedClass(class0, stack0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Parameter type mismatch for com.fasterxml.jackson.databind.type.CollectionLikeType (and target com.fasterxml.jackson.databind.type.CollectionLikeType): expected 0 parameters, was given 1
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test5052() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        JavaType javaType0 = typeFactory0._resolveVariableViaSubTypes((HierarchicType) null, "[", (TypeBindings) null);
        assertFalse(javaType0.isPrimitive());
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
        assertFalse(javaType0.useStaticType());
    }

    @Test(timeout = 4000)
    public void test5254() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<MissingNode> class0 = MissingNode.class;
        Class<Object> class1 = Object.class;
        JavaType[] javaTypeArray0 = typeFactory0.findTypeParameters(class0, class1);
        assertNull(javaTypeArray0);
    }

    @Test(timeout = 4000)
    public void test5355() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Integer> class1 = Integer.class;
        HierarchicType hierarchicType0 = typeFactory0._findSuperInterfaceChain(class0, class1);
        assertNull(hierarchicType0);
    }

    @Test(timeout = 4000)
    public void test5456() throws Throwable {
        Class<ArrayList> class0 = ArrayList.class;
        TypeFactory typeFactory0 = TypeFactory.instance;
        Class<Object> class1 = Object.class;
        HierarchicType hierarchicType0 = typeFactory0._findSuperInterfaceChain(class0, class1);
        assertFalse(hierarchicType0.isGeneric());
    }

    @Test(timeout = 4000)
    public void test5557() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.instance;
        // Undeclared exception!
        try {
            typeFactory0._arrayListSuperInterfaceChain((HierarchicType) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.type.TypeFactory", e);
        }
    }
}
