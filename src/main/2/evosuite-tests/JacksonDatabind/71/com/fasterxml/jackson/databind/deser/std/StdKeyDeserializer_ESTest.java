/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:45:42 GMT 2024
 */

package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.chrono.IsoEra;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdKeyDeserializer_ESTest extends StdKeyDeserializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      JsonDeserializer<Locale> jsonDeserializer0 = (JsonDeserializer<Locale>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
      Class<?> class1 = stdKeyDeserializer_DelegatingKD0.getKeyClass();
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Short> class0 = Short.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      assertNotNull(stdKeyDeserializer0);
      
      Object object0 = stdKeyDeserializer0.deserializeKey("0", (DeserializationContext) null);
      assertNotNull(object0);
      assertEquals((short)0, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Long> class0 = Long.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("#7J>4D`p9n{", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Double> class0 = Double.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0.deserializeKey("0", (DeserializationContext) null);
      assertEquals(0.0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(57, class0);
      Class<?> class1 = stdKeyDeserializer0.getKeyClass();
      assertEquals("class java.lang.Integer", class1.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0.deserializeKey("0", (DeserializationContext) null);
      assertEquals("0", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<IsoEra> class0 = IsoEra.class;
      EnumResolver enumResolver0 = EnumResolver.constructUnsafeUsingToString(class0);
      StdKeyDeserializer.EnumKD stdKeyDeserializer_EnumKD0 = new StdKeyDeserializer.EnumKD(enumResolver0, (AnnotatedMethod) null);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      try { 
        stdKeyDeserializer_EnumKD0.deserializeKey("overflow, value can not be represented as 16-bit value", defaultDeserializationContext_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Can not construct Map key of type java.time.chrono.IsoEra from String (\"overflow, value can not be represented as 16-bit value\"): not a valid representation: null
         //
         verifyException("com.fasterxml.jackson.databind.exc.InvalidFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StdKeyDeserializer.StringCtorKeyDeserializer stdKeyDeserializer_StringCtorKeyDeserializer0 = null;
      try {
        stdKeyDeserializer_StringCtorKeyDeserializer0 = new StdKeyDeserializer.StringCtorKeyDeserializer((Constructor<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StdKeyDeserializer.StringFactoryKeyDeserializer stdKeyDeserializer_StringFactoryKeyDeserializer0 = null;
      try {
        stdKeyDeserializer_StringFactoryKeyDeserializer0 = new StdKeyDeserializer.StringFactoryKeyDeserializer((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      assertEquals(10, StdKeyDeserializer.TYPE_DATE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<UUID> class0 = UUID.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      UUID uUID0 = (UUID)stdKeyDeserializer0.deserializeKey("!<f`CgYR]{[u3tsu", (DeserializationContext) null);
      assertEquals(16793600L, uUID0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      try { 
        stdKeyDeserializer0._parse("${!sHA$", (DeserializationContext) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"${!sHA$\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Date> class0 = Date.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("2143", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0.deserializeKey((String) null, (DeserializationContext) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0.deserializeKey("true", (DeserializationContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Character> class0 = Character.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      assertNotNull(stdKeyDeserializer0);
      
      Object object0 = stdKeyDeserializer0.deserializeKey("0", (DeserializationContext) null);
      assertEquals('0', object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Float> class0 = Float.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("#7J>4D`p9n{", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0.deserializeKey("overflow, value can not be represented as 16-bit value", (DeserializationContext) null);
      assertEquals("overflow, value can not be represented as 16_BIT VALUE", object0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<URI> class0 = URI.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      URI uRI0 = (URI)stdKeyDeserializer0._parse("", (DeserializationContext) null);
      assertNull(uRI0.getRawUserInfo());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<URL> class0 = URL.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      try { 
        stdKeyDeserializer0._parse("expected a value", (DeserializationContext) null);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: expected a value
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Currency> class0 = Currency.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("$'&=ot!YgNC(7^_?4cU", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<IsoEra> class0 = IsoEra.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      assertNull(stdKeyDeserializer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer((-1461), class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<IsoEra> class0 = IsoEra.class;
      StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer((-189), class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("0", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Short> class0 = Short.class;
      StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(15, class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("Sv/Sj_hREE$", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0._parse("false", (DeserializationContext) null);
      assertEquals(false, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      try { 
        stdKeyDeserializer0._parse("ieb%dHh`qLY/%z%", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("-180", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      Object object0 = stdKeyDeserializer0.deserializeKey("0", (DeserializationContext) null);
      assertEquals((byte)0, object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("2143", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Character> class0 = Character.class;
      StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
      // Undeclared exception!
      try { 
        stdKeyDeserializer0.deserializeKey("bjct", (DeserializationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
      assertEquals(8, StdKeyDeserializer.TYPE_DOUBLE);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      Class<URL> class0 = URL.class;
      SimpleType.constructUnsafe(class0);
      JsonDeserializer<JavaType> jsonDeserializer0 = (JsonDeserializer<JavaType>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class) , any(com.fasterxml.jackson.databind.DeserializationContext.class));
      StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
      try { 
        stdKeyDeserializer_DelegatingKD0.deserializeKey("S*$G#UL!C8ee/m2%>6", defaultDeserializationContext_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Can not construct Map key of type java.net.URL from String (\"S*$G#UL!C8ee/m2%>6\"): not a valid representation
         //
         verifyException("com.fasterxml.jackson.databind.exc.InvalidFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<URI> class0 = URI.class;
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, (JsonDeserializer<?>) null);
      Object object0 = stdKeyDeserializer_DelegatingKD0.deserializeKey((String) null, defaultDeserializationContext_Impl0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      JsonDeserializer<Locale> jsonDeserializer0 = (JsonDeserializer<Locale>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class) , any(com.fasterxml.jackson.databind.DeserializationContext.class));
      StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      try { 
        stdKeyDeserializer_DelegatingKD0.deserializeKey("Z", defaultDeserializationContext_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Can not construct Map key of type org.evosuite.runtime.mock.java.util.MockGregorianCalendar from String (\"Z\"): not a valid representation
         //
         verifyException("com.fasterxml.jackson.databind.exc.InvalidFormatException", e);
      }
  }
}
