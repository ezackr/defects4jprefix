/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:29:25 GMT 2024
 */

package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasicBeanDescription_ESTest extends BasicBeanDescription_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      ObjectMapper objectMapper0 = new ObjectMapper();
      ObjectReader objectReader0 = objectMapper0.readerForUpdating(basicBeanDescription0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      // Undeclared exception!
      try { 
        objectMapper0.writeValueAsString(objectMapper0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.fasterxml.jackson.databind.JsonMappingException
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      Class<AnnotatedMethod>[] classArray0 = (Class<AnnotatedMethod>[]) Array.newInstance(Class.class, 0);
      AnnotatedMethod annotatedMethod0 = basicBeanDescription0.findMethod("_", classArray0);
      assertNull(annotatedMethod0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      TypeBindings typeBindings0 = basicBeanDescription0.bindingsForBeanType();
      assertEquals(0, typeBindings0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      boolean boolean0 = basicBeanDescription0.removeProperty((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      PropertyName propertyName0 = PropertyName.NO_NAME;
      boolean boolean0 = basicBeanDescription0.hasProperty(propertyName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      Set<String> set0 = basicBeanDescription0.getIgnoredPropertyNames();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      Class<Boolean> class0 = Boolean.TYPE;
      // Undeclared exception!
      try { 
        basicBeanDescription0.resolveType(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      JavaType javaType0 = basicBeanDescription0.resolveType((Type) null);
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      AnnotatedMethod annotatedMethod0 = basicBeanDescription0.findAnySetter();
      assertNull(annotatedMethod0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      Map<Object, AnnotatedMember> map0 = basicBeanDescription0.findInjectables();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      // Undeclared exception!
      try { 
        basicBeanDescription0.findExpectedFormat((JsonFormat.Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      JsonInclude.Value jsonInclude_Value0 = BeanProperty.EMPTY_INCLUDE;
      JsonInclude.Value jsonInclude_Value1 = basicBeanDescription0.findPropertyInclusion(jsonInclude_Value0);
      assertEquals(JsonInclude.Include.USE_DEFAULTS, jsonInclude_Value1.getContentInclusion());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      AnnotatedMember annotatedMember0 = basicBeanDescription0.findAnyGetter();
      assertNull(annotatedMember0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      AnnotatedMember annotatedMember0 = basicBeanDescription0.findAnySetterField();
      assertNull(annotatedMember0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      ObjectReader objectReader0 = objectMapper0.reader();
      Class<Module> class0 = Module.class;
      ObjectReader objectReader1 = objectReader0.forType(class0);
      assertNotSame(objectReader0, objectReader1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonAutoDetect.Visibility jsonAutoDetect_Visibility0 = JsonAutoDetect.Visibility.NONE;
      ObjectReader objectReader0 = objectMapper0.readerForUpdating(jsonAutoDetect_Visibility0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      JsonPOJOBuilder.Value jsonPOJOBuilder_Value0 = basicBeanDescription0.findPOJOBuilderConfig();
      assertNull(jsonPOJOBuilder_Value0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      String string0 = basicBeanDescription0.findClassDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      LinkedHashMap<String, AnnotatedField> linkedHashMap0 = basicBeanDescription0._findPropertyFields(linkedHashSet0, true);
      assertEquals(0, linkedHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      Class<AnnotatedConstructor> class0 = AnnotatedConstructor.class;
      // Undeclared exception!
      try { 
        basicBeanDescription0._createConverter(class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // AnnotationIntrospector returned Class com.fasterxml.jackson.databind.introspect.AnnotatedConstructor; expected Class<Converter>
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      // Undeclared exception!
      try { 
        basicBeanDescription0._createConverter(basicBeanDescription0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // AnnotationIntrospector returned Converter definition of type com.fasterxml.jackson.databind.introspect.BasicBeanDescription; expected type Converter or Class<Converter> instead
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }
}
