/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 11:36:27 GMT 2023
 */

package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.NormalizedRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.UniformRandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HarmonicFitter_ESTest extends HarmonicFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0, 0, 0, 0, 0).when(differentiableMultivariateVectorOptimizer0).getEvaluations();
      int[] intArray0 = new int[7];
      Well1024a well1024a0 = new Well1024a(intArray0);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(1092, well1024a0);
      DifferentiableMultivariateVectorMultiStartOptimizer differentiableMultivariateVectorMultiStartOptimizer0 = new DifferentiableMultivariateVectorMultiStartOptimizer(differentiableMultivariateVectorOptimizer0, 1092, unitSphereRandomVectorGenerator0);
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorMultiStartOptimizer0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      harmonicFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[9];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-649.361113), 3238.74448133, (-1061.55549));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[3] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[4] = weightedObservedPointArray0[2];
      weightedObservedPointArray0[5] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[6] = weightedObservedPointArray0[4];
      weightedObservedPointArray0[7] = weightedObservedPoint0;
      weightedObservedPointArray0[8] = weightedObservedPointArray0[1];
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator((RandomGenerator) null);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, gaussianRandomGenerator0);
      DifferentiableMultivariateVectorMultiStartOptimizer differentiableMultivariateVectorMultiStartOptimizer0 = new DifferentiableMultivariateVectorMultiStartOptimizer(differentiableMultivariateVectorOptimizer0, 2145948725, uncorrelatedRandomVectorGenerator0);
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorMultiStartOptimizer0);
      // Undeclared exception!
      harmonicFitter0.fit(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[9];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-649.361113), 3238.74448133, 3238.74448133);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPointArray0[3];
      weightedObservedPointArray0[5] = weightedObservedPointArray0[4];
      weightedObservedPointArray0[6] = weightedObservedPointArray0[0];
      weightedObservedPointArray0[7] = weightedObservedPointArray0[5];
      weightedObservedPointArray0[8] = weightedObservedPoint0;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter((DifferentiableMultivariateVectorOptimizer) null);
      // Undeclared exception!
      try { 
        harmonicFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0, 0, 0, 0).when(differentiableMultivariateVectorOptimizer0).getEvaluations();
      Well44497b well44497b0 = new Well44497b(0L);
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-582), well44497b0);
      DifferentiableMultivariateVectorMultiStartOptimizer differentiableMultivariateVectorMultiStartOptimizer0 = new DifferentiableMultivariateVectorMultiStartOptimizer(differentiableMultivariateVectorOptimizer0, 4, unitSphereRandomVectorGenerator0);
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorMultiStartOptimizer0);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        harmonicFitter0.fit(doubleArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UnitSphereRandomVectorGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[0];
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = null;
      try {
        harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1444.79391271338), (-1444.79391271338), 1.671311907037975E-113);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-2728.740333462732), 1344.23492297, 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(3361.4, 1.671311907037975E-113, (-2696.689));
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(3497.562523632, 3497.562523632, (-938.498));
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {1348.3445, 0.0012712934382825857, 2.9840980270071293}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1444.79391271338), (-1444.79391271338), (-2194.79828177));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-2719.1211106240107), 1344.23492297, 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(3361.4, (-2194.79828177), (-2696.689));
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(3497.562523632, 2.220446049250313E-16, (-938.498));
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {1097.399140885, 0.001775395975026233, (-0.9128810385485969)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1444.79391271338), (-1444.79391271338), (-2194.79828177));
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(3361.4, (-2194.79828177), (-2696.689));
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[3];
      Well19937a well19937a0 = new Well19937a(intArray0);
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(well19937a0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(840, uniformRandomGenerator0);
      DifferentiableMultivariateVectorMultiStartOptimizer differentiableMultivariateVectorMultiStartOptimizer0 = new DifferentiableMultivariateVectorMultiStartOptimizer(differentiableMultivariateVectorOptimizer0, 840, uncorrelatedRandomVectorGenerator0);
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorMultiStartOptimizer0);
      // Undeclared exception!
      try { 
        harmonicFitter0.fit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = mock(DifferentiableMultivariateVectorOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn((PointVectorValuePair) null).when(differentiableMultivariateVectorOptimizer0).optimize(anyInt() , any(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(0, 0).when(differentiableMultivariateVectorOptimizer0).getEvaluations();
      double[] doubleArray0 = new double[5];
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, (NormalizedRandomGenerator) null);
      DifferentiableMultivariateVectorMultiStartOptimizer differentiableMultivariateVectorMultiStartOptimizer0 = new DifferentiableMultivariateVectorMultiStartOptimizer(differentiableMultivariateVectorOptimizer0, 2, uncorrelatedRandomVectorGenerator0);
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorMultiStartOptimizer0);
      // Undeclared exception!
      try { 
        harmonicFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator", e);
      }
  }
}
