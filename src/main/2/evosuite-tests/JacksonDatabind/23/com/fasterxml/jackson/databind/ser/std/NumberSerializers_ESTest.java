/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:10:43 GMT 2024
 */

package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.BatchUpdateException;
import java.sql.SQLTransientException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NumberSerializers_ESTest extends NumberSerializers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
      JsonNode jsonNode0 = numberSerializers_ShortSerializer0.getSchema((SerializerProvider) null, (Type) null, false);
      assertFalse(jsonNode0.isBigDecimal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberSerializers numberSerializers0 = new NumberSerializers();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      BatchUpdateException batchUpdateException0 = new BatchUpdateException();
      SQLTransientException sQLTransientException0 = new SQLTransientException("Y.`", "Y.`", 415, batchUpdateException0);
      String string0 = objectMapper0.writeValueAsString(sQLTransientException0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberSerializers.IntegerSerializer numberSerializers_IntegerSerializer0 = new NumberSerializers.IntegerSerializer();
      Double double0 = new Double(0.0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, double0, false);
      JsonFactory jsonFactory0 = new JsonFactory();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, defaultSerializerProvider_Impl0, (DefaultDeserializationContext) null);
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayBuilder0, false);
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 1, objectMapper0, mockPrintStream0, byteArrayBuilder0.NO_BYTES, 1, false);
      // Undeclared exception!
      try { 
        numberSerializers_IntegerSerializer0.serializeWithType(double0, uTF8JsonGenerator0, defaultSerializerProvider_Impl0, (TypeSerializer) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.lang.Integer
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
      JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
      numberSerializers_FloatSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
      assertFalse(numberSerializers_FloatSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer();
      NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
      // Undeclared exception!
      try { 
        numberSerializers_FloatSerializer0.serialize(numberSerializers_DoubleSerializer0, (JsonGenerator) null, (SerializerProvider) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer cannot be cast to java.lang.Float
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberSerializers.LongSerializer numberSerializers_LongSerializer0 = new NumberSerializers.LongSerializer();
      assertFalse(numberSerializers_LongSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberSerializers.LongSerializer numberSerializers_LongSerializer0 = NumberSerializers.LongSerializer.instance;
      Integer integer0 = new Integer(1);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        numberSerializers_LongSerializer0.serialize(integer0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Long
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberSerializers.IntLikeSerializer numberSerializers_IntLikeSerializer0 = NumberSerializers.IntLikeSerializer.instance;
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        numberSerializers_IntLikeSerializer0.serialize((Number) bigDecimal0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberSerializers.IntLikeSerializer numberSerializers_IntLikeSerializer0 = new NumberSerializers.IntLikeSerializer();
      assertFalse(numberSerializers_IntLikeSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberSerializers.DoubleSerializer numberSerializers_DoubleSerializer0 = new NumberSerializers.DoubleSerializer();
      Object object0 = new Object();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        numberSerializers_DoubleSerializer0.serializeWithType(object0, (JsonGenerator) null, defaultSerializerProvider_Impl0, (TypeSerializer) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Double
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
      Short short0 = new Short((short)1);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        numberSerializers_ShortSerializer0.serialize(short0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
      JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
      numberSerializers_ShortSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
      assertFalse(numberSerializers_ShortSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberSerializers.FloatSerializer numberSerializers_FloatSerializer0 = new NumberSerializers.FloatSerializer();
      JsonSerializer<?> jsonSerializer0 = numberSerializers_FloatSerializer0.createContextual((SerializerProvider) null, (BeanProperty) null);
      assertSame(numberSerializers_FloatSerializer0, jsonSerializer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberSerializers.ShortSerializer numberSerializers_ShortSerializer0 = new NumberSerializers.ShortSerializer();
      PropertyName propertyName0 = PropertyName.construct("tc%oHn^.A}k2Tn", "tc%oHn^.A}k2Tn");
      AnnotationMap annotationMap0 = new AnnotationMap();
      PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
      BeanProperty.Std beanProperty_Std0 = new BeanProperty.Std(propertyName0, (JavaType) null, propertyName0, annotationMap0, (AnnotatedMember) null, propertyMetadata0);
      JsonSerializer<?> jsonSerializer0 = numberSerializers_ShortSerializer0.createContextual((SerializerProvider) null, beanProperty_Std0);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }
}
