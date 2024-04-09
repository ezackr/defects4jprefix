/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 00:24:12 GMT 2024
 */

package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FieldProperty_ESTest extends FieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldProperty fieldProperty0 = null;
      try {
        fieldProperty0 = new FieldProperty((FieldProperty) null, (PropertyName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsonDeserializer<BasicBeanDescription> jsonDeserializer0 = (JsonDeserializer<BasicBeanDescription>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      FieldProperty fieldProperty0 = null;
      try {
        fieldProperty0 = new FieldProperty((FieldProperty) null, jsonDeserializer0, jsonDeserializer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", e);
      }
  }
}
