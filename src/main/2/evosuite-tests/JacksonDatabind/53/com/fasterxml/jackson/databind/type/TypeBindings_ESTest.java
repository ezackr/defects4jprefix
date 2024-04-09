/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:41:07 GMT 2024
 */

package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeBindings_ESTest extends TypeBindings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypeBindings.TypeParamStash typeBindings_TypeParamStash0 = new TypeBindings.TypeParamStash();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      JavaType[] javaTypeArray0 = typeBindings0.typeParameterArray();
      assertEquals(0, javaTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      typeBindings0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.instance;
      Class<Map> class0 = Map.class;
      MapType mapType0 = typeFactory0.constructRawMapType(class0);
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) mapType0, (JavaType) mapType0);
      String string0 = typeBindings0.toString();
      assertEquals("<Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;,Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;>", string0);
      assertFalse(typeBindings0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
      TypeBindings typeBindings1 = (TypeBindings)typeBindings0.readResolve();
      assertFalse(typeBindings1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      TypeBindings typeBindings1 = (TypeBindings)typeBindings0.readResolve();
      assertTrue(typeBindings1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<CollectionLikeType> class0 = CollectionLikeType.class;
      TypeBindings typeBindings0 = TypeBindings.create(class0, (List<JavaType>) null);
      assertEquals(0, typeBindings0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<JavaType> vector0 = new Vector<JavaType>();
      Class<MapType> class0 = MapType.class;
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (List<JavaType>) vector0);
      assertEquals(0, typeBindings0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<JavaType> vector0 = new Vector<JavaType>();
      vector0.setSize(1127);
      Class<MapType> class0 = MapType.class;
      // Undeclared exception!
      try { 
        TypeBindings.create((Class<?>) class0, (List<JavaType>) vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class com.fasterxml.jackson.databind.type.MapType with 1127 type parameters: class expects 0
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      // Undeclared exception!
      try { 
        TypeBindings.create(class0, (JavaType[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class java.util.Vector with 0 type parameters: class expects 1
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      CollectionLikeType collectionLikeType0 = typeFactory0.constructCollectionLikeType((Class<?>) class0, (JavaType) resolvedRecursiveType0);
      resolvedRecursiveType0.setReference(collectionLikeType0);
      CollectionType collectionType0 = typeFactory0.constructCollectionType((Class<? extends Collection>) class0, (JavaType) resolvedRecursiveType0);
      assertTrue(typeBindings0.isEmpty());
      assertFalse(collectionType0.equals((Object)collectionLikeType0));
      assertNotSame(collectionType0, collectionLikeType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<MapLikeType> class0 = MapLikeType.class;
      JavaType[] javaTypeArray0 = new JavaType[1];
      // Undeclared exception!
      try { 
        TypeBindings.create(class0, javaTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class com.fasterxml.jackson.databind.type.MapLikeType with 1 type parameter: class expects 0
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JavaType[] javaTypeArray0 = new JavaType[2];
      // Undeclared exception!
      try { 
        TypeBindings.create(class0, javaTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class java.lang.Object with 2 type parameters: class expects 0
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, (JavaType) null);
      assertTrue(typeBindings0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Map> class0 = Map.class;
      // Undeclared exception!
      try { 
        TypeBindings.createIfNeeded(class0, (JavaType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class java.util.Map with 1 type parameter: class expects 2
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      JavaType[] javaTypeArray0 = new JavaType[1];
      // Undeclared exception!
      try { 
        TypeBindings.createIfNeeded(class0, javaTypeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, (JavaType[]) null);
      assertTrue(typeBindings0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      // Undeclared exception!
      try { 
        TypeBindings.createIfNeeded(class0, (JavaType[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class java.util.Vector with 0 type parameters: class expects 1
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      JavaType[] javaTypeArray0 = new JavaType[1];
      // Undeclared exception!
      try { 
        TypeBindings.createIfNeeded(class0, javaTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not create TypeBindings for class java.util.Map with 1 type parameter: class expects 2
         //
         verifyException("com.fasterxml.jackson.databind.type.TypeBindings", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      TypeBindings typeBindings1 = typeBindings0.withUnboundVariable("F");
      TypeBindings typeBindings2 = typeBindings1.withUnboundVariable("F");
      assertNotSame(typeBindings0, typeBindings2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      String string0 = typeBindings0.getBoundName((-537));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_CLASS;
      TypeBindings typeBindings0 = TypeBindings.createIfNeeded((Class<?>) class0, (JavaType) simpleType0);
      String string0 = typeBindings0.getBoundName(0);
      assertNotNull(string0);
      assertFalse(typeBindings0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      String string0 = typeBindings0.getBoundName(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      JavaType javaType0 = typeBindings0.getBoundType((-8));
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      JavaType javaType0 = TypeFactory.unknownType();
      TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, javaType0);
      JavaType javaType1 = typeBindings0.getBoundType(0);
      assertNotNull(javaType1);
      assertEquals(1, typeBindings0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      JavaType javaType0 = typeBindings0.getBoundType(0);
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      List<JavaType> list0 = typeBindings0.getTypeParameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      TypeFactory typeFactory0 = TypeFactory.instance;
      CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
      assertEquals(1, collectionType0.containedTypeCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      TypeBindings typeBindings1 = typeBindings0.withUnboundVariable("@x^b}ljj>&2");
      boolean boolean0 = typeBindings1.hasUnbound("@x^b}ljj>&2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      TypeBindings typeBindings1 = typeBindings0.withUnboundVariable("%");
      boolean boolean0 = typeBindings1.hasUnbound("(5 F\"'Y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      String string0 = typeBindings0.toString();
      assertEquals("<>", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
      TypeBindings typeBindings1 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
      boolean boolean0 = typeBindings0.equals(typeBindings1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      objectMapper0.readerForUpdating(typeBindings0);
      assertTrue(typeBindings0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      boolean boolean0 = typeBindings0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<SimpleType> class0 = SimpleType.class;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      boolean boolean0 = typeBindings0.equals(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
      TypeBindings typeBindings1 = TypeBindings.emptyBindings();
      boolean boolean0 = typeBindings0.equals(typeBindings1);
      assertFalse(boolean0);
      assertFalse(typeBindings1.equals((Object)typeBindings0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Vector> class0 = Vector.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_LONG;
      SimpleType simpleType1 = TypeFactory.CORE_TYPE_BOOL;
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType1);
      TypeBindings typeBindings1 = TypeBindings.create((Class<?>) class0, (JavaType) simpleType0);
      boolean boolean0 = typeBindings1.equals(typeBindings0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      JavaType javaType0 = TypeFactory.unknownType();
      ObjectReader objectReader0 = objectMapper0.readerFor(javaType0);
      assertNotNull(objectReader0);
  }
}
