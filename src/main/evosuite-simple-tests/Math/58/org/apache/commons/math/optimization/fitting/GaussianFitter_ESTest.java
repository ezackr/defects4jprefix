/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:11:15 GMT 2023
 */
package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.fitting.GaussianFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.random.GaussianRandomGenerator;
import org.apache.commons.math.random.NormalizedRandomGenerator;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math.random.Well19937a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class GaussianFitter_ESTest extends GaussianFitter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(Double.NaN, Double.NaN, 6219.551779279577);
        weightedObservedPointArray0[1] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(2122.353873, 2615.68, Double.NaN);
        weightedObservedPointArray0[4] = weightedObservedPoint1;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        // Undeclared exception!
        try {
            gaussianFitter_ParameterGuesser0.guess();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 6219.551779279577, 3673.022243370193);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-642.02215), Double.NaN, (-1211.45605795413));
        weightedObservedPointArray0[7] = weightedObservedPoint1;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        // Undeclared exception!
        try {
            gaussianFitter_ParameterGuesser0.guess();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 6219.551779279577, 3673.022243370193);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(Double.NaN, 0.0, 6219.551779279577);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        weightedObservedPointArray0[2] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.0, 4675.2, 2615.68);
        weightedObservedPointArray0[3] = weightedObservedPoint2;
        weightedObservedPointArray0[4] = weightedObservedPointArray0[2];
        weightedObservedPointArray0[5] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-1.0), 0.0, Double.NEGATIVE_INFINITY);
        weightedObservedPointArray0[6] = weightedObservedPoint3;
        weightedObservedPointArray0[7] = weightedObservedPointArray0[3];
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        assertArrayEquals(new double[] { 6219.551779279577, 0.0, Double.NaN }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1639.0, 0.0, 1639.0);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 0.0, 0.0);
        weightedObservedPointArray0[2] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.0, 0.0, 2019.60840652518);
        weightedObservedPointArray0[3] = weightedObservedPoint2;
        weightedObservedPointArray0[4] = weightedObservedPoint1;
        weightedObservedPointArray0[5] = weightedObservedPoint1;
        weightedObservedPointArray0[6] = weightedObservedPointArray0[0];
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        assertArrayEquals(new double[] { 2019.60840652518, 0.0, 0.0 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(4672.80624, 4672.80624, 4672.80624);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1348.23866, (-1.0), 1348.23866);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(1348.23866, 4672.80624, 4672.80624);
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        assertArrayEquals(new double[] { 4672.80624, 4672.80624, 0.0 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(2.2250738585072014E-306, (-1097.00506), 2.2250738585072014E-306);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(5129.0, 958.3823, 5129.0);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-1097.00506), 5129.0, 2.2250738585072014E-306);
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        weightedObservedPointArray0[3] = weightedObservedPoint0;
        weightedObservedPointArray0[4] = weightedObservedPoint0;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        assertArrayEquals(new double[] { 5129.0, 958.3823, 1074.9528923619391 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair((double[]) null, (double[]) null);
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
        assertNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        double[] doubleArray0 = new double[8];
        VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0);
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        double[] doubleArray1 = gaussianFitter0.fit(doubleArray0);
        assertFalse(doubleArray1.equals((Object) doubleArray0));
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        double[] doubleArray0 = new double[0];
        VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, true);
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        double[] doubleArray1 = new double[4];
        double[] doubleArray2 = gaussianFitter0.fit(doubleArray1);
        assertFalse(doubleArray2.equals((Object) doubleArray1));
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair((double[]) null, (double[]) null);
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter0.addObservedPoint((-478.108979269264), (-478.108979269264), (-478.108979269264));
        gaussianFitter0.addObservedPoint((-98.745), (-98.745));
        gaussianFitter0.addObservedPoint((-3070.816268443537), 4672.918271080159);
        double[] doubleArray0 = gaussianFitter0.fit();
        assertNull(doubleArray0);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn((VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        doReturn(0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
        UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-925));
        MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 57, unitSphereRandomVectorGenerator0);
        GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
        // Undeclared exception!
        try {
            gaussianFitter0.fit((double[]) null);
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.random.UnitSphereRandomVectorGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        double[] doubleArray0 = new double[5];
        VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0);
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn((VectorialPointValuePair) null, (VectorialPointValuePair) null, (VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        doReturn(0, 0, 0).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
        UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(3);
        MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 3, unitSphereRandomVectorGenerator0);
        GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
        // Undeclared exception!
        try {
            gaussianFitter0.fit(doubleArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
        gaussianFitter0.addObservedPoint(0.0, 0.0, 2540.861439);
        gaussianFitter0.addObservedPoint(849.066329945, 849.066329945, 849.066329945);
        gaussianFitter0.addObservedPoint(792.3072330933961, 792.3072330933961, 175.9);
        // Undeclared exception!
        try {
            gaussianFitter0.fit();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.optimization.fitting.CurveFitter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[1];
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
        try {
            gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 is smaller than the minimum (3)
            //
            verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 2019.60840652518, 0.0);
        weightedObservedPointArray0[1] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(3029.018434296812, 2019.60840652518, 0.0);
        weightedObservedPointArray0[4] = weightedObservedPoint1;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        // Undeclared exception!
        try {
            gaussianFitter_ParameterGuesser0.guess();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1639.0, 0.0, 1639.0);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        weightedObservedPointArray0[1] = weightedObservedPointArray0[0];
        weightedObservedPointArray0[2] = weightedObservedPointArray0[0];
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 2042.17, 2019.60840652518);
        weightedObservedPointArray0[3] = weightedObservedPoint1;
        weightedObservedPointArray0[4] = weightedObservedPointArray0[1];
        weightedObservedPointArray0[5] = weightedObservedPoint0;
        weightedObservedPointArray0[6] = weightedObservedPointArray0[5];
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        assertArrayEquals(new double[] { 2019.60840652518, 2042.17, 867.229750447092 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(4672.80624, 4672.80624, 4672.80624);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        weightedObservedPointArray0[1] = weightedObservedPoint0;
        weightedObservedPointArray0[2] = weightedObservedPoint0;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        gaussianFitter_ParameterGuesser0.guess();
        double[] doubleArray0 = gaussianFitter_ParameterGuesser0.guess();
        assertArrayEquals(new double[] { 4672.80624, 4672.80624, 0.0 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = null;
        try {
            gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser((WeightedObservedPoint[]) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // null is not allowed: input array
            //
            verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn((VectorialPointValuePair) null).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt(), any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class), any(double[].class), any(double[].class), any(double[].class));
        GaussianFitter gaussianFitter0 = new GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        double[] doubleArray0 = new double[0];
        // Undeclared exception!
        try {
            gaussianFitter0.fit(doubleArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.optimization.fitting.CurveFitter", e);
        }
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(12, (NormalizedRandomGenerator) null);
        MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 12, uncorrelatedRandomVectorGenerator0);
        GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
        // Undeclared exception!
        try {
            gaussianFitter0.fit();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 is smaller than the minimum (3)
            //
            verifyException("org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser", e);
        }
    }
}
