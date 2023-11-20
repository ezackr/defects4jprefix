/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 09:25:08 GMT 2023
 */
package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.junit.runner.RunWith;

public class WeightTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[3];
        Weight weight0 = new Weight(doubleArray0);
        RealMatrix realMatrix0 = weight0.getWeight();
        realMatrix0.getColumnDimension();
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(31, 2300);
        Weight weight0 = null;
        weight0 = new Weight(array2DRowRealMatrix0);
    }
}
