/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 08:51:17 GMT 2023
 */
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SimplexOptimizer_ESTest extends SimplexOptimizer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(1426.485128383, 1426.485128383);
        simplexOptimizer0.doOptimize();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(1156.961, 1156.961);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(0.0, 0.0);
        simplexOptimizer0.optimize((OptimizationData[]) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((-1.1689405319304267), (-1.1689405319304267));
        OptimizationData[] optimizationDataArray0 = new OptimizationData[0];
        simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(8);
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(8, 8);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
        optimizationDataArray0[4] = (OptimizationData) multiDirectionalSimplex0;
        simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(90.4603367921, 90.4603367921);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
        simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(8);
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(8, 8);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
        optimizationDataArray0[0] = (OptimizationData) multiDirectionalSimplex0;
        simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
        simplexOptimizer0.doOptimize();
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(1426.485128383, 1426.485128383);
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1426.485128383;
        doubleArray0[1] = 1426.485128383;
        MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, 1426.485128383, 1426.485128383);
        InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[5];
        optimizationDataArray0[1] = (OptimizationData) initialGuess0;
        optimizationDataArray0[3] = (OptimizationData) multiDirectionalSimplex0;
        simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
        simplexOptimizer0.doOptimize();
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(13, 13);
        OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
        SimpleBounds simpleBounds0 = SimpleBounds.unbounded(13);
        optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
        MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(13);
        optimizationDataArray0[1] = (OptimizationData) multiDirectionalSimplex0;
        simplexOptimizer0.parseOptimizationData(optimizationDataArray0);
        simplexOptimizer0.doOptimize();
    }
}
