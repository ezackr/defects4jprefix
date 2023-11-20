/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 08:23:13 GMT 2023
 */
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.junit.runner.RunWith;

public class CMAESOptimizerTest {

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = (-1484.941258534);
        CMAESOptimizer.Sigma cMAESOptimizer_Sigma0 = new CMAESOptimizer.Sigma(doubleArray0);
        // Undeclared exception!
        try {
            cMAESOptimizer_Sigma0.getSigma();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -1,484.941 is smaller than the minimum (0)
        }
    }
}
