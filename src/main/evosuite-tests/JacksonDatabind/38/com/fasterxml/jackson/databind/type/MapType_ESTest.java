/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:38:13 GMT 2023
 */

package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MapType_ESTest extends MapType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
      CollectionLikeType collectionLikeType0 = CollectionLikeType.upgradeFrom(simpleType0, simpleType0);
      Class<Object> class0 = Object.class;
      MapType mapType0 = MapType.construct((Class<?>) class0, (JavaType) collectionLikeType0, (JavaType) collectionLikeType0);
      JavaType javaType0 = mapType0.withContentType(collectionLikeType0);
      assertSame(javaType0, mapType0);
      assertFalse(javaType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      MapType mapType1 = mapType0.withContentValueHandler(mapType0);
      assertFalse(mapType1.isCollectionLikeType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
      ArrayType arrayType0 = ArrayType.construct((JavaType) simpleType0, (TypeBindings) null, (Object) class0, (Object) class0);
      JavaType[] javaTypeArray0 = new JavaType[4];
      MapType mapType0 = MapType.construct((Class<?>) class0, (TypeBindings) null, (JavaType) arrayType0, javaTypeArray0, (JavaType) arrayType0, (JavaType) simpleType0);
      Class<Object> class1 = Object.class;
      JavaType javaType0 = mapType0._narrow(class1);
      assertFalse(javaType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      Class<String> class0 = String.class;
      ObjectReader objectReader0 = objectMapper0.readerWithView(class0);
      TypeFactory typeFactory0 = objectReader0.getTypeFactory();
      Class<Map> class1 = Map.class;
      Class<Object> class2 = Object.class;
      MapType mapType0 = typeFactory0.constructMapType(class1, class0, class2);
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class1, (JavaType) mapType0, (JavaType) mapType0);
      JavaType[] javaTypeArray0 = new JavaType[3];
      JavaType javaType0 = mapType0.refine(class0, typeBindings0, mapType0, javaTypeArray0);
      assertFalse(javaType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
      ArrayType arrayType0 = ArrayType.construct((JavaType) simpleType0, (TypeBindings) null, (Object) class0, (Object) class0);
      JavaType[] javaTypeArray0 = new JavaType[4];
      MapType mapType0 = MapType.construct((Class<?>) class0, (TypeBindings) null, (JavaType) arrayType0, javaTypeArray0, (JavaType) arrayType0, (JavaType) simpleType0);
      MapType mapType1 = mapType0.withTypeHandler(mapType0);
      assertTrue(mapType1.equals((Object)mapType0));
      assertFalse(mapType1.useStaticType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      Object object0 = new Object();
      MapType mapType1 = mapType0.withKeyValueHandler(object0);
      assertTrue(mapType1.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      MapType mapType1 = mapType0.withContentTypeHandler(simpleType0);
      assertTrue(mapType1.equals((Object)mapType0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_CLASS;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      String string0 = mapType0.toString();
      assertEquals("[map type; class java.lang.Class, [simple type, class java.lang.Class] -> [simple type, class java.lang.Class]]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      MapType mapType1 = mapType0.withKeyTypeHandler(class0);
      assertFalse(mapType1.isInterface());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      Integer integer0 = new Integer(3796);
      MapType mapType1 = mapType0.withValueHandler(integer0);
      assertFalse(mapType1.isInterface());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      MapType mapType1 = mapType0.withStaticTyping();
      MapType mapType2 = mapType1.withStaticTyping();
      assertTrue(mapType2.useStaticType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      JavaType javaType0 = mapType0.withContentType(mapType0);
      assertNotSame(javaType0, mapType0);
      assertFalse(javaType0.equals((Object)mapType0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      MapType mapType1 = mapType0.withKeyType(mapType0);
      assertNotSame(mapType1, mapType0);
      assertFalse(mapType1.equals((Object)mapType0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_CLASS;
      MapType mapType0 = new MapType(simpleType0, simpleType0, simpleType0);
      MapType mapType1 = mapType0.withKeyType(simpleType0);
      assertSame(mapType1, mapType0);
  }
}
