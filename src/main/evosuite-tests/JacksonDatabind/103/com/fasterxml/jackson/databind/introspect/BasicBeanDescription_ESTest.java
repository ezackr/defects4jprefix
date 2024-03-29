/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 28 08:33:13 GMT 2024
 */

package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.reflect.Type;
import java.time.chrono.HijrahEra;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasicBeanDescription_ESTest extends BasicBeanDescription_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      AnnotatedMethod annotatedMethod0 = basicBeanDescription0.findMethod("cpul-,B", (Class<?>[]) null);
      assertNull(annotatedMethod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      TypeBindings typeBindings0 = basicBeanDescription0.bindingsForBeanType();
      assertEquals(0, typeBindings0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      boolean boolean0 = basicBeanDescription0.removeProperty("com.fasterxml.jackson.annotation.SimpleObjectIdResolver");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      PropertyName propertyName0 = PropertyName.NO_NAME;
      boolean boolean0 = basicBeanDescription0.hasProperty(propertyName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      BeanPropertyDefinition beanPropertyDefinition0 = basicBeanDescription0.findProperty((PropertyName) null);
      assertNull(beanPropertyDefinition0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      AnnotatedMethod annotatedMethod0 = basicBeanDescription0.findJsonValueMethod();
      assertNull(annotatedMethod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      Set<String> set0 = basicBeanDescription0.getIgnoredPropertyNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      Class<Float> class0 = Float.TYPE;
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
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      JavaType javaType0 = basicBeanDescription0.resolveType((Type) null);
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      AnnotatedMember annotatedMember0 = basicBeanDescription0.findAnySetterAccessor();
      assertNull(annotatedMember0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      Map<Object, AnnotatedMember> map0 = basicBeanDescription0.findInjectables();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      Object object0 = basicBeanDescription0.instantiateBean(false);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      JsonFormat.Value jsonFormat_Value0 = new JsonFormat.Value();
      // Undeclared exception!
      try { 
        basicBeanDescription0.findExpectedFormat(jsonFormat_Value0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      ObjectMapper objectMapper0 = new ObjectMapper();
      ObjectMapper objectMapper1 = objectMapper0.setAnnotationIntrospectors(annotationIntrospector0, annotationIntrospector0);
      Class<SimpleObjectIdResolver> class0 = SimpleObjectIdResolver.class;
      ObjectReader objectReader0 = objectMapper1.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      // Undeclared exception!
      try { 
        basicBeanDescription0.findDefaultViews();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      MapperFeature[] mapperFeatureArray0 = new MapperFeature[2];
      MapperFeature mapperFeature0 = MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS;
      mapperFeatureArray0[0] = mapperFeature0;
      MapperFeature mapperFeature1 = MapperFeature.DEFAULT_VIEW_INCLUSION;
      mapperFeatureArray0[1] = mapperFeature1;
      ObjectMapper objectMapper1 = objectMapper0.disable(mapperFeatureArray0);
      Class<POJOPropertyBuilder> class0 = POJOPropertyBuilder.class;
      boolean boolean0 = objectMapper1.canSerialize(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      JsonInclude.Value jsonInclude_Value0 = BeanProperty.EMPTY_INCLUDE;
      JsonInclude.Value jsonInclude_Value1 = basicBeanDescription0.findPropertyInclusion(jsonInclude_Value0);
      assertSame(jsonInclude_Value1, jsonInclude_Value0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      AnnotatedMember annotatedMember0 = basicBeanDescription0.findAnyGetter();
      assertNull(annotatedMember0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      Map<String, AnnotatedMember> map0 = basicBeanDescription0.findBackReferenceProperties();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<HijrahEra> class0 = HijrahEra.class;
      ObjectReader objectReader0 = objectMapper0.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonAutoDetect.Visibility jsonAutoDetect_Visibility0 = JsonAutoDetect.Visibility.ANY;
      JsonAutoDetect.Value jsonAutoDetect_Value0 = JsonAutoDetect.Value.construct(jsonAutoDetect_Visibility0, jsonAutoDetect_Visibility0, jsonAutoDetect_Visibility0, jsonAutoDetect_Visibility0, jsonAutoDetect_Visibility0);
      objectMapper0.setDefaultVisibility(jsonAutoDetect_Value0);
      Class<BasicBeanDescription> class0 = BasicBeanDescription.class;
      ObjectReader objectReader0 = objectMapper0.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      JsonPOJOBuilder.Value jsonPOJOBuilder_Value0 = basicBeanDescription0.findPOJOBuilderConfig();
      assertNull(jsonPOJOBuilder_Value0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
      String string0 = basicBeanDescription0.findClassDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      LinkedHashMap<String, AnnotatedField> linkedHashMap0 = basicBeanDescription0._findPropertyFields(priorityQueue0, false);
      assertEquals(0, linkedHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      ArrayList<BeanPropertyDefinition> arrayList0 = new ArrayList<BeanPropertyDefinition>();
      basicBeanDescription0._properties = (List<BeanPropertyDefinition>) arrayList0;
      arrayList0.add((BeanPropertyDefinition) null);
      Vector<String> vector0 = new Vector<String>();
      // Undeclared exception!
      try { 
        basicBeanDescription0._findPropertyFields(vector0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        basicBeanDescription0._createConverter(class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // AnnotationIntrospector returned Class int; expected Class<Converter>
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      // Undeclared exception!
      try { 
        basicBeanDescription0._createConverter(priorityQueue0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // AnnotationIntrospector returned Converter definition of type java.util.PriorityQueue; expected type Converter or Class<Converter> instead
         //
         verifyException("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", e);
      }
  }
}
