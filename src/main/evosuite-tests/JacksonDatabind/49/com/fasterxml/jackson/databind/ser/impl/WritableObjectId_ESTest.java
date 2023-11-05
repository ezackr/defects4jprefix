/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 18:41:44 GMT 2023
 */

package com.fasterxml.jackson.databind.ser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.time.chrono.ChronoLocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WritableObjectId_ESTest extends WritableObjectId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WritableObjectId writableObjectId0 = new WritableObjectId((ObjectIdGenerator<?>) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      boolean boolean0 = writableObjectId0.writeAsId((JsonGenerator) null, defaultSerializerProvider_Impl0, (ObjectIdWriter) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectIdGenerators.IntSequenceGenerator objectIdGenerators_IntSequenceGenerator0 = new ObjectIdGenerators.IntSequenceGenerator();
      WritableObjectId writableObjectId0 = new WritableObjectId(objectIdGenerators_IntSequenceGenerator0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, true);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, byteArrayOutputStream0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      SerializedString serializedString0 = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
      ObjectIdWriter objectIdWriter0 = new ObjectIdWriter(simpleType0, serializedString0, objectIdGenerators_IntSequenceGenerator0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER, true);
      writableObjectId0.generateId(class0);
      try { 
        writableObjectId0.writeAsId(uTF8JsonGenerator0, defaultSerializerProvider_Impl0, objectIdWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)
         //
         verifyException("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectIdGenerators.IntSequenceGenerator objectIdGenerators_IntSequenceGenerator0 = new ObjectIdGenerators.IntSequenceGenerator();
      WritableObjectId writableObjectId0 = new WritableObjectId(objectIdGenerators_IntSequenceGenerator0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, true);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, byteArrayOutputStream0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      writableObjectId0.idWritten = true;
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      SerializedString serializedString0 = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
      ObjectIdWriter objectIdWriter0 = new ObjectIdWriter(simpleType0, serializedString0, objectIdGenerators_IntSequenceGenerator0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER, true);
      writableObjectId0.generateId(class0);
      try { 
        writableObjectId0.writeAsId(uTF8JsonGenerator0, defaultSerializerProvider_Impl0, objectIdWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)
         //
         verifyException("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectIdGenerators.IntSequenceGenerator objectIdGenerators_IntSequenceGenerator0 = new ObjectIdGenerators.IntSequenceGenerator();
      WritableObjectId writableObjectId0 = new WritableObjectId(objectIdGenerators_IntSequenceGenerator0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, false);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, byteArrayOutputStream0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      SerializedString serializedString0 = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
      ObjectIdWriter objectIdWriter0 = new ObjectIdWriter(simpleType0, serializedString0, objectIdGenerators_IntSequenceGenerator0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER, false);
      Object object1 = writableObjectId0.generateId(class0);
      assertNotNull(object1);
      
      boolean boolean0 = writableObjectId0.writeAsId(uTF8JsonGenerator0, defaultSerializerProvider_Impl0, objectIdWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectIdGenerators.IntSequenceGenerator objectIdGenerators_IntSequenceGenerator0 = new ObjectIdGenerators.IntSequenceGenerator();
      WritableObjectId writableObjectId0 = new WritableObjectId(objectIdGenerators_IntSequenceGenerator0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, "pt", false);
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, pipedOutputStream0);
      JsonGeneratorDelegate jsonGeneratorDelegate0 = new JsonGeneratorDelegate(uTF8JsonGenerator0, false);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      ObjectIdWriter objectIdWriter0 = new ObjectIdWriter(simpleType0, (SerializableString) null, objectIdGenerators_IntSequenceGenerator0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER, false);
      writableObjectId0.writeAsField(jsonGeneratorDelegate0, defaultSerializerProvider_Impl0, objectIdWriter0);
      assertFalse(jsonGeneratorDelegate0.canWriteBinaryNatively());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectIdGenerators.IntSequenceGenerator objectIdGenerators_IntSequenceGenerator0 = new ObjectIdGenerators.IntSequenceGenerator();
      WritableObjectId writableObjectId0 = new WritableObjectId(objectIdGenerators_IntSequenceGenerator0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      Object object0 = new Object();
      IOContext iOContext0 = new IOContext(bufferRecycler0, object0, false);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3);
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectMapper0, byteArrayOutputStream0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.construct(class0);
      SerializedString serializedString0 = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
      ObjectIdWriter objectIdWriter0 = new ObjectIdWriter(simpleType0, serializedString0, objectIdGenerators_IntSequenceGenerator0, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER, false);
      try { 
        writableObjectId0.writeAsField(uTF8JsonGenerator0, defaultSerializerProvider_Impl0, objectIdWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)
         //
         verifyException("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", e);
      }
  }
}
