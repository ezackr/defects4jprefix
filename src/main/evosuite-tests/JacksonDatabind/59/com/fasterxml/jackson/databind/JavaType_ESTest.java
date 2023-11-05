/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 20:41:59 GMT 2023
 */

package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaType_ESTest extends JavaType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      assertFalse(javaType0.isMapLikeType());
      assertFalse(javaType0.isArrayType());
      
      ObjectMapper objectMapper0 = new ObjectMapper();
      objectMapper0.readerForUpdating(javaType0);
      assertFalse(javaType0.isCollectionLikeType());
      assertTrue(javaType0.isConcrete());
      assertFalse(javaType0.hasHandlers());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      simpleType0.getKeyType();
      assertFalse(simpleType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      boolean boolean0 = resolvedRecursiveType0.useStaticType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      simpleType0.isFinal();
      assertFalse(simpleType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      Object object0 = javaType0.getContentTypeHandler();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      Object object0 = javaType0.getContentValueHandler();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      String string0 = javaType0.getGenericSignature();
      assertEquals("Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      String string0 = javaType0.getErasedSignature();
      assertEquals("Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashMap> class0 = HashMap.class;
      MapType mapType0 = typeFactory0.constructRawMapType(class0);
      mapType0.getParameterSource();
      assertFalse(mapType0.hasHandlers());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      Class<Object> class0 = Object.class;
      JavaType javaType1 = javaType0.forcedNarrowBy(class0);
      assertSame(javaType1, javaType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<Integer> class0 = Integer.TYPE;
      Class<HashSet> class1 = HashSet.class;
      CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class1);
      CollectionType collectionType1 = collectionType0.withValueHandler(typeFactory0);
      JavaType javaType0 = collectionType1.forcedNarrowBy(class0);
      assertFalse(javaType0.useStaticType());
      assertTrue(javaType0.hasHandlers());
      assertFalse(collectionType0.hasHandlers());
      assertTrue(javaType0.isFinal());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashSet> class0 = HashSet.class;
      Class<JsonInclude.Include> class1 = JsonInclude.Include.class;
      CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
      CollectionType collectionType1 = collectionType0.withTypeHandler(class1);
      JavaType javaType0 = collectionType1.forcedNarrowBy(class1);
      assertFalse(javaType0.useStaticType());
      assertTrue(javaType0.isEnumType());
      assertTrue(javaType0.hasHandlers());
      assertFalse(collectionType0.hasHandlers());
      assertFalse(javaType0.hasValueHandler());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<JsonDeserializer> class0 = JsonDeserializer.class;
      ObjectReader objectReader0 = objectMapper0.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      Class<Object> class0 = Object.class;
      boolean boolean0 = javaType0.isTypeOrSubTypeOf(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashSet> class0 = HashSet.class;
      Class<JsonInclude.Include> class1 = JsonInclude.Include.class;
      CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
      Class<JavaType> class2 = JavaType.class;
      boolean boolean0 = collectionType0.isTypeOrSubTypeOf(class2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashMap> class0 = HashMap.class;
      Class<Object> class1 = Object.class;
      Class<Integer> class2 = Integer.class;
      MapType mapType0 = typeFactory0.constructMapType(class0, class1, class2);
      boolean boolean0 = mapType0.isTypeOrSubTypeOf(class1);
      assertFalse(mapType0.hasHandlers());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<MapLikeType> class0 = MapLikeType.class;
      ObjectWriter objectWriter0 = objectMapper0.writerFor(class0);
      assertTrue(objectWriter0.hasPrefetchedSerializer());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<Object> class0 = Object.class;
      MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
      boolean boolean0 = mapLikeType0.isJavaLangObject();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      boolean boolean0 = javaType0.hasGenericTypes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashSet> class0 = HashSet.class;
      CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
      boolean boolean0 = collectionType0.hasGenericTypes();
      assertFalse(collectionType0.hasHandlers());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<MapLikeType> class0 = MapLikeType.class;
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashMap> class1 = HashMap.class;
      Class<Object> class2 = Object.class;
      MapType mapType0 = typeFactory0.constructMapType(class1, class2, class0);
      JavaType javaType0 = mapType0.containedTypeOrUnknown(0);
      assertFalse(javaType0.hasHandlers());
      assertTrue(javaType0.isJavaLangObject());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      JavaType javaType1 = javaType0.containedTypeOrUnknown(1);
      assertFalse(javaType1.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      boolean boolean0 = javaType0.hasValueHandler();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleType simpleType0 = (SimpleType)TypeFactory.unknownType();
      Integer integer0 = new Integer(0);
      SimpleType simpleType1 = simpleType0.withValueHandler(integer0);
      boolean boolean0 = simpleType1.hasValueHandler();
      assertTrue(boolean0);
      assertFalse(simpleType1.useStaticType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      ArrayList<JavaType> arrayList0 = new ArrayList<JavaType>();
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ArrayType arrayType0 = ArrayType.construct(javaType0, typeBindings0, (Object) arrayList0, (Object) arrayList0);
      boolean boolean0 = arrayType0.hasHandlers();
      assertFalse(javaType0.hasHandlers());
      assertFalse(arrayType0.useStaticType());
      assertTrue(arrayType0.hasValueHandler());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      LRUMap<Object, JavaType> lRUMap0 = new LRUMap<Object, JavaType>(40, 40);
      TypeFactory typeFactory1 = typeFactory0.withCache(lRUMap0);
      Class<HashSet> class0 = HashSet.class;
      Class<JsonInclude.Include> class1 = JsonInclude.Include.class;
      CollectionType collectionType0 = typeFactory1.constructCollectionType(class0, class1);
      assertFalse(collectionType0.hasHandlers());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      Class<Integer> class0 = Integer.class;
      TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, javaType0);
      ArrayType arrayType0 = ArrayType.construct(javaType0, typeBindings0);
      ArrayType arrayType1 = arrayType0.withValueHandler(javaType0);
      boolean boolean0 = arrayType1.hasHandlers();
      assertFalse(arrayType0.hasHandlers());
      assertFalse(arrayType0.useStaticType());
      assertTrue(boolean0);
  }
}
