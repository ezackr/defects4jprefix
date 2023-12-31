/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 11:18:13 GMT 2023
 */
package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.analysis.function.Acos;
import org.apache.commons.math3.analysis.function.Asin;
import org.apache.commons.math3.analysis.function.Cbrt;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BrentOptimizer brentOptimizer0 = null;
        brentOptimizer0 = new BrentOptimizer((-3.356118100840571E-7), (-3.356118100840571E-7));
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BrentOptimizer brentOptimizer0 = null;
        brentOptimizer0 = new BrentOptimizer(1034.718748, (-1728.0852664));
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(721.4313229246643, 721.4313229246643);
        Asin asin0 = new Asin();
        GoalType goalType0 = GoalType.MINIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(334, (UnivariateFunction) asin0, goalType0, 1445.23141598, 1445.23141598, 1.12996721591364E-202);
        univariatePointValuePair0.getPoint();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(721.4313229246643, 721.4313229246643);
        Asin asin0 = new Asin();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(4687, (UnivariateFunction) asin0, goalType0, 3.0, (double) 334);
        univariatePointValuePair0.getValue();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(721.4313229246643, 721.4313229246643);
        Asin asin0 = new Asin();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(4687, (UnivariateFunction) asin0, goalType0, 3.0, (double) 334);
        univariatePointValuePair0.getPoint();
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
        BrentOptimizer brentOptimizer0 = null;
        brentOptimizer0 = new BrentOptimizer((-34.0), (-34.0), convergenceChecker0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
        BrentOptimizer brentOptimizer0 = null;
        brentOptimizer0 = new BrentOptimizer(805.80288612552, (-1661.1974), convergenceChecker0);
    }

    @Test(timeout = 4000)
    public void test107() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.0, 1.0);
        brentOptimizer0.doOptimize();
    }
}
