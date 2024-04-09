/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 23:09:21 GMT 2024
 */

package org.apache.commons.math.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.UnivariateRealOptimizer;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiStartUnivariateRealOptimizer_ESTest extends MultiStartUnivariateRealOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 11, jDKRandomGenerator0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.setRelativeAccuracy(2185.6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1088));
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 2470, mersenneTwister0);
      int int0 = multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getRelativeAccuracy();
      MersenneTwister mersenneTwister0 = new MersenneTwister(2073);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 2073, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 0, mersenneTwister0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getAbsoluteAccuracy();
      MersenneTwister mersenneTwister0 = new MersenneTwister(0L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-3430), mersenneTwister0);
      multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 1342, jDKRandomGenerator0);
      int int0 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateRealOptimizer0).getResult();
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-699), jDKRandomGenerator0);
      multiStartUnivariateRealOptimizer0.getResult();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(722L);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 2028, mersenneTwister0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) null);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 3032, randomAdaptor0);
      int int0 = multiStartUnivariateRealOptimizer0.getIterationCount();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1));
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 1, mersenneTwister0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, (double) 1984, (-1.0), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1088));
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 2470, mersenneTwister0);
      multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, (-1080), jDKRandomGenerator0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(jDKRandomGenerator0);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 243, randomAdaptor0);
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.getFunctionValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1088));
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 2470, mersenneTwister0);
      int int0 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaximalIterationCount());
      assertEquals(Integer.MAX_VALUE, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(80, 80, 80, 72, 51).when(univariateRealOptimizer0).getIterationCount();
      doReturn(76, (-664), 51, (-664), 76).when(univariateRealOptimizer0).getEvaluations();
      doReturn((double)51, (-1688.9910437744), (double)80, (-1.0), (-2.0)).when(univariateRealOptimizer0).getFunctionValue();
      doReturn((-2175.04964), (-2.0), (-2.0), 2900.7, (-1.0)).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      double[] doubleArray0 = new double[3];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1990, jDKRandomGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunctionLagrangeForm0, goalType0, (-1743.636239440636), (-1743.636239440636));
      multiStartUnivariateRealOptimizer0.getOptima();
      assertEquals((-2.0), multiStartUnivariateRealOptimizer0.getFunctionValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(jDKRandomGenerator0);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1990, randomAdaptor0);
      try { 
        multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(1737, 1737, 1737, 1737, 1737).when(univariateRealOptimizer0).getIterationCount();
      doReturn(1737, 1984, 1, 1737, 1984).when(univariateRealOptimizer0).getEvaluations();
      doReturn((-1871.875), 553.852565922, (-1871.875), (double)1, (-1871.875)).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(1.0, (double)1, 553.852565922, 131.0, (double)1737).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      double[] doubleArray0 = new double[8];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1737, jDKRandomGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunctionLagrangeForm0, goalType0, (double) (-2193), 1.0);
      multiStartUnivariateRealOptimizer0.getOptimaValues();
      assertEquals(3443731, multiStartUnivariateRealOptimizer0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-699), jDKRandomGenerator0);
      try { 
        multiStartUnivariateRealOptimizer0.getOptimaValues();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(627, 627, (-1000), 627, (-1000)).when(univariateRealOptimizer0).getIterationCount();
      doReturn((-1000), 19650218, 19650218, 16, 16).when(univariateRealOptimizer0).getEvaluations();
      doReturn((double)16, Double.NaN, Double.NaN, (double)627, (double)16).when(univariateRealOptimizer0).getFunctionValue();
      doReturn((double)19650218, (-1145.5183768670233), (-1145.5183768670233), Double.NaN, 0.5).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      double[] doubleArray0 = new double[6];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1990, jDKRandomGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunctionLagrangeForm0, goalType0, 2.0, (-2767.536809));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(1737, 1737, 1737, 1737, 1737).when(univariateRealOptimizer0).getIterationCount();
      doReturn(1737, 1984, 1, 1737, 1984).when(univariateRealOptimizer0).getEvaluations();
      doReturn((-1871.875), 553.852565922, (-1871.875), (double)1, (-1871.875)).when(univariateRealOptimizer0).getFunctionValue();
      doReturn(1.0, (double)1, 553.852565922, 131.0, (double)1737).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class) , any(org.apache.commons.math.optimization.GoalType.class) , anyDouble() , anyDouble());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      double[] doubleArray0 = new double[8];
      MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1737, jDKRandomGenerator0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, 0.0);
  }
}
