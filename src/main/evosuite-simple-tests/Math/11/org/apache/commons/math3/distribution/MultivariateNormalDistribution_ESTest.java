/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 18:11:14 GMT 2023
 */
package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MultivariateNormalDistribution_ESTest extends MultivariateNormalDistribution_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2.6197411946856397E-8;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        double double0 = multivariateNormalDistribution0.density(doubleArray0);
        assertArrayEquals(new double[] { 2.6197411946856397E-8 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2.6197411946856397E-8;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        double double0 = multivariateNormalDistribution0.density(doubleArray0);
        assertEquals(6178.325789220325, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2.6197411946856397E-8;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        RealMatrix realMatrix0 = multivariateNormalDistribution0.getCovariances();
        assertEquals(1, realMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[][] doubleArray0 = new double[6][7];
        MultivariateNormalDistribution multivariateNormalDistribution0 = null;
        try {
            multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0[0], doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 6 != 7
            //
            verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[][] doubleArray0 = new double[1][7];
        double[] doubleArray1 = new double[1];
        MultivariateNormalDistribution multivariateNormalDistribution0 = null;
        try {
            multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 7 != 1
            //
            verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = (-2073.87779897508);
        double[][] doubleArray1 = new double[1][9];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = null;
        try {
            multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -2,073.878 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -2,073.878 at index 0
            //
            verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2.6197411946856397E-8;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        double[] doubleArray2 = new double[2];
        try {
            multivariateNormalDistribution0.density(doubleArray2);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 2 != 1
            //
            verifyException("org.apache.commons.math3.distribution.MultivariateNormalDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2.6197411946856397E-8;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        double[] doubleArray2 = multivariateNormalDistribution0.getStandardDeviations();
        assertArrayEquals(new double[] { 1.618561458420915E-4 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 2.6197411946856397E-8;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        double[] doubleArray2 = multivariateNormalDistribution0.sample();
        assertArrayEquals(new double[] { 1.277162837685977E-4 }, doubleArray2, 0.01);
    }
}
