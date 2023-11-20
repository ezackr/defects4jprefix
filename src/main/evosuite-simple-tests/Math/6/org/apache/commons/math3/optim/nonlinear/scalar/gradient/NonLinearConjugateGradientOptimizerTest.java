/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 08:06:11 GMT 2023
 */
package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.junit.runner.RunWith;

public class NonLinearConjugateGradientOptimizerTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
        // Undeclared exception!
        try {
            nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
        SecantSolver secantSolver0 = new SecantSolver();
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null, secantSolver0);
        assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray0, doubleArray0);
        assertNotSame(doubleArray0, doubleArray1);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
        NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(0.0);
        optimizationDataArray0[0] = (OptimizationData) nonLinearConjugateGradientOptimizer_BracketingStep0;
        nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
        assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE;
        NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) null);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
        SimpleBounds simpleBounds0 = SimpleBounds.unbounded(1262);
        optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
        // Undeclared exception!
        try {
            nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
            fail("Expecting exception: MathUnsupportedOperationException");
        } catch (MathUnsupportedOperationException e) {
            //
            // constraint
        }
    }
}
