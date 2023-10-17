/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:37:49 GMT 2023
 */
package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.junit.runner.RunWith;

public class LevenbergMarquardtOptimizerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        doubleArray1[0] = (-94.83151985);
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // unable to perform Q.R decomposition on the 1x1 jacobian matrix
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 49;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        double[] doubleArray2 = new double[0];
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // dimensions mismatch 0 != 1
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[2][6];
        double[] doubleArray1 = new double[2];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // maximal number of iterations (1) exceeded
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-1);
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1637.44);
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[2][6];
        double[] doubleArray1 = new double[2];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-3473.304238));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // unable to perform Q.R decomposition on the 2x2 jacobian matrix
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NEGATIVE_INFINITY);
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NEGATIVE_INFINITY);
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // orthogonality tolerance is too small (-\u221E), solution is orthogonal to the jacobian
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setOrthoTolerance((-3473.304238));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-2491.571243063269));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1008.4756371066549));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        assertEquals(2, levenbergMarquardtOptimizer0.getEvaluations());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker((-58.597104784), (-58.597104784));
        levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialValueChecker0);
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NEGATIVE_INFINITY);
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[1][6];
        double[] doubleArray1 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1008.4756371066549));
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-2202.23851991449));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((Object) doubleArray1, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
