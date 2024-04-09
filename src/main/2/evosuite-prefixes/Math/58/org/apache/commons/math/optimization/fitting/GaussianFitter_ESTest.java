/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 20:56:40 GMT 2024
 */
package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.fitting.GaussianFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.random.GaussianRandomGenerator;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class GaussianFitter_ESTest extends GaussianFitter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
        gaussianFitter0.getObservations();
        gaussianFitter0.fit();
        gaussianFitter0.fit();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(848.0149281, 848.0149281, 848.0149281);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(848.0149281, 2.0, 2.0);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(Double.POSITIVE_INFINITY, 0.0, 2.0);
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(2.0, 0.0, 0.0);
        weightedObservedPointArray0[3] = weightedObservedPoint3;
        WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(848.0149281, 3227.4041, 3227.4041);
        weightedObservedPointArray0[4] = weightedObservedPoint4;
        WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint(0.0, 848.0149281, 0.0);
        weightedObservedPointArray0[5] = weightedObservedPoint5;
        WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(1836.99740615687, 1701.590746208, (-646.144));
        weightedObservedPointArray0[6] = weightedObservedPoint6;
        WeightedObservedPoint weightedObservedPoint7 = new WeightedObservedPoint(1021.0, 0.0, (-646.144));
        weightedObservedPointArray0[7] = weightedObservedPoint7;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        gaussianFitter_ParameterGuesser0.guess();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
        GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator((RandomGenerator) null);
        UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(0, gaussianRandomGenerator0);
        MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 229, uncorrelatedRandomVectorGenerator0);
        GaussianFitter gaussianFitter0 = new GaussianFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[3];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1346.3957905322127), 0, 1526.2309047);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0, (-1890.0), 0.0);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(1063.7892723820455, 229, (-1890.0));
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        gaussianFitter_ParameterGuesser0.guess();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[9];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-997.6192), Double.POSITIVE_INFINITY, (-997.6192));
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(2870.965, 2870.965, 2870.965);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-1386.4065), (-1875.096352), (-1386.4065));
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-1386.4065), (-1875.096352), 2.0);
        weightedObservedPointArray0[3] = weightedObservedPoint3;
        WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint((-1386.4065), (-997.6192), (-1875.096352));
        weightedObservedPointArray0[4] = weightedObservedPoint4;
        WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint((-1875.096352), 0.0, 3.0);
        weightedObservedPointArray0[5] = weightedObservedPoint5;
        WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(3.0, 0.0, (-997.6192));
        weightedObservedPointArray0[6] = weightedObservedPoint6;
        WeightedObservedPoint weightedObservedPoint7 = new WeightedObservedPoint(3.0, (-1386.4065), 2.0);
        weightedObservedPointArray0[7] = weightedObservedPoint7;
        WeightedObservedPoint weightedObservedPoint8 = new WeightedObservedPoint(2.0, (-1875.096352), Double.POSITIVE_INFINITY);
        weightedObservedPointArray0[8] = weightedObservedPoint8;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-862.9496726373916), (-862.9496726373916), (-862.9496726373916));
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 1950.743, (-862.9496726373916));
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.0, 1950.743, 1950.743);
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(1.0, 1.0, 1.0);
        weightedObservedPointArray0[3] = weightedObservedPoint3;
        WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(1950.743, (-862.9496726373916), 1.0);
        weightedObservedPointArray0[4] = weightedObservedPoint4;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        gaussianFitter_ParameterGuesser0.guess();
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1874.44817165005, 1874.44817165005, 1.0);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-723.433080842), 0.0, (-723.433080842));
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-723.433080842), 4085.07956, 0.0);
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-1356.9250706176197), 2.220446049250313E-16, 1874.44817165005);
        weightedObservedPointArray0[3] = weightedObservedPoint3;
        WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(4085.07956, 0.0, 4085.07956);
        weightedObservedPointArray0[4] = weightedObservedPoint4;
        WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint(4085.07956, 0.0, 0.0);
        weightedObservedPointArray0[5] = weightedObservedPoint5;
        WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(0.0, 0.0, 0.0);
        weightedObservedPointArray0[6] = weightedObservedPoint6;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        gaussianFitter_ParameterGuesser0.guess();
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser((WeightedObservedPoint[]) null);
        DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        GaussianFitter gaussianFitter0 = new GaussianFitter((DifferentiableMultivariateVectorialOptimizer) null);
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 2.220446049250313E-16;
        doubleArray0[1] = 2813.14332;
        doubleArray0[2] = 2049.3;
        doubleArray0[3] = Double.POSITIVE_INFINITY;
        doubleArray0[4] = 0.0;
        doubleArray0[5] = (-4118.752554112737);
        doubleArray0[6] = 0.0;
        doubleArray0[7] = (-1257.9922352);
        gaussianFitter0.fit(doubleArray0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
        WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
        weightedObservedPointArray0[0] = weightedObservedPoint0;
        WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, (-744.480519041), 0.0);
        weightedObservedPointArray0[1] = weightedObservedPoint1;
        WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(1076.0, (-1522.609231592659), 1.0);
        weightedObservedPointArray0[2] = weightedObservedPoint2;
        WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-1522.609231592659), 0.0, (-1710.8963209112655));
        weightedObservedPointArray0[3] = weightedObservedPoint3;
        GaussianFitter.ParameterGuesser gaussianFitter_ParameterGuesser0 = new GaussianFitter.ParameterGuesser(weightedObservedPointArray0);
        gaussianFitter_ParameterGuesser0.guess();
    }
}
