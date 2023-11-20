/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:26:58 GMT 2023
 */

package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLTimeoutException;
import java.time.chrono.ChronoLocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdSerializer_ESTest extends StdSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 1);
      // Undeclared exception!
      try { 
        objectMapper0.writeValue((OutputStream) byteArrayBuilder0, (Object) objectMapper0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StdDelegatingSerializer stdDelegatingSerializer0 = new StdDelegatingSerializer((Converter<?, ?>) null);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<JsonFormat.Shape> class0 = JsonFormat.Shape.class;
      ObjectIdGenerators.IntSequenceGenerator objectIdGenerators_IntSequenceGenerator0 = new ObjectIdGenerators.IntSequenceGenerator(class0, 4111);
      Class<?> class1 = objectIdGenerators_IntSequenceGenerator0.getScope();
      JsonNode jsonNode0 = stdDelegatingSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class1);
      assertEquals("", jsonNode0.asText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StdArraySerializers.BooleanArraySerializer stdArraySerializers_BooleanArraySerializer0 = new StdArraySerializers.BooleanArraySerializer();
      Version version0 = new Version(2541, 2541, 2541, "", "", "");
      SimpleModule simpleModule0 = new SimpleModule("y7kRP", version0);
      SimpleModule simpleModule1 = simpleModule0.addSerializer((JsonSerializer<?>) stdArraySerializers_BooleanArraySerializer0);
      assertEquals("y7kRP", simpleModule1.getModuleName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdArraySerializers.BooleanArraySerializer stdArraySerializers_BooleanArraySerializer0 = new StdArraySerializers.BooleanArraySerializer();
      boolean boolean0 = stdArraySerializers_BooleanArraySerializer0.isDefaultSerializer(defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdArraySerializers.LongArraySerializer stdArraySerializers_LongArraySerializer0 = new StdArraySerializers.LongArraySerializer();
      JsonNode jsonNode0 = stdArraySerializers_LongArraySerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) null, true);
      assertEquals(2, jsonNode0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdArraySerializers.LongArraySerializer stdArraySerializers_LongArraySerializer0 = new StdArraySerializers.LongArraySerializer();
      JsonNode jsonNode0 = stdArraySerializers_LongArraySerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) null, false);
      assertEquals(3, jsonNode0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      ObjectNode objectNode0 = stdArraySerializers_IntArraySerializer0.createSchemaNode("%Y$ B5:_mbwJH%lOu7O", false);
      assertEquals(2, objectNode0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
      InvocationTargetException invocationTargetException0 = new InvocationTargetException(sQLTimeoutException0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<ObjectWriter> class0 = ObjectWriter.class;
      RawSerializer<ObjectReader> rawSerializer0 = new RawSerializer<ObjectReader>(class0);
      // Undeclared exception!
      try { 
        rawSerializer0.wrapAndThrow((SerializerProvider) defaultSerializerProvider_Impl0, (Throwable) invocationTargetException0, (Object) defaultSerializerProvider_Impl0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      Class<InputStream> class0 = InputStream.class;
      RawSerializer<ObjectReader> rawSerializer0 = new RawSerializer<ObjectReader>(class0);
      InvocationTargetException invocationTargetException0 = new InvocationTargetException((Throwable) null);
      // Undeclared exception!
      try { 
        rawSerializer0.wrapAndThrow((SerializerProvider) defaultSerializerProvider_Impl0, (Throwable) invocationTargetException0, (Object) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      MockError mockError0 = new MockError();
      Class<ObjectWriter> class0 = ObjectWriter.class;
      RawSerializer<ObjectReader> rawSerializer0 = new RawSerializer<ObjectReader>(class0);
      // Undeclared exception!
      try { 
        rawSerializer0.wrapAndThrow((SerializerProvider) defaultSerializerProvider_Impl0, (Throwable) mockError0, (Object) defaultSerializerProvider_Impl0, (String) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      Class<Error> class0 = Error.class;
      RawSerializer<ObjectReader> rawSerializer0 = new RawSerializer<ObjectReader>(class0);
      JsonMappingException jsonMappingException0 = null;
      try {
        jsonMappingException0 = new JsonMappingException("x");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      SerializationFeature serializationFeature0 = SerializationFeature.WRAP_EXCEPTIONS;
      objectMapper0.disable(serializationFeature0);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0, 1);
      // Undeclared exception!
      try { 
        objectMapper0.writeValue((OutputStream) byteArrayBuilder0, (Object) objectMapper0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
      Class<Object> class0 = Object.class;
      RawSerializer<ObjectReader> rawSerializer0 = new RawSerializer<ObjectReader>(class0);
      // Undeclared exception!
      try { 
        rawSerializer0.wrapAndThrow((SerializerProvider) null, (Throwable) sQLIntegrityConstraintViolationException0, (Object) null, "~mO");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      RawSerializer<ObjectReader> rawSerializer0 = new RawSerializer<ObjectReader>(class0);
      try { 
        rawSerializer0.wrapAndThrow((SerializerProvider) null, (Throwable) mockIOException0, (Object) "~^wL", "~^wL");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      JsonMappingException jsonMappingException0 = null;
      try {
        jsonMappingException0 = new JsonMappingException("c,5b_");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InvocationTargetException invocationTargetException0 = new InvocationTargetException((Throwable) null);
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      // Undeclared exception!
      try { 
        stdArraySerializers_IntArraySerializer0.wrapAndThrow((SerializerProvider) null, (Throwable) invocationTargetException0, (Object) null, (-1314));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
      InvocationTargetException invocationTargetException0 = new InvocationTargetException(sQLTimeoutException0);
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      // Undeclared exception!
      try { 
        stdArraySerializers_IntArraySerializer0.wrapAndThrow((SerializerProvider) null, (Throwable) invocationTargetException0, (Object) null, 4040);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      MockError mockError0 = new MockError();
      // Undeclared exception!
      try { 
        stdArraySerializers_IntArraySerializer0.wrapAndThrow((SerializerProvider) null, (Throwable) mockError0, (Object) mockError0, (-131072));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      // Undeclared exception!
      try { 
        stdArraySerializers_IntArraySerializer0.wrapAndThrow((SerializerProvider) defaultSerializerProvider_Impl0, (Throwable) null, (Object) null, (-105));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      StdArraySerializers.IntArraySerializer stdArraySerializers_IntArraySerializer0 = new StdArraySerializers.IntArraySerializer();
      try { 
        stdArraySerializers_IntArraySerializer0.wrapAndThrow((SerializerProvider) null, (Throwable) mockIOException0, (Object) null, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<IOException> class0 = IOException.class;
      boolean boolean0 = objectMapper0.canSerialize(class0);
      assertTrue(boolean0);
  }
}
