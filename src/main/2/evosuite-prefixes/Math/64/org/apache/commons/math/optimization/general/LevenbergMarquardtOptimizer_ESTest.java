/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 22:58:22 GMT 2024
 */
package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class LevenbergMarquardtOptimizer_ESTest extends LevenbergMarquardtOptimizer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }
}
