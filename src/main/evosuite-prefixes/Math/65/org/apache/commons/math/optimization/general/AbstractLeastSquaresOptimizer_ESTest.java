/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:39:11 GMT 2023
 */
package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class AbstractLeastSquaresOptimizer_ESTest extends AbstractLeastSquaresOptimizer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[9];
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[1];
        levenbergMarquardtOptimizer0.optimize((DifferentiableMultivariateVectorialFunction) null, doubleArray0, doubleArray1, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[8];
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 0;
        levenbergMarquardtOptimizer0.cols = 36;
        levenbergMarquardtOptimizer0.guessParametersErrors();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-527.9837694436);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-527.9837694436);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-527.9837694436);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = (double) 100;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        levenbergMarquardtOptimizer0.guessParametersErrors();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = (double) 100;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 2;
        levenbergMarquardtOptimizer0.guessParametersErrors();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-208);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-208);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = (-208);
        double double0 = levenbergMarquardtOptimizer0.getChiSquare();
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cost = (double) 124;
        double double0 = gaussNewtonOptimizer0.getRMS();
        gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cost = (double) 124;
        double double0 = gaussNewtonOptimizer0.getRMS();
    }

    @Test(timeout = 4000)
    public void test0814() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cost = (double) 124;
        double double0 = gaussNewtonOptimizer0.getRMS();
        gaussNewtonOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        doubleArray0[0] = (double) 100;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        levenbergMarquardtOptimizer0.getRMS();
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
        levenbergMarquardtOptimizer0.getRMS();
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[5];
        levenbergMarquardtOptimizer0.cost = 1.0;
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 1684;
        levenbergMarquardtOptimizer0.getRMS();
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
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
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
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray2, doubleArray2, doubleArray2);
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
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray0);
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
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.doOptimize();
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
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
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
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
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
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0[0], doubleArray0[0], doubleArray2);
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        gaussNewtonOptimizer0.setMaxIterations((-2261));
        double[] doubleArray0 = new double[0];
        gaussNewtonOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 105;
        int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 105;
        int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test2230() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cols = 105;
        int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.rows = (-1989);
        int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.rows = (-1989);
        int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
        gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2333() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.rows = (-1989);
        int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
        gaussNewtonOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test2434() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = 124;
        int int0 = gaussNewtonOptimizer0.getEvaluations();
        gaussNewtonOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test2435() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = 124;
        int int0 = gaussNewtonOptimizer0.getEvaluations();
        gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2436() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = 124;
        int int0 = gaussNewtonOptimizer0.getEvaluations();
    }

    @Test(timeout = 4000)
    public void test2537() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 35;
        int int0 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test2538() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 35;
        int int0 = levenbergMarquardtOptimizer0.getEvaluations();
    }

    @Test(timeout = 4000)
    public void test2539() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 35;
        int int0 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2640() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        gaussNewtonOptimizer0.getRMS();
    }

    @Test(timeout = 4000)
    public void test2641() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        gaussNewtonOptimizer0.rows = (-586);
        double double0 = gaussNewtonOptimizer0.getRMS();
    }

    @Test(timeout = 4000)
    public void test2742() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2743() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.setMaxIterations(0);
        int int0 = gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2844() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((-587));
        int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test2945() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test2946() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test3047() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-414));
        int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test3148() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
    }

    @Test(timeout = 4000)
    public void test3249() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
    }

    @Test(timeout = 4000)
    public void test3250() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
        gaussNewtonOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test3251() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
        gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test3352() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.updateResidualsAndCost();
    }

    @Test(timeout = 4000)
    public void test3453() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.updateJacobian();
    }

    @Test(timeout = 4000)
    public void test3554() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        gaussNewtonOptimizer0.setMaxIterations(0);
        gaussNewtonOptimizer0.incrementIterationsCounter();
    }

    @Test(timeout = 4000)
    public void test3655() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        gaussNewtonOptimizer0.getCovariances();
    }

    @Test(timeout = 4000)
    public void test3756() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[9];
        levenbergMarquardtOptimizer0.residuals = doubleArray0;
        levenbergMarquardtOptimizer0.rows = 100;
        levenbergMarquardtOptimizer0.residualsWeights = doubleArray0;
        levenbergMarquardtOptimizer0.getChiSquare();
    }

    @Test(timeout = 4000)
    public void test3857() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialValueChecker0);
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test3858() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        SimpleVectorialValueChecker simpleVectorialValueChecker0 = new SimpleVectorialValueChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialValueChecker0);
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test3959() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.guessParametersErrors();
    }

    @Test(timeout = 4000)
    public void test4060() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
        gaussNewtonOptimizer0.cols = (-878);
        gaussNewtonOptimizer0.guessParametersErrors();
    }

    @Test(timeout = 4000)
    public void test4161() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.rows = 164;
        levenbergMarquardtOptimizer0.getChiSquare();
    }

    @Test(timeout = 4000)
    public void test4262() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-2026));
        DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
        doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
        double[] doubleArray0 = new double[8];
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test4363() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test4364() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test4465() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test4466() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test4567() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test4568() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test4569() throws Throwable {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
        int int0 = levenbergMarquardtOptimizer0.getIterations();
    }

    @Test(timeout = 4000)
    public void test4670() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        int int0 = gaussNewtonOptimizer0.getMaxEvaluations();
        gaussNewtonOptimizer0.getMaxIterations();
    }

    @Test(timeout = 4000)
    public void test4671() throws Throwable {
        GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
        int int0 = gaussNewtonOptimizer0.getMaxEvaluations();
    }
}
