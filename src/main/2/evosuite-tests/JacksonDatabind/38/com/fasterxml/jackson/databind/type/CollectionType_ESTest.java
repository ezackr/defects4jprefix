/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:54:22 GMT 2024
 */

package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CollectionType_ESTest extends CollectionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeFactory typeFactory0 = TypeFactory.instance;
      ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
      CollectionType collectionType0 = CollectionType.construct((Class<?>) class0, (JavaType) arrayType0);
      JavaType javaType0 = collectionType0._narrow(class0);
      assertFalse(javaType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.instance;
      Class<Vector> class0 = Vector.class;
      CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
      String string0 = collectionType0.toString();
      assertFalse(collectionType0.useStaticType());
      assertEquals("[collection type; class java.util.Vector, contains [simple type, class java.lang.Object]]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<String> class0 = String.class;
      JavaType javaType0 = TypeBase._bogusSuperClass(class0);
      CollectionType collectionType0 = CollectionType.construct(class0, javaType0);
      CollectionType collectionType1 = collectionType0.withValueHandler("");
      assertFalse(collectionType1.useStaticType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<String> class0 = String.class;
      JavaType javaType0 = TypeBase._bogusSuperClass(class0);
      CollectionType collectionType0 = CollectionType.construct(class0, javaType0);
      CollectionType collectionType1 = collectionType0.withContentValueHandler("");
      assertFalse(collectionType1.useStaticType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleType simpleType0 = TypeFactory.CORE_TYPE_CLASS;
      CollectionLikeType collectionLikeType0 = CollectionLikeType.upgradeFrom(simpleType0, simpleType0);
      CollectionType collectionType0 = new CollectionType(collectionLikeType0, simpleType0);
      JavaType javaType0 = collectionType0.withContentType(simpleType0);
      assertSame(javaType0, collectionType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<Vector> class0 = Vector.class;
      CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
      CollectionLikeType collectionLikeType0 = collectionType0.withContentTypeHandler(typeFactory0);
      assertFalse(collectionLikeType0.useStaticType());
      assertTrue(collectionLikeType0.equals((Object)collectionType0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeFactory typeFactory0 = TypeFactory.instance;
      ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
      CollectionType collectionType0 = CollectionType.construct((Class<?>) class0, (JavaType) arrayType0);
      JavaType javaType0 = collectionType0.withContentType(collectionType0);
      assertNotSame(javaType0, collectionType0);
      assertFalse(javaType0.equals((Object)collectionType0));
      assertFalse(javaType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeFactory typeFactory0 = TypeFactory.instance;
      ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
      CollectionType collectionType0 = CollectionType.construct((Class<?>) class0, (JavaType) arrayType0);
      CollectionType collectionType1 = collectionType0.withStaticTyping();
      CollectionType collectionType2 = collectionType1.withStaticTyping();
      assertTrue(collectionType2.useStaticType());
      assertNotSame(collectionType2, collectionType0);
  }
}
