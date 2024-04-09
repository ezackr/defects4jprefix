/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 00:13:33 GMT 2024
 */

package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NumberSerializer_ESTest extends NumberSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<BigDecimal> class0 = BigDecimal.class;
      NumberSerializer numberSerializer0 = new NumberSerializer(class0);
      JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
      numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
      assertFalse(numberSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<BigInteger> class0 = BigInteger.class;
      NumberSerializer numberSerializer0 = new NumberSerializer(class0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<HashMap> class1 = HashMap.class;
      MapType mapType0 = typeFactory0.constructRawMapType(class1);
      JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
      numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, mapType0);
      assertFalse(mapType0.isCollectionLikeType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
      JsonSerializer<?> jsonSerializer0 = numberSerializer0.createContextual(defaultSerializerProvider_Impl0, beanProperty_Bogus0);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        numberSerializer0.serialize((Number) null, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      // Undeclared exception!
      try { 
        numberSerializer0.serialize((Number) bigDecimal0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        numberSerializer0.serialize((Number) bigInteger0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Long long0 = new Long((-596L));
      // Undeclared exception!
      try { 
        numberSerializer0.instance.serialize((Number) long0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      Double double0 = new Double(0.0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        numberSerializer0.instance.serialize((Number) double0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Float float0 = new Float((-9.223372E18F));
      // Undeclared exception!
      try { 
        numberSerializer0.serialize((Number) float0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Integer integer0 = new Integer(147);
      // Undeclared exception!
      try { 
        numberSerializer0.serialize((Number) integer0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      Byte byte0 = new Byte((byte)113);
      // Undeclared exception!
      try { 
        numberSerializer0.serialize((Number) byte0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Short short0 = new Short((short) (-1655));
      // Undeclared exception!
      try { 
        numberSerializer0.instance.serialize((Number) short0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Short> class0 = Short.class;
      NumberSerializer numberSerializer0 = new NumberSerializer(class0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      JsonNode jsonNode0 = numberSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0);
      assertEquals(1, jsonNode0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<BigInteger> class0 = BigInteger.class;
      NumberSerializer numberSerializer0 = new NumberSerializer(class0);
      JsonNode jsonNode0 = numberSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0, false);
      assertFalse(jsonNode0.isInt());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberSerializer numberSerializer0 = NumberSerializer.instance;
      JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
      numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
      assertFalse(numberSerializer0.isUnwrappingSerializer());
  }
}
