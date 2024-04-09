/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:57:11 GMT 2024
 */

package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleType_ESTest extends SimpleType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_STRING;
      // Undeclared exception!
      try { 
        simpleType0.withContentValueHandler(simpleType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Simple types have no content types; can not call withContenValueHandler()
         //
         verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      // Undeclared exception!
      try { 
        simpleType0.withContentTypeHandler(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Simple types have no content types; can not call withContenTypeHandler()
         //
         verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<SimpleType> class0 = SimpleType.class;
      ObjectReader objectReader0 = objectMapper0.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
      // Undeclared exception!
      try { 
        simpleType0.withContentType(simpleType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Simple types have no content types; can not call withContentType()
         //
         verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
      ReferenceType referenceType0 = new ReferenceType(simpleType0, simpleType0);
      SimpleType simpleType1 = referenceType0.withStaticTyping();
      assertFalse(simpleType1.isEnumType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      assertFalse(simpleType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_ENUM;
      String string0 = simpleType0.getErasedSignature();
      assertEquals("Ljava/lang/Enum;", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Module> class0 = Module.class;
      SimpleType simpleType0 = new SimpleType(class0);
      assertFalse(simpleType0.isArrayType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      // Undeclared exception!
      try { 
        SimpleType.construct(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not construct SimpleType for a Map (class: java.util.HashMap)
         //
         verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<LinkedList> class0 = LinkedList.class;
      // Undeclared exception!
      try { 
        SimpleType.construct(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not construct SimpleType for a Collection (class: java.util.LinkedList)
         //
         verifyException("com.fasterxml.jackson.databind.type.SimpleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_COMPARABLE;
      Class<String> class0 = String.class;
      JavaType javaType0 = simpleType0._narrow(class0);
      assertFalse(javaType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
      Class<Object> class0 = Object.class;
      JavaType javaType0 = simpleType0._narrow(class0);
      assertSame(javaType0, simpleType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
      SimpleType simpleType1 = simpleType0.withTypeHandler(simpleType0);
      assertNotSame(simpleType1, simpleType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
      SimpleType simpleType1 = simpleType0.withTypeHandler((Object) null);
      assertSame(simpleType1, simpleType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
      SimpleType simpleType1 = simpleType0.withValueHandler(simpleType0);
      assertTrue(simpleType1.hasValueHandler());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_INT;
      SimpleType simpleType1 = simpleType0.withValueHandler((Object) null);
      assertSame(simpleType1, simpleType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_BOOL;
      SimpleType simpleType1 = simpleType0.withStaticTyping();
      SimpleType simpleType2 = simpleType1.withStaticTyping();
      assertTrue(simpleType2.useStaticType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.instance;
      Class<LinkedList> class0 = LinkedList.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
      CollectionType collectionType0 = typeFactory0.constructCollectionType((Class<? extends Collection>) class0, (JavaType) simpleType0);
      Class<BigIntegerNode> class1 = BigIntegerNode.class;
      Class<HashMap> class2 = HashMap.class;
      MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class1);
      MapType mapType0 = typeFactory0.constructMapType((Class<? extends Map>) class2, (JavaType) collectionType0, (JavaType) mapLikeType0);
      SimpleType simpleType1 = new SimpleType(mapType0);
      String string0 = simpleType1.buildCanonicalName();
      assertEquals("java.util.HashMap<java.util.LinkedList<java.lang.Object>,com.fasterxml.jackson.databind.node.BigIntegerNode<java.lang.Object,java.lang.Object>>", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.instance;
      Class<LinkedList> class0 = LinkedList.class;
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_OBJECT;
      CollectionType collectionType0 = typeFactory0.constructCollectionType((Class<? extends Collection>) class0, (JavaType) simpleType0);
      SimpleType simpleType1 = new SimpleType(collectionType0);
      String string0 = simpleType1.getGenericSignature();
      assertEquals("Ljava/util/LinkedList<Ljava/lang/Object;>;", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      boolean boolean0 = simpleType0.equals((Object) null);
      assertFalse(simpleType0.useStaticType());
      assertFalse(boolean0);
  }
}
