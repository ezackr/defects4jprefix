/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 09:07:13 GMT 2023
 */
package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class GaussNewtonOptimizer_ESTest extends GaussNewtonOptimizer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer((ConvergenceChecker<PointVectorValuePair>) null);
        gaussNewtonOptimizer0.doOptimize();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleVectorValueChecker simpleVectorValueChecker0 = new SimpleVectorValueChecker(1378.515258208318, 1378.515258208318);
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(simpleVectorValueChecker0);
        gaussNewtonOptimizer0.doOptimize();
    }
}
