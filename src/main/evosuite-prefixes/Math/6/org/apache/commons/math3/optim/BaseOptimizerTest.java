/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:51:59 GMT 2023
 */
package org.apache.commons.math3.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.junit.runner.RunWith;

public class BaseOptimizerTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SimplexSolver simplexSolver0 = new SimplexSolver(4.903687986212687E-49, 22, 22);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
        double[] doubleArray0 = new double[0];
        InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
        optimizationDataArray0[3] = (OptimizationData) initialGuess0;
        SimpleBounds simpleBounds0 = SimpleBounds.unbounded(3965);
        optimizationDataArray0[7] = (OptimizationData) simpleBounds0;
        simplexSolver0.optimize(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimplexSolver simplexSolver0 = new SimplexSolver(1223.833820786675, (-633066204));
        OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
        simplexSolver0.optimize(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SimplexSolver simplexSolver0 = new SimplexSolver(18.43408335013158);
        ConvergenceChecker<PointValuePair> convergenceChecker0 = simplexSolver0.getConvergenceChecker();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2330.5611073367345, 2330.5611073367345);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[23];
        MaxIter maxIter0 = MaxIter.unlimited();
        optimizationDataArray0[16] = (OptimizationData) maxIter0;
        brentOptimizer0.optimize(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2330.5611073367345, 2330.5611073367345);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[23];
        MaxEval maxEval0 = MaxEval.unlimited();
        optimizationDataArray0[7] = (OptimizationData) maxEval0;
        brentOptimizer0.optimize(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2776.7344283859998, 2776.7344283859998);
        int int0 = brentOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2776.7344283859998, 2776.7344283859998);
        int int0 = brentOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2776.7344283859998, 2776.7344283859998);
        int int0 = brentOptimizer0.getEvaluations();
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2776.7344283859998, 2776.7344283859998);
        int int0 = brentOptimizer0.getIterations();
    }
}
