/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:15:33 GMT 2023
 */

package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientException;
import java.sql.SQLWarning;
import java.time.chrono.ChronoLocalDate;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdValueInstantiator_ESTest extends StdValueInstantiator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<JsonMappingException> class0 = JsonMappingException.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getDelegateType((DeserializationConfig) null);
      assertEquals("com.fasterxml.jackson.databind.JsonMappingException", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      ObjectReader objectReader0 = objectMapper0.readerForUpdating(jsonFactory0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createUsingArrayDelegate((DeserializationContext) null, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No delegate constructor for int
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getDelegateCreator();
      assertEquals("int", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<JsonMappingException> class0 = JsonMappingException.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getArrayDelegateCreator();
      assertEquals("com.fasterxml.jackson.databind.JsonMappingException", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromInt((DeserializationContext) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<TextNode> class0 = TextNode.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      StdValueInstantiator stdValueInstantiator1 = new StdValueInstantiator(stdValueInstantiator0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<Map> class1 = Map.class;
      MapType mapType0 = typeFactory0.constructRawMapType(class1);
      stdValueInstantiator1._arrayDelegateType = (JavaType) mapType0;
      boolean boolean0 = stdValueInstantiator1.canCreateUsingArrayDelegate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<ExceptionInInitializerError> class0 = ExceptionInInitializerError.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, simpleType0);
      stdValueInstantiator0.getArrayDelegateType((DeserializationConfig) null);
      assertEquals("[simple type, class java.lang.ExceptionInInitializerError]", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getDefaultCreator();
      assertEquals("java.lang.String", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getWithArgsCreator();
      assertEquals("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (Class<?>) null);
      assertEquals("UNKNOWN TYPE", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (JavaType) null);
      assertEquals("UNKNOWN TYPE", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      PlaceholderForType placeholderForType0 = new PlaceholderForType(0);
      stdValueInstantiator0._delegateType = (JavaType) placeholderForType0;
      boolean boolean0 = stdValueInstantiator0.canInstantiate();
      assertTrue(stdValueInstantiator0.canCreateUsingDelegate());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createUsingDefault((DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromObjectWith((DeserializationContext) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<TextNode> class0 = TextNode.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createUsingDelegate((DeserializationContext) null, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No delegate constructor for com.fasterxml.jackson.databind.node.TextNode
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromString((DeserializationContext) null, "(\"spIJQE,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<MapType> class0 = MapType.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromLong((DeserializationContext) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromDouble((DeserializationContext) null, (-20.614495));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<MapType> class0 = MapType.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromBoolean((DeserializationContext) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<JsonMappingException> class0 = JsonMappingException.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
      JsonMappingException jsonMappingException0 = stdValueInstantiator0.wrapException(sQLTimeoutException0);
      JsonMappingException jsonMappingException1 = stdValueInstantiator0.wrapException(jsonMappingException0);
      assertEquals("com.fasterxml.jackson.databind.JsonMappingException", stdValueInstantiator0.getValueTypeDesc());
      assertSame(jsonMappingException1, jsonMappingException0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
      JsonMappingException jsonMappingException0 = stdValueInstantiator0.unwrapAndWrapException(defaultDeserializationContext_Impl0, sQLFeatureNotSupportedException0);
      JsonMappingException jsonMappingException1 = stdValueInstantiator0.unwrapAndWrapException(defaultDeserializationContext_Impl0, jsonMappingException0);
      assertEquals("java.lang.Integer", stdValueInstantiator0.getValueTypeDesc());
      assertSame(jsonMappingException1, jsonMappingException0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<ExceptionInInitializerError> class0 = ExceptionInInitializerError.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      ExceptionInInitializerError exceptionInInitializerError0 = new ExceptionInInitializerError();
      // Undeclared exception!
      try { 
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, exceptionInInitializerError0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<JsonMappingException> class0 = JsonMappingException.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      JsonMappingException jsonMappingException0 = JsonMappingException.from((JsonGenerator) null, "B9h");
      stdValueInstantiator0.wrapAsJsonMappingException((DeserializationContext) null, jsonMappingException0);
      assertEquals("com.fasterxml.jackson.databind.JsonMappingException", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLTransientException sQLTransientException0 = new SQLTransientException();
      // Undeclared exception!
      try { 
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, sQLTransientException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<InvocationTargetException> class0 = InvocationTargetException.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLWarning sQLWarning0 = new SQLWarning();
      InvocationTargetException invocationTargetException0 = new InvocationTargetException(sQLWarning0, "h`{yoTw[~ZSNyQlGw_");
      // Undeclared exception!
      try { 
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, invocationTargetException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }
}
