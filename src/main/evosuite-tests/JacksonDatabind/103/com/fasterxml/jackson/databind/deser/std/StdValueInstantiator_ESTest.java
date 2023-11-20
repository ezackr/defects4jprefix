/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:52:03 GMT 2023
 */

package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLDataException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLTransientException;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdValueInstantiator_ESTest extends StdValueInstantiator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (JavaType) null);
      stdValueInstantiator0.getDelegateType((DeserializationConfig) null);
      assertEquals("UNKNOWN TYPE", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<MockFileInputStream> class0 = MockFileInputStream.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.configureIncompleteParameter((AnnotatedParameter) null);
      assertEquals("`org.evosuite.runtime.mock.java.io.MockFileInputStream`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createUsingArrayDelegate((DeserializationContext) null, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No delegate constructor for `int`
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<MatchStrength> class0 = MatchStrength.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getDelegateCreator();
      assertEquals("`com.fasterxml.jackson.core.format.MatchStrength`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
      ObjectMapper objectMapper0 = new ObjectMapper();
      ObjectReader objectReader0 = objectMapper0.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<MatchStrength> class0 = MatchStrength.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getArrayDelegateCreator();
      assertEquals("`com.fasterxml.jackson.core.format.MatchStrength`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Module> class0 = Module.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException();
      InvocationTargetException invocationTargetException0 = new InvocationTargetException(sQLTransientConnectionException0);
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

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StdValueInstantiator stdValueInstantiator0 = null;
      try {
        stdValueInstantiator0 = new StdValueInstantiator((StdValueInstantiator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getArrayDelegateType((DeserializationConfig) null);
      assertEquals("`java.lang.Integer`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<MatchStrength> class0 = MatchStrength.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getDefaultCreator();
      assertEquals("`com.fasterxml.jackson.core.format.MatchStrength`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      stdValueInstantiator0.getWithArgsCreator();
      assertEquals("`com.fasterxml.jackson.databind.type.ResolvedRecursiveType`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (Class<?>) null);
      assertFalse(stdValueInstantiator0.canInstantiate());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<DecimalNode> class0 = DecimalNode.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      boolean boolean0 = stdValueInstantiator0.canInstantiate();
      assertEquals("`com.fasterxml.jackson.databind.node.DecimalNode`", stdValueInstantiator0.getValueTypeDesc());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<PropertyName> class0 = PropertyName.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      Class<MatchStrength> class1 = MatchStrength.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class1);
      ReferenceType referenceType0 = ReferenceType.upgradeFrom(simpleType0, simpleType0);
      stdValueInstantiator0._delegateType = (JavaType) referenceType0;
      boolean boolean0 = stdValueInstantiator0.canInstantiate();
      assertTrue(stdValueInstantiator0.canCreateUsingDelegate());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<MatchStrength> class0 = MatchStrength.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      PlaceholderForType placeholderForType0 = new PlaceholderForType((-820));
      stdValueInstantiator0._arrayDelegateType = (JavaType) placeholderForType0;
      boolean boolean0 = stdValueInstantiator0.canInstantiate();
      assertTrue(stdValueInstantiator0.canCreateUsingArrayDelegate());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<DecimalNode> class0 = DecimalNode.class;
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
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createUsingDelegate((DeserializationContext) null, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No delegate constructor for `java.lang.String`
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<JavaType> class0 = JavaType.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromString((DeserializationContext) null, "Instantiation of ");
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
      Class<ExceptionInInitializerError> class0 = ExceptionInInitializerError.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromInt((DeserializationContext) null, 1);
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
      Class<String> class0 = String.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromLong((DeserializationContext) null, 24L);
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
      Class<DecimalNode> class0 = DecimalNode.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.createFromDouble((DeserializationContext) null, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.ValueInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLDataException sQLDataException0 = new SQLDataException();
      stdValueInstantiator0.wrapException(sQLDataException0);
      assertEquals("`java.lang.String`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLTransientException sQLTransientException0 = new SQLTransientException();
      JsonMappingException jsonMappingException0 = JsonMappingException.wrapWithPath((Throwable) sQLTransientException0, (Object) null, "");
      JsonMappingException jsonMappingException1 = stdValueInstantiator0.wrapException(jsonMappingException0);
      assertSame(jsonMappingException1, jsonMappingException0);
      assertEquals("`java.lang.Integer`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException();
      // Undeclared exception!
      try { 
        stdValueInstantiator0.unwrapAndWrapException((DeserializationContext) null, sQLInvalidAuthorizationSpecException0);
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
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      JsonMappingException jsonMappingException0 = defaultDeserializationContext_Impl0.weirdNativeValueException((Object) null, class0);
      stdValueInstantiator0.unwrapAndWrapException((DeserializationContext) null, jsonMappingException0);
      assertEquals("`java.lang.reflect.InvocationTargetException`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<NamedType> class0 = NamedType.class;
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      JsonMappingException jsonMappingException0 = JsonMappingException.from((SerializerProvider) defaultSerializerProvider_Impl0, "'");
      stdValueInstantiator0.wrapAsJsonMappingException((DeserializationContext) null, jsonMappingException0);
      assertEquals("`com.fasterxml.jackson.databind.jsontype.NamedType`", stdValueInstantiator0.getValueTypeDesc());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
  public void test28()  throws Throwable  {
      StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (JavaType) null);
      // Undeclared exception!
      try { 
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", e);
      }
  }
}
