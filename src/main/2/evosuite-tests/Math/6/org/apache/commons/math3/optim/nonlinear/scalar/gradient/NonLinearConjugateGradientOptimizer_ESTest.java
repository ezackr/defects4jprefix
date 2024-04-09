/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 16:52:41 GMT 2024
 */

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NonLinearConjugateGradientOptimizer_ESTest extends NonLinearConjugateGradientOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      double[] doubleArray0 = new double[6];
      nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(1262);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(6.283185307179586);
      nonLinearConjugateGradientOptimizer_BracketingStep0.getBracketingStep();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      SecantSolver secantSolver0 = new SecantSolver();
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null, secantSolver0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(0.0);
      optimizationDataArray0[0] = (OptimizationData) nonLinearConjugateGradientOptimizer_BracketingStep0;
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[0];
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
  }
}
