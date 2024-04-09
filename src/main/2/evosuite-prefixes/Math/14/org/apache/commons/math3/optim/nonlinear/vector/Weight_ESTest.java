/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 17:53:01 GMT 2024
 */
package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Weight_ESTest extends Weight_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[3];
        Weight weight0 = new Weight(doubleArray0);
        RealMatrix realMatrix0 = weight0.getWeight();
        realMatrix0.getColumnDimension();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(3318, 3318);
        Weight weight0 = new Weight(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(31, 2300);
        Weight weight0 = null;
        weight0 = new Weight(array2DRowRealMatrix0);
    }
}
