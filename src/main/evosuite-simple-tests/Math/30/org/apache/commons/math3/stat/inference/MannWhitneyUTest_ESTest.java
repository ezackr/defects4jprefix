/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 12:38:51 GMT 2023
 */
package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.inference.MannWhitneyUTest;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class MannWhitneyUTest_ESTest extends MannWhitneyUTest_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
        TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
        double[] doubleArray0 = new double[12];
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        double[] doubleArray1 = new double[0];
        try {
            mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no data
            //
            verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
        mannWhitneyUTest0.mannWhitneyU((double[]) null, (double[]) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        double[] doubleArray0 = new double[2];
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, (double[]) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
        double[] doubleArray0 = new double[0];
        try {
            mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no data
            //
            verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
        TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
        TiesStrategy tiesStrategy0 = TiesStrategy.AVERAGE;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
        double[] doubleArray0 = new double[0];
        try {
            mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no data
            //
            verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.MINIMAL;
        TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = Double.NaN;
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
        double[] doubleArray0 = new double[1];
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        double[] doubleArray1 = new double[3];
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray1);
        doubleArray1[0] = Double.NaN;
        doubleArray1[1] = Double.NaN;
        doubleArray1[2] = Double.NaN;
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray1);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        doubleArray0[0] = Double.NaN;
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray1);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU((double[]) null, doubleArray1);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        try {
            mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // null is not allowed
            //
            verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 0.0;
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
        TiesStrategy tiesStrategy0 = TiesStrategy.MAXIMUM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = (-2031.392814);
        doubleArray0[1] = 215.098246;
        doubleArray0[2] = 0.0;
        doubleArray0[3] = 66.7604712;
        doubleArray0[4] = (-49.803165123);
        doubleArray0[5] = 0.0;
        doubleArray0[6] = 0.0;
        doubleArray0[7] = 12.0;
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        double[] doubleArray1 = new double[4];
        mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray1);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, doubleArray1);
        double double0 = Double.POSITIVE_INFINITY;
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray1, (double[]) null);
        doubleArray1[0] = double0;
        double double1 = (-6266.0);
        doubleArray1[1] = double1;
        double double2 = (-4279.3534738841);
        doubleArray1[2] = double2;
        double double3 = 1.0;
        doubleArray1[3] = double3;
        mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray1);
        try {
            mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // null is not allowed
            //
            verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
        TiesStrategy tiesStrategy0 = TiesStrategy.RANDOM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 0.0;
        doubleArray0[1] = 2093.946;
        doubleArray0[2] = 3891.778;
        double double0 = 1144.9324598;
        double[] doubleArray1 = new double[0];
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray1);
        doubleArray0[3] = double0;
        double double1 = (-1.0);
        doubleArray0[4] = double1;
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest((NaNStrategy) null, tiesStrategy0);
        double[] doubleArray0 = new double[2];
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        // Undeclared exception!
        try {
            mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.stat.ranking.NaturalRanking", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        NaNStrategy naNStrategy0 = NaNStrategy.MAXIMAL;
        TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
        double[] doubleArray0 = new double[20];
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        doubleArray0[12] = 2.0;
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray0);
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 552.0;
        doubleArray1[1] = 552.0;
        mannWhitneyUTest0.mannWhitneyU(doubleArray1, doubleArray0);
        doubleArray0[1] = 0.0;
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        double[] doubleArray2 = new double[0];
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray1);
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray2);
        double[] doubleArray3 = new double[1];
        double[] doubleArray4 = null;
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        TiesStrategy tiesStrategy0 = TiesStrategy.MINIMUM;
        MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest((NaNStrategy) null, tiesStrategy0);
        double[] doubleArray0 = new double[1];
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        double[] doubleArray1 = new double[1];
        // Undeclared exception!
        try {
            mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
