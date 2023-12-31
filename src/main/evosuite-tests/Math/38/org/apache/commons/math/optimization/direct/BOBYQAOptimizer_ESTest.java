/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 14:34:09 GMT 2023
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(34);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 34, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      bOBYQAOptimizer0.optimize(34, microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      bOBYQAOptimizer0.doOptimize();
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.computeObjectiveValue(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 2
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(317);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 317, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(942, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray0);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator1 = new UnitSphereRandomVectorGenerator(bOBYQAOptimizer0.MINIMUM_PROBLEM_DIMENSION);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction1 = null;
      try {
        microsphereInterpolatingFunction1 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, int0, bOBYQAOptimizer0.MINIMUM_PROBLEM_DIMENSION, unitSphereRandomVectorGenerator1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(35);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 35, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(35, microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      bOBYQAOptimizer0.computeObjectiveValue(doubleArray0);
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 2
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(0, microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      bOBYQAOptimizer0.doOptimize();
      long long0 = 0L;
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(150);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 150, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(150, microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      bOBYQAOptimizer0.computeObjectiveValue(doubleArray0);
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (150)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-640));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(524);
      bOBYQAOptimizer0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = (-1645.832532305);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(877, 877, (-1645.832532305));
      bOBYQAOptimizer0.doOptimize();
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.getEvaluations();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 0;
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(0, microsphereInterpolatingFunction0, goalType0, doubleArray0);
      bOBYQAOptimizer0.computeObjectiveValue(doubleArray0);
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 0, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(0, microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      bOBYQAOptimizer0.computeObjectiveValue(doubleArray0);
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (0)
         //
         verifyException("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(34);
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[1][7];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(2);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, 34, 650, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.optimize(34, microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      bOBYQAOptimizer0.computeObjectiveValue(doubleArray0);
      // Undeclared exception!
      try { 
        bOBYQAOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 2
         //
         verifyException("org.apache.commons.math.linear.ArrayRealVector", e);
      }
  }
}
