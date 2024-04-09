/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 23:04:25 GMT 2024
 */

package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      // Undeclared exception!
      try { 
        brentOptimizer0.doOptimize();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetRelativeAccuracy();
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        brentOptimizer0.optimize((UnivariateRealFunction) null, goalType0, 0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetAbsoluteAccuracy();
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        brentOptimizer0.optimize((UnivariateRealFunction) null, goalType0, (-0.5954927814375433), (-0.5954927814375433), (-0.5954927814375433));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetMaximalIterationCount();
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.univariate.BrentOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-762.904076848751);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, (-762.904076848751));
      assertEquals(61, brentOptimizer0.getEvaluations());
      assertEquals((-1.203999647446027E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-899.2313204);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, (-899.2313204));
      assertEquals(60, brentOptimizer0.getIterationCount());
      assertEquals((-1.597843652009935E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-911.0508017868533);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, (-911.0508017868533), 8.262102492811719, (-911.0508017868533));
      assertEquals(11, brentOptimizer0.getEvaluations());
      assertEquals(1.0658141036401503E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 9.851358506271103E-10, (-1.0));
      assertEquals(30, brentOptimizer0.getEvaluations());
      assertEquals((-0.5000000035384924), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double0 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 3524.42485557, 1068.61078511);
      assertEquals(62, brentOptimizer0.getIterationCount());
      assertEquals(2586.387350704509, double0, 0.01);
  }
}
