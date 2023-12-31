/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 18:14:53 GMT 2023
 */
package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Acosh;
import org.apache.commons.math3.analysis.function.Asin;
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.analysis.function.Log1p;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BrentOptimizer_ESTest extends BrentOptimizer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.48008447885513306, 0.48008447885513306);
        Expm1 expm1_0 = new Expm1();
        GoalType goalType0 = GoalType.MINIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1458271765, (UnivariateFunction) expm1_0, goalType0, 0.48008447885513306, 0.48008447885513306, (double) 1458271765);
        assertEquals(30.190590761630535, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BrentOptimizer brentOptimizer0 = null;
        try {
            brentOptimizer0 = new BrentOptimizer((-958.04074868), (-958.04074868));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -958.041 is smaller than the minimum (0)
            //
            verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BrentOptimizer brentOptimizer0 = null;
        try {
            brentOptimizer0 = new BrentOptimizer(3968.4, (-0.0492602052561105));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // -0.049 is smaller than, or equal to, the minimum (0)
            //
            verifyException("org.apache.commons.math3.optimization.univariate.BrentOptimizer", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.655589133934081E-8, 3.655589133934081E-8);
        Acosh acosh0 = new Acosh();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(925, (UnivariateFunction) acosh0, goalType0, (-2019.678552), (-2019.678552), (double) 925);
        assertEquals(924.9999661492446, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(3.655589133934081E-8, 3.655589133934081E-8);
        Log1p log1p0 = new Log1p();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1967532823, (UnivariateFunction) log1p0, goalType0, 3.655589133934081E-8, (double) 1967532823, (double) 1967532823);
        assertEquals(1.967532751075084E9, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.097, 0.097);
        Inverse inverse0 = new Inverse();
        GoalType goalType0 = GoalType.MINIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(927, (UnivariateFunction) inverse0, goalType0, 0.097, (double) 927);
        assertEquals(788.4390227447333, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(5.0, 5.0);
        Expm1 expm1_0 = new Expm1();
        GoalType goalType0 = GoalType.MINIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2147423806, (UnivariateFunction) expm1_0, goalType0, (double) 2147423806, 5.0, 5.0);
        assertEquals(35.0, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(0.5415972471237183, 0.5415972471237183);
        Acosh acosh0 = new Acosh();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2147483592, (UnivariateFunction) acosh0, goalType0, (double) 2147483592, (double) 2147483592, 0.5415972471237183);
        assertEquals(4.126265450918533, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2727.5728673977655, 2727.5728673977655);
        Log1p log1p0 = new Log1p();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1754, (UnivariateFunction) log1p0, goalType0, (double) 1754, (double) 1754, (double) 1754);
        assertEquals(7.470224135899966, univariatePointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2727.5728673977655, 2727.5728673977655);
        Log1p log1p0 = new Log1p();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1754, (UnivariateFunction) log1p0, goalType0, (double) 1754, (double) 1754, (double) 1754);
        assertNotNull(univariatePointValuePair0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2727.5728673977655, 2727.5728673977655);
        Log1p log1p0 = new Log1p();
        GoalType goalType0 = GoalType.MAXIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(1754, (UnivariateFunction) log1p0, goalType0, (double) 1754, (double) 1754, (double) 1754);
        assertEquals(1754.0, univariatePointValuePair0.getPoint(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        BrentOptimizer brentOptimizer0 = new BrentOptimizer(2731.088474737597, 2731.088474737597);
        Asin asin0 = new Asin();
        GoalType goalType0 = GoalType.MINIMIZE;
        UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(2147483603, (UnivariateFunction) asin0, goalType0, (double) 2147483603, 2731.088474737597, 2731.088474737597);
        assertEquals(1.7463079343324553E7, univariatePointValuePair0.getPoint(), 0.01);
    }
}
