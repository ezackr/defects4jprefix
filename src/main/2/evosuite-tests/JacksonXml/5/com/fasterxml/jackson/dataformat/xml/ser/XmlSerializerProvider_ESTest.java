/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 00:52:36 GMT 2024
 */

package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ctc.wstx.api.WriterConfig;
import com.ctc.wstx.sw.NonNsStreamWriter;
import com.ctc.wstx.sw.XmlWriter;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientException;
import java.time.chrono.ChronoLocalDate;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.namespace.QName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlSerializerProvider_ESTest extends XmlSerializerProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      ObjectMapper objectMapper0 = new ObjectMapper();
      WriterConfig writerConfig0 = WriterConfig.createFullDefaults();
      NonNsStreamWriter nonNsStreamWriter0 = new NonNsStreamWriter((XmlWriter) null, "JSON", writerConfig0);
      QName qName0 = QName.valueOf("JSON");
      ToXmlGenerator toXmlGenerator0 = new ToXmlGenerator((IOContext) null, 39, (-2443), objectMapper0, nonNsStreamWriter0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0._startRootArray(toXmlGenerator0, qName0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No element/attribute name specified when trying to output element
         //
         verifyException("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      DefaultSerializerProvider defaultSerializerProvider0 = xmlSerializerProvider0.copy();
      assertNotSame(xmlSerializerProvider0, defaultSerializerProvider0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
      SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
      RootNameLookup rootNameLookup0 = new RootNameLookup();
      ConfigOverrides configOverrides0 = new ConfigOverrides();
      SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, simpleMixInResolver0, rootNameLookup0, configOverrides0);
      BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
      XmlSerializerProvider xmlSerializerProvider1 = new XmlSerializerProvider(xmlSerializerProvider0, serializationConfig0, beanSerializerFactory0);
      try { 
        xmlSerializerProvider1._serializeXmlNull((JsonGenerator) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // [no message for java.lang.NullPointerException]
         //
         verifyException("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      JsonFactory jsonFactory0 = new JsonFactory((ObjectCodec) null);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, xmlSerializerProvider0, defaultDeserializationContext_Impl0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
      boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
      JsonParser jsonParser0 = arrayNode0.traverse();
      TokenBuffer tokenBuffer0 = new TokenBuffer(jsonParser0);
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) tokenBuffer0, (Object) arrayNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
      ObjectMapper objectMapper0 = new ObjectMapper();
      WriterConfig writerConfig0 = WriterConfig.createFullDefaults();
      NonNsStreamWriter nonNsStreamWriter0 = new NonNsStreamWriter((XmlWriter) null, "zJ8$T", writerConfig0);
      ToXmlGenerator toXmlGenerator0 = new ToXmlGenerator(iOContext0, 1, 2, objectMapper0, nonNsStreamWriter0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) toXmlGenerator0, (Object) writerConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
      JsonParser jsonParser0 = arrayNode0.traverse();
      TokenBuffer tokenBuffer0 = new TokenBuffer(jsonParser0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) tokenBuffer0, (Object) arrayNode0, (JavaType) null, (JsonSerializer<Object>) null);
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
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) null, (Object) null, (JavaType) null, (JsonSerializer<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
      ObjectMapper objectMapper0 = new ObjectMapper();
      WriterConfig writerConfig0 = WriterConfig.createFullDefaults();
      NonNsStreamWriter nonNsStreamWriter0 = new NonNsStreamWriter((XmlWriter) null, "zJ8$T3", writerConfig0);
      ToXmlGenerator toXmlGenerator0 = new ToXmlGenerator(iOContext0, 1, 2, objectMapper0, nonNsStreamWriter0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) toXmlGenerator0, (Object) writerConfig0, (JavaType) null, xmlSerializerProvider0.DEFAULT_NULL_KEY_SERIALIZER);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
      JsonParser jsonParser0 = arrayNode0.traverse();
      TokenBuffer tokenBuffer0 = new TokenBuffer(jsonParser0);
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) tokenBuffer0, (Object) arrayNode0, (JavaType) null, xmlSerializerProvider0.DEFAULT_NULL_KEY_SERIALIZER);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)
         //
         verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
      JsonParser jsonParser0 = arrayNode0.traverse();
      TokenBuffer tokenBuffer0 = new TokenBuffer(jsonParser0);
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      JsonSerializer<Object> jsonSerializer0 = xmlSerializerProvider0.getDefaultNullValueSerializer();
      xmlSerializerProvider0.serializeValue((JsonGenerator) tokenBuffer0, (Object) arrayNode0, (JavaType) null, jsonSerializer0);
      assertFalse(arrayNode0.isDouble());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
      SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
      RootNameLookup rootNameLookup0 = new RootNameLookup();
      ConfigOverrides configOverrides0 = new ConfigOverrides();
      SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, simpleMixInResolver0, rootNameLookup0, configOverrides0);
      PropertyName propertyName0 = PropertyName.construct("-", "");
      SerializationConfig serializationConfig1 = serializationConfig0.withRootName(propertyName0);
      BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
      XmlSerializerProvider xmlSerializerProvider1 = new XmlSerializerProvider(xmlSerializerProvider0, serializationConfig1, beanSerializerFactory0);
      try { 
        xmlSerializerProvider1._serializeXmlNull((JsonGenerator) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // [no message for java.lang.NullPointerException]
         //
         verifyException("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, xmlSerializerProvider0, true);
      ObjectMapper objectMapper0 = new ObjectMapper();
      WriterConfig writerConfig0 = WriterConfig.createFullDefaults();
      NonNsStreamWriter nonNsStreamWriter0 = new NonNsStreamWriter((XmlWriter) null, "", writerConfig0);
      QName qName0 = new QName("", "", "");
      ToXmlGenerator toXmlGenerator0 = new ToXmlGenerator(iOContext0, 3, 0, objectMapper0, nonNsStreamWriter0);
      xmlSerializerProvider0._initWithRootName(toXmlGenerator0, qName0);
      xmlSerializerProvider0._initWithRootName(toXmlGenerator0, qName0);
      assertEquals(3, toXmlGenerator0.getFeatureMask());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, xmlSerializerProvider0, true);
      ObjectMapper objectMapper0 = new ObjectMapper();
      WriterConfig writerConfig0 = WriterConfig.createFullDefaults();
      NonNsStreamWriter nonNsStreamWriter0 = new NonNsStreamWriter((XmlWriter) null, "", writerConfig0);
      QName qName0 = new QName("", "", "");
      ToXmlGenerator toXmlGenerator0 = new ToXmlGenerator(iOContext0, 3, 0, objectMapper0, nonNsStreamWriter0);
      toXmlGenerator0.writeStartArray(984);
      xmlSerializerProvider0._initWithRootName(toXmlGenerator0, qName0);
      xmlSerializerProvider0._initWithRootName(toXmlGenerator0, qName0);
      assertEquals(56320, GeneratorBase.SURR2_FIRST);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, xmlSerializerProvider0, false);
      ObjectMapper objectMapper0 = new ObjectMapper();
      WriterConfig writerConfig0 = WriterConfig.createFullDefaults();
      NonNsStreamWriter nonNsStreamWriter0 = new NonNsStreamWriter((XmlWriter) null, "lu", writerConfig0);
      QName qName0 = new QName("lu", "lu");
      ToXmlGenerator toXmlGenerator0 = new ToXmlGenerator(iOContext0, 3, 0, objectMapper0, nonNsStreamWriter0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0._initWithRootName(toXmlGenerator0, qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not set default namespace for non-namespace writer.
         //
         verifyException("com.ctc.wstx.sw.BaseStreamWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
      SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
      RootNameLookup rootNameLookup0 = new RootNameLookup();
      ConfigOverrides configOverrides0 = new ConfigOverrides();
      SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, simpleMixInResolver0, rootNameLookup0, configOverrides0);
      PropertyName propertyName0 = PropertyName.USE_DEFAULT;
      SerializationConfig serializationConfig1 = serializationConfig0.withRootName(propertyName0);
      BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
      XmlSerializerProvider xmlSerializerProvider1 = new XmlSerializerProvider(xmlSerializerProvider0, serializationConfig1, beanSerializerFactory0);
      try { 
        xmlSerializerProvider1._serializeXmlNull((JsonGenerator) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // [no message for java.lang.NullPointerException]
         //
         verifyException("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
      SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
      RootNameLookup rootNameLookup0 = new RootNameLookup();
      ConfigOverrides configOverrides0 = new ConfigOverrides();
      SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, simpleMixInResolver0, rootNameLookup0, configOverrides0);
      PropertyName propertyName0 = new PropertyName("Cannot pass null modifier", "Cannot pass null modifier");
      SerializationConfig serializationConfig1 = serializationConfig0.withRootName(propertyName0);
      BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
      XmlSerializerProvider xmlSerializerProvider1 = new XmlSerializerProvider(xmlSerializerProvider0, serializationConfig1, beanSerializerFactory0);
      try { 
        xmlSerializerProvider1._serializeXmlNull((JsonGenerator) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // [no message for java.lang.NullPointerException]
         //
         verifyException("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlRootNameLookup xmlRootNameLookup0 = new XmlRootNameLookup();
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider(xmlRootNameLookup0);
      // Undeclared exception!
      try { 
        xmlSerializerProvider0.serializeValue((JsonGenerator) null, (Object) xmlRootNameLookup0, (JavaType) null, xmlSerializerProvider0.DEFAULT_NULL_KEY_SERIALIZER);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException();
      IOException iOException0 = xmlSerializerProvider0._wrapAsIOE((JsonGenerator) null, sQLNonTransientException0);
      assertNotNull(iOException0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlSerializerProvider xmlSerializerProvider0 = new XmlSerializerProvider((XmlRootNameLookup) null);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("item", "item");
      IOException iOException0 = xmlSerializerProvider0._wrapAsIOE((JsonGenerator) null, sQLIntegrityConstraintViolationException0);
      assertNotNull(iOException0);
  }
}
