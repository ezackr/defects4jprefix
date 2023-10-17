/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 19:39:04 GMT 2023
 */

package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.lang.annotation.Annotation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationMap_ESTest extends AnnotationMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      AnnotationMap annotationMap1 = AnnotationMap.merge((AnnotationMap) null, annotationMap0);
      assertSame(annotationMap0, annotationMap1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      String string0 = annotationMap0.toString();
      assertEquals("[null]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      // Undeclared exception!
      try { 
        annotationMap0.addIfNotPresent((Annotation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.AnnotationMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      int int0 = annotationMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      AnnotationMap annotationMap1 = AnnotationMap.merge(annotationMap0, (AnnotationMap) null);
      assertNull(annotationMap1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      Iterable<Annotation> iterable0 = annotationMap0.annotations();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      Class<Annotation> class0 = Annotation.class;
      Annotation annotation0 = annotationMap0.get(class0);
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AnnotationMap annotationMap0 = new AnnotationMap();
      // Undeclared exception!
      try { 
        annotationMap0.add((Annotation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.introspect.AnnotationMap", e);
      }
  }
}
