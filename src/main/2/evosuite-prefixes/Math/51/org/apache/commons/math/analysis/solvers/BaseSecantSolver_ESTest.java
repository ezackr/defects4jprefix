/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 19:22:39 GMT 2024
 */
package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(5528, (UnivariateRealFunction) sinc0, 0.6666666269302368, (double) 5528, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
        pegasusSolver0.getMin();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Expm1 expm1_0 = new Expm1();
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        regulaFalsiSolver0.solve(103, (UnivariateRealFunction) expm1_0, (-1.0), (double) 103);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        Gaussian gaussian0 = new Gaussian();
        double double0 = illinoisSolver0.solve(307, (UnivariateRealFunction) gaussian0, (double) 307, (double) 307, allowedSolution0);
        illinoisSolver0.getMax();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        Gaussian gaussian0 = new Gaussian();
        double double0 = illinoisSolver0.solve(307, (UnivariateRealFunction) gaussian0, (double) 307, (double) 307, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Expm1 expm1_0 = new Expm1();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1827, (UnivariateRealFunction) expm1_0, (double) 1827, 0.0, allowedSolution0);
        illinoisSolver0.getMin();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Expm1 expm1_0 = new Expm1();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1827, (UnivariateRealFunction) expm1_0, (double) 1827, 0.0, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Minus minus0 = new Minus();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(2713, (UnivariateRealFunction) minus0, (-8.923805256116543E-7), (double) 2713, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Minus minus0 = new Minus();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(2713, (UnivariateRealFunction) minus0, (-8.923805256116543E-7), (double) 2713, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Expm1 expm1_0 = new Expm1();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(3198, 3198, 3198);
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(3198, (UnivariateRealFunction) expm1_0, (-743.219634668679), (double) 3198, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(178, (UnivariateRealFunction) sinc0, (double) 178, 281.780882, allowedSolution0);
        illinoisSolver0.getMin();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(178, (UnivariateRealFunction) sinc0, (double) 178, 281.780882, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(178, (UnivariateRealFunction) sinc0, (double) 178, 281.780882, allowedSolution0);
        illinoisSolver0.getMin();
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(178, (UnivariateRealFunction) sinc0, (double) 178, 281.780882, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1827, (UnivariateRealFunction) sinc0, (double) 1827, 72872.97743757491, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1827, (UnivariateRealFunction) sinc0, (double) 1827, 72872.97743757491, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(4075, (UnivariateRealFunction) sinc0, (-0.1666666567325592), (double) 4075, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1017() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(4075, (UnivariateRealFunction) sinc0, (-0.1666666567325592), (double) 4075, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1118() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1833, (UnivariateRealFunction) sinc0, (double) 1833, 72872.97743757491, allowedSolution0);
        illinoisSolver0.getMin();
    }

    @Test(timeout = 4000)
    public void test1119() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Sinc sinc0 = new Sinc();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1833, (UnivariateRealFunction) sinc0, (double) 1833, 72872.97743757491, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1220() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        Inverse inverse0 = new Inverse();
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-319.60586103559), (double) 3188, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1221() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        Inverse inverse0 = new Inverse();
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-319.60586103559), (double) 3188, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1322() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(3222, (UnivariateRealFunction) inverse0, (-1.5838082551345614E-15), (double) 3222, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1323() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(3222, (UnivariateRealFunction) inverse0, (-1.5838082551345614E-15), (double) 3222, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1424() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(3218, (UnivariateRealFunction) inverse0, (-1712.13346991), (double) 3218, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1425() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(3218, (UnivariateRealFunction) inverse0, (-1712.13346991), (double) 3218, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1526() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(3139, (UnivariateRealFunction) inverse0, (-1021.19), (double) 3139, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1527() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(3139, (UnivariateRealFunction) inverse0, (-1021.19), (double) 3139, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1628() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        Inverse inverse0 = new Inverse();
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-319.60586103559), (double) 3188, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1629() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        Inverse inverse0 = new Inverse();
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-319.60586103559), (double) 3188, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1730() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-1712.13346991), (double) 3188, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1731() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-1712.13346991), (double) 3188, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1832() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-1712.13346991), (double) 3188, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1833() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(3188, (UnivariateRealFunction) inverse0, (-1712.13346991), (double) 3188, allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test1934() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1420308, (UnivariateRealFunction) inverse0, (-0.12221472128530378), (double) 1420308, allowedSolution0);
        illinoisSolver0.getStartValue();
    }

    @Test(timeout = 4000)
    public void test1935() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Inverse inverse0 = new Inverse();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1420308, (UnivariateRealFunction) inverse0, (-0.12221472128530378), (double) 1420308, allowedSolution0);
    }
}
