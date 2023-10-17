/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:39:11 GMT 2023
 */
package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.junit.runner.RunWith;

public class AbstractLeastSquaresOptimizerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[9];
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[1];
        try {
            levenbergMarquardtOptimizer0.optimize((DifferentiableMultivariateVectorialFunction) null, doubleArray0, doubleArray1, doubleArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // dimensions mismatch 7 != 1
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[8];
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // dimensions mismatch 5 != 8
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 0;
        levenbergMarquardtOptimizer0.cols = 36;
        try {
            levenbergMarquardtOptimizer0.guessParametersErrors();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // no degrees of freedom (0 measurements, 36 parameters)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-527.9837694436);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-527.9837694436);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-527.9837694436);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = (double) 100;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.guessParametersErrors();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 9
        }
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = (double) 100;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 2;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.guessParametersErrors();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-208);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-208);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-208);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cost = (double) 124;
        double double0 = gaussNewtonOptimizer0.getRMS();
        assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cost = (double) 124;
        double double0 = gaussNewtonOptimizer0.getRMS();
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0814() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cost = (double) 124;
        double double0 = gaussNewtonOptimizer0.getRMS();
        assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        doubleArray0[0] = (double) 100;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.getRMS();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = (double) 100;
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray1;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.getRMS();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        levenbergMarquardtOptimizer0.cost = 1.0;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 1684;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.getRMS();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
        double[] doubleArray0 = new double[1];
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = (double) 100;
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
    public void test1319() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        double[][] doubleArray0 = new double[4][1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = (double) 100;
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        double[] doubleArray2 = new double[4];
        // Undeclared exception!
        try {
            gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray2, doubleArray2);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        double[] doubleArray0 = new double[4];
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        double[] doubleArray1 = new double[7];
        try {
            gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // dimensions mismatch 4 != 7
        }
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        double[] doubleArray0 = new double[9];
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        double[] doubleArray1 = new double[5];
        try {
            gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // dimensions mismatch 9 != 5
        }
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
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
    public void test1723() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        double[][] doubleArray0 = new double[4][1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = (double) 100;
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        // Undeclared exception!
        try {
            gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
        }
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[1];
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        double[][] doubleArray1 = new double[3][6];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(levenbergMarquardtOptimizer0.residualsWeights).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[4];
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[1];
        MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
        doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0[0], doubleArray0[0], doubleArray2);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // dimensions mismatch 2 != 4
        }
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        gaussNewtonOptimizer0.setMaxIterations((-2261));
        double[] doubleArray0 = new double[0];
        try {
            gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // maximal number of iterations (-2,261) exceeded
        }
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        assertEquals(1, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 105;
        int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 105;
        int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test2230() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 105;
        int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.rows = (-1989);
        int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.rows = (-1989);
        int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
        assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test2333() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.rows = (-1989);
        int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
        assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test2434() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = 124;
        int int0 = gaussNewtonOptimizer0.getEvaluations();
        assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test2435() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = 124;
        int int0 = gaussNewtonOptimizer0.getEvaluations();
        assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test2436() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = 124;
        int int0 = gaussNewtonOptimizer0.getEvaluations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2537() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 35;
        int int0 = levenbergMarquardtOptimizer0.getEvaluations();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test2538() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 35;
        int int0 = levenbergMarquardtOptimizer0.getEvaluations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2539() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 35;
        int int0 = levenbergMarquardtOptimizer0.getEvaluations();
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test2640() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2641() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        gaussNewtonOptimizer0.rows = (-586);
        double double0 = gaussNewtonOptimizer0.getRMS();
        assertEquals(-0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2742() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test2743() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.setMaxIterations(0);
        int int0 = gaussNewtonOptimizer0.getMaxIterations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2844() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((-587));
        int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
        assertEquals((-587), int0);
    }

    @Test(timeout = 4000)
    public void test2945() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test2946() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test3047() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-414));
        int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        assertEquals((-414), int0);
    }

    @Test(timeout = 4000)
    public void test3148() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test3249() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
        assertNotNull(vectorialConvergenceChecker0);
    }

    @Test(timeout = 4000)
    public void test3250() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
        assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test3251() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
        assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test3352() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.updateResidualsAndCost();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3453() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        // Undeclared exception!
        try {
            gaussNewtonOptimizer0.updateJacobian();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3554() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        gaussNewtonOptimizer0.setMaxIterations(0);
        try {
            gaussNewtonOptimizer0.incrementIterationsCounter();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // maximal number of iterations (0) exceeded
        }
    }

    @Test(timeout = 4000)
    public void test3655() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        // Undeclared exception!
        try {
            gaussNewtonOptimizer0.getCovariances();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3756() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[9];
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.getChiSquare();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 9
        }
    }

    @Test(timeout = 4000)
    public void test3857() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialValueChecker0);
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test3858() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialValueChecker0);
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test3959() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        try {
            levenbergMarquardtOptimizer0.guessParametersErrors();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // no degrees of freedom (0 measurements, 0 parameters)
        }
    }

    @Test(timeout = 4000)
    public void test4060() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = (-878);
        // Undeclared exception!
        try {
            gaussNewtonOptimizer0.guessParametersErrors();
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test4161() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 164;
        // Undeclared exception!
        try {
            levenbergMarquardtOptimizer0.getChiSquare();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test4262() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-2026));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        double[] doubleArray0 = new double[8];
        try {
            levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // maximal number of evaluations (-2,026) exceeded
        }
    }

    @Test(timeout = 4000)
    public void test4363() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.getConvergenceChecker();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test4364() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.getConvergenceChecker();
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test4465() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test4466() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
        assertEquals(1000, int0);
    }

    @Test(timeout = 4000)
    public void test4567() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
        assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test4568() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
        assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
    }

    @Test(timeout = 4000)
    public void test4569() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4670() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        int int0 = gaussNewtonOptimizer0.getMaxEvaluations();
        assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
    }

    @Test(timeout = 4000)
    public void test4671() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        int int0 = gaussNewtonOptimizer0.getMaxEvaluations();
        assertEquals(Integer.MAX_VALUE, int0);
    }
}
