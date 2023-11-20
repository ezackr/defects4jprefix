/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:19:15 GMT 2023
 */

package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.concurrent.atomic.AtomicReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AtomicReferenceDeserializer_ESTest extends AtomicReferenceDeserializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaType0, javaType0);
      ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(referenceType0, typeFactory0);
      AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(referenceType0, classNameIdResolver0, "6;F~A~MgYO", true, javaType0);
      JsonDeserializer<Integer> jsonDeserializer0 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer(referenceType0, valueInstantiator_Base0, asExternalTypeDeserializer0, jsonDeserializer0);
      AtomicReferenceDeserializer atomicReferenceDeserializer1 = atomicReferenceDeserializer0.withResolved(asExternalTypeDeserializer0, (JsonDeserializer<?>) null);
      assertFalse(atomicReferenceDeserializer1.isCachable());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaType0, javaType0);
      ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(referenceType0, typeFactory0);
      AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(referenceType0, classNameIdResolver0, "6;F~A~MgYO", true, javaType0);
      JsonDeserializer<Integer> jsonDeserializer0 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer(referenceType0, valueInstantiator_Base0, asExternalTypeDeserializer0, jsonDeserializer0);
      Boolean boolean0 = atomicReferenceDeserializer0.supportsUpdate((DeserializationConfig) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaType0, javaType0);
      ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(referenceType0, typeFactory0);
      AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(referenceType0, classNameIdResolver0, "6;F~A~MgYO", true, javaType0);
      JsonDeserializer<Integer> jsonDeserializer0 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer(referenceType0, valueInstantiator_Base0, asExternalTypeDeserializer0, jsonDeserializer0);
      AtomicReference<Object> atomicReference0 = new AtomicReference<Object>();
      Object object0 = atomicReferenceDeserializer0.getReferenced(atomicReference0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      JavaType javaType0 = typeFactory0.constructReferenceType(class0, simpleType0);
      ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      JavaType[] javaTypeArray0 = new JavaType[2];
      javaTypeArray0[1] = (JavaType) simpleType0;
      CollectionType collectionType0 = CollectionType.construct((Class<?>) class0, typeBindings0, (JavaType) simpleType0, javaTypeArray0, javaTypeArray0[1]);
      JsonDeserializer<Object> jsonDeserializer0 = beanDeserializerFactory0.createBeanDeserializer(defaultDeserializationContext_Impl0, collectionType0, (BeanDescription) null);
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer(javaType0, valueInstantiator_Base0, (TypeDeserializer) null, jsonDeserializer0);
      Object object0 = atomicReferenceDeserializer0.getEmptyValue((DeserializationContext) defaultDeserializationContext_Impl0);
      assertEquals("null", object0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavaType javaType0 = TypeFactory.unknownType();
      ReferenceType referenceType0 = ReferenceType.upgradeFrom(javaType0, javaType0);
      ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(referenceType0, typeFactory0);
      AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer(referenceType0, classNameIdResolver0, "6;F~A~MgYO", true, javaType0);
      JsonDeserializer<Integer> jsonDeserializer0 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer(referenceType0, valueInstantiator_Base0, asExternalTypeDeserializer0, jsonDeserializer0);
      AtomicReference<Object> atomicReference0 = new AtomicReference<Object>();
      AtomicReference<Object> atomicReference1 = atomicReferenceDeserializer0.updateReference(atomicReference0, (Object) valueInstantiator_Base0);
      assertSame(atomicReference1, atomicReference0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JsonDeserializer<String> jsonDeserializer0 = (JsonDeserializer<String>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer((JavaType) null, (ValueInstantiator) null, (TypeDeserializer) null, jsonDeserializer0);
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      AtomicReference<Object> atomicReference0 = atomicReferenceDeserializer0.getNullValue((DeserializationContext) defaultDeserializationContext_Impl0);
      assertEquals("null", atomicReference0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JsonDeserializer<String> jsonDeserializer0 = (JsonDeserializer<String>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class) , any(com.fasterxml.jackson.databind.DeserializationContext.class));
      AtomicReferenceDeserializer atomicReferenceDeserializer0 = new AtomicReferenceDeserializer((JavaType) null, (ValueInstantiator) null, (TypeDeserializer) null, jsonDeserializer0);
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonParser jsonParser0 = jsonFactory0.createParser((byte[]) null, 0, (-32768));
      Object object0 = atomicReferenceDeserializer0.deserializeWithType(jsonParser0, defaultDeserializationContext_Impl0, (TypeDeserializer) null);
      assertEquals("null", object0.toString());
  }
}
